import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	  Scanner sc = new Scanner(System.in);
	  int num = sc.nextInt();
	  int c = 0;
	  
	  while(num>0){
	     c=num%10;
	     
	     num/=10;
	     System.out.print(c);
	  }	}
}
