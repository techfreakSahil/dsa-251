package String.Encoding;

class Solution {
    public static String encode(String message) {
        int count = 1, len = message.length();
        StringBuilder res = new StringBuilder();
        for (int i = 0; i < len; i++) {
            if (i < len - 1 && message.charAt(i) == message.charAt(i + 1)) {
                count++;
            } else {
                res.append(message.charAt(i));
                res.append(count);
                count = 1;
            }
        }

        return res.toString();
    }
}
