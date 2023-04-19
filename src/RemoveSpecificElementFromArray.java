import java.util.Arrays;

public class RemoveSpecificElementFromArray{
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9};

        System.out.println("Original Array : "+ Arrays.toString(arr));

        //remove the third element (index -3 and value -4)
        int removeIndex = 3;

        for(int i = removeIndex; i < arr.length -1; i++){
            arr[i] = arr[i + 1];
        }

        //we cannot alter size of an array, after removal last and second last element in array will exist twice
        System.out.println("After removing 3rd element: " +Arrays.toString(arr));
    }
}
