package task13;

import java.util.List;

public class District {
    private String name;
    private List<Town> towns;

    public District(String name, List<Town> regions) {
        this.name = name;
        this.towns = regions;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "District{" +
                "name='" + name + '\'' +
                ", towns=" + towns +
                '}';
    }

    public int getSquare() {
        int square = 0;
        for (Town town : towns) {
            square += town.getSquare();
        }
        return square;
    }

    public void getRegionsTown() {
        for (Town town : towns) {
            boolean result = town.isRegionTown();
            if (result) {
                System.out.println(town.getName());
            }
        }
    }

    public void getCapital() {
        for (Town town : towns) {
            boolean result = town.isCapital();
            if (result) {
                System.out.println(town.getName());
                break;
            }
        }
    }
}