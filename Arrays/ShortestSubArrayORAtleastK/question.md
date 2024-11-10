# Problem Statement

You are given an array `nums` of non-negative integers and an integer `k`.

A subarray of `nums` is called **special** if the bitwise OR of all its elements is at least `k`.

Return the length of the shortest special non-empty subarray of `nums`, or return `-1` if no such subarray exists.

## Example

### Example 1

```plaintext
Input: nums = [1, 2, 3], k = 3
Output: 2
Explanation: The shortest subarray with bitwise OR >= 3 is [2, 3], with length 2.
```
