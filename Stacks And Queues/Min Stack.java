Design a stack that supports push, pop, top, and retrieving the minimum element in constant time.

push(x) – Push element x onto stack.
pop() – Removes the element on top of the stack.
top() – Get the top element.
getMin() – Retrieve the minimum element in the stack.
Note that all the operations have to be constant time operations.

Questions to ask the interviewer :

Q: What should getMin() do on empty stack?
A: In this case, return -1.

Q: What should pop do on empty stack?
A: In this case, nothing.

Q: What should top() do on empty stack?
A: In this case, return -1





class Solution {
    // Node head;
    // int size;
    // Solution()
    // {
    //     head=null;
    //     size=0;
    // }
    Stack <Integer> s=new Stack<>();
    Stack <Integer> min=new Stack<>();
    public void push(int x) {
        s.push(x);
        if(min.isEmpty() || min.peek()>=x)
        {
            min.push(x);
        }
    }

    public void pop() {
        if(!s.isEmpty())
        {int n=s.pop();
        if(n==min.peek())
        min.pop();
        }

    }

    public int top() {
        if(s.isEmpty())
        return -1;
        return s.peek();
    }

    public int getMin() {
        if(min.isEmpty())
        return -1;

        return min.peek();
    }
}
