package pl.javastart.task;

import java.util.HashSet;
import java.util.Set;

public class Student {
    private int index;
    private String firstName;
    private String lastName;
    private Set<String> enrolledGroups; // Zbiór przechowujący kody grup, do których student jest zapisany

    public Student(int index, String firstName, String lastName) {
        this.index = index;
        this.firstName = firstName;
        this.lastName = lastName;
        this.enrolledGroups = new HashSet<>();
    }

    public int getIndex() {
        return index;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void addEnrolledGroup(String groupCode) {
        enrolledGroups.add(groupCode);
    }

    public boolean isEnrolledInGroup(String groupCode) {
        return enrolledGroups.contains(groupCode);
    }
}
