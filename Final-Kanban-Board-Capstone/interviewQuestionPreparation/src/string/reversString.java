package string;
import java.util.Scanner;

public class reversString
{
    public static void main(String[] args) {

      Scanner scan = new Scanner(System.in);
      System.out.println("Enter any name ");
      String name = scan.next();
      String reverse = "";

      char ch ;

      int size = name.length();
      for (int i=0; i<size; i++){
          ch = name.charAt(i);
          reverse = ch + reverse;
      }
        System.out.println("Reverse String = "+reverse);

    }

}












//    Scanner scanner = new Scanner(System.in);
//        System.out.println("Enter any name");
//                String name = scanner.next();
//
//                String reverse = "";
//                int size = name.length();
//
//                char ch ;
//                for (int i=0; i<size; i++){
//        ch = name.charAt(i);
//        reverse = ch +reverse;   //sayli,  //adds each character in front of the existing string
//        }
//
//        System.out.println("After reverse string ");
//        System.out.println(" reverse name : "+reverse);