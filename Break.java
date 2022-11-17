//to implement break statement
public class Break{
	public static void main(String[] args){
		for(int i=0;i<3;i++){
			if(i==2)
				break;
			System.out.println(i);
		}
		System.out.println("after loop statement");
		return;
	}
}