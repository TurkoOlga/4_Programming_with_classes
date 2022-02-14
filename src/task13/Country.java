package task13;

import java.util.List;

public class Country {
    private String name;
    private List<Region> regions;

    public Country(String name, List<Region> regions) {
        this.name = name;
        this.regions = regions;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Country{" +
                "name='" + name + '\'' +
                ", regions=" + regions +
                '}';
    }

    public void getSquare() {
        int square = 0;
        for (Region region : regions) {
            square += region.getSquare();
        }
        System.out.println(square);
    }

    public void getNumberOfRegions() {
        int result = regions.size();
        System.out.println(result);
    }

    public void getCapital() {
        for (Region region : regions) {
            region.getCapital();
        }
    }

    public void getRegionTowns() {
        for (Region region : regions) {
            region.getRegionsTown();
        }
    }
}