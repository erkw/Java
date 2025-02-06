package edu.cuny.citytech.cst.gpa;

public class GPA {

// Developer: Kwan, Eric

    public record Score(float range1, float range2, String letterGrade, float gpa) {
    }

    public static Score calculateGrade(float score) {
        if (score >= 93 && score <= 100 || score == 4.0F) {
            return new Score(93, 100, "A", 4.0F);
        } else if (score >= 90 && score < 92.9 || score == 3.7F) {
            return new Score(90, 92.99F, "A-", 3.7F);
        } else if (score >= 87 && score < 89.9 || score == 3.3F) {
            return new Score(87, 89.99F, "B+", 3.3F);
        } else if (score >= 83 && score < 86.9 || score == 3.0F) {
            return new Score(83, 86.99F, "B", 3.0F);
        } else if (score >= 80 && score < 82.9 || score == 2.7F) {
            return new Score(80, 82.99F, "B-", 2.7F);
        } else if (score >= 77 && score < 79.9 || score == 2.3F) {
            return new Score(77, 79.99F, "C+", 2.3F);
        } else if (score >= 75 && score < 76.9 || score == 2.0F) {
            return new Score(75, 76.99F, "C", 2.0F);
        } else if (score >= 60 && score < 74.9 || score == 1.0F) {
            return new Score(60, 74.99F, "D", 1.0F);
        }
        return new Score(0, 59.99F, "F", 0.0F);
    }
    
}