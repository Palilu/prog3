package ejercicio02;

import java.util.List;
import java.util.Optional;

public class ListUtils<T extends Comparable<T>> {

    /**
     * Implemente un algoritmo recursivo para buscar un elemento en una lista simple.
     *
     * @return El índice del elemento buscado si existiera.
     */
    public Optional<Integer> findElement(T element, List<T> list) {
         return doFindElement(element, list, 0);
    }

    private Optional<Integer> doFindElement(T element, List<T> list, Integer index) {
        // Si me pasé del largo no lo encontré
        if (list.size() == index) {
           return Optional.empty();
        }
        // Si es el elemento actual devuelvo el índice
        if (list.get(index).compareTo(element) == 0) {
            return Optional.of(index);
        }
        // Sino no lo busco más adelante
        return doFindElement(element, list, index + 1);
    }
}
