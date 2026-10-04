//Defining array
// type[] arrayName = new type[size];

// import java.lang.reflect.Array;
import java.util.Scanner;

public class array {
    public static void main(String[] args) {
//        int[] marks= new int[6];
//        marks[0]=89;
//        marks[1]=99;
//        marks[2]=69;
//        marks[3]=90;
//        System.out.println(marks[0]);
//        for(int i=0;i<6;i++){
//            System.out.println(marks[i]);
//------------------------
//        Scanner sc = new Scanner(System.in);
//
//        int size=sc.nextInt();
//        int number[]=new int[size];
////input
//        for(int i=0;i<size;i++){
//            number[i]=sc.nextInt();
//        }
////output
//        for(int i=0;i<size;i++){
//            System.out.println(number[i]);
//        }

//---------------
//        Scanner sc= new Scanner(System.in);
//        System.out.print("Enter the size of the array :");
//        int size=sc.nextInt();
//        int number[]=new int[size];
//
//        for(int i=0;i<size;i++) {
//            number[i]=sc.nextInt();
//        }
//
//        System.out.println("Enter the elements of the array :");
//        int x=sc.nextInt();
//
//        boolean found = false;
//
//        for(int i=0;i<number.length;i++) {
//            if (x == number[i]) {
//                System.out.println("x found at index : " + i);
//                found = true;
//                break;
//            }
//        }
//            if(found==false){
//                System.out.println("x NOT found");
//            }
//            sc.close();

//        Take an array of names as input from the user and print them on the screen
//        Scanner sc= new Scanner(System.in);
//        System.out.print("Enter number of names:");
//        int size=sc.nextInt();
//        String Names[]=new String[size];
//
//        System.out.println("Enter names:");
//        for(int i=0;i<size;i++){
//            Names[i]=sc.next();
//        }
//
//        System.out.println("Names enterd are:");
//        for(int i=0;i< Names.length;i++){
//            System.out.println(Names[i]);
//        }

//        Find the maximum & minimum number in an array of integers.

//        Scanner input=new Scanner(System.in);
//
//        int number[]=new int[6];
//
//        System.out.println("Enter the numbers of array elements:");
//        for(int i=0;i<6;i++){
//            number[i]=input.nextInt();
//        }
//
//        int max = Integer.MIN_VALUE;
//        int min = Integer.MAX_VALUE;
//
//        for(int i=0;i< number.length;i++){
//            if(number[i]>max){
//                max=number[i];
//            }
//            if(number[i]<min){
//                min=number[i];
//            }
//        }
//        System.out.println("Maximum number = " + max);
//        System.out.println("Minimum number = " + min);


//        Take an array of numbers as input and check if it is an array sorted in ascending order.
//
//        Scanner input=new Scanner(System.in);
//
//        int number[]=new int[5];
//
//        for(int i=0;i<5;i++){
//            number[i]=input.nextInt();
//        }
//
//        boolean isascending=true;
//        for(int i=0;i< number.length-1;i++){
//            if(number[i]>number[i+1]){
//                isascending=false;
//                break;
//            }
//        }
//        if(isascending) {
//            System.out.println("Array is sorted in ascending order.");
//        } else {
//            System.out.println("Array is not sorted in ascending order.");
//        }


//2D-Array
//
//        Scanner sc = new Scanner(System.in);
//
//        System.out.print("Enter number of rows: ");
//        int row = sc.nextInt();
//
//        System.out.print("Enter number of columns: ");
//        int col = sc.nextInt();
//
//        int[][] array = new int[row][col];
//
//        // Input
//        System.out.println("Enter the elements of the matrix:");
//        for(int i = 0; i < row; i++){
//            for(int j = 0; j < col; j++){
//                array[i][j] = sc.nextInt();
//            }
//        }
//
//        // Output
//        System.out.println("Matrix is:");
//        for(int i = 0; i < row; i++){
//            for(int j = 0; j < col; j++){
//                System.out.print(array[i][j] + " ");
//            }
//            System.out.println();
//        }
//
//        sc.close();

//-----------
//        Scanner sc = new Scanner(System.in);
//
//        System.out.print("Enter number of rows: ");
//        int row = sc.nextInt();
//
//        System.out.print("Enter number of columns: ");
//        int col = sc.nextInt();
//
//        int[][] array = new int[row][col];
//
//        // Input
//        System.out.println("Enter the elements of the matrix:");
//        for(int i = 0; i < row; i++){
//            for(int j = 0; j < col; j++){
//                array[i][j] = sc.nextInt();
//            }
//        }
//        System.out.println("enter the number you have to find");
//        int x= sc.nextInt();
//        boolean found=false;
//
//        for(int i=0;i<row;i++){
//            for(int j=0;j<col;j++){
//                if(x==array[i][j]) {
//                    System.out.println("X is found at matrix " +"["+ i +"]"+ "[" + j+"]");
//                    found = true;
//                    break;
//                }
//            }
//        }
//        if(!found){
//            System.out.println("X is not found");
//        }



//        Print the spiral order matrix as output for a given matrix of numbers.
//                Scanner sc = new Scanner(System.in);
//
//                System.out.print("Enter rows: ");
//                int rows = sc.nextInt();
//
//                System.out.print("Enter columns: ");
//                int cols = sc.nextInt();
//
//                int matrix[][] = new int[rows][cols];
//
//                System.out.println("Enter matrix elements:");
//
//                for(int i = 0; i < rows; i++){
//                    for(int j = 0; j < cols; j++){
//                        matrix[i][j] = sc.nextInt();
//                    }
//                }
//
//                int top = 0, bottom = rows - 1;
//                int left = 0, right = cols - 1;
//
//                System.out.println("Spiral Order:");
//
//                while(top <= bottom && left <= right){
//
//                    // Top row
//                    for(int i = left; i <= right; i++){
//                        System.out.print(matrix[top][i] + " ");
//                    }
//                    top++;
//
//                    // Right column
//                    for(int i = top; i <= bottom; i++){
//                        System.out.print(matrix[i][right] + " ");
//                    }
//                    right--;
//
//                    // Bottom row
//                    if(top <= bottom){
//                        for(int i = right; i >= left; i--){
//                            System.out.print(matrix[bottom][i] + " ");
//                        }
//                        bottom--;
//                    }
//
//                    // Left column
//                    if(left <= right){
//                        for(int i = bottom; i >= top; i--){
//                            System.out.print(matrix[i][left] + " ");
//                        }
//                        left++;
//                    }
//                }
//
//

//        For a given matrix of N x M, print its transpose.

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter rows: ");
        int rows = sc.nextInt();

        System.out.print("Enter columns: ");
        int cols = sc.nextInt();

        int matrix[][] = new int[rows][cols];

        System.out.println("Enter matrix elements:");

        // Input matrix
        for(int i = 0; i < rows; i++){
            for(int j = 0; j < cols; j++){
                matrix[i][j] = sc.nextInt();
            }
        }

        System.out.println("Transpose of matrix:");

        // Print transpose
        for(int j = 0; j < cols; j++){
            for(int i = 0; i < rows; i++){
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }



    }
}
