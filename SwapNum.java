//swap two numbers
import java.util.Scanner;
public class SwapNum{
	public static void main(String[] args){
		int num1,num2,temp;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the two numbers ");
		num1 = sc.nextInt();
		num2 = sc.nextInt();
		temp = num1;
		num1 = num2;
		num2 = temp;
		System.out.println("the swapped values are: num1 = " + num1 + "num2 = " + num2);
		return;
	}
}
