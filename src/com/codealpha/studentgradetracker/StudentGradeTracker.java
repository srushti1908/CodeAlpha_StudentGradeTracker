package com.codealpha.studentgradetracker;
import java.util.ArrayList;
import java.util.Scanner;

public class StudentGradeTracker {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        ArrayList<Student> students = new ArrayList<>();

        System.out.print("Enter number of students: ");
        int numberOfStudents = scanner.nextInt();
        scanner.nextLine();

        for (int i = 1; i <= numberOfStudents; i++) {

            System.out.println("\nEnter details for Student " + i);

            System.out.print("Enter student name: ");
            String name = scanner.nextLine();

            System.out.print("Enter marks: ");
            double marks = scanner.nextDouble();
            scanner.nextLine();

            students.add(new Student(name, marks));
        }

        double average = GradeCalculator.calculateAverage(students);
        double highest = GradeCalculator.findHighest(students);
        double lowest = GradeCalculator.findLowest(students);

        System.out.println("\n========== STUDENT GRADE REPORT ==========");

        for (Student student : students) {
            System.out.println(
                    "Name: " + student.getName()
                            + " | Marks: " + student.getMarks()
            );
        }

        System.out.println("-------------------------------------------");
        System.out.printf("Average Score : %.2f%n", average);
        System.out.println("Highest Score : " + highest);
        System.out.println("Lowest Score  : " + lowest);
        System.out.println("===========================================");

        scanner.close();
    }
}