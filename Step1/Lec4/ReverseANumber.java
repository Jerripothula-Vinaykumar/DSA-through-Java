package Step1.Lec4;
import java.util.Scanner;
public class ReverseANumber {
    public static int reverseANumber(int number)
    {
       
        int ls , reversednum = 0 ;
        while(number > 0)
        {
            ls = number % 10;
            reversednum = (reversednum*10) + ls;
            number = number / 10;
        }
        return reversednum;
       
    }
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter A Number to Reverse : ");
        int number = sc.nextInt();
        int reversednum = reverseANumber(number);
        System.out.println("The Reverse of" + number +  "is : " + reversednum);
         sc.close();
    }   
}
