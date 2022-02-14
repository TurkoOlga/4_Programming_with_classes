package task15;
/*
5. Туристические путевки. Сформировать набор предложений клиенту по выбору туристической путевки
различного типа (отдых, экскурсии, лечение, шопинг, круиз и т. д.) для оптимального выбора. Учитывать
возможность выбора транспорта, питания и числа дней. Реализовать выбор и сортировку путевок.
 */

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Map<TourType, List<Tour>> tours = generateTours();
        TravelAgency travelAgency = new TravelAgency(tours);

        Map<TourType, List<Tour>> toursByDate = travelAgency.getToursBy(TourSearchCriteria.DATE, "2022-02-13");
        Client turko = new Client(1, "Turko Olga", toursByDate);

        Map<TourType, List<Tour>> tourByCountry = travelAgency.getToursBy(TourSearchCriteria.COUNTRY, "Germany");
        Client dorohova = new Client(6, "Dorohova Maria", tourByCountry);

        Map<TourType, List<Tour>> tourByDaysNumber = travelAgency.getToursBy(TourSearchCriteria.DAYS_NUMBER, "12");
        Client shibkov = new Client(23, "Shibkov Sergei", tourByDaysNumber);

        Map<TourType, List<Tour>> toursByFeeding = travelAgency.getToursBy(TourSearchCriteria.FEEDING, "all inclusive");
        Client ivanov = new Client(2, "Ivanov Evgeni", toursByFeeding);

        Map<TourType, List<Tour>> tourByName = travelAgency.getByTourType(TourType.VACATION);
        System.out.println(tourByName);

        OrderStorage orderStorage = new OrderStorage();
        orderStorage.addClient(turko);
        orderStorage.addClient(dorohova);
        orderStorage.addClient(shibkov);
        orderStorage.addClient(ivanov);
    }

    public static Map<TourType, List<Tour>> generateTours() {
        Map<TourType, List<Tour>> tours = new HashMap<>();

        List<Tour> therapyTours = new ArrayList<>();
        TherapyTour therapyTour = new TherapyTour(TourType.THERAPY, "Belarus", 10,
                LocalDate.of(2022, 2, 13), "bus", "breakfast", 800.56,
                "Minsk", List.of("massage", "sauna"));
        therapyTours.add(therapyTour);

        List<Tour> cruiseTours = new ArrayList<>();
        CruiseTour cruiseTour = new CruiseTour(TourType.CRUISE, "Italy", 21, LocalDate.of(2022, 6, 23),
                "liner", "all inclusive", 5678.09, "Oasis Liner");
        cruiseTours.add(cruiseTour);

        List<Tour> excursionTours = new ArrayList<>();
        ExcursionTour excursionTour = new ExcursionTour(TourType.EXCURSION, "Germany", 7, LocalDate.of(2022, 3, 30),
                "plane", "breakfast and diner", 245.56, List.of("Berlin's Brandenburg Gate", "The Black Forest", "Miniatur Wunderland"));
        excursionTours.add(excursionTour);

        List<Tour> shoppingTours = new ArrayList<>();
        ShoppingTour shoppingTour = new ShoppingTour(TourType.SHOPPING, "Poland", 4, LocalDate.of(2022, 7, 9),
                "car", "not included", 34.09, "Belostok", List.of("Next", "Apple Store", "H&M"));
        shoppingTours.add(shoppingTour);

        List<Tour> vacationTours = new ArrayList<>();
        VacationTour vacationTourOne = new VacationTour(TourType.VACATION, "Turkey", 12, LocalDate.of(2022, 5, 8),
                "plane", "all inclusive", 2343.09, "Kemer");
        VacationTour vacationTourTwo = new VacationTour(TourType.VACATION, "Maldive", 10, LocalDate.of(2022, 7, 14),
                "plane", "all inclusive", 2509.55, "Paradise");
        vacationTours.add(vacationTourOne);
        vacationTours.add(vacationTourTwo);

        tours.put(TourType.THERAPY, therapyTours);
        tours.put(TourType.EXCURSION, excursionTours);
        tours.put(TourType.CRUISE, cruiseTours);
        tours.put(TourType.SHOPPING, shoppingTours);
        tours.put(TourType.VACATION, vacationTours);
        return tours;
    }
}
