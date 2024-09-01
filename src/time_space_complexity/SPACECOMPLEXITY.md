## Space Complexity

### What is Space Complexity and How to Calculate it?
Space complexity is a measure of how efficient your code is in terms of memory used.

Space complexity analysis happens almost in the same way time complexity analysis happens, i.e. it is measured by calculating the total space taken by an algorithm with respect to the input.

_Eg: Let’s take the following example:<br/>
vector<int> V;<br/>
The code snippet ends up creating a vector of size N. So, space complexity of the code is O(n)._

_Eg: Let’s take another example.<br/> Let’s say we need to create a 2-D array of size n*n.<br/>
The space complexity in this case would be O(n2 ) ._

Similar to Space complexity there is another concept called Auxiliary Space.

Auxiliary space is the extra space used by the algorithm apart from the input space.

_Eg: The following is the code for calculating the sum of an input array.<br/>
Int sum( int arr[] , int n)<br/>
{<br/>
int sum=0;<br/>
for (int i=0 ; i< n ; i++)<br/>
{<br/>
sum+=arr[i];<br/>
}<br/>
return sum;<br/>
}_<br/><br/>
In the above algorithm apart from the input array we only declare one variable ‘sum’.
Therefore for the above algorithm ,

Auxiliary Space = O(1)<br/>
Space complexity = O(n)

***

>Reference: interview bit