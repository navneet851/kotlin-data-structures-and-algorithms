## Queues

A Queue Data Structure is a fundamental concept in computer science used for storing and managing data in a specific order. It follows the principle of “First in, First out” (FIFO), where the first element added to the queue is the first one to be removed. Queues are commonly used in various algorithms and applications for their simplicity and efficiency in managing data flow.

### Basic Operations on Queue
* **Enqueue** (Insert): Adds an element to the rear of the queue.
* **Dequeue** (Delete): Removes and returns the element from the front of the queue.
* **Peek**: Returns the element at the front of the queue without removing it.
* **Empty**: Checks if the queue is empty.
* **Full**: Checks if the queue is full.


### Main Types of Queues:
* Linear Queue
* Circular Queue
* Priority Queue
* Double Ended Queue


### Linear Queue

In Linear Queue, an insertion takes place from one end while the deletion occurs from another end. The end at which the insertion takes place is known as the rear end, and the end at which the deletion takes place is known as front end. It strictly follows the FIFO rule.

![linearqueue](https://media.geeksforgeeks.org/wp-content/cdn-uploads/20230726165642/Queue-Data-structure1.png)

***

### Circular Queue

Circular Queue is a linear data structure in which the operations are performed based on FIFO (First In First Out) principle and the last position is connected back to the first position to make a circle. It is also called ‘Ring Buffer’

![circularqueue](https://static.javatpoint.com/ds/images/ds-types-of-queue4.png)

***

### Priority Queue

A priority queue is a special type of queue in which each element is associated with a priority and is served according to its priority. There are two types of Priority Queues. They are:

* **Ascending Priority Queue:** Element can be inserted arbitrarily but only smallest element can be removed. For example, suppose there is an array having elements 4, 2, 8 in the same order. So, while inserting the elements, the insertion will be in the same sequence but while deleting, the order will be 2, 4, 8.

![asecpriorityqueue](https://static.javatpoint.com/ds/images/ds-priority-queue.png)


* **Descending priority Queue:** Element can be inserted arbitrarily but only the largest element can be removed first from the given Queue. For example, suppose there is an array having elements 4, 2, 8 in the same order. So, while inserting the elements, the insertion will be in the same sequence but while deleting, the order will be 8, 4, 2.

![desecpriorityqueue](https://static.javatpoint.com/ds/images/ds-priority-queue2.png)

***

### Double Ended Queue

Double Ended Queue is also a Queue data structure in which the insertion and deletion operations are performed at both the ends (front and rear). That means, we can insert at both front and rear positions and can delete from both front and rear positions.  Since Deque supports both stack and queue operations, it can be used as both. The Deque data structure supports clockwise and anticlockwise rotations in O(1) time which can be useful in certain applications. Also, the problems where elements need to be removed and or added both ends can be efficiently solved using Deque.

![doubleendedqueue](https://media.geeksforgeeks.org/wp-content/uploads/20220623131811/doubleended.jpg)

***

>Reference : geeksforgeeks, javatpoint



