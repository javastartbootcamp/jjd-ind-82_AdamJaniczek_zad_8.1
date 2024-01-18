package pl.javastart.task;

import java.util.HashMap;
import java.util.Map;

public class Group {
    private String code;
    private String name;
    private Lecturer lecturer;
    private Map<Integer, Student> students = new HashMap<>();
    private Map<Integer, Double> grades = new HashMap<>();

    public Group(String code, String name, Lecturer lecturer) {
        this.code = code;
        this.name = name;
        this.lecturer = lecturer;
    }

    public String getCode() {
        return code;
    }

    public String getName() {
        return name;
    }

    public Lecturer getLecturer() {
        return lecturer;
    }

    public void addStudent(Student student) {
        students.put(student.getIndex(), student);
    }

    public boolean hasGrade(int studentIndex) {
        return grades.containsKey(studentIndex);
    }

    public void addGrade(int studentIndex, double grade) {
        grades.put(studentIndex, grade);
    }

    public Map<Integer, Double> getGrades() {
        return grades;
    }

    public Iterable<Student> getStudents() {
        return students.values();
    }

    public double getGrade(int studentIndex) {
        return grades.getOrDefault(studentIndex, -1.0); // Zwraca -1.0, jeśli nie ma oceny dla danego studenta
    }


}
