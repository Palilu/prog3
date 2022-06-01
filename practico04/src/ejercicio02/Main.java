package ejercicio02;

public class Main {

    public static void main(String[] args) {
        Board board = new Board(3, 3);
        // x/y 0  1  2
        //  0  1  4  6
        //  1  7  8  2
        //  2  5  9  3
        board.put(0, 0, new Cell(1, false, true, true, false));
        board.put(0, 1, new Cell(4, false, true, true, true));
        board.put(0, 2, new Cell(6, false, false, true, true));
        board.put(1, 0, new Cell(7, true, true, true, false));
        board.put(1, 1, new Cell(8, true, true, true, true));
        board.put(1, 2, new Cell(2, true, false, true, true));
        board.put(2, 0, new Cell(5, true, true, false, false));
        board.put(2, 1, new Cell(9, true, true, false, true));
        board.put(2, 2, new Cell(3, true, false, false, true));

        System.out.println(board.getMinPath(0, 0, 2, 2));
    }
}
