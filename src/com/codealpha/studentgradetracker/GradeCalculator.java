package com.codealpha.studentgradetracker;
import java.util.ArrayList;

public class GradeCalculator {

    public static double calculateAverage(ArrayList<Student> students) {

        double total = 0;

        for (Student student : students) {
            total += student.getMarks();
        }

        return total / students.size();
    }

    public static double findHighest(ArrayList<Student> students) {

        double highest = students.get(0).getMarks();

        for (Student student : students) {
            if (student.getMarks() > highest) {
                highest = student.getMarks();
            }
        }

        return highest;
    }

    public static double findLowest(ArrayList<Student> students) {

        double lowest = students.get(0).getMarks();

        for (Student student : students) {
            if (student.getMarks() < lowest) {
                lowest = student.getMarks();
            }
        }

        return lowest;
    }
}