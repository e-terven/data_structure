# Data Structure

#### Node
- is a basic data structure which contain _data_ and one or more _links_ to other nodes
- can be used to represent a linear structure - **LinkedList** / nonlinear structure - **Tree**  
![alt-фото](https://github.com/e-terven/data_structure/blob/8d5cfef41134791fcdde8b48ea43bc5fad27dc51/images/Screenshot%202023-07-22%20at%2017.18.39.png)  
"orphaned" nodes - a5 and a6 as no links pointing to them

[ path: src/LinearDataStructure/Node.java ]
I created a Node class with the fields:    
_....public String data;  
....private Node next;  
....private Node previous;_   
and wrote the folloing methods in the Node class:
_....  public void setNextNode(Node node);_
_.setPreviousNode(Node node);_
_.getNextNode(Node node);_
_.getPreviousNode(Node node);_

#### Singly LinkedList
