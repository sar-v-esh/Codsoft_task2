import java.util.Scanner;

public class GradeCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        char grade;

        System.out.println("Enter marks obtained in each subject (out of 100):");

        int numSubjects = 0;
        int totalMarks = 0;

        while (true) {
            System.out.print("Enter marks for subject " + (numSubjects + 1) + " (Provide -1 to close): ");
            int marks = scanner.nextInt();

            if (marks == -1) {
                break;
            }

            if (marks < 0 || marks > 100) {
                System.out.println("Invalid marks. Please enter marks between 0 and 100.");
                continue;
            }

            totalMarks += marks;
            numSubjects+=1;
        }

        double averagePercentage = (double) totalMarks / numSubjects;

        if (averagePercentage >= 90) {
            grade = 'A';
        } else if (averagePercentage >= 80) {
            grade = 'B';
        } else if (averagePercentage >= 70) {
            grade = 'C';
        } else if (averagePercentage >= 60) {
            grade = 'D';
        } else {
            grade = 'F';
        }

        System.out.println("\nResults:");
        System.out.println("Total Marks: " + totalMarks);
        System.out.println("Average Percentage: " + averagePercentage + "%");
        System.out.println("Grade: " + grade);

        scanner.close();
    }
}
