import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        String [] myArray = new String[n];
        for (int i = 0;i<n;i++)
        {
            myArray[i]=input.next();

        }
        float m=0;
        float b=0;
        int flag=0;
        int x =input.nextInt();
        while(x!=0)
        {
            int count=0;
            switch (x){
                case 1:{
                    for (int j=0;j<n;j++){

                        myArray[j].contains("java");
                        if(myArray[j].contains("java")==true)
                        {
                            count++;
                        }
                    }
                    System.out.println(count);
                    break;

                }
                case 2:{
                    for(int k=0;k<n;k++){
                        myArray[k].startsWith("code");
                        if (myArray[k].startsWith("code")==true)
                        {
                            m+=1;
                            b+=myArray[k].length();
                        }
                    }
                    if (m>0)
                    {
                        float y = b/m;
                        System.out.println(y);
                    }
                    else
                    {
                        System.out.println("0");
                    }
                    break;
                }
                case 3:{
                    for(int l=0;l<n;l++)
                    {
                        if (myArray[l].length()<3)
                        {
                            System.out.println(l);
                            flag++;
                        }
                    }
                    if(flag<1) {
                        System.out.println("empty");
                    }
                    break;

                }
            }
            x= input.nextInt();
        }

    }
}
