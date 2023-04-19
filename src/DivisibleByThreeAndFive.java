public class DivisibleByThreeAndFive {
    //program to print numbers between 1 to 100 which are divisble by 3 & 5
    public static void main(String[] args) {
        int i = 1;
        System.out.println("Numbers divisible by 3: ");

        do{                //1st do while for number divisible by 3

            if (i % 3 == 0) //number divisible by 3
            {
                System.out.print(i + " ");
            }
            i++;
        } while ( i <= 100);

        System.out.println("\nNumbers divisible by 5: ");
        i = 1;
        do {  //2nd do while for number divisible by 5
            if (i % 5 == 0)  //number divisible by 5
            {
                System.out.print(i + " ");
            }i++;
        } while (i <= 100);
    }
}
