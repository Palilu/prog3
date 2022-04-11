package ejercicio03;

/**
 * Ejercicio 3.
 *
 * Implemente un algoritmo recursivo que convierta un número en notación decimal a su
 * equivalente en notación binaria.
 */
public class Main {

    private static BinaryUtils binaryUtils = new BinaryUtils();

    public static void main(String[] args) {
        System.out.println(binaryUtils.toBinary(0));
        System.out.println(binaryUtils.toBinary(2));
        System.out.println(binaryUtils.toBinary(4));
        System.out.println(binaryUtils.toBinary(8));
        System.out.println(binaryUtils.toBinary(16));
        System.out.println(binaryUtils.toBinary(32));
        System.out.println(binaryUtils.toBinary(1));
        System.out.println(binaryUtils.toBinary(3));
        System.out.println(binaryUtils.toBinary(7));
        System.out.println(binaryUtils.toBinary(15));
        System.out.println(binaryUtils.toBinary(31));
        System.out.println(binaryUtils.toBinary(42));
    }
}
