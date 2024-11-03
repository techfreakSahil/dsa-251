# Rotate String Problem

## Problem Statement

Given two strings, `s` and `goal`, determine if `s` can become `goal` after performing some number of **shifts** on `s`.

A **shift** on `s` consists of moving the leftmost character of `s` to the rightmost position.

### Example

For example, if `s = "abcde"`, then after one shift it will be `"bcdea"`.

## Input and Output

### Example 1

**Input**:

- `s = "abcde"`
- `goal = "cdeab"`

**Output**:

- `true`

**Explanation**: By shifting `"abcde"` two times, we get `"cdeab"`, which matches `goal`.

### Example 2

**Input**:

- `s = "abcde"`
- `goal = "abced"`

**Output**:

- `false`

**Explanation**: No number of shifts on `"abcde"` can make it equal to `"abced"`.

## Constraints

- `s` and `goal` are both strings of lowercase English letters.
- The length of `s` and `goal` will be between 1 and 100.
