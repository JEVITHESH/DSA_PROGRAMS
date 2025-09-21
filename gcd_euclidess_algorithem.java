import java.util.Scanner;
public class Main
{
  //long devision
  //greatest commen devisor between 2 numbers
  //the answer is devisor
	public static void main(String[] args) {
	   int a,b,temp;
	   Scanner sc = new Scanner(System.in);
	   System.out.print("Enter the a : ");
	       a = sc.nextInt();
	   System.out.print("Enter the b : ");
	       b = sc.nextInt();
	       while(a!=0){  //while devisior is 0 , it will run
	           temp = a;  //after the formula ,the reminder is store in the temp 
	           a = b%a;  //the reminder is stored in the divisior 
	           b = temp; //if the condition is out,befor value want to display soo b = twmp ,the temp is already the reminder;
	       }
	       
	    System.out.println(b);
	}
}
