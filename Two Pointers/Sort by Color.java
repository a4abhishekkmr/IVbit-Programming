Given an array with n objects colored red, white or blue, 

sort them so that objects of the same color are adjacent, with the colors in the order red, white and blue.

Here, we will use the integers 0, 1, and 2 to represent the color red, white, and blue respectively.

Note: Using library sort function is not allowed.

Example :

Input : [0 1 2 0 1 2]
Modify array so that it becomes : [0 0 1 1 2 2]




public class Solution {
	public void sortColors(ArrayList<Integer> A) {
        //dutch National Flag
        //isme 3 color me divide krna hai .. sort by 3 types

        //remember thissettle mid one then small will be on left and big on right
        int low=0,mid=0;
        int high=A.size()-1;
        while(mid<=high)
        {
            if(A.get(mid)==0)
            {A.set(mid,1);//A.get(low)
                A.set(low,0);
            
            low++;
            mid++;}
            else if(A.get(mid)==1)
            {
                mid++;
            }
            else
            {
                A.set(mid,A.get(high));
                A.set(high,2);
                
                high--;
            }
        }
	}
}
