package task4;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        TrainSearcher trainSearcher = new TrainSearcher();
        Train[] trains = createTrains();

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите номер поезда");
        int trainNumber = scanner.nextInt();
        Train trainByNumber = trainSearcher.searchTrainByNumber(trains, trainNumber);
        System.out.println(trainByNumber);

        Train[] sortByTrainNumbers = trainSearcher.sortByTrainNumbers(trains);
        System.out.println(Arrays.toString(sortByTrainNumbers));

        Train[] sortByDestination = trainSearcher.sortByDestination(trains);
        System.out.println(Arrays.toString(sortByDestination));
    }

    private static Train[] createTrains() {
        return new Train[]{
                new Train("Minsk", 56, 12.50),
                new Train("London", 456, 14.18),
                new Train("Moscow", 489, 4.09),
                new Train("Paris", 3098, 23.56),
                new Train("Rogachev", 23, 09.09)
        };
    }

}