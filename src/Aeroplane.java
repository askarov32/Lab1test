// Класс Самолет, реализующий интерфейс Движение
class Aeroplane implements Moveable {
    @Override
    public void move() {
        System.out.println("Самолет летит");
    }
}