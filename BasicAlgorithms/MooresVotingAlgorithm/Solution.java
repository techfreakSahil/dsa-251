package BasicAlgorithms.MooresVotingAlgorithm;

public class Solution {
    public static void main(String[] args) {

        int[] arr = { 3, 3, 4, 2, 4, 4, 2, 4, 4 };
        int majorityElement = findMajorityElement(arr);

        if (majorityElement != -1) {
            System.out.println("Majority Element: " + majorityElement);
        } else {
            System.out.println("No Majority Element");
        }
    }

    static int findMajorityElement(int[] nums) {
        int candidate = -1;
        int count = 0;

        for (int num : nums) {
            if (count == 0) {
                candidate = num;
                count = 1;
            } else if (candidate == num) {
                count++;
            } else {
                count--;
            }
        }
        count = 0;
        for (int num : nums) {
            if (num == candidate) {
                count++;
            }
        }

        return (count > nums.length / 2) ? candidate : -1;
    }
}
