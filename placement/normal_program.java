import java.util.Scanner ; 
public class Main
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    String word = sc.nextLine();
	    boolean pal = true;
	    int i = 0;
	    int j = word.length() - 1;
	    while(i<j){
	        if(word.charAt(i)!=word.charAt(j)){
	            pal = false;
	            break;
	        }
	        i++;
	        j--;
	    }
        if (pal){
            System.out.println("it is pal");
        }
        else{
            System.out.println("it is not pal");
        }
	}
}
