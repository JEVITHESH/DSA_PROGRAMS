import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	  Scanner sc = new Scanner(System.in);
	  int num = sc.nextInt();
	  int c = 0;
	  int n=0;
	  int dupn=num;
	  
	  while(num>0){
	     c=num%10;
	     n = n *10 + c;
	     num/=10;
	    //System.out.print(c);
	  }
	  System.out.print(" ");
	  if(n==dupn){
	      System.out.println("it is palindrome");
	  }	
	    else{
	         System.out.println("it is not-palindrome");
	    }
	}
}
