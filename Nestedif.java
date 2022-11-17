//to implement nested if 
import java.util.Scanner;
public class Nestedif{
	public static void main(String[] args){
		int num1,num2;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter your marks in maths and biology: ");
		num1 = sc.nextInt();
		num2 = sc.nextInt();
		if(num1>=80){
			if(num2>=80){
				System.out.println("Congrats! you are eligible to take biomaths group.");
			}

			else
				System.out.println("error!");
		}
		else
			System.out.println("error!");
	}
}