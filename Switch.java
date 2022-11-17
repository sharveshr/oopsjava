//to implement switch case statement
import java.util.Scanner; 
public class Switch{
	public static void main(String[] args){
		int num;
		Scanner sc = new Scanner(System.in);
		System.out.println("type 1-3 to know the new rules by dua lipa");
		num = sc.nextInt();
		switch(num){
			case 1: 
				System.out.println("dont pick up the phone");
				break;
			case 2:
				System.out.println("dont let him in");
				break;
			case 3:
				System.out.println("dont be his friend");
				break;
			default:
				System.out.println("dont do anything stupid");
				break;
		}
		return;
	}
}