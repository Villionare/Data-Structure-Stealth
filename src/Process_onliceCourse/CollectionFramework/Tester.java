package Process_onliceCourse.CollectionFramework;

import java.util.ArrayList;

public class Tester {
    public static void main(String[] args) {
        ArrayList<Student> student = new ArrayList<>();
        student.add(new Student(2, "ritikk", true));
        student.add(new Student(2, "abi", false));
        student.add(new Student(2, "polo", true));
        student.add(new Student(2, "kick", false));

        ArrayList<String> studentNames = new ArrayList<String>();

        for (Student i : student) {
            studentNames.add(i.getStudentName());
            System.out.println("Student name: " + i.getStudentName());
            System.out.println("Student Id: " + i.getStudentId());
            System.out.println("Course Registered: " + i.getCourseRegistered());
        }
        System.out.println(studentNames);
    }
}
