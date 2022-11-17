//to implement if else if ladder
import java.util.*;
public class Ifelseif {

	public static void main(String[] args) {
		int marks;

		Scanner sc= new Scanner(System.in);
        	System.out.printf("enter the marks in percentage ");
		marks= sc.nextInt();
		
		if(marks<40) {
			System.out.printf("Grade F \n please reappear");
		}
		else if((40<marks) && (50>marks)) {
			System.out.printf("Grade E");
		}
		else if((50<=marks) && (60>marks)) {
			System.out.printf("Grade D");
		}
		else if((60<=marks) && (70>marks)) {
		   	System.out.printf("Grade C");
		}
		else if((70<=marks) && (80>marks)) {
			System.out.printf("Grade B");
		}
		else if((80<=marks) && (90>marks)) {
			System.out.printf("Grade A");
		}
		else if((90<=marks) && (100>marks)) {
			System.out.printf("Grade O");
		}
		else
			System.out.printf("Grade O+ \n perfect score");
	}

}