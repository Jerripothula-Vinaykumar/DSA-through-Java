package Step1.Lec5;
import java.util.Scanner;
public class UnderstandRecursion {

    public static void printNameNTimesWithRecursion(int n , String name) {
        if(n == 0)
        {
            return;
        }
        System.out.println(name  + n);
        printNameNTimesWithRecursion(n-1 , name);
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the range to print name : ");
        int n = sc.nextInt();
        System.out.print("Enter the name to print N times : ");
        sc.nextLine();
        String name  = sc.nextLine();

        printNameNTimesWithRecursion(n , name);
        sc.close();
    }
    
}
