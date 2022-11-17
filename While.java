//to implement while loop
import java.util.Scanner;
public class While{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int num,i=0;
		System.out.println("enter the number until which it is to be printed");
		num = sc.nextInt();
		num++;
		while(i<num){
			System.out.println(i + " ");
			i++;
		}
	}
}

