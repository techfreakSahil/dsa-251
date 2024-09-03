package String.SumOfDigitsAfterString;

public class Solution {
    public int getLucky(String s, int k) {
        StringBuilder sb = new StringBuilder();
        int sum = 0;
        for (int i = 0; i < s.length(); i++) {
            sb.append(((int) (s.charAt(i)) - 96));
        }
        for (int i = 0; i < sb.length(); i++) {
            sum += (sb.charAt(i) - '0');
        }
        k--;
        while (k > 0) {
            int n = sum;
            sum = 0;
            while (n != 0) {
                int rem = n % 10;
                sum += rem;
                n /= 10;
            }
            k--;
        }
        return sum;
    }
}