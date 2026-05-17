import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    
		System.out.print("Enter the Start number : ");
		int st = sc.nextInt();
	    System.out.print("Enter the End number : ");
		int end = sc.nextInt();
		System.out.print("Enter the Find number : ");
		int find = sc.nextInt();
		if(st<=find && find<=end){
		    System.out.println("The number "+ find+" in the Range");
		}
		else{
		    System.out.println("The number "+ find+" not in the Range");
		}
	}
}
