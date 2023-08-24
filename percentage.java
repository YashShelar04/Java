import java.util.*;

public class percentage{
  
    public static void main(String []args){
         Scanner sc=new Scanner(System.in);
         
         System.out.println("Enter the grade of the student");
         char grade=sc.next().charAt(0);
         
         switch(grade){
         
         case 'A': System.out.println("The percentage range is of the student is 91-100");
                   break;
                    
         case 'B': System.out.println("The percentage range is of the student is 81-90");
                   break;
                   
         case 'C': System.out.println("The percentage range is of the student is 71-80");
                   break;
                   
         case 'D': System.out.println("The percentage range is of the student is 61-70");
                   break;
                   
         case 'F': System.out.println("The percentage range is of the student is 0-60");
                   break;
                   
         default: System.out.println("Invalid grade");  
                  break;      
         }
         
    
    
    }
}
