import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);

        long n = input.nextInt();
        long y = 0;
        long max =-11;

        for (int i=1; i<=n; i++) {
            y = input.nextLong();

            if(max < y){
                max=y;
            }

        }
        System.out.println(max);
    }
}
