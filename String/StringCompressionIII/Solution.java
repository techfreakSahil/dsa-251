package String.StringCompressionIII;

public class Solution {
    public String compressedString(String word) {
        StringBuilder ans = new StringBuilder();
        for (int i = 0; i < word.length(); i++) {
            int j = i + 1;
            while (j < word.length() && word.charAt(i) == word.charAt(j)) {
                j++;
            }
            int size = j - i;
            while (size > 0) {
                int minSize = Math.min(9, size);
                ans.append(minSize);
                ans.append(word.charAt(i));
                size -= minSize;
            }
            i = j - 1;
        }
        return ans.toString();
    }
}
