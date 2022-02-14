package task15;

import java.time.LocalDate;

public class Tour {
    private TourType tourType;
    private String country;
    private int daysNumber;
    private LocalDate departureDate;
    private String transport;
    private String feeding;
    private double price;

    public Tour(TourType tourType, String country, int daysNumber, LocalDate departureDate,
                String transport, String feeding, double price) {
        this.tourType = tourType;
        this.country = country;
        this.daysNumber = daysNumber;
        this.departureDate = departureDate;
        this.transport = transport;
        this.feeding = feeding;
        this.price = price;
    }

    public TourType getTourType() {
        return tourType;
    }

    public void setTourType(TourType tourType) {
        this.tourType = tourType;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public int getDaysNumber() {
        return daysNumber;
    }

    public LocalDate getDepartureDate() {
        return departureDate;
    }

    public String getTransport() {
        return transport;
    }

    public String getFeeding() {
        return feeding;
    }


    @Override
    public String toString() {
        return "Tour{" +
                "tourType=" + tourType +
                ", country='" + country + '\'' +
                ", daysNumber=" + daysNumber +
                ", departureDate=" + departureDate +
                ", transport='" + transport + '\'' +
                ", feeding='" + feeding + '\'' +
                ", price=" + price +
                '}';
    }
}
