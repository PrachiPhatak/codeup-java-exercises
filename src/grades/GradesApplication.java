package grades;

import movies.Movie;
import movies.MovieArray;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;

public class GradesApplication {
    public static void main(String[] args) {
        Student prachi = new Student("Prachi");
        prachi.addGrade(70);
        prachi.addGrade(80);
        prachi.addGrade(90);

        Student casey = new Student("Casey");
        casey.addGrade(90);
        casey.addGrade(100);
        casey.addGrade(100);

        Student laura = new Student("Laura");
        laura.addGrade(100);
        laura.addGrade(100);
        laura.addGrade(100);

        Student jordy = new Student("Jordy");
        jordy.addGrade(99);
        jordy.addGrade(99);
        jordy.addGrade(99);


        HashMap<String, Student> students = new HashMap<>();
        students.put("prachiphatak", prachi);
        students.put("vegetasrevenge", casey);
        students.put("SuitcaseCoder", laura);
        students.put("jordysolis96", jordy);

        showOptions(students);
    }

    private static void showOptions(HashMap<String, Student> students) {
        Scanner scanner = new Scanner(System.in);
        String userInput = "";
        System.out.println("******************************************************************");
        System.out.println("        Here are the GitHub usernames of our students:");
        printName(students);
        System.out.println("******************************************************************");
        showResults(scanner, students);

    }

    private static void showResults(Scanner scanner, HashMap<String, Student> students) {
        int userChoice = showOptions(scanner);
        switch (userChoice) {
            case 0:
                System.out.println("Goodbye, and have a wonderful day!");
                return;
            case 1:
                showStudentsInfo(students);
                break;
            case 2:
                System.out.println("What student would you like to see more information on? ");
                System.out.print(">");
                String name = scanner.nextLine();
                showStudentInfo(name, students);
                break;
            case 3:
                System.out.println("work in progress");
                break;
            default:
                System.out.println("Invalid choice");
        }
        showResults(scanner, students);
    }

    private static void showStudentsInfo(HashMap<String, Student> students) {
        Iterator studentsIterator = students.entrySet().iterator();
        while (studentsIterator.hasNext()) {
            Map.Entry mapElement = (Map.Entry) studentsIterator.next();
            Student student = (Student) mapElement.getValue();
            student.print();
        }
    }

    public static int showOptions(Scanner scanner) {
        System.out.println("What would you like to do?\n" +
                "\n" +
                "0 - exit\n" +
                "1 - view all users\n" +
                "2 - view more information for a student\n" +
                "3 - WIP - view class average\n" +
                "\n" +
                "Enter your choice: ");
        return Integer.parseInt(scanner.nextLine());
    }

    private static void showStudentInfo(String name, HashMap<String, Student> students) {
        if (students.containsKey(name)) {
            Student student = students.get(name);
            student.print();
        } else {
            System.out.println("Sorry, no student found with the GitHub username of " + name + ".");
        }

    }

    private static void printName(HashMap<String, Student> students) {
        Iterator hmIterator = students.entrySet().iterator();
        System.out.print("| ");
        while (hmIterator.hasNext()) {
            Map.Entry mapElement = (Map.Entry) hmIterator.next();
            Student student = (Student) mapElement.getValue();
            System.out.print(mapElement.getKey() + " | ");
        }
        System.out.println("\n");
    }
}
