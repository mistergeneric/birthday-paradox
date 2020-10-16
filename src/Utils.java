import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class Utils {

    public static List<Integer> createBirthdays(int size) {
        List<Integer> birthdays = new ArrayList<>();
        for (int i = 0; i < size; i++) {
            birthdays.add((int) (Math.random() * 364));
        }
        return birthdays;
    }

    public static int getNumberOfPeople() {
        System.out.println("How many people are in the list of birthdays?");
        return getNumber();
    }

    private static int getNumber() {
        Scanner scanner = new Scanner(System.in);
        int number = 0;
        try {
            number = scanner.nextInt();
        } catch (InputMismatchException e) {
            System.out.println("Incorrect input type");
        }
        return number;
    }

    public static int getTimesToRunExperiment() {
        System.out.println("How many times to run experiment?");
        return getNumber();
    }

    public static int findMatches(List<Integer> birthdays) {
        for (int i : birthdays) {
            for (int j = i + 1; j < birthdays.size(); j++) {
                if (i == birthdays.get(j)) {
                    return 1;
                }
            }
        }
        return 0;
    }

    public static double runExperiment(double numberOfTimesToRunExperiment, int numberOfPeople) {
        double matches = 0;
        double count = 0;
        while (count < numberOfTimesToRunExperiment) { List<Integer> birthdays = createBirthdays(numberOfPeople);
            matches += findMatches(birthdays);
            count++;
        }
        return (matches * 100)/ numberOfTimesToRunExperiment;

    }
}
