package MultiArray.SumofZeroes;

import java.util.ArrayList;

public class Solution {
    public static Integer coverageOfMatrix(ArrayList<ArrayList<Integer>> mat) {
        int ans = 0;
        for (int i = 0; i < mat.size(); i++) {
            for (int j = 0; j < mat.get(0).size(); j++) {
                if (mat.get(i).get(j) == 0) {
                    if (i > 0 && mat.get(i - 1).get(j) == 1) {
                        ans++;
                    }
                    if (j > 0 && mat.get(i).get(j - 1) == 1) {
                        ans++;
                    }
                    if (i < mat.size() - 1 && mat.get(i + 1).get(j) == 1) {
                        ans++;
                    }
                    if (j < mat.get(0).size() - 1 && mat.get(i).get(j + 1) == 1) {
                        ans++;
                    }
                }
            }
        }
        return ans;
    }
}
