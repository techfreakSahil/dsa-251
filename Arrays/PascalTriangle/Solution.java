package Arrays.PascalTriangle;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> ans = new ArrayList<List<Integer>>();
        List<Integer> prev = null;
        for (int i = 1; i <= numRows; i++) {
            List<Integer> row = new ArrayList<Integer>();
            for (int j = 1; j <= i; j++) {
                if (j == 1 || j == i) {
                    row.add(1);
                } else {
                    row.add(prev.get(j - 1) + prev.get(j - 2));
                }
            }
            ans.add(row);
            prev = row;
        }
        return ans;
    }
}
