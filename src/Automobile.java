// Класс Автомобиль, реализующий интерфейс Движение
class Automobile implements Moveable {
    @Override
    public void move() {
        System.out.println("Автомобиль двигается");
    }
}
