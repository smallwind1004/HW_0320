import java.util.*;

/**
 * test
 */
public class test {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        String str = Integer.toString(n);
        for (int i = 3; i < n / 2; i++) {
            if (isPrime(i)) {
                int m = n - i;
                if (isPrime(m)) {
                    str = str + "=" + Integer.toString(i) + "+" + Integer.toString(m);
                }
            }
        }
        System.out.println(str);
    }

    public static boolean isPrime(int n) {
        boolean flag = true;
        for (int i = 2; i < n / 2; i++) {
            if (n % i == 0) {
                flag = false;
            }
        }
        return flag;
    }
}