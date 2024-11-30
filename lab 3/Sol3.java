import javax.swing.*;

public class Sol3 {
    public static void main(String[] args) {
    
        String inputStudents = JOptionPane.showInputDialog("Enter the total number of students:");
        int numStudents = Integer.parseInt(inputStudents);

        
        int[] scores = new int[numStudents];

        
        for (int i = 0; i < numStudents; i++) {
            String inputScore = JOptionPane.showInputDialog("Enter score for student " + (i + 1) + ":");
            scores[i] = Integer.parseInt(inputScore);
        }

        
        int bestScore = findBestScore(scores);

        
        String[] grades = assignGrades(scores, bestScore);

        
        for (int i = 0; i < numStudents; i++) {
            JOptionPane.showMessageDialog(null, "Student " + (i + 1) + " Score: " + scores[i] + ", Grade: " + grades[i]);
        }
    }

    private static int findBestScore(int[] scores) {
        int best = Integer.MIN_VALUE;

        for (int score : scores) {
            if (score > best) {
                best = score;
            }
        }

        return best;
    }

    private static String[] assignGrades(int[] scores, int bestScore) {
        String[] grades = new String[scores.length];

        for (int i = 0; i < scores.length; i++) {
            if (scores[i] >= bestScore - 10) {
                grades[i] = "A";
            } else if (scores[i] >= bestScore - 20) {
                grades[i] = "B";
            } else if (scores[i] >= bestScore - 30) {
                grades[i] = "C";
            } else if (scores[i] >= bestScore - 40) {
                grades[i] = "D";
            } else {
                grades[i] = "F";
            }
        }

        return grades;
    }
}