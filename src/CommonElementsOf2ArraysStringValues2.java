import java.util.Arrays;

public class CommonElementsOf2ArraysStringValues2 {
    //program to print common elements from 2 arrays with string values
    public static void main(String[] args) {


        //create array 1
        String[] arr1 = {"Meha","Kaushal","Yogini","Devangi","Dharmistha"};

        //create array 2
        String[] arr2 = {"Kaushal", "Meha","Devangi"};

        //print array 1
        System.out.println("Array 1: " + Arrays.toString(arr1));

        //print array 2
        System.out.println("Array 2: " + Arrays.toString(arr2));

        System.out.println("Common Elements: ");

        for(int i = 0; i <arr1.length-1; i++)    //for loop syntax
        {
            for(int j = 0; j< arr2.length-1; j++)  //nested for loop
            {
                if(arr2[j] == arr1[i])        //if condition

                    System.out.println(arr2[j]);  //to print common elements
            }
        }



    }
}
//array.split