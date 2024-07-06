import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String str1 = input.nextLine();
        String r = str1;
        StringBuffer m = new StringBuffer(r);
        m = m.reverse();
        System.out.println(m);
    }
}

