//arithmetic operations in java (add,sub,mul,div,rem)
import java.util.Scanner;
public class arithmetic{
	public static void main(String[] args){
		int num1,num2;
		Scanner sc= new Scanner(System.in);
		System.out.println("enter the numbers: ");
		num1 = sc.nextInt();
		num2 = sc.nextInt();
		System.out.println("the sum of two numbers is " + (num1+num2));
		System.out.println("the difference of two numbers is " + (num1-num2));
		System.out.println("the product of two numbers is " + (num1*num2));
		System.out.println("The quotient of two numbers is " + (num1/num2));
		System.out.println("the remainder when the first num is divide by the second num is " + (num1%num2));
		return;
	}
}
	
