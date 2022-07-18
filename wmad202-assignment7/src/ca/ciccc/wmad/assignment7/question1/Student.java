package ca.ciccc.wmad.assignment7.question1;

public class Student implements Specifier {

    private int id;

    private String name;

    private float gpa;


    public Student(int id, String name, float gpa) {
        this.id = id;
        this.name = name;
        this.gpa = gpa;
    }


    @Override
    public boolean hasSpecificValue() {
        return this.gpa > 3.50;
    }

    @Override
    public String toString() {
        return "ID: " + this.id + " Name: " + this.name + " GPA: " +this.gpa;
    }
}
