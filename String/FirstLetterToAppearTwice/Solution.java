package String.FirstLetterToAppearTwice;

import java.util.HashMap;

public class Solution {
    public char repeatedCharacter(String s) {
        HashMap<Character, Integer> hm = new HashMap<>();

        char ans = ' ';
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            hm.put(ch, hm.getOrDefault(ch, 0) + 1);
            if (hm.get(ch) >= 2) {
                ans = ch;
                break;
            }

        }

        return ans;

    }
}
