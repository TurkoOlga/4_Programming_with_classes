package task5;
/*
5. Опишите класс, реализующий десятичный счетчик, который может увеличивать или уменьшать свое значение
на единицу в заданном диапазоне. Предусмотрите инициализацию счетчика значениями по умолчанию и
произвольными значениями. Счетчик имеет методы увеличения и уменьшения состояния, и метод
позволяющее получить его текущее состояние. Написать код, демонстрирующий все возможности класса.

 */

public class Main {
    public static void main(String[] args) {
        Counter decreaseCounter = new Counter(56);
        decreaseCounter.decrease();

        Counter increaseCounter = new Counter(-4567);
        increaseCounter.increase();

        System.out.println(decreaseCounter);
        System.out.println(increaseCounter);
    }
}
