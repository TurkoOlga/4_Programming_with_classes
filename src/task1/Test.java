package task1;
/*
1. Создайте класс Test1 двумя переменными. Добавьте метод вывода на экран и методы изменения этих
переменных. Добавьте метод, который находит сумму значений этих переменных, и метод, который находит
наибольшее значение из этих двух переменных.

 */

public class Test {
    private int numberOne;
    private int numberTwo;

    public void printNumbers() {
        System.out.println(numberOne);
        System.out.println(numberTwo);
    }

    public int changeNumbers(int number) {
        number = numberOne * 10;
        return number;
    }

    public int changeNumberTwo(int number) {
        number = numberTwo + 3;
        return number;
    }

    public int sumNumbers(int one, int two) {
        return one + two;
    }

    public int greatestValue(int one, int two) {
        return Math.max(one, two);
    }
}
