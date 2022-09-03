/* 
Find the Missing Number - You are provided with an array of the size n-1. 
It contains distinct integers in the range of 1 to n. 
Your task is to find the missing number. 
Input: 5   1 2 3 5  / Output: 4
*/

import java.util.Scanner; 
class MissingNumberFinder 
{
    public static void main(String[] args) 
    {
        Scanner in = new Scanner(System.in); 
        int size = in .nextInt();
        int[] arr = new int[size - 1];
        for (int i = 0; i < size - 1; i++) arr[i] = in .nextInt();
        System.out.println(missingNumberFinder(arr, size)); 
    } 
    static int missingNumberFinder(int array[], int n) 
    {
        int mis_no = 0, 
            arr_size = array.length, 
            tot_size = arr_size + 1,
            arr_sum = 0, 
            sum = 0;
            
        // Sum of integers in array             
        for(int i = 0; i < arr_size; i++)
        {
            arr_sum += array[i];
        }
        // Sum of first n integers = n(n+1) / 2
        sum = tot_size * (tot_size + 1) / 2;
        mis_no = sum - arr_sum;
        return mis_no;
    }
} 