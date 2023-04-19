import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {
        //program to reverse 5 digit number

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a 5 digit number: ");  //tell user to give input

        int num = scanner.nextInt(); //declaring variable in scanner class object

        int digits[] = new int[5];  //declaration and instantiation

        digits[0] = num % 10; //initialization
        digits[1] = (num/10) % 10;
        digits[2] = (num/100) % 10;
        digits[3] = (num/1000) % 10;
        digits[4] = (num/10000) % 10;

        System.out.println("Reversed number: ");
         //traversing array

        for (int i = 0; i < digits.length; i++ ) {
            System.out.print(digits[i]);

        }


    }
}
