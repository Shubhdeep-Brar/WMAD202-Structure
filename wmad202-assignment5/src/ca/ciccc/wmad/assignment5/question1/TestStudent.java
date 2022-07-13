package ca.ciccc.wmad.assignment5.question1;

import java.util.ArrayList;

public class TestStudent {

    public void test(){
        ArrayList<Integer> ListOfGrade = new ArrayList<>();
        ListOfGrade.add(80);
        ListOfGrade.add(78);
        ListOfGrade.add(65);
        ListOfGrade.add(34);

        Student student1 = new Student(77889911 ,ListOfGrade,"Dave");
        Student student2 = new Student(66553322,"James");

        student2.addGrade(87);
        student2.addGrade(63);
        student2.addGrade(45);
        student2.addGrade(91);

        System.out.printf("The GPA of student 1 is %f\n", student1.calculateGPA());

        System.out.printf("The GPA of Student 2 is: %f\n ", student2.calculateGPA());

        if(student1.compareGPA(student2) == 1){
            System.out.println("Student 1 has higher GPA than Student 2");
        } else if (student1.compareGPA(student2) == -1) {
            System.out.println("Student 2 has higher GPA than Student 1");
        }
          else if(student1.compareGPA(student2) == 0){
              System.out.println("Both the Students have same GPA");
        }

    }

}
