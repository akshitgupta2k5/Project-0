// AUTHOR: Akshit Gupta
// FILENAME: Lab3
// SPECIFICATION: total Weighted Calculator
// FOR: CS 1400- Assignment #3
// TIME SPENT: 30 minutes


import java.util.Scanner;

public class WeightedGradeCalculator {
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);
        double homework = getValidGrade(scanner, "Homework");
        double midterm = getValidGrade(scanner, "Midterm");
        double finalExam = getValidGrade(scanner, "Final Exam");
        
        // Define weights
        double homeworkWeight = 0.3;
        double midtermWeight = 0.3;
        double finalExamWeight = 0.4;
        
        // Calculate final weighted grade
        double finalGrade = (homework * homeworkWeight) + (midterm * midtermWeight) + (finalExam * finalExamWeight);
        
        // Display final grade
        System.out.printf("Final Grade: %.2f%%\n", finalGrade);
        
        // Determine pass/fail status
        if (finalGrade >= 60) {
            System.out.println("Status: Passed");
        } else {
            System.out.println("Status: Failed");
        }
        
        scanner.close();
    }
    
    private static double getValidGrade(Scanner scanner, String gradeType) {
        double grade;
        while (true) {
            System.out.print("Enter " + gradeType + " Grade (0-100): ");
            if (scanner.hasNextDouble()) {
                grade = scanner.nextDouble();
                if (grade >= 0 && grade <= 100) {
                    break;
                } else {
                    System.out.println("Invalid input. Please enter a number between 0 and 100.");
                }
            } else {
                System.out.println("Invalid input. Please enter a numeric value.");
                scanner.next(); // Clear invalid input
            }
        }
        return grade;
    }
}

