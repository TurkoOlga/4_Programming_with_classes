package task12;

public class Wheel {
    private String wheelManufacture;
    private double diameter;

    public Wheel(String wheelManufacture, double diameter) {
        this.wheelManufacture = wheelManufacture;
        this.diameter = diameter;
    }

    @Override
    public String toString() {
        return "Wheel" +
                "wheelManufacture '" + wheelManufacture + '\'' +
                ", diameter " + diameter;
    }
}
