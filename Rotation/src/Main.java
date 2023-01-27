import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the number of rows");
        int r=sc.nextInt();
        int[][]arr=new int[r][];
        System.out.println("Enter the number of columns");
        int c=sc.nextInt();
        arr=new int[r][c];
        System.out.println("Enter the values of matrix element");
        for(int i =0;i<r;i++){
            for(int j=0;j<c;j++){
                arr[i][j]=sc.nextInt();
            }
        }
        System.out.println("Input matrix");
        printMatrix(arr);


        rotateMatrix(arr,r,c);

        System.out.println("Rotated Matrix");
        printMatrix(arr);
    }
    static void printMatrix(int[][]output){
        for(int i=0;i<output.length;i++){
            for(int j=0;j<output[i].length;j++){
                System.out.print(output[i][j] + " ");
            }
            System.out.println();
        }
    }
    static void rotateMatrix(int[][]rotate,int r,int c){
//        Step 1 :transpose
        transposeInPlace(rotate,r,c);
//        Step 2 :reverse each row of transposed matrix
       for(int i=0;i<r;i++){
           reverseArray(rotate[i]);
       }
    }
    static void transposeInPlace(int[][]matrix,int r, int c){
        for(int i=0;i<c;i++){
            for(int j=i;j<r;j++){
                int temp=matrix[i][j];
                matrix[i][j]=matrix[j][i];
                matrix[j][i]=temp;
            }
        }
    }
    static void reverseArray(int[]array){
        int i=0,j=array.length-1;
        while(i<j){
            int temp=array[i];
            array[i]=array[j];
            array[j]=temp;
            i++;
            j--;
        }
    }
}