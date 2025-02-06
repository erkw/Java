package edu.cuny.citytech.cst.gpa;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

// Developer: Kwan, Eric

public class T1 {

    @Test
    @DisplayName("D is Passing")
    public void t1() {
        GPA.Score score = GPA.calculateGrade(60);

        String expected = "D";
        String actual = score.letterGrade();

        assertEquals(expected, actual);
    }

    @Test
    @DisplayName("B is a good grade")
    public void t2() {
        GPA.Score score = GPA.calculateGrade(84);

        String expected = "B";
        String actual = score.letterGrade();

        assertEquals(expected, actual);
    }

    @Test
    @DisplayName("A is associated with a 4.0")
    public void t3() {
        GPA.Score score = GPA.calculateGrade(95);

        String expected = "A";
        String actual = score.letterGrade();

        assertEquals(expected, actual);
    }

    @Test 
    @DisplayName("C is associated a 2.0")
    public void t4() {
        GPA.Score score = GPA.calculateGrade(95);

        float expected = 2.0f;
        float actual = score.gpa();

        assertEquals(expected, actual);
    }
    
}