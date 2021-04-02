package collection;

class Student implements Comparable<Student> {
    private String name;
    private String family;
    private double average;

    public String getName() {
        return name;
    }

    public String getFamily() {
        return family;
    }

    public double getAverage() {
        return average;
    }

    public Student(String name, String family, double average) {
        this.name = name;
        this.family = family;
        this.average = average;
    }

    public int compareTo(Student student) {
        if (average == student.average) {
            return 0;
        } else if (average < student.average) {
            return 1;
        } else {
            return -1;
        }
    }
}


