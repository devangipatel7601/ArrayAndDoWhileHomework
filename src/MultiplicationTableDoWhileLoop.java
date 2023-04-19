import java.util.Scanner;

public class MultiplicationTableDoWhileLoop {

    //program to print multiplication table
    public static void main(String[] args) {

        int i = 1;   //initialization

        //do while loop syntax

            do
            {
                for (int j = 1; j <= 12 ; j++)
                {

                System.out.print(i * j + " ");// to print i*j with space
            }
            System.out.println();
            i++;
        } while (i <= 12);       //exit condition
    }
}
