package task15;

import java.time.LocalDate;

public class CruiseTour extends Tour {
    private String cruiseLiner;

    public CruiseTour(TourType tourType, String country, int daysNumber, LocalDate departureDate,
                      String transport, String feeding, double price, String cruiseLiner) {
        super(tourType, country, daysNumber, departureDate, transport, feeding, price);
        this.cruiseLiner = cruiseLiner;
    }

    @Override
    public String toString() {
        return super.toString() + "CruiseTour{" +
                "cruiseLiner='" + cruiseLiner + '\'' +
                '}';
    }
}
