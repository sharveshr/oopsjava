//to implement dowhile loop 
import java.util.Scanner;
public class DoWhile{
	public static void main(String[] args){
		int i=0,num;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number of channels");
		num = sc.nextInt();
		num++;
		do{
			System.out.println("channel number " + i);
			i++;
		}while(i<num);
		return;
	}
}