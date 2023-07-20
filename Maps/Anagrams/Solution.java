package Maps.Anagrams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> mp = new HashMap<>();
        for (String s : strs) {
            char ch[] = s.toCharArray();
            Arrays.sort(ch);
            String word = String.valueOf(ch);
            if (!mp.containsKey(word)) {
                mp.put(word, new ArrayList<>());
            }
            mp.get(word).add(s);
        }
        return new ArrayList<>(mp.values());
    }
}
