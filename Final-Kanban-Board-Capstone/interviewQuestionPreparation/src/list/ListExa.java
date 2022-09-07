package list;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class ListExa {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List list = new ArrayList();

        int again = 0;
        do {
            System.out.println(" Enter student name ");
            String name = scanner.next();
            list.add(name);

            System.out.println("1   yes\n2  No");
            again = scanner.nextInt();
        }while (again == 1);

        System.out.println(" Display list ");
        for (int i=0; i< list.size(); i++){
            System.out.println(list.get(i));
        }

        System.out.println("Name first letter is Capital");
        for (int i=0; i< list.size(); i++)
        {
            String firstLetter = (String) list.get(i);
            int size = firstLetter.length();

            String capital = null,capitalString = null;
            for (int j=0; j<firstLetter.length(); j++){
                if (j == firstLetter.indexOf(0)){
                    capital = String.valueOf(firstLetter.charAt(i));
                    capital.toUpperCase();
                    capitalString = capitalString + capital;
                }else {
                    System.out.println("elase");
                    capital = String.valueOf(firstLetter.charAt(i));
                    capitalString = capitalString +capital;
                }
            }
            System.out.println("Capital");
            System.out.println(capital);
        }


    }


}