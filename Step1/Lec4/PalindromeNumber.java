package Step1.Lec4;
import java.util.Scanner;
public class PalindromeNumber {

    public static void palindromeNumberOrNot(int n )
    {
        int lastdigit = 0 , reversedNum = 0 , original = n ;
        while(n > 0) {
            lastdigit = n % 10;
            reversedNum = (reversedNum*10) + lastdigit ;
            n = n /10;
        }
        if(original == reversedNum) {
            System.out.println("The given Number is a Palindrome . ");
        }
        else {
            System.out.println("Not a Palindrome .." + reversedNum);
        }
    }
    public static void main(String[] args)
    {
        Scanner sc =  new Scanner(System.in);
        System.out.print("Enter Number to check its Palindrome or not : ");
        int number  = sc.nextInt();
        palindromeNumberOrNot(number);
        sc.close();

    }
}
