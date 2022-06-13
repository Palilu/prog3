package ejercicio05;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TaskAllocator {

    private List<Integer> best;
    private Integer[] temp;

    public TaskAllocator(Integer numberOfProcessors) {
        this.temp = new Integer[numberOfProcessors];
        for (int i = 0; i < numberOfProcessors; i++) {
            temp[i] = 0;
        }
    }

    public List<Integer> allocateTasks(List<Integer> taskCosts) {
        doAllocateTasks(taskCosts, 0);
        return best;
    }

    public void doAllocateTasks(List<Integer> taskCosts, Integer index) {
        if (index == taskCosts.size()) {
            Integer bestValue = best == null ? Integer.MAX_VALUE : best.stream().mapToInt(Integer::intValue).max().getAsInt();
            if (getMaxTime(temp).compareTo(bestValue) < 0) {
                best = new ArrayList<>(Arrays.asList(temp));
            }
        } else {
            for (int p = 0; p < temp.length; p++) {
                temp[p] += taskCosts.get(index);
                doAllocateTasks(taskCosts, index + 1);
                temp[p] -= taskCosts.get(index);
            }
        }
    }

    private Integer getMaxTime(Integer[] array) {
        return Arrays.stream(array).mapToInt(Integer::intValue).max().getAsInt();
    }
}
