import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	 int [] arr = new int[5];
	 Scanner sc = new Scanner(System.in);
	 for(int i = 0 ; i < arr.length ; i++){
	    arr[i] = sc.nextInt(); 
	 }
	 
	 int tem = arr[0];
	 for(int i = 1 ; i<arr.length ; i++){
	     arr[i-1]=arr[i];
	 }
	 arr[arr.length - 1] = tem;
	 for(int arr1 : arr){
	     System.out.print(arr1);
	 }
	
	}
}
