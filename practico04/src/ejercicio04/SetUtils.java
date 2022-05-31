package ejercicio04;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class SetUtils extends ejercicio03.SetUtils {

    public Boolean hasDisjointSubsets(Set<Integer> input) {
        var disjointSubsets = getDisjointSubsets(input);
        System.out.println(disjointSubsets);
        return !disjointSubsets.isEmpty();
    }

    public List<Pair<Set<Integer>, Set<Integer>>> getDisjointSubsets(Set<Integer> input) {
        List<Pair<Set<Integer>, Set<Integer>>> solutions = new ArrayList<>();
        getDisjointSubsets(new ArrayList<>(input), 0, new HashSet<>(), new HashSet<>(), solutions);
        return solutions;
    }

    private void getDisjointSubsets(List<Integer> input,
                                    int i,
                                    Set<Integer> temp1,
                                    Set<Integer> temp2,
                                    List<Pair<Set<Integer>, Set<Integer>>> solutions) {
        Integer sum1 = temp1.stream().reduce(0, Integer::sum);
        Integer sum2 = temp2.stream().reduce(0, Integer::sum);
        if (sum1.compareTo(sum2) == 0 && !temp1.isEmpty() && !temp2.isEmpty()) {
            solutions.add(new Pair(new HashSet<>(temp1), new HashSet<>(temp2)));
        } else if (i < input.size()) {
            Integer value = input.get(i);
            temp1.add(value);
            getDisjointSubsets(input, i + 1, temp1, temp2, solutions);
            temp1.remove(value);
            temp2.add(value);
            getDisjointSubsets(input, i + 1, temp1, temp2, solutions);
            temp2.remove(value);
            getDisjointSubsets(input, i + 1, temp1, temp2, solutions);
        }
    }
}
