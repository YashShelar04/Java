import java.util.Scanner;

public class object1{

    String name,des,department;
    int id;

    public static void main(String []args){
       Scanner sc= new Scanner(System.in);
       object1 obj=new object1();
       
       String name,des,department;
       int id;

       
       //Name of the employee
       System.out.println("Enter the name of the employee: ");
       name=sc.nextLine();
       
       //Designation of the employee in the company
       System.out.println("Enter the designation of the employee: ");
       des=sc.nextLine();
       
       //Department     
       System.out.println("Enter the department:");
       department=sc.nextLine();

       //ID of the employee
       System.out.println("Enter the id of the employee: ");
       id=sc.nextInt();
       
       
       obj.display(name,des,department,id);
       
       
    }
    
    void display(String name, String des,String department,int id){     
       //Name of the employee
       System.out.println("The name of the employee is "+ name);
       
       //Designation of the employee in the company
       System.out.println("The designation of the employee in the company is "+ des);
       
       //Department    
       System.out.println("The department the employee works in is "+ department);

       //ID of the employee
       System.out.println("The id of the employee is "+ id);
       
    }
    
}
