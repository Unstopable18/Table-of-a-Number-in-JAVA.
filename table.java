//WAP in JAVA to print table of a number

import java.util.Scanner;
public class table 
{
    public static void main(String[] args) 
    {
        int num;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number to get Table: ");
        num = sc.nextInt();
        System.out.println("*******************************");                         
        for(int i = 1; i <= 10; ++i)
        {
            System.out.printf("%d * %d = %d \n", num, i, num * i);
        }
    }
}
