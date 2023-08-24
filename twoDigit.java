import java.lang.*;
import java.util.*;

public class twoDigit{
   public static void main(String []args){
   Scanner sc = new Scanner(System.in);
   
   System.out.print("Enter a number: ");
   int num= sc.nextInt();
   
   if((num>9)&&(num<100)){
        System.out.print("Number is 2 digit");
   }else{
        System.out.print("Number is not 2 digit");
   }
}
}
