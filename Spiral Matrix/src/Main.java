import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows");
        int rows= sc.nextInt();
        int[][]matrix= new int[rows][];
        System.out.println("Enter the number of columns");
        int columns= sc.nextInt();
        matrix=new int[rows][columns];
        System.out.println("Enter the values for matrix elements");
        for(int i=0;i<rows;i++){
            for(int j=0;j<columns;j++){
                matrix[i][j]=sc.nextInt();
            }
        }
        System.out.println("Input Matrix");
        printMatrix(matrix);

        System.out.println("Spiral Order");
        printSpiralOrder(matrix,rows,columns);
    }

    static void printMatrix(int[][]arr){
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
    static void printSpiralOrder(int [][]arr,int r,int c){
        int topRow=0, bottomRow=r-1,leftCol=0,rightCol=c-1;
        int totalVariables=1;
        while(totalVariables <= r*c){
//            topRow -> leftCol to rightCol
            for(int j=leftCol; j<=rightCol;j++){
                System.out.print(arr[topRow][j]+" ");
                totalVariables++;
            }
            topRow++;

//            rightCol -> topRow to bottomRow
            for(int i =topRow; i<=bottomRow;i++){
                System.out.print(arr[i][rightCol]+" ");
                totalVariables++;
            }
            rightCol--;

//            bottomRow -> rightCol to leftCol
            for(int j =rightCol;j>= leftCol;j--){
                System.out.print(arr[bottomRow][j]+" ");
                totalVariables++;
            }
            bottomRow--;// Here I faced a problem of sign error

            for(int i=bottomRow;i >= topRow;i--){
                System.out.print(arr[i][leftCol]+" ");
                totalVariables++;
            }
            leftCol++;
        }
    }
}