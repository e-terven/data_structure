# Data Structure

#### Node
- is a basic data structure which contain _data_ and one or more _links_ to other nodes
- can be used to represent a linear structure - **LinkedList** / nonlinear structure - **Tree**  
![alt-фото](https://github.com/e-terven/data_structure/blob/8d5cfef41134791fcdde8b48ea43bc5fad27dc51/images/Screenshot%202023-07-22%20at%2017.18.39.png)  
"orphaned" nodes - a5 and a6 as no links pointing to them

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

  

#### Singly LinkedList vs. Doubly LinkedList
![alt-image](https://github.com/e-terven/data_structure/blob/39f2e089cfa695d02cd38bb2ba022a4b8a49087b/images/Screenshot%202023-07-22%20at%2021.04.23.png)  


#### References:  
Codecademy. _"Pass the Technical Interview with Java"_ Skill Path      
Simple Snippets. _["Doubly Linked List Data Structure"](https://simplesnippets.tech/doubly-linked-list-data-structure-all-operations-c-program-to-implement-doubly-linked-list/)_



