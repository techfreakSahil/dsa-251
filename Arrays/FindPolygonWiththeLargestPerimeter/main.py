from ast import List


class Solution:
    def largestPerimeter(self, nums: List[int]) -> int:
        nums.sort()
        cur_sum = 0
        sum=[0]*len(nums)
        for i in range(len(nums)):
            sum[i]=cur_sum
            cur_sum +=nums[i]
        for i in range(len(nums)-1,-1,-1):
            if nums[i]<sum[i]:
                return nums[i]+sum[i]
        return -1        

        