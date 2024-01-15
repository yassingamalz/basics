# Data Structures, Design Patterns, and Algorithms Showcase

Welcome to my personal repository where I explore and implement various data structures, design patterns, and algorithms. This repository serves as a testament to my skills and understanding of fundamental concepts in computer science.

<details>
<summary><strong>Table of Contents</strong></summary>

- [Data Structures](#data-structures)
- [Design Patterns](#design-patterns)
- [Algorithms](#algorithms)

</details>

<details>
<summary><strong>Data Structures</strong></summary>

- [BasicStack](#basicstack)
- [BasicQueue](#basicqueue)
- [BasicHashSet](#basicHashSet)

</details>

<details>
<summary><strong>Design Patterns</strong></summary>

<!-- Add your design patterns here -->

</details>

<details>
<summary><strong>Algorithms</strong></summary>

- [SingleNumber](#singleNumber)

</details>

<details>
<summary><strong>How to Use</strong></summary>

<!-- Add instructions on how to use your code -->

</details>

## Data Structures
<details>
<summary><strong>BasicStack</strong></summary>

![BasicStack Image](https://cdn.programiz.com/sites/tutorial2program/files/stack.png)

In this project, I've implemented a versatile and efficient generic stack data structure. A stack follows the Last In, First Out (LIFO) principle, where elements are added and removed from the same end, known as the "top" of the stack.

#### Features

- **Generics Support**: The stack is designed to be generic, allowing it to store elements of any data type.
- **Dynamic Sizing**: The underlying array dynamically adjusts its size to accommodate the number of elements, ensuring optimal memory usage.
- **Push and Pop Operations**: The stack supports standard operations like push (to add an element) and pop (to remove and retrieve the top element).
- **Exception Handling**: An `IllegalArgumentException` is thrown if a pop operation is attempted on an empty stack, providing robust error handling.

#### Implementation Details
- **File**: [BasicStack.java](src/main/java/basics/structures/stack/BasicStack.java)

</details>

<details>
<summary><strong>BasicQueue</strong></summary>

![BasicQueue Image](https://media.geeksforgeeks.org/wp-content/uploads/20220805131014/fifo.png)

In this project, I've implemented a flexible and efficient generic queue data structure. A queue follows the First In, First Out (FIFO) principle, where elements are added at the back and removed from the front.

#### Features

- **Generics Support**: The queue is designed to be generic, allowing it to store elements of any data type.
- **Dynamic Sizing**: The underlying array dynamically adjusts its size to accommodate the number of elements, ensuring optimal memory usage.
- **Enqueue and Dequeue Operations**: The queue supports adding elements to the back (enqueue) and removing elements from the front (dequeue).
- **Exception Handling**: An `IllegalArgumentException` is thrown if a dequeue operation is attempted on an empty queue, providing robust error handling.

#### Implementation Details
- **File**: [BasicQueue.java](src/main/java/basics/structures/queue/BasicQueue.java)

</details>

<details>
<summary><strong>BasicHashSet</strong></summary>

![BasicHashSet Image](https://www.iunera.com/wp-content/uploads/image-264.png)

In this project, I've implemented a basic hash set data structure. A hash set is a collection of unique elements, and it uses a hash table for efficient insertion, deletion, and lookup operations.

#### Features

- **Generics Support**: The hash set is designed to be generic, allowing it to store elements of any data type.
- **Dynamic Sizing**: The underlying array dynamically adjusts its size to accommodate the number of elements, ensuring optimal memory usage.
- **Add, Remove, and Contains Operations**: The hash set supports adding elements, removing elements, and checking for element existence efficiently.
- **Collision Handling**: In case of hash collisions, this implementation uses a simple linear probing approach.

#### Implementation Details
- **File**: [BasicHashSet.java](src/main/java/basics/structures/hashtable/BasicHashSet.java)

</details>


## Algorithms

<details>
<summary><strong>136 Single Number Algorithm</strong></summary>

## 136 Single Number Algorithm
#### Problem Statement
Given an array of integers where every element appears twice except for one, find that single element.

#### Algorithm Explanation
We use the XOR (^) bitwise operation, exploiting its properties. XORing the same number twice cancels out (A ^ A = 0), and XORing with 0 does not change the value (A ^ 0 = A). By XORing all elements in the array, the duplicates cancel each other, leaving only the unique element.

#### Complexity Analysis
- **Time Complexity**: O(n) - where n is the length of the input array. We iterate through the entire array once.
- **Space Complexity**: O(1) - The algorithm uses a constant amount of extra space.

### Implementation Details
- **File**: [SingleNumber.java](src/main/java/basics/algorithms/SingleNumber.java)
</details>