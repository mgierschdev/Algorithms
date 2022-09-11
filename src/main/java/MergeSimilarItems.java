import java.util.*;

public class MergeSimilarItems {
    public List<List<Integer>> mergeSimilarItems(int[][] items1, int[][] items2) {

        HashMap<Integer, Integer> map = new HashMap<>();

        for(int[] i : items1){
            map.put(i[0], i[1] + map.getOrDefault(i[0], 0));
        }

        for(int[] i : items2){
            map.put(i[0], i[1] + map.getOrDefault(i[0], 0));
        }

        List<List<Integer>> list = new LinkedList<>();

        for(Map.Entry<Integer, Integer> set: map.entrySet()){
            List<Integer> l = new LinkedList<>();
            l.add(set.getKey());
            l.add(set.getValue());
            list.add(l);
        }

        list.sort((List<Integer> a, List<Integer> b) -> b.get(0) - a.get(0));
        return list;
    }
}
