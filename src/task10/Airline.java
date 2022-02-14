package task10;
/*
Создать класс Airline, спецификация которого приведена ниже. Определить конструкторы, set- и get- методы
и метод toString(). Создать второй класс, агрегирующий массив типа Airline, с подходящими конструкторами и
методами. Задать критерии выбора данных и вывести эти данные на консоль.
Airline: пункт назначения, номер рейса, тип самолета, время вылета, дни недели.
Найти и вывести:
a) список рейсов для заданного пункта назначения;
b) список рейсов для заданного дня недели;
c) список рейсов для заданного дня недели, время вылета для которых больше заданного.
 */

import java.time.LocalTime;
import java.util.List;

public class Airline {
    private String destination;
    private int flightNumber;
    private String aircraftType;
    private LocalTime departureTime;
    private List<WeekDays> weekDays;

    public Airline(String destination, int flightNumber, String aircraftType,
                   LocalTime departureTime, List<WeekDays> weekDays) {
        this.destination = destination;
        this.flightNumber = flightNumber;
        this.aircraftType = aircraftType;
        this.departureTime = departureTime;
        this.weekDays = weekDays;
    }

    public String getDestination() {
        return destination;
    }

    public LocalTime getDepartureTime() {
        return departureTime;
    }

    public List<WeekDays> getWeekDays() {
        return weekDays;
    }


    @Override
    public String toString() {
        return "Airline{" +
                "destination='" + destination + '\'' +
                ", flightNumber=" + flightNumber +
                ", aircraftType='" + aircraftType + '\'' +
                ", departureTime=" + departureTime +
                ", weekDays=" + weekDays +
                '}';
    }
}
