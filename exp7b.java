import java.util.Scanner;
class subjects{
    int subject1;
    int subject2;
    int subject3;
    int total;

    subjects(int subject1,int subject2,int subject3){
        this.total= subject1+subject2+subject3;
    }
}

public class exp7b{
    public static void main(String[] args) {
        int subject1,subject2,subject3;
        Scanner sc= new Scanner(System.in);
        subjects[] obj = new subjects[5];

        for(int i=0;i<5;i++){
            System.out.println("Student "+(i+1));
            System.out.print("Enter the marks scored in subject1: ");
            subject1=sc.nextInt();
            System.out.print("Enter the marks scored in subject2: ");
            subject2=sc.nextInt();
            System.out.print("Enter the marks scored in subject3: ");
            subject3=sc.nextInt();

            obj[i]=new subjects(subject1,subject2,subject3);
        }

        for(subjects student: obj){
            System.out.println("The total marks student has scored is "+student.total);
        }

        int max= obj[0].total;
        for(int i=0;i<5;i++){
            if(max<obj[i].total){
                max=obj[i].total;
            }
        }

        for(int i=0;i<5;i++){
            if(max==obj[i].total){
                System.out.println("Student "+(i+1)+" has scored highest marks among the 5.");
            }
        }
    }
}