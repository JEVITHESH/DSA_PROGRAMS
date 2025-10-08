import java.util.Scanner;
class Main {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       System.out.print("Enter the number : ");
       int n= sc.nextInt();
       int count = 0;
      for(int i = 1; i*i>=0; i++){
          if(n%i==0){
              if(i*i!=n){
                 count++;
              }
          }
      }
      if(count == 2){
          System.out.print("it is prime number");
      }
      else{
                    System.out.print("it is not prime number");

      }
    }
}
(or)
import java.util.Scanner;
class Main {
    public static boolean isprime(int n){
      for(int i = 2; i*i<=n; i++){
          if(n%i==0){
             
                return false;
          }
                 
      }
      return true;
    }
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       System.out.print("Enter the number : ");
       int n= sc.nextInt();
      if(isprime(n)){
          System.out.print("it is prime");
      }
      else{
                    System.out.print("it is not prime");

      }
    }
}
