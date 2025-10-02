import java.util.Scanner;
class Main {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       System.out.print("Enter the size of the array : ");
       int size = sc.nextInt();
       boolean ass = true;
       int[] arr = new int[size];
       for(int i =0 ; i < size ; i++){
           arr[i] = sc.nextInt();
       }
                  int max = arr[0];

       for(int i = 0 ; i < size-1 ; i++){
           if(arr[i]>arr[i+1]){
                ass = false;
           }
               else{
                  ass =   true;
               }
           
       }
       System.out.print(ass);
    }
}
Enter the array of the size : 5
2 3 5 6 8 
true
