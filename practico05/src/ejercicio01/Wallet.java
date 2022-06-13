package ejercicio01;

import java.util.ArrayList;
import java.util.List;

public class Wallet {

    private static final List<Double> values = List.of(
            1000D, 500D, 200D, 100D, 50D, 20D, 10D, 5D, 2D, 1D, // Pesos
            0.5, 0.25, 0.10, 0.05, 0.01); // Centavos

    public List<Double> get(Double amount) {
        Double sum = 0D;
        int index = 0;
        List<Double> result = new ArrayList<>();
        while (sum.compareTo(amount) != 0  && index < values.size()) {
            Double current = values.get(index);
            int c = amount.compareTo(sum + current);
            if (c >= 0) {
                result.add(current);
                sum += current;
            } else if (c < 0) {
                index = index + 1;
            }
        }
        return result;
    }
}
