package TwoPointer.ContainerWithMostWater;

class Solution {
    public int maxArea(int[] height) {
        int start = 0;
        int ans = 0;
        int end = height.length - 1;
        while (start < end) {
            int minHeight = Math.min(height[start], height[end]);
            int width = end - start;
            ans = Math.max(ans, width * minHeight);
            if (height[start] < height[end]) {
                start++;
            } else {
                end--;
            }
        }
        return ans;
    }
}
