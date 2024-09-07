## Problem Description

You are given:

1. A binary tree represented by its root node `root`.
2. A singly linked list represented by its head node `head`.

Your task is to **determine if the elements in the linked list starting from `head` correspond to a downward path in the binary tree**.

In this context, a **downward path** is a path that starts at some node in the binary tree and moves downward along the tree’s edges (i.e., only traverses from parent to child nodes).

Return `True` if such a downward path exists in the binary tree that matches all the elements in the linked list. Otherwise, return `False`.
