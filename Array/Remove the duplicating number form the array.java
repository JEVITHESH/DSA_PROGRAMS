import java.util.Scanner;
class Main {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       System.out.print("Enter the size of the array : ");
       int size = sc.nextInt();
       int[] arr = new int[size];
       for(int i =0 ; i < size ; i++){
           arr[i] = sc.nextInt();
       }
      int i = 0 ;
      //int j = 1;
      for(int j = 1 ; j < size ; j++){
          if(arr[i]<arr[j]){
              arr[i+1] = arr[j];
              System.out.print(arr[i]);
              i++;
          }
      }
      System.out.println(i+1);
    }
}
output
  Enter the size of the array : 5
  1 1 2 3 3 
  1 2 3 
