package task15;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Client {
    private int id;
    private String name;
    private Map<TourType, List<Tour>> tours = new HashMap<>();

    public Client(int id, String name, Map<TourType, List<Tour>> tours) {
        this.id = id;
        this.name = name;
        this.tours = tours;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Map<TourType, List<Tour>> getTours() {
        return tours;
    }

    @Override
    public String toString() {
        return "Client{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", tour=" + tours +
                '}';
    }
}
