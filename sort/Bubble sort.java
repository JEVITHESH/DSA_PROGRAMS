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
      for(int i = 0 ; i <size ;i++){
          for(int j = 0 ; j < size-i-1 ; j++){ //5-0-1 = 4
              if(arr[j]>arr[j+1]){             //5-1-1 = 3
                  int temp = arr[j];           //  0  1  2  3 4
                  arr[j] = arr[j+1];           // 68 25 71 43 5
                  arr[j+1] = temp;
              }
          }
      }
      for(int num : arr){
          System.out.print(num + " ");
      }
    }
}
//output
//Enter the size of the array : 5
//68
//25
//71
//43
//5
//5 25 43 68 71 
