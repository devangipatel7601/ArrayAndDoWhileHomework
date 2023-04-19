public class TransposeMatrix2DArray {
    //program to transpose matrix of 2d array
    //transpose of matrix is calculated by simply swapping columns to rows: transpose[j][i] = matrix[i][j];
    public static void main(String[] args) {
        int original[][]={{1,2,3},{4,5,6},{7,8,9}};

//creating another matrix to store transpose of a matrix
        int transpose[][]=new int[3][3];  //3 rows and 3 columns

//Code to transpose a matrix
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                transpose[i][j]=original[j][i];
            }
        }

        System.out.println("Original Matrix:");
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                System.out.print(original[i][j]+" ");
            }
            System.out.println();//new line
        }
        System.out.println("Transposed Matrix:");
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                System.out.print(transpose[i][j]+" ");
            }
            System.out.println();//new line
        }
    }}


