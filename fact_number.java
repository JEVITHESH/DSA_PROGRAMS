import java.util.Scanner;
class Main {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       System.out.print("Enter the Number : ");
       int a = sc.nextInt();

       System.out.println("Factors of " + a + " are:");
       for(int i = 1; i * i <= a; i++){
           if(a % i == 0){
               System.out.println(i);       // first factor
               if(i != a / i){              // avoid printing sqrt twice
                   System.out.println(a / i); // pair factor root(n)
               }
           }
       }
    }
}
