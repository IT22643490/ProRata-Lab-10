import java.util.Scanner;

public class IT22643490_Lab10Q1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter the mark (0 - 100): ");
        int mark = input.nextInt();
        
        // Part (a): Validate mark using assertion
        assert (mark >= 0 && mark <= 100) : "Invalid Mark";
        
        // If assertion passes, mark is valid
        System.out.println("Mark is Validated");
        
        // Part (b): Determine grade
        char grade;
        
        if (mark >= 75) {
            grade = 'A';
        } else if (mark >= 60) {
            grade = 'B';
        } else if (mark >= 50) {
            grade = 'C';
        } else if (mark >= 40) {
            grade = 'D';
        } else {
            grade = 'F';
        }
        
        // Verify grade using assertion
        // Check if the grade assignment is correct
        boolean isGradeCorrect = false;
        
        if (mark >= 75 && grade == 'A') {
            isGradeCorrect = true;
        } else if (mark >= 60 && mark <= 74 && grade == 'B') {
            isGradeCorrect = true;
        } else if (mark >= 50 && mark <= 59 && grade == 'C') {
            isGradeCorrect = true;
        } else if (mark >= 40 && mark <= 49 && grade == 'D') {
            isGradeCorrect = true;
        } else if (mark < 40 && grade == 'F') {
            isGradeCorrect = true;
        }
        
        assert isGradeCorrect : "Incorrect Grade Assigned";
        
        // Display the grade
        System.out.println("The Grade for the Entered Mark is: " + grade);
        
        input.close();
    }
}