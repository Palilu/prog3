package ejercicio04;

public class Pair<S, T> {

    private S left;
    private T right;

    public Pair(S left, T right) {
        this.left = left;
        this.right = right;
    }

    public S getLeft() {
        return left;
    }

    public T getRight() {
        return right;
    }

    @Override
    public String toString() {
        return "Pair{" +
                "left=" + left.toString() +
                ", right=" + right.toString() +
                '}';
    }
}
