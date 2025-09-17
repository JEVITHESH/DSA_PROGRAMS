import java.util.Scanner;
import java.lang.Math;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int tem = a;
        int f = 0;
        while(a > 0){
            int m = a % 10;
            int s = (int)Math.pow(m, 3);
            f = f*10 + s;           
            a = a / 10;              
        }
        if(tem == f){
            System.out.println("A");
        }
        else{
            System.out.println("NA");
        }
    }
}
