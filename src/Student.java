public class Student {
    int id;
    String name;
    String surname;
    double gpa;

    public Student(){

    }
    public Student(int id, String name, String surname, double gpa) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.gpa = gpa;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public double getGpa() {
        return gpa;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    @Override
    public String toString() {
        return "Student{" + "id=" + id + ", name='" + name + '\'' + ", surname='" + surname + '\'' + ", gpa=" + gpa + '}';
    }

    public String getStudentInfo() {
        return "ID: " + id + ", Имя: " + name + ", Фамилия: " + surname + ", Средний балл: " + gpa;
    }
}
