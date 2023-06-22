package String;

class Solution {
    public String reverseWords(String s) {
        s = s.trim() + " ";
        String word = "", res = "";
        int flag = 0;
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch != ' ') {
                word += ch;
                flag = 0;
            } else if (flag == 0) {
                res = word + " " + res;
                word = "";
                flag = 1;
            }
        }
        return res.trim();
    }
}
