//command line arguments in integer form
public class CmdLinInt{
	public static void main(String[] args){
		int temp;
		System.out.println("the command line arguments in integer form are: ");
		for(int i=0;i<2;i++){
			temp = Integer.parseInt(args[i]);
			System.out.println(temp);
		}
	}
}			
