import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n =in.nextInt();
        int m =n;
        int reverse=0;
        while(m>0)
        {
            int r=m%10;
            m=m/10;
            reverse=(reverse*10)+r;
        }
        if (reverse==n)
        {
            System.out.print("YES");
        }
        else
            System.out.print("NO");
    }

}


