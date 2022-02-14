package task12;
/*
2. Создать объект класса Автомобиль, используя классы Колесо, Двигатель. Методы: ехать, заправляться,
менять колесо, вывести на консоль марку автомобиля.
 */

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Car car = buildCar();
        car.move();
        car.printCarModel();
        car.refuel(23);

        Wheel replacement = new Wheel("Toiu", 17.0);
        car.replaceWheel(replacement, 2);
    }

    public static Car buildCar() {
        List<Wheel> wheels = new ArrayList<>();
        wheels.add(new Wheel("Fgol", 17.0));
        wheels.add(new Wheel("Fgol", 17.0));
        wheels.add(new Wheel("Fgol", 17.0));
        wheels.add(new Wheel("Fgol", 17.0));

        Engine engine = new Engine(350);

        return new Car("White", "Opel", wheels, engine, 23);
    }
}