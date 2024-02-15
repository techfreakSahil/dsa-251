function largestPerimeter(nums: number[]): number {
  nums.sort((a, b) => a - b);
  const sum = new Array(nums.length).fill(0);
  let curSum = 0;

  for (let i = 0; i < nums.length; i++) {
    sum[i] = curSum;
    curSum += nums[i];
  }

  for (let i = nums.length - 1; i >= 0; i--) {
    if (nums[i] < sum[i]) {
      return nums[i] + sum[i];
    }
  }

  return -1;
}
