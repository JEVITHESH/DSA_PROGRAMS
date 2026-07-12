import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	 int [] arr = new int[5];
	 Scanner sc = new Scanner(System.in);
	 for(int i = 0 ; i < arr.length ; i++){
	    arr[i] = sc.nextInt(); 
	 }
	int tem = 0;
	int k = 0 , j =1;
	while(j<arr.length){
	       if(arr[k]==0 ){
	           if(arr[j]!=0){
	           tem = arr[k];
	           arr[k]=arr[j];
	           arr[j]=tem;
	           k++;
	           j++;
	       }else{
	           j++;
	       }
	    
	   }
	   else{
	       k++;
	       j++;
	   }
	}
	 
	 for(int arr1 : arr){
	     System.out.print(arr1);
	 }
	
	}
}
