# Data Structure

### Context
#### Linear Data Structure   
* Linked List  /  Doubly Linked List  /  Queue  /  Stack     
#### Nonlinear Data Structure   
* Tree  /  Binary Search Tree  /  minHeap-maxHeap      
#### Hash Map 
#### Graph Data Structure  
* Graph Traversal DFS - BFS /  Dijkstra's Algorithm     
#### Algorithmic Concepts  
* Recursion  /  Algorithmic Complexity   
#### Sorting Algorithms  
*  Bubble Sort  /  Merge Sort  /  Quicksort  
  
================  ================  ================

#### Node
- a basic data structure which contain _data_ and one or more _links_ to other nodes
- can be used to represent a _linear_ structure - **LinkedList** / _nonlinear_ structure - **Tree**  
![alt-фото](https://github.com/e-terven/data_structure/blob/8d5cfef41134791fcdde8b48ea43bc5fad27dc51/images/Screenshot%202023-07-22%20at%2017.18.39.png)  
- "orphaned" nodes - a2 and a5 as no links pointing to them

` path: src/LinearDataStructure/Node.java ` where a Node class was created adding getters and setters:
```java
public class Node {
        public String data;
        private Node next;
        private Node previous;

        public Node(String data) {
            this.data = data;
            this.next = null;
        }
```

----
#### LinkedList

```java
|        Singly LinkedList        |         Doubly LinkedList         | |             ArrayList               |
|---------------------------------|-----------------------------------| |-------------------------------------|
|  public void addToHead(data) {} |  public void addToHead(data) {}*  | |                                     |   
|  public void addToTail(data) {} |  public void addToTail(data) {}*  | |                                     |
|---------------------------------|-----------------------------------| |-------------------------------------|
|  public String removeHead() {}  |   public String removeHead() {}*  | |                                     |
|          did not apply          |   public String removeTail() {}   | |                                     |
|---------------------------------|-----------------------------------| |-------------------------------------| 
|          did not apply          | public Node removeByData(data) {} | |  public int[] removeByData(data) {} |
|---------------------------------|-----------------------------------| |-------------------------------------|
|                      public void printList() {}                     | |     public void printList() {}*     |
 -------------------------------------------------------------------------------------------------------------
 -------------------------------------------------------------------------------------------------------------
|                                 |     + interface Deque methods:    | |                                     |
|---------------------------------------------------------------------| |-------------------------------------|
|                                 |    .getFirst(); / .getLast();     | |                                     |
|                                 |                                   | |                                     |
|                                 |    .peekFirst(); / .peekLast();   | |                                     |
 -------------------------------------------------------------------------------------------------------------
 -------------------------------------------------------------------------------------------------------------
|                                        <<<  Swapping Elements  >>>                                          |
| ------------------------------------------------------------------------------------------------------------|
|    linear (sequential) search   |                                   | |            binary search            |
| ------------------------------------------------------------------------------------------------------------|  
|  while (node1 != null) {        |                                   | |                                     |
|    if (node1.data == data1) {   |                                   | |                                     | 
|       break;                    |                                   | |                                     |
|    }                            |                                   | |                                     |
|    node1Prev = node1;           |                                   | |                                     |
|    node1 = node1.getNextNode(); |                                   | |                                     |
|  }                              |                                   | |                                     |
| ------------------------------------------------------------------------------------------------------------|
|                                          <<<  Big O Notation  >>>                                           |
| ------------------------------------------------------------------------------------------------------------|   
|      Time Complexity: O(N)      |                                   | |       Time Complexity: O(logN)      |
|          (head/tail): O(1)      |                                   | |                                     |
|      Space Complexity: O(1)     |                                   | |                                     |
|-------------------------------------------------------------------------------------------------------------|
```

![alt-image](https://github.com/e-terven/data_structure/blob/7ceab5b7d1f72099725caf9d0bbc2b55bc9b365c/images/Screenshot%202023-07-22%20at%2021.04.23.png)  

##### "Runner" Technique

----
![alt-image](https://github.com/e-terven/data_structure/blob/af987c8b3c3742cc589b3fd61ea541a60a811c84/images/Screenshot%202023-08-24%20at%2014.14.02.png)

##### Asymptomatic Notation (Time and Space Complexity)
          ... is a general way of describing the function's runtime based on the input
          Adding Runime (when we neglect costants and focus on a dominant term) 
          Thus, Θ(N) + Θ(N*logN) = Θ(N)         

![alt-image](https://github.com/e-terven/data_structure/blob/12bad7a9f04cb61eeebbfdfd5223f1da581b213d/images/common_runtime%202023-08-01%20at%2000.04.21.png)  

_... the most efficient_
###### Constatnt Runtime **Θ(1)**: highly efficient as the algorithm is not influenced by _the data unput_ (e.g. the program use only constants or print the same String);  
###### Logarithmic Runtime **O(logN)**: (e.g. binary search);
###### Linear Runtime **O(N)**: (e.g. linear search (first part of the list preffered)
###### **Θ(N*logN)** for sorting algorithms;
###### Quadratic Runtime **Θ(N^2)**: (e.g.search through a two-dimensional dataset (like a matrix) or nested loops);
###### Exponential Runtime **Θ(2^N)**: (e.g. recursive algorithms);
###### Factorial Runtime **Θ(N!)**: to generate all possible ways of arranging ittems in differentt order (aka permutation)     
_... the least efficient_   


----

*** Big Omega (Ω) for the best case *** Big O (O) for the worst case *** Big Theta (Θ) for onle case scenario ***

----  
##### Sorting Algorithms
![alt-image](https://github.com/e-terven/data_structure/blob/87b9fdb9e7dfb7bac66f7ab7e8297519fc16796a/images/Screenshot%202023-08-23%20at%2019.07.27.png)   



**DFS Depth-First Search** moves forward every time visiting a new vertex (employs a Stack or Recursion)  
[ _is useful for determining whether a path exists between two points - find out if the solution exists for a maze_ ]      

**BFS Breadth-First Search** visits every conection before moving forward (by using a Queue)     
[ _is helpful in finding the shortest path between two points_ - useful for map navigation (GPS system) tools because it helps determine the shortest path between two vertices ]

**Traversal Methods:**  
PRE-Order Traversal:  start at the ROOT node + DFS (e.g. to create a copy of the tree or graph)     
>> _visit current node, left subtree, right subtree_  
  
POST-Order Traversal: start at the ROOT node but visit children before their parent (e.g. to delete the tree or graph)  
>> _traverse left subtree, right subtree, visit current node_  
  
Reverse POST-Order Traversal  
>> _visit current node, traverse right subtree in reverse post-order, traverse left subtree in reverse post-order_  

RUNTIME: O(E + V)

**Dijkstra's Algorithm:**  
- to find all of the shortest distances between a start vertex and the rest of the vertices in a graph

RUNTIME: 0((E + V) logV)
(in the worst case... (V+E)loop iterations x (logV) to update minHeap each iteration)
Dijkstra’s Algorithm does not work with negative edge weights



#### References:  
Codecademy. _"Pass the Technical Interview with Java"_ Skill Path      
Simple Snippets. _["Doubly Linked List Data Structure"](https://simplesnippets.tech/doubly-linked-list-data-structure-all-operations-c-program-to-implement-doubly-linked-list/)_

happy coding!

