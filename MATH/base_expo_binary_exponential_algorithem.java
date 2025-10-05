import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	   int base,expo;
	   int ans=1;
	   Scanner sc = new Scanner(System.in);
	   System.out.print("Enter the base : ");   3
	       base = sc.nextInt();
	   System.out.print("Enter the expo : ");   //5
	       
	       expo = sc.nextInt();
	       while(expo > 0){             
	           if(expo %2!=0){   //if the expo is odd
	               ans = ans * base;   //ans = 0 * 3
	           }
	           base = base * base; //if the expo is even  3^4 => 3*3*3*3 => 9^2 * 9^2 => 81^1 * 81^1 => 243
                                 // double the base and divide the expo
	           expo /= 2;
	       }
	       
	    System.out.println(ans);
	}
}
//output
//Enter the base : 3
//Enter the expo : 5
//243
