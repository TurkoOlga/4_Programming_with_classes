package task15;

import java.time.LocalDate;
import java.util.List;

public class ShoppingTour extends Tour {
    private String town;
    private List<String> shops;

    public ShoppingTour(TourType tourType, String country, int daysNumber, LocalDate departureDate,
                        String transport, String feeding, double price, String town, List<String> shops) {
        super(tourType, country, daysNumber, departureDate, transport, feeding, price);
        this.town = town;
        this.shops = shops;
    }


    @Override
    public String toString() {
        return super.toString() + "ShoppingTour{" +
                "town='" + town + '\'' +
                ", shops=" + shops +
                '}';
    }
}
