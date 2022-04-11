package ejercicio01;

/**
 * Ejercicio 1.
 *
 * Implemente un algoritmo recursivo que determine si un arreglo de tamaño N está ordenado.
 *
 * 1. ¿Qué complejidad O tiene? (La complejidad en el peor caso)
 *       O(log(n))
 * 2. ¿Trae algún problema hacerlo recursivo? ¿Cuál?
 *       ¿Trae algún problema hacerlo recursivo? ¿Cuál?
 *          ¿Trae algún problema hacerlo recursivo? ¿Cuál?
 *              ¿Trae algún problema hacerlo recursivo? ¿Cuál?
 *                  ¿Trae algún problema hacerlo recursivo? ¿Cuál?
 *                      ¿Trae algún problema hacerlo recursivo? ¿Cuál?
 *                          ¿Trae algún problema hacerlo recursivo? ¿Cuál?
 *                              ¿Trae algún problema hacerlo recursivo? ¿Cuál?
 *                                  ¿Trae algún problema hacerlo recursivo? ¿Cuál?
 *                                      ¿Trae algún problema hacerlo recursivo? ¿Cuál?
 *                                          ¿Trae algún problema hacerlo recursivo? ¿Cuál?
 *                                              ¿Trae algún problema hacerlo recursivo? ¿Cuál?
 *                                                  ¿Trae algún problema hacerlo recursivo? ¿Cuál?
 *                                                      ¿Trae algún problema hacerlo recursivo? ¿Cuál?
 *                                                          ¿Trae algún problema hacerlo recursivo? ¿Cuál?
 *                                                              ¿Trae algún problema hacerlo recursivo? ¿Cuál?
 *                                                                  ¿Trae algún problema hacerlo recursivo? ¿Cuál?
 *                                                                      ¿Trae algún problema hacerlo recursivo? ¿Cuál?
 *                                                                          ¿Trae algún problema hacerlo recursivo? ¿Cuál?
 *                                                                              ¿Trae algún problema hacerlo recursivo? ¿Cuál?
 * ¿A vos que te parece?
 *
 * 3. ¿Qué cambiaría si la estructura fuera una lista en lugar de un arreglo?
 *       Cómo que no hay una forma bella de partir una lista a la mitad.
 *       A menos que la lista pueda partirse y devolver el último va a ser O(n)
 */
public class Main {

    public static void main(String[] args) {
        ArrayUtils<Integer> arrayUtils = new ArrayUtils<>();
        Integer[] test1 = {1, 2, 3, 4, 5, 6};
        System.out.println("1: " + (arrayUtils.isSorted(test1) ? "está" : "no está") + " ordenado.");
        Integer[] test2 = {1, 2, 3, 4, 5, 6, 7};
        System.out.println("2: " + (arrayUtils.isSorted(test2) ? "está" : "no está") + " ordenado.");
        Integer[] test3 = {1, 2, 3, 4, 5, 6, 7, 8};
        System.out.println("3: " + (arrayUtils.isSorted(test3) ? "está" : "no está") + " ordenado.");
        Integer[] test4 = {1, 2, 5, 4, 3, 6};
        System.out.println("4: " + (arrayUtils.isSorted(test4) ? "está" : "no está") + " ordenado.");
        Integer[] test5 = {1, 2, 3, 4, 5, 8, 7};
        System.out.println("5: " + (arrayUtils.isSorted(test5) ? "está" : "no está") + " ordenado.");
        Integer[] test6 = {9, 2, 3, 4, 5, 6, 7, 8};
        System.out.println("6: " + (arrayUtils.isSorted(test6) ? "está" : "no está") + " ordenado.");
        Integer[] test7 = {};
        System.out.println("7: " + (arrayUtils.isSorted(test7) ? "está" : "no está") + " ordenado.");
        Integer[] test8 = {42};
        System.out.println("8: " + (arrayUtils.isSorted(test8) ? "está" : "no está") + " ordenado.");
    }
}
