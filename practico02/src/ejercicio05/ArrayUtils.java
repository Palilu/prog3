package ejercicio05;

import java.util.Arrays;

public class ArrayUtils<T extends Comparable> extends ejercicio04.ArrayUtils<T> {

    public void mergeSort(T[] sortee) {
        T[] helper = (T[]) new Comparable[sortee.length];
        doMergeSort(0, sortee.length -1, sortee, helper);
    }

    private void doMergeSort(int from, int to, T[] sortee, T[] helper) {
        if (from < to) {
            int middle = (from + to) / 2;
            doMergeSort(from, middle, sortee, helper);
            doMergeSort(middle + 1, to, sortee, helper);
            merge(from, middle, to, sortee, helper);
        }
    }

    private void merge(int from, int middle, int to, T[] sortee, T[] helper) {
        // copiar ambas partes al array helper
        for (int i = from; i <= to; i++) {
            helper[i] = sortee[i];
        }
        int i = from;
        int j = middle + 1;
        int k = from;
        // copiar de manera ordenada al array original los valores de la
        // mitad izquierda o de la derecha
        while (i <= middle && j <= to) {
            if (helper[i].compareTo(helper[j]) < 0) {
                sortee[k] = helper[i];
                i++;
            } else {
                sortee[k] = helper[j];
                j++;
            }
            k++;
        }
        // si quedaron elementos copiarlos al array original
        while (i <= middle) {
            sortee[k] = helper[i];
            k++;
            i++;
        }
        while (j <= to) {
            sortee[k] = helper[j];
            k++;
            j++;
        }
    }

    public void quickSort(T[] sortee) {
        doQuickSort(0, sortee.length -1, sortee);
    }

    private void doQuickSort(int from, int to, T[] sortee) {
        if (from < to) {
            int pivot = partition(from, to, sortee);
            doQuickSort(from, pivot - 1, sortee);
            doQuickSort(pivot + 1, to, sortee);
        }
    }

    private int partition(int from, int to, T[] sortee) {
        // Elegimos de pivote el último elemento del arreglo.
        T pivot = sortee[to];
        System.out.println("Pivote:" + pivot);
        int i = from; // smaller element index
        for (int j = from; j < to; j++) {
            // Si el elemento actual es menor que el pivote
            if (sortee[j].compareTo(pivot) < 0) {
                // Intercambio los elementos en i y en j
                T temp = sortee[i];
                sortee[i] = sortee[j];
                sortee[j] = temp;
                i++;
            }
        }

        // Luego intercambio el elemento en i con el pivote
        T temp = sortee[i];
        sortee[i] = sortee[to];
        sortee[to] = temp;
        System.out.println("Particionado:" + Arrays.toString(sortee));
        System.out.println("Índice pivote:" + i);
        return i;
    }

}
