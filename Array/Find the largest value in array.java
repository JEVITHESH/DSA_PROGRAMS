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
                  int max = arr[0];

       for(int i = 0 ; i < size ; i++){
           if(arr[i]>max){
               max = arr[i];
           }
       }
       System.out.print(max);
    }
}
//output:
//Enter the size of the array : 5
//55
//1
//5
//78
//22
//78
