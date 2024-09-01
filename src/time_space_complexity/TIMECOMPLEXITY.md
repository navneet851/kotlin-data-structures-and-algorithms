## Time Complexity Of A Computer Program

What is Time complexity and What is its need?
Let us take one example, suppose your friend picked a number between 1 to 1000 and he told you to guess the number. If your guess is correct he will tell you that it is correct, otherwise, if your guess is bigger than his number he would tell you that it's 'too big and if it is smaller than his number then he would tell you that it is ‘too small. Here are some ways by which we could find the number.

We can guess each number from 1 to 1000, and see if it is correct.
We can pick the middle number, if he says ‘too big’ then we know for sure that the number is on the left side so we can discard the right side, similarly if he says ‘too small’ we can discard the left side. We can repeat the same process until he says it's correct.
Which way do you think is better?
As you might have guessed correctly, the 2nd way is actually way better than the first way. In the worst case, the 1st way would take 1000 guesses before we get the correct number ( if the number is 1000 ), while the 2nd way would only take 10 guesses in the worst case ( this is because at every guess we discard one of the halves).

Later you would see that the time complexity of the first way is O(n) and that of the second way is O(logn).

As we saw from the above example there can be multiple approaches to solving the same problem. The same applies to computer programming. For every approach (algorithm) the time taken, amount of space used, and computational power might be different. Therefore there has to be a way by which we can distinguish these different approaches (algorithms) and choose the one which is the most efficient.

In this article, we are going to speak about how we can choose the best algorithm based on the time taken by an algorithm to execute. But how do we compare the algorithms which are written in two different languages, running on two different machines? This is exactly why the concept of time complexity was introduced. But what is time complexity?

By definition, Time complexity is the time taken by an algorithm/program to run as a function of the length of the input.

### Why is it so important?

It can clearly distinguish between two different algorithms based on their efficiency.
It’s independent of the machine on which the algorithm is run.
We can get a direct correlation with the length of the input.
It’s important to note here that time complexity doesn’t really measure the actual time taken by an algorithm to run ( Since that kind of depends on the programming language, processing power etc.). It calculates the execution time of an algorithm in terms of the algorithms and the inputs.

### Asymptotic notations
Asymptotic notations are mathematical notations which are used to describe the running time of an algorithm when input tends towards infinity.

<br/>For example, in the last section, we discussed an example where we had to find ‘1’ in the array. We saw that when the input array had ‘1’ in its first position the time taken by the algorithm was constant, whereas when the array had ‘1’ in its last position or did not have ‘1’ at all, the time taken by the algorithm was linear.

There are mainly 3 types of Asymptotic notations:

> 1. Big-O notation: The Big-O notation describes the worst-case running time of an algorithm. It is computed by counting the number of operations it will take in the worst-case scenario with the input ‘n’.

_O(g(n)) = { f(n): there exist positive constants c and n0<br/>
such that 0 ≤ f(n) ≤ cg(n) for all n ≥ n0 }_
> 2. Big Omega() notation: The notation describes the best running time of an algorithm. It is computed by counting the number of operations it will take in the best-case scenario with the input ‘n’.

_Ω(g(n)) = { f(n): there exist positive constants c and n0<br/>
such that 0 ≤ cg(n) ≤ f(n) for all n ≥ n0 }_
> 3. Big Theta() Notation: The theta notation encloses the function from above and below, therefore it defines the exact asymptotic behaviour. The notation is used for analyzing the average runtime of an algorithm.

_Θ(g(n)) = { f(n): there exist positive constants c1, c2 and n0<br/>
such that 0 ≤ c1g(n) ≤ f(n) ≤ c2g(n) for all n ≥ n0 }_<br/><br/>
It’s important to note here that O, and are not functions. For example, O(n) represents the class of all functions that grow at most as quickly as the linear function f(n)=n.

Big-O notations give us a convenient way to talk about upper bounds. For example, we can say the time complexity of the algorithm is O(n^3) ( i.e. T(n)  O(n^3) ), which means that the running time of the algorithm is at most cubic.

Another point to note here is that running time and time complexity are two different things, for example, if the running time of an algorithm is the following T(n)= 3*n^2 + 4*n + 2, the time complexity would be O(n^2).

### Types of Time Complexity
Some Common Algorithmic Runtimes. (from fastest to slowest)

*  **O(1)	Constant Time Complexity	Example: Sum of two numbers.**
* **O(logn)	Logarithmic Time Complexity	Example: Finding an element in a sorted array by using binary search.**
* **O(n)	Linear Time Complexity	Example: Finding the sum of an array of size n.**
* **O(n logn)	Log-Linear Time Complexity	Example: Sorting the array using merge sort.**
* **O(n2)	Quadratic Time Complexity	Example: Finding the sum of every pair of elements in an array.**
* **O(2n)	Exponential Time Complexity	Example: Finding all the subsets.**
* **O(n!)	Factorial Time Complexity	Example: Finding all the permutations of a given array.**

***

>Reference: interview bit