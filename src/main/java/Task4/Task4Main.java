package Task4;

import java.util.ArrayList;
import java.util.Collections;

public class Task4Main {

    public static void main(String[] args) {

        ArrayList<Student> students = new ArrayList<>();

        students.add(new Student(103, 3.2));
        students.add(new Student(101, 3.8));
        students.add(new Student(102, 3.5));

        System.out.println("Original List:");
        for (Student s : students) {
            System.out.println(s);
        }

        Collections.sort(students);

        System.out.println("\nSorted by Roll Number:");
        for (Student s : students) {
            System.out.println(s);
        }

        Collections.sort(students, new CgpaComparator());

        System.out.println("\nSorted by CGPA (Descending):");
        for (Student s : students) {
            System.out.println(s);
        }
    }
}