import java.util.Scanner;
public class table1to100 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("********************************************"); 
        System.out.print("How many tables you want to print \nFrom 1 to ");  
        int n = sc.nextInt();
        System.out.println("***************************");  
        for(int j=1;j<=n;j++)  
        {                     
            System.out.printf("    *** Table of %d ***\n",j);
            for(int i = 1; i <= 10; ++i)
            {
                System.out.printf("\t%d * %d = %d \n", j, i, j * i);
            }
            System.out.println("***************************");  
        }
    }
}