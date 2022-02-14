package task15;

import java.time.LocalDate;
import java.util.List;

public class ExcursionTour extends Tour {
    private List<String> countryAttractions;

    public ExcursionTour(TourType tourType, String country, int daysNumber, LocalDate departureDate,
                         String transport, String feeding, double price, List<String> countryAttractions) {
        super(tourType, country, daysNumber, departureDate, transport, feeding, price);
        this.countryAttractions = countryAttractions;
    }


    @Override
    public String toString() {
        return super.toString() + "ExcursionTour{" +
                "countryAttractions=" + countryAttractions +
                '}';
    }
}
