import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        int temp;
        for (int i = 1; i < (num * 2)+2; i++) {
            for (int j = 0; j <= (num * 2)+2; j++) {

                if (j < num+1) {
                    temp = (i > num ? i - (num+1) : (num+1) - i);
                    if (j < temp)
                        System.out.print(" ");
                    else if (j > temp)
                        System.out.print("*");
                    if (j >= temp)
                        System.out.print("*");
                }
            }
            System.out.println();
        }
    }
}


