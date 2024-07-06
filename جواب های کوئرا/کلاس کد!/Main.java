import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        StringBuilder res = new StringBuilder();
        int i = 1;
        while( i <= 5000) {
            String str = i + "";
            res.append(str);
            i++;
        }
        if(num>0 && num<4000){
            char result = res.charAt(num-1);
            System.out.println(result);
        }else {
            System.out.println();
        }
    }
}

