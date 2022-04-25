package ejercicio02;

import java.util.Optional;

public class ArrayUtils<T extends Comparable<T>> extends ejercicio01.ArrayUtils<T> {

    public Optional<Integer> findInSortedArray(T target, T[] array) {
        if (!this.isSorted(array)) {
            throw new IllegalArgumentException("Me dijiste que el arreglo estaba ordenado man");
        }
        return doFindInSortedArray(target, array, 0, array.length);
    }

    private Optional<Integer> doFindInSortedArray(T target, T[] array, Integer from, Integer to) {
        // Si el arreglo es de tamaño 0 no está
        if (to - from == 0) {
            return Optional.empty();
        }
        // Sino obtengo el medio
        int middle = (from + to )/ 2;
        // Y el resultado de la comparación del objetivo con el valor del medio
        int compare = target.compareTo(array[middle]);
        if (compare == 0) { // Si es igual lo encontré
            return Optional.of(middle);
        } else if (compare < 0) { // Si es menor lo busco a la izquierda
            return doFindInSortedArray(target, array, from, middle);
        } else { // Si es mayor lo busco a la derecha
            return doFindInSortedArray(target, array, middle + 1, to);
        }
    }
}
