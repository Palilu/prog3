package ejercicio01;

public class Main {

    private static final Wallet wallet = new Wallet();

    /**
     * Cambio de monedas. Dado un conjunto C de N tipos de monedas con un número ilimitado de
     * ejemplares de cada tipo, se requiere formar, si se puede, una cantidad M empleando el mínimo
     * número de ellas. Por ejemplo, un cajero automático dispone de billetes de distintos valores: 100$,
     * 25$, 10$, 5$ y 1$, si se tiene que pagar 289$, la mejor solución consiste en dar 10 billetes: 2 de
     * 100$, 3 de 25$, 1 de 10$ y 4 de 1$.
     */
    public static void main(String[] args) {
        test(3000.00);
        test(1000.00);
        test(999.00);
        test(876.00);
        test(532.50);
        test(413.85);
        test(134.56);
        test(87.87);
        test(0.98);
    }

    private static void test(Double value) {
        System.out.println("$" + value + " " +  wallet.get(value));
    }
}
