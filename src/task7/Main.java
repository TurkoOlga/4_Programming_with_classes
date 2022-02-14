package task7;
/*
7. Описать класс, представляющий треугольник. Предусмотреть методы для создания объектов, вычисления
площади, периметра и точки пересечения медиан.

 */

public class Main {

    public static void main(String[] args) {
        Point a = new Point(1, 2);
        Point b = new Point(4, 8);
        Point c = new Point(5, 2);

        Triangle triangle = new Triangle(a, b, c);
        double perimeter = triangle.calculatePerimeter();
        System.out.println("Triangle perimeter " + perimeter);

        double square = triangle.calculateSquare();
        System.out.println("Triangle square " + square);

        Point median = triangle.calculateMedianPoint(a, b, c);
        System.out.println(median);
    }
}
