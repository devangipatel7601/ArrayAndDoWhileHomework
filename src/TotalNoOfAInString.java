import java.util.Scanner;

public class TotalNoOfAInString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = 0,i = 0;
        System.out.println("Please Enter a String to Count total number of 'a': ");
        String string = scanner.nextLine();
        while(i < string.length())
        {
            if(string.charAt(i) == 'a'){
                count++;
            }
            i++;
        }
        System.out.println("The total Number of 'a' in String are: " + count);

    }
}
