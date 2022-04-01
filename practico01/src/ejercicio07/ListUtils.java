package ejercicio07;

import java.util.ArrayList;
import java.util.List;

/**
 * Ejercicio 7.
 *
 * Escriba una función que dadas dos listas construya otra con los elementos que están en la
 * primera pero no en la segunda.
 */
public class ListUtils<T> extends ejercicio06.ListUtils {

    /**
     * O(n)
     */
    public List<T> elementsInList1AndNotInList2(List<T> list1, List<T> list2) {
        List<T> result = new ArrayList<>(list1);
        result.removeAll(list2);
        return result;
    }
}
