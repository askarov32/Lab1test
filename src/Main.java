import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

// Основной класс
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int radius = 0;
        double length = 0, width = 0;

        // Создание переменных радиуса
        try {
            System.out.println("Введите радиус");
            radius = in.nextInt();
        } catch (Exception e) {
            System.out.println("Введено неправильное значение радиуса");
            return;
        }

        // Создание переменных длины и ширины прямоугольника
        try {
            System.out.println("Введите длину, а затем ширину прямоугольника");
            length = in.nextDouble();
            width = in.nextDouble();
        } catch (Exception e) {
            System.out.println("Введено неправильное значение ширины и длины прямоугольника");
            return;
        }

        // Создание объекта Круга
        Circle circle = new Circle(radius);
        String circleArea = "Площадь круга: " + circle.calculateArea();

        // Создание объекта Прямоугольника
        Rectangle rectangle = new Rectangle(length, width);
        String rectangleArea = "Площадь прямоугольника: " + rectangle.calculateArea();

        // Создание объекта Автомобиля и вызов метода move()
        Automobile car = new Automobile();
        car.move();
        String carMove = "Машина двигается.";

        // Создание объекта Самолета и вызов метода move()
        Aeroplane airplane = new Aeroplane();
        airplane.move();
        String airplaneMove = "Самолет летит.";


        // Создание объекта Студента и StudentHouse и добавление сдудентов
        StudentHouse studentHouse = new StudentHouse("HSE");
        studentHouse.addStudent(new Student(1, "Ruslan", "Kasenov", 12));
        studentHouse.addStudent(new Student(2, "Kulash", "Kulashova", 3.8));
        studentHouse.addStudent(new Student(3, "Imanbek", "Imanbekov", 3.95));

        StudentHouse studentHouse1 = new StudentHouse("MTUCI");
        studentHouse1.addStudent(new Student(0, "Alex", "Alphonso", 3.96));
        studentHouse1.addStudent(new Student(1, "Dmitriy", "Kim", 3.97));
        studentHouse1.addStudent(new Student(2, "Vladislav", "Ivanov", 3.97));
        studentHouse1.addStudent(new Student(3, "Ivan", "Ivanov", 3.97));

        StringBuilder output = new StringBuilder();
        output.append(circleArea).append("\n");
        output.append(rectangleArea).append("\n");
        output.append(carMove).append("\n");
        output.append(airplaneMove).append("\n");

        output.append("University -> ").append(studentHouse.getName()).append("\n");
        studentHouse.deleteStudent(1);
        output.append(studentHouse.getStudentsInfo()).append("\n");

        output.append("University -> ").append(studentHouse1.getName()).append("\n");
        studentHouse1.deleteStudent(0);
        studentHouse1.deleteStudent(1);
        output.append(studentHouse1.getStudentsInfo()).append("\n");

        // Работа с интерфейсом Animal
        Cat cat = new Cat("Maria", 0);
        output.append(cat.getInfo()).append("\n");
        System.out.println("");

        Dog dog = new Dog("Alpha", "Border Collie");
        output.append(dog.getInfo()).append("\n");
        System.out.println("");

        // Запись в файл
        try {
            FileWriter writer = new FileWriter("output.txt");
            writer.write(output.toString());
            writer.close();
            System.out.println("Все успешно записано в файл output.txt");
        } catch (IOException e) {
            System.out.println("Ошибка при записи в файл: " + e.getMessage());
        }
    }
}
