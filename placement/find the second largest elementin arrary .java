public class Main
{
	public static void main(String[] args) {
		int [] arr ={5,17,2,64,72,64};
		int max = arr[0];
		for(int i=0; i<arr.length ;i++){
		    if(arr[i]>max){
		        max = arr[i];
		    }
		}
		int se = arr[0];
	if(se == max){
	    se = arr[1];
	}
	for(int i = 0 ; i < arr.length ; i++){
	    if(arr[i] > se && arr[i] != max){
	        se = arr[i];
	    }
	}
	System.out.println(max);
	System.out.println(se);
		    
		}
		
	}
	
	//72
	//64
