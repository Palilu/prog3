package ejercicio04;

public class ArrayUtils<T extends Comparable> {

    /**
     * Implemente un algoritmo de ordenamiento por selección en un arreglo.
     */
    public void minSort(T[] sortee) {
        // Por cada posición del arreglo
        for (int i = 0; i < sortee.length; i++) {
            // Inicializo min index cómo esa posición
            int minIndex = i;
            // Y min como el valor en esa posición
            T min = sortee[i];
            // Por cada posición restante del arreglo j
            for (int j = i; j < sortee.length; j++) {
                // Si el valor en j es menor que el valor en i
                if (sortee[j].compareTo(min) < 0) {
                    // El mínimo se vuelve el valor en j
                    min = sortee[j];
                    // Y la posición del mínimo se vuelve j
                    minIndex = j;
                }
            }
            // Entonces el valor en la posición del mínimo se vuelve el valor en í
            sortee[minIndex] = sortee[i];
            // Y el valor en í se vuelve el mínimo
            sortee[i] = min;
        }
    }

    /**
     * Implemente un algoritmo de ordenamiento por selección en un arreglo.
     */
    public void bubbleSort(T[] sortee) {
        for (int i = 0; i < sortee.length; i++) {
            for (int j = 0; j < sortee.length - i - 1; j++) {
                if (sortee[j].compareTo(sortee[j + 1]) > 0) {
                    T aux =  sortee[j + 1];
                    sortee[j + 1] = sortee[j];
                    sortee[j] = aux;
                }
            }
        }
    }


}
