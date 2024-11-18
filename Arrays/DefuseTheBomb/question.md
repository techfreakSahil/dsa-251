# Problem: Defuse the Bomb

You are tasked with decrypting a circular array code to defuse a bomb. Follow the rules below:

## Rules:

1. **Input:** A circular array `code` of length `n` and an integer `k`.
2. **Decryption:**
   - If `k > 0`: Replace the `i`th number with the sum of the next `k` numbers.
   - If `k < 0`: Replace the `i`th number with the sum of the previous `k` numbers.
   - If `k == 0`: Replace the `i`th number with `0`.
3. **Circular Property:** The array is circular, so:
   - The next element of `code[n-1]` is `code[0]`.
   - The previous element of `code[0]` is `code[n-1]`.

## Input:

- `code`: A list of integers representing the circular array.
- `k`: An integer, the decryption key.

## Output:

- Return a list representing the decrypted code.

## Example:

# Example Input:

code = [5, 7, 1, 4]
k = 3

# Example Output:

[12, 10, 16, 13]
