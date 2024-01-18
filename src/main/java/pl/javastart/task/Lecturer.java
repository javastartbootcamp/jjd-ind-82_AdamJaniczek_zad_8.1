package pl.javastart.task;

class Lecturer {
    private int id;
    private String degree;
    private String firstName;
    private String lastName;

    public Lecturer(int id, String degree, String firstName, String lastName) {
        this.id = id;
        this.degree = degree;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public int getId() {
        return id;
    }

    public String getDegree() {
        return degree;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }
}
