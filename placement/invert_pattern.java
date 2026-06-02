
public class Main
{
	public static void main(String[] args) {
	    int a = 5;
	    for(int i = 1 ; i <= a ; i++){
	        int pal = (i % 2 == 0)? 1 : 0;
	        for(int j = 1 ; j <= i ; j++){
	        	System.out.print(pal + " ");
                pal = (pal == 0) ? 1 : 0;  
	        }
	        	System.out.println();
	    }
	
	}
}

0
1 0
0 1 0
1 0 1 0 
0 1 0 1 0
