// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.Scanner;
class Main {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      System.out.print("Enter the size of the array : ");
      int size = sc.nextInt();
      int[] arr = new int[size];
      for (int i =0 ; i < size ; i++){
          arr[i]=sc.nextInt();
      }
     for(int i =1 ; i < size ; i++){ // 1 is already sorted
         int j = i ;
         while(j>0 && arr[j-1]>arr[j]){ //  0  1  2  3  4 
             int temp = arr[j];         // 64 25 12 22 11 
             arr[j] = arr[j-1];         // o befor is out of the bound
             arr[j-1] = temp;
             j--;
         }
     }
      for(int num : arr){
          System.out.print(num + " ");
      }
    }
}
//Enter the size of the array : 5
//64
//25
//12
//2
//11
//2 11 12 25 64 
