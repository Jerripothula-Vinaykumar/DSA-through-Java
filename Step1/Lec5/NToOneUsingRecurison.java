package Step1.Lec5;
import java.util.Scanner;
public class NToOneUsingRecurison {
    public static void printNToOneUsingRecursion(int n )
    {
        if(n == 0)
        {
            return;
        }
        System.out.println(n);
        printNToOneUsingRecursion(n-1);
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Range to Print NToOne : ");
        int n = sc.nextInt();
        printNToOneUsingRecursion(n);
        sc.close();
    }
}
