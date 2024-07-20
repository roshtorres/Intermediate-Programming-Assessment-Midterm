package javaPackage;
import java.util.Scanner;

public class _12MethodsAndPackageQuizLEC 
{
	static int number = 4;
		public static void main(String[] args)
		{
			recursiveMethod();
		}
		
		public static void recursiveMethod()
		{
			number--;
			if(number == 0)
				return;
			System.out.print(number + " ");
			recursiveMethod();
			}
	
	/*public static void main(String[] args)
	{
		Recursive_Q1 rt2 = new Recursive_Q1();
		int sum = rt2.summer(4);
		System.out.println(sum);
	}
	int 
	}*/
}
