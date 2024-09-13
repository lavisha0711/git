import java.util.Scanner;

public class StudentGradeTracker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of students: ");
        int numStudents = scanner.nextInt();

        double[] grades = new double[numStudents];
        double sum = 0;
        double highest = Double.MIN_VALUE;
        double lowest = Double.MAX_VALUE;

        for (int i = 0; i < numStudents; i++) {
            System.out.print("Enter grade for student " + (i + 1) + ": ");
            grades[i] = scanner.nextDouble();

            sum += grades[i];
            highest = Math.max(highest, grades[i]);
            lowest = Math.min(lowest, grades[i]);
        }

        double average = sum / numStudents;

        System.out.println("\nStudent Grade Summary:");
        System.out.println("Average grade: " + average);
        System.out.println("Highest grade: " + highest);
        System.out.println("Lowest grade: " + lowest);

        scanner.close();
    }
}

