package ejercicio03;

public class BinaryUtils {

    public Long toBinary(Integer value) {
        if (value == 0) {
            return 0L;
        } else {
            return value % 2 + 10 * toBinary(value / 2);
        }
    }
}
