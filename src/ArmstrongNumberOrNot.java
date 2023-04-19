import java.util.Scanner;

public class ArmstrongNumberOrNot {
    // program to check given number is Armstrong ot not
    //armstrong number is sum of cubes of all numbers
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in); //scanner class object
        int num ,temp ,remainder , digits = 0;//initialization
        int sum = 0;

        System.out.println("Enter a number: ");  // tell user to give input
        num = scanner.nextInt();

        temp = num;
        do               //1st do while loop
        {
            digits++;
            temp /= 10;
        } while( temp != 0);

        temp = num;
        do                //2nd do while loop
        {
            remainder = temp % 10;
            sum += Math.pow(remainder, digits); //built in method
            temp /= 10;

        }while(temp != 0);

        if (sum == num)      //if else statement
        {
            System.out.println(num + " is an Armstrong number.");
        }else
        {
            System.out.println(num + " is not an Armstrong number.");
        }

    }
}
