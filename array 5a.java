import java.util.*;

public class Main{
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        Main obj= new Main();
        System.out.println("Enter the size of the array");
        int n=sc.nextInt();

        int arr[]=new int[n];

        obj.inputArray(n,arr);

        obj.count(arr,n);


    }

     static void inputArray(int n,int arr[] ){
        Scanner sc=new Scanner(System.in);
        for(int i=0;i<n;i++){
            arr[i] =sc.nextInt();
        }
    }

    public static void count(int arr[],int n){
        int countEven=0,countOdd=0;
        for(int i=0;i<n;i++){
            if(arr[i]%2==0){
                countEven++;
            }else if(arr[i]%2==1){
                countOdd++;
            }
        }
        System.out.println("The number of even number in the array is "+countEven);
        System.out.println("The number of odd number in the array is "+countOdd);
    }
}