import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	  Scanner sc = new Scanner(System.in);
	  System.out.print("Enter the n number : ");
	  int num = sc.nextInt();
	  
	 if(num%2==0) //4 % 2 == 0
	  System.out.println((num/2)); // 4/2 => 2
	  else{  //5 % 2 != 1
	      System.out.println((num/2)+ 1); // (5/2) + 1 
	  }
	  
	 
	}
}
//output
//Enter the n number : 5
//3
//Enter the n number : 4 
//2
