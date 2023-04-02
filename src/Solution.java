import java.util.Arrays;
import java.util.Comparator;

class Solution {
    public String sortSentence(String s) {
        String[] arr = s.split("\\s");
        Arrays.sort(arr, Comparator.comparingInt(a -> Integer.parseInt(a.replaceAll("\\D", ""))));
        for(int i = 0; i <arr.length; i++){
            arr[i] = arr[i].replaceAll("\\d", "");
        }
        String ans = String.join(" ", arr);
        return ans;
    }
}
