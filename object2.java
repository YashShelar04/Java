import java.util.*;


public class object2{
       public static void main(String []args){
           int a,b,c;
           use obj1=new use();

           obj1.maxAndMin();
       }
}

class use{
      void maxAndMin(){
          int a,b,c;
          Scanner sc=new Scanner(System.in);
          use obj=new use();
          System.out.println("Enter the three numbers: ");
          a=sc.nextInt();
          b=sc.nextInt();
          c=sc.nextInt();
       
          System.out.println("The maximum among the three numbers is "+obj.maximum(a,b,c));
          System.out.println("The minimum among the three numbers is "+obj.minimum(a,b,c));
          
      }

      int maximum(int a ,int b, int c){
            int max= (a>b)?(a>c?a:c):(b>c?b:c);
            return max;
      }

      int minimum(int a,int b,int c){
            int min=(a<b)?(a<c?a:c):(b<c?b:c);
            return min;
      }      
}
