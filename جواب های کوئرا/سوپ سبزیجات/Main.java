import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        double k = in.nextDouble();
        double s = in.nextDouble();
        if(n*k<=s)
            System.out.print("Kafie!");
        else
            System.out.print("Na! yeki bayad bere sabzi bekhare");


    }
}
