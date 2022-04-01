package ejercicio09;

/**
 * Ejercicio 9.
 *
 * Verificar si una cadena de texto es palindroma (capicua).
 */
public class Main {

    private static PalindromeUtils palindromaUtils = new PalindromeUtils();

    public static void main(String[] args) {
        print("Roberto");
        print("palilulilap");
        print("La ruta nos aporto otro paso natural");
    }

    private static void print(String value) {
        if (palindromaUtils.isPalindrome(value)) {
            System.out.println(value + " es un palíndromo.");
        } else {
            System.out.println(value + " no es un palíndromo.");
        }
    }
}
