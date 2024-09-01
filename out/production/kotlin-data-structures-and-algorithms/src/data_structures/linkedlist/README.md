## Linked List
A linked list is a linear data structure where each element is a separate object.
Linked list elements are not stored at contiguous location; the elements are linked using pointers.

### Singly Linked List
Each node of a list is made up of two items - the data and a reference to the next node. The last node has a reference to null. The entry point into a linked list is called the head of the list. It should be noted that head is not a separate node, but the reference to the first node. If the list is empty then the head is a null reference.

![linkedlist](https://media.geeksforgeeks.org/wp-content/uploads/20240410135517/linked-list.webp)

***

### Circular Linked List
In Circular Singly Linked List, each node has just one pointer called the “next” pointer. The next pointer of last node points back to the first node and this results in forming a circle. In this type of Linked list we can only move through the list in one direction.

![circularlinkedlist](https://media.geeksforgeeks.org/wp-content/uploads/20240806130914/Representation-of-circular-linked-list.webp)

***

### Doubly Linked List
A doubly linked list is a data structure that consists of a set of nodes, each of which contains a value and two pointers, one pointing to the previous node in the list and one pointing to the next node in the list. This allows for efficient traversal of the list in both directions, making it suitable for applications where frequent insertions and deletions are required.

![doublylinkedlist](https://media.geeksforgeeks.org/wp-content/uploads/20240809123741/Insertion-at-the-End-in-Doubly-Linked-List-copy.webp)

***

>Reference: geeksforgeeks