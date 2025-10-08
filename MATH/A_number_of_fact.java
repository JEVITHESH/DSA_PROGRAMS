import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        for (int i = 1; i * i <= n; i++)
        {
            if (n % i == 0)
            {
                System.out.print(i + " ");
                if (i * i == n)
                    continue;
                System.out.print(n / i + " ");
            }
        }
        sc.close();
    }
}
