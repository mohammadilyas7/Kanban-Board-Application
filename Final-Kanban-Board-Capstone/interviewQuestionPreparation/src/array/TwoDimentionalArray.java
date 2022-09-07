package array;

import java.util.Scanner;

public class TwoDimentionalArray
{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the row ");
        int row = scanner.nextInt();

        System.out.println("enter the column");
        int column = scanner.nextInt();

        int arr[][] = new int[row][column];

        for (int i=0; i<row; i++){
            for (int j=0; j<column; j++){
                arr[i][j] = scanner.nextInt();
            }
        }

        for (int i=0; i<row; i++){
            for (int j=0; j<column; j++){
                System.out.print(arr[i][j]+ " ");
            }
        }

        System.out.println("");
    }
}