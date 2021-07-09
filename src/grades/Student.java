package grades;

import java.util.ArrayList;

public class Student {
    private String name;
    private ArrayList<Integer> grades;

    public Student(String name) {
        this.name = name;
        this.grades = new ArrayList<>();
    }

    // returns the student's name
    public String getName() {
        return name;
    }

    // adds the given grade to the grades property
    public void addGrade(int grade) {
        grades.add(grade);
    }

    // returns the average of the students grades
    public double getGradeAverage() {
        double total = 0;
        for (int grade : grades) {
            total = total + grade;
        }
        return total / grades.size();
    }

    public void print() {
        System.out.println("Student Name: " + getName());
        System.out.println("Avg grade: " + getGradeAverage());
        System.out.print("Grades: ");
        for(int grade: grades){
            System.out.print(" "+grade +" ");
        }
        System.out.println("\n------------------------------------------");
    }

}
