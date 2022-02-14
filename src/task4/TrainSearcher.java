package task4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class TrainSearcher {
    public Train[] sortByTrainNumbers(Train[] trains) {
        Train[] trainsCopy = Arrays.copyOf(trains, trains.length);
        for (int i = trainsCopy.length - 1; i > 0; i--) {
            for (int j = 0; j < trainsCopy.length - 1; j++) {
                if (trainsCopy[j].getTrainNumber() > trainsCopy[j + 1].getTrainNumber()) {
                    Train tmp = trainsCopy[j];
                    trainsCopy[j] = trainsCopy[j + 1];
                    trainsCopy[j + 1] = tmp;
                }
            }
        }
        return trainsCopy;
    }

    public Train[] sortByDestination(Train[] trains) {
        ArrayList<String> sortedDestinations = getSortedCopy(trains);

        Train[] trainsCopy = new Train[trains.length];
        for (int i = 0; i < trainsCopy.length; i++) {
            String sortedDest = sortedDestinations.get(i);
            for (Train train : trains) {
                if (train.getDestination().equals(sortedDest)) {
                    trainsCopy[i] = train;
                }
            }
        }
        return trainsCopy;
    }

    public Train searchTrainByNumber(Train[] trains, int trainNumber) {
        Train trainFound = new Train();
        for (Train train : trains) {
            if (train.getTrainNumber() == trainNumber) {
                trainFound = train;
            }
        }
        return trainFound;
    }

    private ArrayList<String> getSortedCopy(Train[] trains) {
        ArrayList<String> destinations = new ArrayList<>();

        for (Train train : trains) {
            String destination = train.getDestination();
            destinations.add(destination);
        }
        Collections.sort(destinations);
        return destinations;
    }
}
