package ejercicio05;

import java.util.List;

public class Main {

    public static void main(String[] args) {
        TaskAllocator taskAllocator = new TaskAllocator(3);
        System.out.println(taskAllocator.allocateTasks(List.of(1, 2, 3, 5, 8, 13)));
    }
}
