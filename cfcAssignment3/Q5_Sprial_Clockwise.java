package cfcAssignment3;

import java.util.Scanner;

public class Q5_Sprial_Clockwise {
    public static int[][] input2dArray(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of rows and columns");
        int rows = sc.nextInt();         //no. of rows
        int cols = sc.nextInt();         //no. of columns

        int[][] array = new int[rows][cols];

        for (int i = 0; i < rows; i++) {
            System.out.printf("Enter Values of %d index row\n",i);
            for (int j = 0; j < cols; j++) {
                array[i][j] = sc.nextInt();
            }
        }
        return array;
    }


    public static void main(String[] args) {
        int[][] arr = {
                {11, 12, 13, 14},
                {21, 22, 23, 24},
                {31, 32, 33, 34},
                {41, 42, 43, 44}
        };
//        int[][] arr = input2dArray();

    }
}
