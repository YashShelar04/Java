import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the number of rows");
        int r=sc.nextInt();
        int [][] ans=pascal(r);
        printMatrix(ans);
    }
    static void printMatrix(int[][]matrix){
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[i].length;j++){
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
    static int[][] pascal(int r){
        int [][]ans=new int[r][];
        for (int i=0; i<r;i++){
//             ith row has i+1 columns
            ans[i]=new int[i+1];
//            1st and last element of every row is 1
            ans[i][0]=ans[i][i]=1;
            for (int j=1;j<i;j++){
                ans[i][j]=ans[i-1][j]+ans[i-1][j-1];
            }
        }
    return ans;
    }
}