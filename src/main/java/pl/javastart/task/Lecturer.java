package pl.javastart.task;

class Lecturer extends UniversityPerson {
    private int id;
    private String degree;

    public Lecturer(int id, String degree, String firstName, String lastName) {
        this.id = id;
        this.degree = degree;
        super.setFirstName(firstName);
        super.setLastName(lastName);
    }

    public int getId() {
        return id;
    }

    public String getDegree() {
        return degree;
    }
}
