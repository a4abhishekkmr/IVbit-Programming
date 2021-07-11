Problem Description

Given four positive integers A, B, C, D, determine if there’s a rectangle such that the lengths of its sides are A, B, C and D (in any order).

If any such rectangle exist return 1 else return 0.



public class Solution {
    public int solve(int A, int B, int C, int D) {
        int one=0;
        if(A==B || A==C || A==D)
        one=A;

        int two=0;
        if(A!=B)
        two=B;

        if(A!=C)
        two=C;

        else
        two=D;

        int p=A+B+C+D;

        int p1=2*(one+two);

        if(p==p1) return 1;
        else return 0;

    }
}
