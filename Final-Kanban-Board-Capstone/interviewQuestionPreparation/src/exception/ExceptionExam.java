package exception;

import java.util.Scanner;

public class ExceptionExam
{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try
        {
            System.out.println("enter first number");
            int first = scanner.nextInt();

            System.out.println("Enter the second number ");
            int second = scanner.nextInt();

            if (second!=0){
                int third = first * second;
            }else
                throw new Exception("zero not allowed inside the mehod ");
        }catch (Exception e){
            System.out.println();
        }finally {
            System.out.println("finally blog always execute exception handled or not ");
        }
    }



    
}