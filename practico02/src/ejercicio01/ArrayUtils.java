package ejercicio01;

public class ArrayUtils<T extends Comparable<T>> {

    public boolean isSorted(T[] value) {
        return isSorted(value, 0, value.length -1);
    }

    private boolean isSorted(T[] value, int from, int to) {
        // Si el arreglo es de tamaño 1 o 0 está ordenado
        if (to - from <= 1) {
            return true;
        }
        // Sino obtengo el medio
        int middle = (from + to )/ 2; // El arreglo está ordenado
        return isSorted(value, from, middle - 1)  // Si la parte a la izquierda del medio está ordenada
                && value[middle -1].compareTo(value[middle]) <= 0 // El último valor a la izquierda es menor que el del medio
                && value[middle].compareTo(value[middle + 1]) <= 0 // El valor del medio es menor que el primero a la derecha
                && isSorted(value, middle + 1, to); // Y la parte derecha del arreglo está ordenada.
    }
}
