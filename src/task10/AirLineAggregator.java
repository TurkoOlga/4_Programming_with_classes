package task10;

import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AirLineAggregator {
    private Airline[] airlines;

    public AirLineAggregator(Airline[] airlines) {
        this.airlines = airlines;
    }

    public Airline[] getAirlinesByDestination(String destination) {
        List<Airline> result = new ArrayList<>();
        for (Airline airline : airlines) {
            if (airline.getDestination().equalsIgnoreCase(destination)) {
                result.add(airline);
            }
        }
        return result.toArray(new Airline[0]);
    }

    public Airline[] getAirlinesByWeekDays(WeekDays day) {
        List<Airline> result = new ArrayList<>();
        for (Airline airline : airlines) {
            List<WeekDays> weekDaysFlights = airline.getWeekDays();

            for (WeekDays weekDaysFlight : weekDaysFlights) {
                if (weekDaysFlight == day) {
                    result.add(airline);
                }
            }
        }
        return result.toArray(new Airline[0]);
    }

    public Airline[] getAirlinesByWeekDaysAndHours(WeekDays day, LocalTime time) {
        List<Airline> result = new ArrayList<>();
        for (Airline airline : airlines) {
            List<WeekDays> weekDaysFlights = airline.getWeekDays();

            for (WeekDays weekDaysFlight : weekDaysFlights) {
                if (weekDaysFlight == day) {
                    LocalTime departure = airline.getDepartureTime();
                    int isDepartureGreaterTime = departure.compareTo(time);
                    if (isDepartureGreaterTime > 0) {
                        result.add(airline);
                    }
                }
            }
        }
        return result.toArray(new Airline[0]);
    }

    @Override
    public String toString() {
        return "AirLineAggregator{" +
                "airlines=" + Arrays.toString(airlines) +
                '}';
    }
}
