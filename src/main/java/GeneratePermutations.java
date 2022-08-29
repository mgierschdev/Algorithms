import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

public class GeneratePermutations {
    List<int[]> perm;

    public List<int[]> generatePermutations(int[] nums){
        perm = new LinkedList<>();
        List<Integer> l = Arrays.stream(nums).boxed().collect(Collectors.toList());
        generatePermutations(l, new ArrayList<>());
        return perm;
    }

    private void generatePermutations(List<Integer> nums, List<Integer> prefix){
        if(nums.size() == 0){
            int[] a = prefix.stream().mapToInt(i -> i).toArray();
            perm.add(a);
        }else{

            for(int i = 0; i < nums.size(); i++){
                List<Integer> tmp = new ArrayList<>();
                tmp.addAll(nums.subList(0, i));
                tmp.addAll(nums.subList(i + 1, nums.size()));

                List<Integer> tmp2 = new ArrayList<>();
                tmp2.addAll(prefix);
                tmp2.add(nums.get(i));

                generatePermutations(tmp, tmp2);
            }
        }
    }
}
