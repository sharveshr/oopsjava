import java.util.Scanner;
//to implement if statement
public class Ifcondition{
	public static void main(String[] args){
		int num;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the password");
		num = sc.nextInt();
		if(num==1234){
			System.out.println("you may enter");
		}
		return;
	}
}