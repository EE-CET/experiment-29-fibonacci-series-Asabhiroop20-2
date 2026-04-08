 import java.util.*;
public class Fibonacci {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        // Base cases
        if (N == 1) {
            System.out.println(0);
            return;
        }
        if (N == 2) {
            System.out.println(1);
            return;
        }

        int a = 0, b = 1, c = 0;

        for (int i = 3; i <= N; i++) {
            c = a + b;
            a = b;
            b = c;
        }

        System.out.println(c);
    }
}