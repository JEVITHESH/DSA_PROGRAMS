public class Main
{ 
    
	public static void main(String[] args) {
	    int n = 5;
	    for(int row = 1 ; row <= n ; row++){
	        for(int spa = 1 ; spa <= n-row ; spa++){
	            System.out.print(" ");
	           
	        }
	        
	        for(int str = 1 ; str <= ((row *2)-1) ; str++){
	            if(str == 1 || row == n || str == (row *2)-1){
	            System.out.print("*");
	            }
	            else{
	                 System.out.print(" ");
	            }
	        }
	        System.out.println();
	        }	
	}
	        
	    }


    *
   * *
  *   *
 *     *
*********
