
class Solution:
    def maxSubArray(self, nums) -> int:
        cur_sum = nums[0]
        max_sum = nums[0]
        for i in range(1,len(nums)):
            cur_sum = max(nums[i],cur_sum+nums[i])
            max_sum = max(cur_sum,max_sum)
        return max_sum    