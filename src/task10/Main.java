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
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Airline[] airlines = createAirlines();
        AirLineAggregator aggregator = new AirLineAggregator(airlines);

        Airline[] airlines2 = aggregator.getAirlinesByDestination("Moscow");
        System.out.println(Arrays.toString(airlines2));

        Airline[] airlines1 = aggregator.getAirlinesByWeekDays(WeekDays.FRIDAY);
        System.out.println(Arrays.toString(airlines1));

        Airline[] airlines3 = aggregator.getAirlinesByWeekDaysAndHours(WeekDays.FRIDAY, LocalTime.of(6, 45));
        System.out.println(Arrays.toString(airlines3));
    }

    private static Airline[] createAirlines() {
        Airline airline1 = new Airline("Moscow", 65676, "Boeing 737-500",
                LocalTime.of(23, 45), List.of(WeekDays.values()));
        Airline airline2 = new Airline("Minsk", 234, "Boeing 737-800",
                LocalTime.of(5, 34), List.of(WeekDays.SATURDAY, WeekDays.FRIDAY));
        Airline airline3 = new Airline("New York", 987, "Boeing 737-700",
                LocalTime.of(23, 45), List.of(WeekDays.SATURDAY, WeekDays.FRIDAY, WeekDays.THURSDAY));

        return new Airline[]{airline1, airline2, airline3};
    }
}
