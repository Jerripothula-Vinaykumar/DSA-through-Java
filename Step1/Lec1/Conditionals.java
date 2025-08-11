package Step1.Lec1;

import java.util.Scanner;

public class Conditionals {
    
    static void adultOrNot()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("");
        System.out.print("Enter the age : ");
        int age = sc.nextInt();
        System.out.println("");
        if(age >= 18)
        {
            System.out.println("You are an Adult");
        }
        else{
            System.out.println("Oops! You are not an Adult ..");
        }
        System.out.println("");
        sc.close();
    }
    static void gradeOfStudent()
    {
        System.out.println("");
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the marks of Student : ");
        int marks = sc.nextInt();
        System.out.println("");
        if(marks < 35)
        {
            System.out.println("You`re Failed !..");
        }
        else if(marks < 55)
        {
            System.out.println("Congrats ! You passed and secured a grade of `D` .");
        }
        else if(marks < 75)
        {
            System.out.println("Congrats ! You passed and secured a grade of `C` .");
        }
        else if(marks < 90)
        {
            System.out.println("Congrats ! You passed and secured a grade of `B` .");
        }
        else if(marks < 95) {
            System.out.println("Congrats ! You passed and secured a grade of `A` .");
        }
        else {
            System.out.println("Congrats ! You passed and seured a grade of `A+` .");
        }
        System.out.println("");
        sc.close();
    }
    static void eligibleForJobOrNot()
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your age : ");
        int age = sc.nextInt();
        System.out.println("");
        if(age >= 21)
        {
            if(age >=60){
                System.out.println("You are Retired !..");
            }
            else  if(age > 55)
            {
                System.out.println("You are eligible for Job !..  but retirement soon ..");
            }
            else {
                System.out.println("You are eligible for Job !..");
            }
            
        }
        System.out.println("");
        sc.close();
    }
    public static void main(String[] args) {

        /* adultOrNot(); */
        /* gradeOfStudent(); */
        /* eligibleForJobOrNot(); */
    }
}
