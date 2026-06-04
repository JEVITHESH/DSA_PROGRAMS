public class Main
{ 
    
	public static void main(String[] args) {
	    int n = 5;
	    for(int row = 1 ; row <= (n*2)-1 ; row++){
	        int rowcha = (row>n)? row-n:n-row;
	        for(int spa = 1 ; spa <= rowcha ; spa++){
	            System.out.print(" ");
	           
	        }
	        int colcha = (row>n)? ((n*2)-row)+(((n*2)-1)-row): row+(row-1);
	        for(int str = 1 ; str <= colcha ; str++){
	            System.out.print("*");
	        }
	        System.out.println();
	        }	
	}
	        
	    }


    *
   ***
  *****
 *******
*********
 *******
  *****
   ***
    *
