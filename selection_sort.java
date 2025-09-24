// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.Scanner;
class Main {
    public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
     System.out.print("Enter the number : ");
     int size = sc.nextInt();
     int[] arr = new int[size];
     for(int i = 0; i < size ; i++){
         arr[i]= sc.nextInt();
     }
     //selection sort
     for(int i = 0; i < size-2 ; i++){
         int mindix = i;
         for(int j = i+1 ; j < size-1 ; j++ ){
             if(arr[mindix]>arr[j]){
                 mindix = j;
             }
         } 
         // swap arr[i] and arr[minIndex]
         int temp = arr[i];
         arr[i]=arr[mindix];
         arr[mindix]=temp;
     }
     for(int num : arr){
         System.out.print(num);
     }
    }
}
