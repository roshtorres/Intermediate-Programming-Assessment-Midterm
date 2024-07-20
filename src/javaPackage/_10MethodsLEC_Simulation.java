package javaPackage;

public class _10MethodsLEC_Simulation 
{
	public static void main(String[] args) 
	{
		int num1;
		int num2;
		
		num1 = 5;
		num2 = 10;
		num2 = test(24, num2);
		num2 = test(num1, num2);
		num2 = test(num1 * num1, num2);
		num2 = test(num1 + num1, num2);
	}
	
	public static int test(int first, int second)
	{
		int third;
		
		third = first + second * second + 2;
		first = second - first;
		second = 2 * second;
		
		System.out.println(first + " " + second + " " + third);
		
		return second;
	}

}
