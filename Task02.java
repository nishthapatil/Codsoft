import java.util.Scanner;
public class Task02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of subjects: ");
        int subno = sc.nextInt();
        if (subno <= 0) {
            System.out.println("Invalid number of subjects. Exiting...");
            return;
        }
        System.out.println("Enter the marks for the subjects:");
        int[] marks = new int[subno];
        for (int i = 0; i < subno; i++) {
            System.out.println("Enter the marks for subject " + (i + 1));
            marks[i] = sc.nextInt();
        }
        int total = 0;
        for (int mark : marks) {
            total += mark;
        }
        float percentage = (float) total / subno;
        char grade = 'F';
        if (percentage >= 90)
            grade = 'A';
        else if (percentage >= 80)
            grade = 'B';
        else if (percentage >= 70)
            grade = 'C';
        else if (percentage >= 60)
            grade = 'D';
        else if (percentage >= 40)
            grade = 'E';
        System.out.println("Total marks: " + total);
        System.out.println("Average marks: " + percentage);
        System.out.println("Grade: " + grade);
    }
}
