import java.util.Scanner;
class Main {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       System.out.print("Enter the number : ");
       int n= sc.nextInt();
        for(int i = 1 ; i*i >= 0 ; i++){//find the A value(a*b=n)->b=n/i
            if(n%i==0){
                if(i*i != n){
                    System.out.print(n/i+" ");
                }  
            }
        }
    }
}
