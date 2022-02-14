package task5;
/*
5. Опишите класс, реализующий десятичный счетчик, который может увеличивать или уменьшать свое значение
на единицу в заданном диапазоне. Предусмотрите инициализацию счетчика значениями по умолчанию и
произвольными значениями. Счетчик имеет методы увеличения и уменьшения состояния, и метод
позволяющее получить его текущее состояние. Написать код, демонстрирующий все возможности класса.
 */

public class Counter {
    int current;

    public Counter(int current) {
        this.current = current;
    }

    public void increase() {
        current++;
    }

    public void decrease() {
        current--;
    }


    @Override
    public String toString() {
        return "Counter{" +
                "current=" + current +
                '}';
    }
}
