package ejercicio02;

import ejercicio04.Pair;

import java.util.ArrayList;
import java.util.List;

public class Board {

    private Cell[][] board;
    private List<Cell> best;

    public Board(Integer x, Integer y) {
        board = new Cell[x][y];
    }

    public void put(Integer x, Integer y, Cell cell) {
        board[x][y] = cell;
    }

    public List<Cell> getMinPath(Integer xFrom,
                                           Integer yFrom,
                                           Integer xTo,
                                           Integer yTo) {
        best = new ArrayList<>();
        List<Cell> temp = new ArrayList<>();
        temp.add(board[xFrom][yFrom]);
        getMinPath(xFrom, yFrom, xTo, yTo, temp);
        return best;
    }

    public void getMinPath(Integer xFrom,
                           Integer yFrom,
                           Integer xTo,
                           Integer yTo,
                           List<Cell> temp) {

        if (xFrom == xTo && yFrom == yTo) {
            Integer sum = temp.stream().map(Cell::getValue).reduce(0, Integer::sum);

            Integer bestSum = Integer.MAX_VALUE;
            if (!best.isEmpty()) {
                bestSum = best.stream().map(Cell::getValue).reduce(0, Integer::sum);
            }
            System.out.println("Llegué con best: " + bestSum + " sum: " + sum + " por " + temp);
            if (sum.compareTo(bestSum) < 0) {
                System.out.println("sum: " + sum + " is best... wi!!!");
                best = new ArrayList<>(temp);
            }
        } else {
            for (Pair<Integer, Integer> pair : nextSteps(xFrom, yFrom)) {
                Cell cell = board[pair.getLeft()][pair.getRight()];
                if (!temp.contains(cell)) { // Para evitar ciclos en mi solución temporal
                    temp.add(cell);
                    getMinPath(pair.getLeft(), pair.getRight(), xTo, yTo, temp);
                    temp.remove(cell);
                }
            }
        }
    }

    private List<Pair<Integer, Integer>> nextSteps(Integer x, Integer y){
        List<Pair<Integer, Integer>> nextSteps = new ArrayList<>();
        Cell cell = board[x][y];
        // x/y 0  1  2
        //  0  1  4  6
        //  1  7  8  2
        //  2  5  9  3
        if (cell.getNorth()) {
            nextSteps.add(new Pair(x - 1, y));
        }
        if (cell.getEast()) {
            nextSteps.add(new Pair(x, y + 1));
        }
        if (cell.getSouth()) {
            nextSteps.add(new Pair(x + 1, y));
        }
        if (cell.getWest()) {
            nextSteps.add(new Pair(x, y - 1));
        }
        return nextSteps;
    }
}
