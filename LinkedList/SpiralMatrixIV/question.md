## Problem Description

You are given:

- Two integers `m` and `n`, which represent the dimensions of a matrix.
- The head of a linked list of integers.

### Task

Your task is to generate an `m x n` matrix and fill it with the integers from the linked list in a spiral order (clockwise), starting from the top-left of the matrix. If the linked list runs out of integers before the matrix is filled, the remaining spaces should be filled with `-1`.

### Input

- `m`: an integer representing the number of rows of the matrix.
- `n`: an integer representing the number of columns of the matrix.
- A linked list of integers.

### Output

- A 2D list (matrix) of dimensions `m x n` filled with the integers from the linked list in spiral order. Remaining empty spaces (if any) should be filled with `-1`.

### Spiral Order

The spiral order traversal proceeds as follows:

1. Start from the top-left corner of the matrix.
2. Move right along the top row.
3. Move down the last column.
4. Move left along the bottom row.
5. Move up the first column.
6. Repeat the process for the remaining submatrix.

### Edge Cases

- If the linked list is shorter than `m * n`, the remaining spaces should be filled with `-1`.
- If the linked list is longer than `m * n`, only the first `m * n` integers from the list should be used.
