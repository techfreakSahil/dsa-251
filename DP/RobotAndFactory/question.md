# Minimum Total Distance Between Robots and Factories

## Problem Statement

Given a list of robots' positions and a list of factories, each with a position and capacity, determine the minimum total distance required to assign each robot to a factory position. Each factory can accommodate multiple robots based on its capacity, and each robot must be assigned to exactly one factory position.

### Input

- **`robot`**: A list of integers representing the positions of robots.
- **`factory`**: A 2D list where each element is `[position, capacity]`:
  - `position`: the location of the factory.
  - `capacity`: the number of robots the factory can accommodate at that position.

### Output

- A single integer representing the minimum total distance for assigning all robots to factory positions.

### Constraints

- `1 <= robot.length, factory.length <= 100`
- Each position and capacity is a positive integer within an appropriate range.

## Examples

### Example 1

- **Input**:
  ```java
  robot = [1, 5, 9]
  factory = [[2, 2], [8, 1]]
  ```
