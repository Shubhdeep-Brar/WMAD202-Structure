package ca.ciccc.wmad.assignment5.question1;

import java.util.ArrayList;

public class Student {

    private int StudentID;

    private ArrayList<Integer> ListOfGrades;

    private String Name;

    public Student(int StudentID, ArrayList<Integer> ListofGrades, String Name) {
        this.StudentID = StudentID;
        this.ListOfGrades = ListofGrades;
        this.Name = Name;
    }
    public Student(int StudentID, String Name){
        this.Name = Name;
        this.StudentID = StudentID;
        this.ListOfGrades = new ArrayList<>();
    }

    public void addGrade(int grade){
        this.ListOfGrades.add(grade);
    }
    public float calculateGPA(){
        int sum = 0;
        for (Integer grades : this.ListOfGrades) {
            sum = sum + grades  ;
        }
        return (float)sum/this.ListOfGrades.size();
    }
    public void printStudentInformation(){

        System.out.printf("StudentID: %d\n",this.StudentID);
        System.out.printf("List of Grades %d\n",this.ListOfGrades);
        System.out.print(Name);
        System.out.print(calculateGPA());
    }

    public int compareGPA(Student otherStudent) {
        if(this.calculateGPA() > otherStudent.calculateGPA()){
        return 1;}
        else if (this.calculateGPA() < otherStudent.calculateGPA())
        {return -1;}
        return 0;

    }}