package ejercicio06;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

/**
 * Ejercicio 6.
 *
 * Escriba un procedimiento que dadas dos listas construya otra con los elementos comunes,
 * suponiendo que:
 *
 * a) Las listas están desordenadas y la lista resultante debe quedar ordenada.
 * b) Las listas están ordenadas y la lista resultante debe mantenerse ordenada.
 */
public class ListUtils<T extends Comparable<T>> {

    /**
     * a) Las listas están desordenadas y la lista resultante debe quedar ordenada.
     *
     * Esto es lo primero que escribiría, la complejidad computacional es:
     *
     * O(n * m) ?
     */
    public List<T> sortedIntersectionA1(List<T> list1, List<T> list2) {
        return list1.stream()
                .collect(Collectors.toSet()) // No estoy seguro si hay que contar o no los repetidos.
                .stream()
                .filter(list2::contains)
                .sorted()
                .collect(Collectors.toList());
    }

    /**
     * a) Las listas están desordenadas y la lista resultante debe quedar ordenada.
     *
     * Tratando de reducir complejidad computacional:
     *
     * O (max(n, m) log (max(n, m)))
     */
    public List<T> sortedIntersectionA2(List<T> list1, List<T> list2) {
        Map<T, Long> count = list1.stream()
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        return new ArrayList<>(list2.stream()
                .filter(count::containsKey)
                .collect(Collectors.toSet()));
    }

    /**
     * b) Las listas están ordenadas y la lista resultante debe mantenerse ordenada.
     *
     * O(max(n, m))
     */
    public List<T> sortedIntersectionB(List<T> list1, List<T> list2) {
        if (list1.size() < list2.size()) {
            // Asumo que la primera es la más larga, sino lo calculo alrevez.
            return sortedIntersectionB(list2, list1);
        }
        List<T> result = new ArrayList<>();
        Integer index1 = 0;
        Integer index2 = 0;

        while (index1 < list1.size()) {
            int compare = list1.get(index1).compareTo(list2.get(index2));
            if (compare == 0) {
                // Si son iguales lo agrego, incremento los dos indices
                result.add(list1.get(index1));
                index2++;
                index1++;
            } else if (compare == -1) {
                // Si el valor en 2 es más grande, incremento el índice de 1
                index1++;
            } else {
                // Si el valor en 1 es más grande, incremento el índice de 2
                index2++;
            }
        }
        return result;
    }
}
