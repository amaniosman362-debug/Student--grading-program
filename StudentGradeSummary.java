package vu.studentgradesummary;
import java.util.Scanner;

public class StudentGradeSummary {
    public static void main(String[] args) {
        Scanner save = new Scanner(System.in);

        int[] gradeCount = new int[10]; 
        int student = 1;

        while (student <= 5) {
            System.out.print("\nEnter score for student " + student + " (0–100): ");
            int score = save.nextInt();

            int grade;
            String remark;

            if (score >= 80 && score <= 100) { grade = 1; remark = "Distinction"; }
            else if (score >= 75) { grade = 2; remark = "Distinction"; }
            else if (score >= 66) { grade = 3; remark = "Credit"; }
            else if (score >= 60) { grade = 4; remark = "Credit"; }
            else if (score >= 50) { grade = 5; remark = "Credit"; }
            else if (score >= 45) { grade = 6; remark = "Credit"; }
            else if (score >= 35) { grade = 7; remark = "Pass"; }
            else if (score >= 30) { grade = 8; remark = "Pass"; }
            else { grade = 9; remark = "Fail"; }

            System.out.println("Score: " + score + " | Grade: " + grade + " | Remark: " + remark);

            
            gradeCount[grade]++;

            student++;
        }
        System.out.println("\n=== SUMMARY OF GRADES ===");
        for (int g = 1; g <= 9; g++) {
            System.out.println("Grade " + g + ": " + gradeCount[g] + " student(s)");
        }

        
    }
}

