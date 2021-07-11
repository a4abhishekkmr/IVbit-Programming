Given a positive integer A, return an array of strings with all the integers from 1 to N.

But for multiples of 3 the array should have “Fizz” instead of the number.

For the multiples of 5, the array should have “Buzz” instead of the number.

For numbers which are multiple of 3 and 5 both, the array should have “FizzBuzz” instead of the number.

Look at the example for more details.

Example

A = 5
Return: [1 2 Fizz 4 Buzz]




public class Solution {
    public String[] fizzBuzz(int A) {
        String ans[]=new String[A];
        for(int ia=0;ia<A;ia++)//fill
        {
            int i=ia+1;
            if(i%3==0 && i%5==0)
            ans[ia]="FizzBuzz";
            else if(i%3==0)
            ans[ia]="Fizz";
            else if(i%5==0)
            ans[ia]="Buzz";
            else
            ans[ia]=String.valueOf(i);
        }
        // for(int i=0;i<A;i++)
        // System.out.print(ans[i]);
        return ans;
    }
}
