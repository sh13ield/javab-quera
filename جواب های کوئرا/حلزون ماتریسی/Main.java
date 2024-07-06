import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int sum,n,m,fr,lr,fc,lc,p;
        n = s.nextInt();
        m=n;
        fr=0;
        lr=m-1;
        fc=0;
        lc=n-1;
        p=0;
        sum=0;
        int a[][] = new int[n][n];
        for (int i = 0; i < n; i++)
        {
            for (int j = 0; j < n; j++)
            {
                a[i][j] = s.nextInt();
            }
        }
        int count=0;

        while((fr<=lr) && (fc<=lc))
        {
            for(int i=fc;i<=lc;i++)
            {
                if(count<m*n)
                {
                    count++;
                    p+=a[fr][i];
                    if(Math.sqrt(p)==(int)Math.sqrt(p))
                    {
                        sum++;
                    }

                }
            }
            for(int i=fr+1;i<=lr;i++)
            {
                if(count<m*n)
                {
                    count++;
                    p+=a[i][lc];
                    if(Math.sqrt(p)==(int)Math.sqrt(p))
                    {
                        sum++;
                    }

                }
            }
            for(int i=lc-1;i>=fc;i--)
            {
                if(count<m*n)
                {
                    count++;
                    p+=a[lr][i];
                    if(Math.sqrt(p)==(int)Math.sqrt(p))
                    {
                        sum++;
                    }

                }
            }
            for(int i=lr-1;i>fr;i--)
            {
                if(count<m*n)
                {
                    count++;
                    p+=a[i][fc];
                    if(Math.sqrt(p)==(int)Math.sqrt(p))
                    {
                        sum++;
                    }

                }
            }
            fr++;
            fc++;
            lr--;
            lc--;
        }
        System.out.print(sum);
    }
}
