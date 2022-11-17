import java.util.Scanner;
//to implement if else statement
public class Ifelse{
	public static void main(String[] args){
		int num;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter your height in centimetres");
		num = sc.nextInt();
		if(num>=150){
			System.out.println("you can go on the rollercoaster");
		}
		else
			System.out.println("Sorry! you cannot ride the rollercoaster");
		return;
	}
}