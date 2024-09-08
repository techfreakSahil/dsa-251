## Problem Description

Given the head of a singly linked list and an integer `k`, split the linked list into `k` consecutive linked list parts.

The length of each part should be as equal as possible:

- No two parts should have a size differing by more than one.
- This may lead to some parts being null.

The parts should be split in the order of occurrence in the input list, and parts occurring earlier should always have a size greater than or equal to parts occurring later.

## Return

Return an array of the `k` parts.

## Example

```text
Input: head = [1, 2, 3], k = 5
Output: [[1], [2], [3], [], []]
```
