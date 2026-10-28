import java.util.*;

class Strong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), temp = n, sum = 0;

        while (n > 0) {
            int d = n % 10, f = 0;

            for (int i = 1; i < d; i++)
                f *= i;

            sum += f;
            n /= 10;
        }

        if (sum == n)
            System.out.println("Strong Number");
        else
            System.out.println("Not Strong Number");
    }
}
