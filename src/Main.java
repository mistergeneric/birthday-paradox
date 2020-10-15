import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        double numberOfTimesToRunExperiment = Utils.getTimesToRunExperiment();

        double probibility = Utils.runExperiment(numberOfTimesToRunExperiment);

        System.out.println("Chance of matching birthdays " + probibility + "%");
    }
}
