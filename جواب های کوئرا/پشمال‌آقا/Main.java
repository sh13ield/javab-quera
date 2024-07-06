import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        float k = input.nextFloat();
        int p = input.nextInt();
        int x;
        x = (int) ((n*k) * p);
        System.out.print(x);
    }
}
