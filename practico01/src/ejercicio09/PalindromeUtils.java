package ejercicio09;

/**
 * Ejercicio 9.
 *
 * Verificar si una cadena de texto es palindroma (capicua).
 */
public class PalindromeUtils {

    public boolean isPalindrome(String param) {
        String value = param.toLowerCase().replace(" ", "");
        if (value == null || value.isEmpty()) {
            return true;
        }
        for (int i=0; i < value.length() / 2; i++) {
            if (value.charAt(i) != value.charAt(value.length() - 1 - i)) {
                return false;
            }
        }
        return true;
    }
}
