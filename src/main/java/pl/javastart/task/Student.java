package pl.javastart.task;

import java.util.HashSet;
import java.util.Set;

public class Student extends UniversityPerson {
    private int index;

    private Set<String> enrolledGroups; // Zbiór przechowujący kody grup, do których student jest zapisany

    public Student(int index, String firstName, String lastName) {
        this.index = index;
        super.setFirstName(firstName);
        super.setLastName(lastName);
        this.enrolledGroups = new HashSet<>();
    }

    public int getIndex() {
        return index;
    }

    public void addEnrolledGroup(String groupCode) {
        enrolledGroups.add(groupCode);
    }

    public boolean isEnrolledInGroup(String groupCode) {
        return enrolledGroups.contains(groupCode);
    }
}
