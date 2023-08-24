import java.lang.*;
import java.util.*;

public class Greatest{
   public static void main(String []args){
   
   int a=1;
   int b=2;
   int c=3;
   
   if(a>c){
        if(a>b){
            System.out.println(a+" is greatest number");
        }else{
            System.out.println(b+" is greatest number");
        }
   
   }else if(c>a){
         if(c>b){
              System.out.println(c+" is greatest number");
         }else{
              System.out.println(b+" is greatest number");
         }

   }
}
}
