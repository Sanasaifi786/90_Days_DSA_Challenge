import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class groupAnagram {
    public static List<List<String>> groupAnagrams(String[] strs) {
        for(int i =0; i<strs.length;i++)
        {
            char c[] = strs[i].toCharArray();
            Arrays.sort(c);
            String sorted = new String(c);
            strs[i] = sorted;
        }
        List<List<String>> arr = new ArrayList<>();
        List<String> nums = new ArrayList<>();
        for(int j=0; j<strs.length; j++)
        {
            nums.add(strs[j]);
        }
        arr.add(nums);
        return arr;
    }
    public static void main(String[] args) {
        String[] strs = {"eat","tea","tan","ate","nat","bat"};
        System.out.println(groupAnagrams(strs));
    }
}
