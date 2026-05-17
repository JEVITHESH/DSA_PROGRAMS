/************************************************************/
import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    
		System.out.println("Sum of the Nth Natural numbers or Whole numbers");
		String NW = sc.nextLine();
		System.out.print("Enter the number : ");
		int num = sc.nextInt();
		int val = 0;
		
		switch (NW){
		    case "Natural":
		        for(int i = 1 ; i <= num ; i++){
		            val+=i;
		        }
		        System.out.println("The sum of the Natural Number is "+val);
		        break;
		    case "Whole":
		        for(int i = 0 ; i <= num ; i++){
		            val+=i;
		        }
		        System.out.println("The sum of the Whole Number is "+val);
		        break;
		   default:
		       System.out.println(" Properly enter the words");
		}
}}
