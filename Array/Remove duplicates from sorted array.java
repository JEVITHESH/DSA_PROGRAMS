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
	 for(int i = 0 ; i < arr.length ; i++){
	     for(int j = 0 ; j < arr.length-i-1;j++)
	    if(arr[j] > arr[j+1]){
	         tem = arr[j];
	         arr[j] = arr[j+1];
	         arr[j+1] = tem;
	    } 
	 }
	 for(int arr1 : arr){
	     System.out.print(arr1);
	 }
	 boolean m = true;
	 for(int i = 1 ; i < arr.length ; i++){
	     if(arr[i-1] == arr[i]){
	         System.out.println(" dupl had");
	         m=false;
	         break;
	     }
	     m=true;
	 }
	 if(m==true){
	     System.out.println(" no dupl\n");
	 }
	}
}
