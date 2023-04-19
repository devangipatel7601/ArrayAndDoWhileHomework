import java.util.Scanner;

public class ArrayValuesInAscendingOrder {
    private static boolean so;

    public static void main(String[] args) {

        int count, temp;

        //creating scanner class object
        Scanner scanner = new Scanner(System.in);

        //user input array size
        System.out.println("Enter number of elements you want in an Array: ");
         count = scanner.nextInt();

        int num[]=new int[count];
        System.out.println("Enter array elements: ");  //user input array elements in int

        for (int i = 0; i < count ; i++)
        {
            num[i] = scanner.nextInt();

        }
        scanner.close();
        for (int i = 0; i <count ; i++)
        {
            for (int j = i+1; j < count ; j++)
            {
                if (num[i] > num[j]) {
                    temp = num[i];
                    num[i] = num[j];
                    num[j] = temp;

                }
                }

            }

        System.out.print("Array Elements in Ascending Order: ");
        for(int i = 0; i< count -1; i++)
        {
            System.out.print(num[i] + " , ");

        }
        System.out.print(num[count - 1]);
    }
}

