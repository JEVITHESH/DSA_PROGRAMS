import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	 int [] arr = new int[5];
	 Scanner sc = new Scanner(System.in);
	 for(int i = 0 ; i < arr.length ; i++){
	    arr[i] = sc.nextInt(); 
	 }
	 
	 int tem = arr[arr.length - 1];
	 for(int i=arr.length-1 ;i>0; i--){
	     arr[i]=arr[i-1];
	 }
	 arr[0] = tem;
	 for(int arr1 : arr){
	     System.out.print(arr1);
	 }
	
	}
}
