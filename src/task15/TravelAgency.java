package task15;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TravelAgency {
    private Map<TourType, List<Tour>> tours;

    public TravelAgency(Map<TourType, List<Tour>> tours) {
        this.tours = tours;
    }

    public Map<TourType, List<Tour>> getToursBy(TourSearchCriteria searchCriteria, String searchParameter) {
        Map<TourType, List<Tour>> result = new HashMap<>();

        for (TourType tourType : TourType.values()) {
            List<Tour> toursByType = tours.get(tourType);

            List<Tour> tours = new ArrayList<>();
            for (Tour tour : toursByType) {
                getToursByCriteria(searchCriteria, searchParameter, tours, tour);
            }

            result.put(tourType, tours);
        }

        return result;
    }

    private void getToursByCriteria(TourSearchCriteria searchCriteria, String searchParameter, List<Tour> tours, Tour tour) {
        switch (searchCriteria) {
            case DATE:
                if (tour.getDepartureDate().equals(LocalDate.parse(searchParameter))) {
                    tours.add(tour);
                }
                break;
            case COUNTRY: {
                if (tour.getCountry().equalsIgnoreCase(searchParameter)) {
                    tours.add(tour);
                }
                break;
            }
            case DAYS_NUMBER: {
                if (tour.getDaysNumber() == Integer.parseInt(searchParameter)) {
                    tours.add(tour);
                }
                break;
            }
            case FEEDING: {
                if (tour.getFeeding().equalsIgnoreCase(searchParameter)) {
                    tours.add(tour);
                }
                break;
            }
            case TRANSPORT: {
                if (tour.getTransport().equalsIgnoreCase(searchParameter)) {
                    tours.add(tour);
                }
                break;
            }
        }
    }

    public Map<TourType, List<Tour>> getByTourType(TourType tourName) {
        Map<TourType, List<Tour>> result = new HashMap<>();
        List<Tour> tourNameList = tours.get(tourName);
        result.put(tourName, tourNameList);
        return result;
    }


    @Override
    public String toString() {
        return "TourAggregator{" +
                "tours=" + tours +
                '}';
    }
}
