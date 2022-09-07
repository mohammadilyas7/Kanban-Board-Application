package array;

import java.util.Arrays;
import java.util.Scanner;

public class OneDimention
{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter array size ");
        int size = scan.nextInt();

        String name[] = new String[size];

        System.out.println("enter Student name ");
        for (int i=0; i<size; i++){
            name[i] = scan.next();
            System.out.println(name[i]);
        }

        System.out.println("display array ");
        Arrays.sort(name);
        System.out.println(name);
    }
}