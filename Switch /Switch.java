import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the input number");
        int num= sc.nextInt();
        switch(num){
            case 0:System.out.println("Case 1 is true");
            break;
            case 1:System.out.println("Case 2 is true");
            break;
            case 2:System.out.println("Case 3 is true");
            break;
        }
    }
}