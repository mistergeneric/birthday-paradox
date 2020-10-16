import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        double numberOfTimesToRunExperiment = Utils.getTimesToRunExperiment();

        for(int numberOfPeople = 5; numberOfPeople <= 100; numberOfPeople += 5) {
            double probability = Utils.runExperiment(numberOfTimesToRunExperiment, numberOfPeople);
            System.out.println("Chance of matching birthdays with " + numberOfPeople + " people :" + probability + "%");

        }
    }
}
