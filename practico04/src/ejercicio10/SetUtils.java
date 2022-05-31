package ejercicio10;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

import static java.util.function.Predicate.not;

public class SetUtils extends ejercicio04.SetUtils {

    /**
     * Ejercicio 10
     *
     * Utilizando la técnica Backtraking, escriba un algoritmo que dado un conjunto de números
     * enteros, devuelva (si existen) todos los subconjuntos de tamaño N (dado como parámetro),
     * cuyas sumas sean exactamente cero.
     *
     * Por ejemplo dado el conjunto {-7, -3, -2, -1, 5, 8 } y N = 3, los subconjuntos que suman cero son:
     * {-7, -1, 8} y {-3, -2, 5}.
     */
    public List<Set<Integer>> zeroSumSubsetsOfSize(Set<Integer> input, Integer N) {
        List<Set<Integer>> solutions = new ArrayList<>();
        zeroSumSubsetsOfSize(input, 0, new HashSet<>(), solutions);
        return solutions;
    }

    public void zeroSumSubsetsOfSize(Set<Integer> input,
                                     Integer n,
                                     Set<Integer> temp,
                                     List<Set<Integer>> solutions) {
        if (n == 3) {
            Integer sum = temp.stream().reduce(0, Integer::sum);
            if (sum == 0) {
                solutions.add(new HashSet<>(temp));
            }
        } else {
            for (Integer value : input) {
                if (!temp.contains(value)) {
                    temp.add(value);
                    if (solutions.stream() // Si no existe una solución tal que
                            .filter(solution -> temp.stream() // Todos los elementos de mi solución temporal
                                    .filter(not(solution::contains)) // Estén contenidos en ella
                                    .findAny().isEmpty())
                            .findAny().isEmpty()) {
                        // Exploro el espacio de soluciones
                        zeroSumSubsetsOfSize(input, n + 1, temp, solutions);
                    }
                    temp.remove(value);
                }
            }
        }
    }
}
