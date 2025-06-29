package Process.CollectionFramework;

import java.util.ArrayList;
import java.util.List;

public class ArrayLists {
    public static void main(String[] args) {

    }

    public static List<Student> getStudentList() {
        List<Student> students = new ArrayList<>();
        students.add(new Student(1, "John Doe", true));
        students.add(new Student(2, "Jane Smith", false));
        students.add(new Student(3, "Alice Johnson", true));
        students.add(new Student(4, "Bob Brown", false));
        return students;
    }

    public static List<String> getStudentNames(List<Student> students) {
        List<String> studentNames = new ArrayList<>();
        for (Student student : students) {
            studentNames.add(student.getStudentName());
        }
        return studentNames;
    }