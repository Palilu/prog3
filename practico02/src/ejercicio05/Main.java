package ejercicio05;

import java.util.Arrays;

/**
 * Ejercicio 5.
 * Implemente un algoritmo de ordenamiento mergesort para un arreglo de tamaño N.
 * Implemente un algoritmo de ordenamiento quicksort para un arreglo de tamaño N.
 * 1. ¿Cuál es su complejidad en el peor caso?
 *          El merge sort es O(n log n), el quicksort es O(n˜2)
 * 2. ¿Cuál es su complejidad promedio?
 *          El merge sort es O(n log n), el quicksort es O(n log n)
 */
public class Main {

    public static void main(String[] args) {
        ArrayUtils<Integer> arrayUtils = new ArrayUtils<>();

        Integer[] randomValuesForMergeSort = {9, 4, 5, 7, 2, 6, 8, 3, 1};
        System.out.println(Arrays.toString(randomValuesForMergeSort));
        arrayUtils.mergeSort(randomValuesForMergeSort);
        System.out.println(Arrays.toString(randomValuesForMergeSort));

        Integer[] randomValuesForQuickSort = {9, 4, 5, 7, 2, 6, 8, 3, 1};
        System.out.println(Arrays.toString(randomValuesForQuickSort));
        arrayUtils.quickSort(randomValuesForQuickSort);
        System.out.println(Arrays.toString(randomValuesForMergeSort));
    }
}
