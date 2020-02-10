package math_operations;
import calculator_operations.Calculator;
import java.util.Scanner;
public class Main {
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		Calculator obj=new Calculator();
		System.out.println("Math Operations :");
		System.out.println("1.Addition\n"+ "2.Subtraction\n"+ "3.Multiplication\n"+"4.Division\n");
		System.out.println("Choose an operation :");
		int choice=sc.nextInt();
		System.out.println("Enter first number :");
		int num1=sc.nextInt();
		System.out.println("Enter second number :");
		int num2=sc.nextInt();
		switch(choice)
		{
			case 1:System.out.println("Addition of num1 and num2 is :"+obj.add(num1, num2));
					break;
			case 2:System.out.println("Subtraction of num1 and num2 is :"+obj.subtract(num1, num2));
					break;
			case 3:System.out.println("Multiplication of num1 and num2 is :"+obj.multiply(num1, num2));
					break;
			case 4:System.out.println("Division of num1 and num2 is :"+obj.divide(num1, num2));
					break;
			default:System.out.println("Invalid choice");
					return;
		}
					
	}
}
