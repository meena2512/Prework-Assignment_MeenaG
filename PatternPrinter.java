/*
Pattern Printer - Your task is to print the following 
pattern for a given n value. 
For n=2, pattern is: 
2 2 1 1 
2 1
*/

import java.util.Scanner; 
class PatternPrinter 
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        int n = in .nextInt();
        patternPrinter(n);
    }
    static void patternPrinter(int n) 
    {
        for(int i = n; i > 0; i--)
        {
            for(int j = 0; j < n; j++)
            {
                for (int k = 0; k < i ; k++)
                {
                    System.out.print(n - j + " ");
                }
            }
            System.out.println();
        }
    } 
} 