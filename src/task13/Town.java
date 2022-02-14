package task13;

public class Town {
    private String name;
    private int square;
    private boolean isCapital;
    private boolean isRegionTown;

    public Town(String name, int townSquare, boolean isCapital, boolean isRegionTown) {
        this.name = name;
        this.square = townSquare;
        this.isCapital = isCapital;
        this.isRegionTown = isRegionTown;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSquare() {
        return square;
    }

    public boolean isCapital() {
        return isCapital;
    }

    public boolean isRegionTown() {
        return isRegionTown;
    }

    @Override
    public String toString() {
        return "Town{" +
                "name='" + name + '\'' +
                ", square=" + square +
                ", isCapital=" + isCapital +
                ", isRegionTown=" + isRegionTown +
                '}';
    }
}
