package task15;

import java.time.LocalDate;

public class VacationTour extends Tour {
    private String resort;

    public VacationTour(TourType tourType, String country, int daysNumber, LocalDate departureDate, String transport,
                        String feeding, double price, String resort) {
        super(tourType, country, daysNumber, departureDate, transport, feeding, price);
        this.resort = resort;
    }

    @Override
    public String toString() {
        return super.toString() + "VacationTour{" +
                "resort='" + resort + '\'' +
                '}';
    }
}
