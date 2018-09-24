import java.util.Scanner;
public class TwoIntegersrunner 
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		int num1 = 0;
		int num2 = 0;
		System.out.print("Input first value: ");
		num1 = input.nextInt();
		System.out.print("Input second value: ");
		num2 = input.nextInt();
		TwoIntegers num3 = new TwoIntegers(num1, num2);
		String math = num3.arithmetic();
		int greater = num3.larger();
		boolean isEven = num3.isEven();
		boolean multiple = num3.multiple();
		System.out.println(math);
		System.out.println("The input " + greater + " is larger");
		System.out.println("The sum is even: " + isEven);
		System.out.println("The number is a multiple: " + multiple);
		
		
				
	}
	
}