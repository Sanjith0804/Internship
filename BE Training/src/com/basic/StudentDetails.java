package com.basic;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;

public class StudentDetails {
    public String name, dept,usn;
    protected LocalDate dob;
    private String parentName;
    public int sem;
    ArrayList<Float> sgpas = new ArrayList<>();
    float cgpa;

    public String getParentName() {
        return parentName;
    }

    public void setParentName(String parentName) {
        this.parentName = parentName;
    }

    public StudentDetails() {
    }

    public StudentDetails(String name, String usn, String dob, String dept, String parentName, int sem, ArrayList<Float> sgpas) {
        this.name = name;
        this.usn = usn;
        this.dob = LocalDate.parse(dob);
        this.dept = dept;
        this.parentName = parentName;
        this.sem = sem;
        this.sgpas = sgpas;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<StudentDetails> students = new ArrayList<>();

        System.out.print("Enter the number of students: ");
        int numberOfStudents = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < numberOfStudents; i++) {
            System.out.println("\nEnter details for Student " + (i + 1));

            StudentDetails student = new StudentDetails();

            System.out.print("Enter your name: ");
            student.name = sc.nextLine();
            while (!student.name.matches("^[A-Za-z ]{2,}$")) {
                System.out.println("Invalid name! Only alphabets and spaces allowed. Try again:");
                student.name = sc.nextLine();
            }

            System.out.print("Enter your USN: ");
            student.usn = sc.nextLine();
            while (!student.usn.matches("^[0-9]{1}+[A-Z]{2}+[0-9]{2}+[A-Z]{2}+[0-9]{3}$")) {
                System.out.println("Invalid format, it must be in the form of (1RN20XX001)");
                student.usn = sc.nextLine();
            }            

            System.out.print("Enter your Date Of Birth (YYYY-MM-DD): ");
            student.dob = LocalDate.parse(sc.nextLine());
            while (student.dob.isAfter(LocalDate.now())) {
                System.out.println("Invalid DOB!Try again:");
                student.dob = LocalDate.parse(sc.nextLine());
            }


            System.out.print("Enter your department: ");
            student.dept = sc.nextLine();
            while (!student.dept.matches("^[A-Za-z ]{2,}$")) {
                System.out.println("Invalid name! Only alphabets and spaces allowed. Try again:");
                student.dept = sc.nextLine();
            }

            System.out.print("Enter your parent's name: ");
            student.setParentName(sc.nextLine());
            while (!student.parentName.matches("^[A-Za-z ]{2,}$")) {
                System.out.println("Invalid name! Only alphabets and spaces allowed. Try again:");
                student.parentName = sc.nextLine();
            }

            System.out.print("Enter the semester you are studying in: ");
            student.sem = sc.nextInt();
            while (student.sem > 8) {
                System.out.println("There are only 8 semesters. Try again !");
                student.sem = sc.nextInt();
            }
            int semForSgpa = student.sem - 1; 
            System.out.print("Enter your SGPA of all " + semForSgpa + " semesters: ");
           
            for (int j = 1; j <= semForSgpa; j++) {
                System.out.print("Semester " + j + " SGPA: ");
                student.sgpas.add(sc.nextFloat());
            }
            sc.nextLine();

            students.add(student);
        }

        
        System.out.println("Student Information ");
        for (int i = 0; i < students.size(); i++) {
            StudentDetails student = students.get(i);
            System.out.println("Student " + (i + 1));
            System.out.println("Name: " + student.name);
            System.out.println("USN: " + student.usn);
            System.out.println("Date of Birth: " + student.dob);
            System.out.println("Department: " + student.dept);
            System.out.println("Parent's Name: " + student.getParentName());            
            System.out.println("Semester: " + student.sem);
            System.out.println("SGPA: " + student.sgpas);  
        }
        sc.close();
    }
}
