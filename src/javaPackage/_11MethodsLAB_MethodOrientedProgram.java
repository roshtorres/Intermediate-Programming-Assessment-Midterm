package javaPackage;
import java.util.Scanner;

public class _11MethodsLAB_MethodOrientedProgram 
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		
		System.out.print("String input: ");
		String in = input.nextLine();
		
		 if (isInputStringValid(in)) 
		 {
	            System.out.println("String is valid: " + in);
	     } 
		 else 
		 {
	            System.out.println("String is invalid");
	     }
	}
	
	public static final int lengthOfString = 8;
	
	//Verifying if the input String is valid
	public static boolean isInputStringValid(String inputString)
	{
		if(inputString.length() < lengthOfString)
		{
			return false;
		}
		
		int c = 0, d = 0;
		for(int a = 0; a < inputString.length(); a++)
		{
			char b = inputString.charAt(a);
			
			if(isNumbers(b))
			{
				c++;
			}
			else if(isLetters(b))
			{
				d++;
			}
			else
			{
				return false;
			}
		}
		
		return(c >= 3 && d >= 3);
	}
	
	//Letters
	public static boolean isLetters(char b)
	{
		//b = Character.toUpperCase(b);
		boolean z;
		if(b >= 'A' && b <= 'Z' || b >= 'a' && b <= 'z')
		{
			z = true;
		}
		else
		{
			z = false;
		}
		
		return z;
		//return (b >= 'A' && b <= 'Z');
    }
	
	//Numbers
    public static boolean isNumbers(char b) 
    {
    	boolean z;
		if(b >= '0' && b <= '9')
		{
			z = true;
		}
		else
		{
			z = false;
		}
		return z;
		//return(b >= '0' && b <= '9');
    }

}
