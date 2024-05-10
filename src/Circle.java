// Класс Круг, наследующийся от Фигуры
class Circle extends Figure {
    private double radius;

    // Конструктор
    public Circle(double radius) {
        this.radius = radius;
    }

    // Перегрузка метода calculateArea для круга
    @Override
    double calculateArea() {
        return Math.PI * radius * radius;
    }

}
