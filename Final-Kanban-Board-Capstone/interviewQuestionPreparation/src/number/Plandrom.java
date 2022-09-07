package number;

import java.util.Scanner;

public class Plandrom
{
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the Number");
        int number = scanner.nextInt();

        int remainder=0,    sum=0,    num = number;

        while (number > 0){
            remainder = number % 10;            //getting remainder
            sum = (sum*10)+remainder;
            number = number /10;
        }
        if (sum == num) {
            System.out.println("number is plandrom \n"+sum);
        }else {
            System.out.println("number is not plandrom \n"+sum);
        }
    }
}