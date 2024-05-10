// Класс Прямоугольник, наследующийся от Фигуры
class Rectangle extends Figure {
    private double length;
    private double width;

    // Конструктор
    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    // Перегрузка метода calculateArea для прямоугольника
    @Override
    double calculateArea() {
        return length * width;
    }
}
