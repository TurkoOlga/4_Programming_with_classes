package task13;

import java.util.List;

public class Region {
    private String name;
    private List<District> districts;

    public Region(String name, List<District> towns) {
        this.name = name;
        this.districts = towns;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    @Override
    public String toString() {
        return "Region{" +
                "name='" + name + '\'' +
                ", districts=" + districts +
                '}';
    }

    public int getSquare() {
        int square = 0;
        for (District district : districts) {
            square += district.getSquare();
        }
        return square;
    }

    public void getRegionsTown() {
        for (District district : districts) {
            district.getRegionsTown();
        }
    }

    public void getCapital() {
        for (District district : districts) {
            district.getCapital();
        }
    }
}
