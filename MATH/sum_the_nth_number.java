import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	  Scanner sc = new Scanner(System.in);
	  System.out.print("Enter the n number : ");
	  int num = sc.nextInt();
	 
	  System.out.println((num*(num + 1)/2)); //(5*(5+1)/2)
		                                     //5*(6)/2
		                                     //30/2 => 15
	  
	 
	}
}
//output
//Enter the n number : 5
//15
