# Problem Description

## Task

You are given two integers `n` and `x`. Your task is to construct an array `nums` of size `n` such that:

- The array is **strictly increasing**, i.e., `nums[i] < nums[i+1]` for all `0 <= i < n - 1`.
- The result of the **bitwise AND** operation on all the elements of the array should equal `x`, i.e., `nums[0] & nums[1] & ... & nums[n-1] = x`.

Return the **minimum possible value** of `nums[n-1]`.

## Input

- An integer `n` (1 <= n <= 10^5) — the size of the array.
- An integer `x` (1 <= x <= 10^9) — the target bitwise AND value.

## Output

- Return an integer, which is the minimum possible value of `nums[n-1]`.
