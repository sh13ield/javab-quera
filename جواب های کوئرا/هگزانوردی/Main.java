import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        int[] answers = new int[t];

        for (int i = 0; i < t; i++) {
            String s = scanner.next();
            int a = (int) (s.chars().filter(ch -> ch == 'A').count() - s.chars().filter(ch -> ch == 'D').count());
            int b = (int) (s.chars().filter(ch -> ch == 'B').count() - s.chars().filter(ch -> ch == 'E').count());
            int c = (int) (s.chars().filter(ch -> ch == 'C').count() - s.chars().filter(ch -> ch == 'F').count());

            int sum = Math.abs(a) + Math.abs(b) + Math.abs(c);
            while (true) {
                if (a > 0 && c > 0) {
                    int x = Math.min(a, c);
                    a -= x;
                    b += x;
                    c -= x;
                } else if (a < 0 && c < 0) {
                    int x = Math.max(a, c);
                    a -= x;
                    b += x;
                    c -= x;
                } else if (a > 0 && b < 0) {
                    int x = Math.min(a, -b);
                    a -= x;
                    b += x;
                    c -= x;
                } else if (b > 0 && a < 0) {
                    int x = Math.min(b, -a);
                    a += x;
                    b -= x;
                    c += x;
                } else if (b > 0 && c < 0) {
                    int x = Math.min(b, -c);
                    a += x;
                    b -= x;
                    c += x;
                } else if (c > 0 && b < 0) {
                    int x = Math.min(c, -b);
                    a -= x;
                    b += x;
                    c -= x;
                }

                int newSum = Math.abs(a) + Math.abs(b) + Math.abs(c);
                if (newSum == sum) {
                    answers[i] = newSum;
                    break;
                } else {
                    sum = newSum;
                }
            }
        }

        for (int answer : answers) {
            System.out.println(answer);
        }
    }
}
