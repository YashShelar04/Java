import java.io.*;

public class admission{

       public static void main(String []args) throws IOException{
       
       BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
       
       System.out.println("Enter your marks in physics: ");
       int phy=Integer.parseInt(br.readLine());
       
       System.out.println("Enter your marks in chemistry: ");
       int chem=Integer.parseInt(br.readLine());
       
       System.out.println("Enter your marks in math: ");
       int math=Integer.parseInt(br.readLine());
       
       int total=phy+chem+math;
       
       if((phy>=50)&&(chem>=40)&&(math>=60)&&(total>=200)){
              System.out.println("You are eligible to get the admission");
       }else{
             System.out.println("You are not eligible to get the admission");
       }
       
       }
}
