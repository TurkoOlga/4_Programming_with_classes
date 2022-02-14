package task15;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class OrderStorage {
    Map<Integer, Map<TourType, List<Tour>>> allClients = new HashMap<>();

    public void addClient(Client client) {
        allClients.put(client.getId(), client.getTours());
    }

    @Override
    public String toString() {
        return "TourAgency{" +
                "allClients=" + allClients +
                '}';
    }
}
