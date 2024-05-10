import java.util.Arrays;

public class StudentHouse {
    String name;
    Student[] students = new Student[1000];
    int size = 0;

    public StudentHouse() {
    }

    public StudentHouse(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void printStudents() {
        for (int i = 0; i < size; i++) {
            if (students[i] != null) {
                System.out.println(students[i].toString());
            }
        }
    }

    public void addStudent(Student student) {
        if (size < students.length) {
            students[size] = student;
            size++;
        } else {
            System.out.println("Cannot add more students. The array is full.");
        }
    }

    public void deleteStudent(int id) {
        for (int i = 0; i < students.length; i++) {
            if (students[i] != null) {
                if (students[i].getId() == id) {
                    students[i] = null;
                }
            }
        }
    }

    @Override
    public String toString() {
        return "StudentHouse{" + "name='" + name + '\'' + ", students=" + Arrays.toString(students) + ", size=" + size + '}';

    }

    public String getStudentsInfo() {
        StringBuilder info = new StringBuilder();
        for (int i = 0; i < size; i++) {
            if (students[i] != null) {
                info.append(students[i].getStudentInfo()).append("\n");
            }
        }
        return info.toString();
    }
}