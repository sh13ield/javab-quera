import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int p, q, m;
        p = s.nextInt();
        q = s.nextInt();
        m = s.nextInt();
        int a[][] = new int[p][q];
        int b[][] = new int[q][m];
        int c[][] = new int[q][m];
        for (int i = 0; i < p; i++)
        {
            for (int j = 0; j < q; j++)
            {
                a[i][j] = s.nextInt();
            }
        }
        for (int i = 0; i < q; i++)
        {
            for (int j = 0; j < m; j++)
            {
                b[i][j] = s.nextInt();
            }
        }
        for(int i = 0;i < p;i++){
            for(int j = 0;j < m;j++){
                for(int k = 0;k < q;k++){
                    c[i][j] += a[i][k] * b[k][j];
                }
            }
        }
        for (int i = 0; i < p; i++)
        {
            for (int j = 0; j < m; j++)
            {
                System.out.print(c[i][j]+" ");
            }
            System.out.println("");
        }

    }
}

