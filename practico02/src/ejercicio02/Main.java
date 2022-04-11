package ejercicio02;

import java.util.List;

/**
 * Ejercicio 2.
 *
 * Implemente un algoritmo recursivo para buscar un elemento en una lista simple.
 * Implemente, además, un algoritmo recursivo para buscar un elemento en un arreglo ordenado
 * ascendentemente [1 2 3 …].
 *
 * 1. ¿Qué complejidad O tienen estos algoritmos?
 *       O(n) y O(log n)
 * 2. ¿En qué afecta la estructura a estos algoritmos?
 *       Tener acceso de costo uno a cualquier elemento es clave.
 * 3. ¿Cambia algo que la estructura esté ordenada?
 *       Sí.
 */
public class Main {

    private static ListUtils<String> listUtils = new ListUtils<>();
    private static ArrayUtils<String> arrayUtils = new ArrayUtils<>();

    public static void main(String[] args) {
        // Implemente un algoritmo recursivo para buscar un elemento en una lista simple.
        List<String> cracksList = List.of("John", "Paul", "George", "Ringo");
        printListResult("John", cracksList);
        printListResult("George", cracksList);
        printListResult("Ringo", cracksList);
        printListResult("Paul", cracksList);
        printListResult("Carlos", cracksList);
        // Implemente, además, un algoritmo recursivo para buscar un elemento en un arreglo ordenado
        String[] cracksArray = {"George", "John", "Paul", "Ringo"};
        printArraysResult("John", cracksArray);
        printArraysResult("George", cracksArray);
        printArraysResult("Ringo", cracksArray);
        printArraysResult("Paul", cracksArray);
        printArraysResult("Carlos", cracksArray);

    }

    public static void printListResult(String target, List<String> list) {
        var result = listUtils.findElement(target, list);
        if (result.isEmpty()) {
            System.out.println(target + " no se encuentra en la lista.");
        } else {
            System.out.println(target + " se encuentra en la posición " + result.get() + " de la lista.");
        }
    }

    public static void printArraysResult(String target, String[] array) {
        var result = arrayUtils.findInSortedArray(target, array);
        if (result.isEmpty()) {
            System.out.println(target + " no se encuentra en el array.");
        } else {
            System.out.println(target + " se encuentra en la posición " + result.get() + " del array");
        }
    }
}
