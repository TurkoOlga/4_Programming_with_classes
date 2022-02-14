package task7;
/*
 Описать класс, представляющий треугольник. Предусмотреть методы для создания объектов, вычисления
площади, периметра и точки пересечения медиан.
 */

public class Triangle {
    private double sideA;
    private double sideB;
    private double sideC;

    public Triangle(Point a, Point b, Point c) {
        sideA = calculateSide(a, b);
        sideB = calculateSide(b, c);
        sideC = calculateSide(a, c);
    }

    public double calculatePerimeter() {
        return sideA + sideB + sideC;
    }

    public double calculateSquare() {
        double halfPerimeter = (sideA + sideB + sideC) / 2;

        double triangleSqr = Math.sqrt(
                halfPerimeter * (halfPerimeter - sideA) * (halfPerimeter - sideB) * (halfPerimeter - sideC));
        return triangleSqr;
    }

    public double calculateSide(Point one, Point two) {
        double side = Math.sqrt(Math.pow((two.getX() - one.getX()), 2) + Math.pow((two.getY() - one.getY()), 2));
        return side;
    }

    public Point calculateMedianPoint(Point a, Point b, Point c) {
        double xMedian = (a.getX() + b.getX() + c.getX()) / 3;
        double yMedian = (a.getY() + b.getY() + c.getY()) / 3;

        return new Point(xMedian, yMedian);
    }

    @Override
    public String toString() {
        return "Triangle{" +
                "sideA=" + sideA +
                ", sideB=" + sideB +
                ", sideC=" + sideC +
                '}';
    }
}

