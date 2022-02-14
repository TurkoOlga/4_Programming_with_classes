package task12;
/*
2. Создать объект класса Автомобиль, используя классы Колесо, Двигатель. Методы: ехать, заправляться,
менять колесо, вывести на консоль марку автомобиля.
 */

import java.util.List;

public class Car {
    private String color;
    private String carModel;
    private List<Wheel> wheels;
    private Engine engine;
    private int fuelLevel;

    public Car(String color, String carModel, List<Wheel> wheels, Engine engine, int fuelLevel) {
        this.color = color;
        this.carModel = carModel;
        this.wheels = wheels;
        this.engine = engine;
        this.fuelLevel = fuelLevel;
    }

    public String getCarModel() {
        return carModel;
    }

    @Override
    public String toString() {
        return "Car{" +
                "color='" + color + '\'' +
                ", carModel='" + carModel + '\'' +
                ", wheels=" + wheels +
                ", engine=" + engine +
                '}';
    }

    public void printCarModel() {
        System.out.println(getCarModel());
    }

    public void move() {
        if (fuelLevel > 0) {
            System.out.println("The car is moving");
        } else {
            System.out.println("The car is not driving, check the fuel level");
        }
    }

    public void refuel(int fuelToAdd) {
        fuelLevel += fuelToAdd;
    }

    public void replaceWheel(Wheel wheelToReplace, int wheelIndex) {
        wheels.remove(wheelIndex);
        wheels.add(wheelIndex, wheelToReplace);
    }
}

