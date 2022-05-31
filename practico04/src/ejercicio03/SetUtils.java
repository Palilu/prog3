package ejercicio03;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class SetUtils {

    /**
     * Ejercicio 3.
     * Suma de subconjuntos. Dados n números positivos distintos, se desea encontrar todas las
     * combinaciones de esos números tal que la suma sea igual a M.
     */
    public List<Set<Integer>> subsets(Set<Integer> input, Integer target) {
        List<Set<Integer>> solutions = new ArrayList<>();
        subsets(new ArrayList<>(input), target, 0, new HashSet<>(), solutions);
        return solutions;
    }

    private void subsets(List<Integer> input,
                         Integer target,
                         int i,
                         Set<Integer> temp,
                         List<Set<Integer>> solutions) {

        // Calculo la suma que tengo hasta ahora
        Integer sum = temp.stream().reduce(0, Integer::sum);
        // Si es solución, la agrego a las soluciones
        if (sum.compareTo(target) == 0) {
            solutions.add(new HashSet<>(temp));
        } else if (i < input.size()) { // Sino
            //Sino, y Si no me pasé del tamaño de mi entrada obtengo el valor actual
            Integer value = input.get(i);
            // y calculo cual es la próxima suma
            Integer nextSum = sum + value;
            // Unicamente si la próxima suma no se pasa del valor objetivo
            if (nextSum.compareTo(target) <= 0) {
                // Agrego el valor a la solución temporal
                temp.add(value);
                // Y pruebo encontrar soluciones que incluyan el valor
                subsets(input, target, i + 1, temp, solutions);
                // Y luego lo saco de la solución temporal
                temp.remove(value);
            }
            // De cualquier forma pruebo encontrar soluciones que no contengan el valor.
            subsets(input, target, i + 1, temp, solutions);
        }
    }
}
