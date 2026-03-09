import java.util.Scanner;

class Student {
    String name;
    int id;
    double marks;
    char grade;
    static int totalStudents = 0;
    final String courseName = "Data Science";

    Student() {
        name = "Unknown";
        id = 0;
        marks = 0;
        grade = 'F';
        totalStudents++;
    }

    Student(String name, int id, double marks) {
        this.name = name;
        this.id = id;
        this.marks = marks;

        if (marks >= 90) grade = 'A';
        else if (marks >= 75) grade = 'B';
        else if (marks >= 60) grade = 'C';
        else if (marks >= 50) grade = 'D';
        else grade = 'F';

        totalStudents++;
    }

    void display() {
        System.out.println("Course: " + courseName);
        System.out.println("Name: " + name);
        System.out.println("ID: " + id);
        System.out.println("Marks: " + marks);
        System.out.println("Grade: " + grade);
        System.out.println();
    }
}

public class assign2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Student s1 = new Student();

        System.out.print("Enter student name: ");
        String name = sc.nextLine();

        System.out.print("Enter student ID: ");
        int id = sc.nextInt();

        System.out.print("Enter marks: ");
        double marks = sc.nextDouble();

        Student s2 = new Student(name, id, marks);

        System.out.println("\nStudent Details");
        s1.display();
        s2.display();

        System.out.println("Total Students: " + Student.totalStudents);
    }
}