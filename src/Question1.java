import java.util.HashMap;
import java.util.Map;
import java.util.Arrays;

public class Question_1 {

    public static int[] Twonumbers(int[] arr) {
        Map<Integer, Integer> frequencyMap = new HashMap<>();
        
        for (int num : arr) {
            frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
        }
        
        int[] result = new int[2];
        int index = 0;
        
        for (int num : frequencyMap.keySet()) {
            if (frequencyMap.get(num) == 1) {
                result[index] = num;
                index++;
            }
        }
        
        Arrays.sort(result);
        
        return result;
    }

    public static void main(String[] args) {
        int N = 2;
        int[] arr = {1, 2, 3, 2, 1, 4};
        
        int[] result = Twonumbers(arr);
        
        System.out.println(result[0] + " " + result[1]);
    }
}
