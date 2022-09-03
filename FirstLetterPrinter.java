/*
First Letter Printer - You are provided with a string. 
Your task is to create a string with the first letter of every word in the string. 
Input: Hey, Printing first letter of every word. / Output: HPfloew
*/

import java.util.Scanner; 
class FirstLetterPrinter 
{
    public static void main(String[] args) 
    {
        Scanner in = new Scanner(System.in);
        String input = in .nextLine(); 
        System.out.println(firstLetterPrinter(input)); 
    }
    static String firstLetterPrinter(String str) 
    { 
        String result = "";
        boolean space = true;
        for(int i = 0; i < str.length(); i++)
        {
            char let1 = str.charAt(i);  // Current character
            Boolean letter = Character.isLetter(let1);  // Check if the current character is letter or not
            if(letter == false)  // Current character contains space
            {
                space = true;
            }
            else if(letter == true && space == true) // First character of the string
            {
                result += let1;
                space = false;
            }
            
            else // Remaining character of the string
            {
                space = false;
            }
        }
        return result;
    } 
}
