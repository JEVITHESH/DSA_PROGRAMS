import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        
        int f =0;
        int c = 0;
        while(num>0 ){
            c++;
            int re = num%10;
            f=f*10+re;
            num/=10;
        }
        System.out.println(c);
        if(c%2==0){
            System.out.print(c/2);
        }
        else{
            System.out.print((c/2)+1);
        }
    }
}
