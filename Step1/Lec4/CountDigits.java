package Step1.Lec4;
import java.util.Scanner;
public class CountDigits {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number to Count the digits :");
        int number =  sc.nextInt();
        int count = 0 , ld;
        while(number > 0)
        {
            ld = number % 10;
            count++;
            number = number / 10;
        }
        System.out.print("The Number of digits are : " + count);
        sc.close();

        
    }
}
