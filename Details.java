public class Details{
     public static void main(String args[]){
         int num=0;
         int sum=0;
         
         for(int i=101;i<200;i++){
              if(i%7==0){
                 System.out.print(i+" ");
                 num++;
                 sum+=i;
              }
         }
         
         System.out.println("\n There are "+num+ " numbers which are divisible by 7 and which are greater than 100 and less than 200");
         
         System.out.println("The Sum of numbers which are divisible by 7 and which are greater than 100 and less than 200 is "+sum);
         
     }
}
