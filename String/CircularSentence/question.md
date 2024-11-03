# Circular Sentence Problem

## Problem Statement

A **sentence** is a list of words separated by a single space, with no leading or trailing spaces.

Examples of valid sentences:

- `"Hello World"`
- `"HELLO"`
- `"hello world hello world"`

Words consist only of uppercase and lowercase English letters, which are considered different characters.

A **sentence** is defined as **circular** if:

1. The last character of a word is equal to the first character of the next word.
2. The last character of the last word is equal to the first character of the first word.

Examples of circular sentences:

- `"leetcode exercises sound delightful"`
- `"eetcode"`
- `"leetcode eats soul"`

Examples of non-circular sentences:

- `"Leetcode is cool"`
- `"happy Leetcode"`
- `"Leetcode"`
- `"I like Leetcode"`

## Input

- A string `sentence`, which represents the sentence to be checked for circularity.

## Output

- Return `true` if the sentence is circular.
- Return `false` if the sentence is not circular.

## Constraints

- The input sentence will contain only English letters and spaces.
- Each word in the sentence is separated by exactly one space.

## Example Test Cases

### Test Case 1

**Input**: `"leetcode exercises sound delightful"`  
**Output**: `true`  
**Explanation**: The sentence is circular as each word follows the circular rule.

### Test Case 2

**Input**: `"Leetcode is cool"`  
**Output**: `false`  
**Explanation**: The last letter of "Leetcode" is "e", which does not match the first letter of "is".

### Test Case 3

**Input**: `"eetcode"`  
**Output**: `true`  
**Explanation**: The single word forms a circular sentence by itself.

### Test Case 4

**Input**: `"happy Leetcode"`  
**Output**: `false`  
**Explanation**: The last letter of "happy" is "y", which does not match the first letter of "Leetcode".
