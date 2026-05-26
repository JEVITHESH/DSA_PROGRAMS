import java.util.Scanner ; 
public class Main
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    String word = sc.nextLine();
	    boolean pal = true;
	    
	    int j = word.length() - 1;
	    for(int i = j ; i >= 0;i--){
	        System.out.print(word.charAt(i));
	    }
	}
}
