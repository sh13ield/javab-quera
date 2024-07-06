import java.util.Scanner;

public class Main {

    static boolean Avalboodan(int num) {
        if (num <= 1)
            return false;
        for (int i = 2; i * i <= num; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        int n = scr.nextInt();

        int lowerBound = (int) Math.pow(10, n - 1);
        int upperBound = (int) Math.pow(10, n);

        for (int num = lowerBound; num < upperBound; num++) {
            String numStr = Integer.toString(num);
            if (numStr.startsWith("2") || numStr.startsWith("3") || numStr.startsWith("5") || numStr.startsWith("7")) {
                boolean aval = true;
                int temp = num;
                while (temp > 0) {
                    aval = Avalboodan(temp);
                    if (!aval) {
                        break;
                    }
                    temp /= 10;
                }
                if (aval) {
                    System.out.println(num);
                }
            }
        }
    }
}
