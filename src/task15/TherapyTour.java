package task15;

import java.time.LocalDate;
import java.util.List;

public class TherapyTour extends Tour {
    private String town;
    private List<String> healthTreatments;

    public TherapyTour(TourType tourType, String country, int daysNumber, LocalDate departureDate,
                       String transport, String feeding, double price, String town, List<String> healthTreatments) {
        super(tourType, country, daysNumber, departureDate, transport, feeding, price);
        this.town = town;
        this.healthTreatments = healthTreatments;
    }

    @Override
    public String toString() {
        return "TherapyTour{" +
                "town='" + town + '\'' +
                ", healthTreatments=" + healthTreatments +
                '}';
    }
}
