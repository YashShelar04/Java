import java.lang.*;
import java.util.*;

public class vowel{
   public static void main(String []args){
   
   Scanner sc= new Scanner(System.in);
   char al=sc.next().charAt(0);
   
   if(al=='a'||al=='e'||al=='i'||al=='o'||al=='u'||al=='A'||al=='E'||al=='I'||al=='O'||al=='U'){
       System.out.println("The alphabet is vowel.");
   }else{
       System.out.println("The alphabet is not vowel.");
   }

   }
}
