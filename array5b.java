import java.util.Scanner;

public class array5b {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of subjects: ");
        int n = scanner.nextInt();

        int[] marks = new int[n];

        System.out.println("Enter the marks for each subject:");
        for (int i = 0; i < n; i++) {
            marks[i] = scanner.nextInt();
        }

        scanner.close();

        int totalMarks = 0;
        int highestMarks = Integer.MIN_VALUE;

        for (int mark : marks) {
            totalMarks += mark;
            if (mark > highestMarks) {
                highestMarks = mark;
            }
        }

        System.out.println("Total marks: " + totalMarks);
        System.out.println("Highest marks obtained: " + highestMarks);
    }
}
