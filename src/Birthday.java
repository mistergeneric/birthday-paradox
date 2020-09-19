import java.util.ArrayList;
import java.util.Random;

public class Birthday {
    private ArrayList<Integer> birthdays;
    Random random;

    public Birthday() {
        this.random = new Random();
        this.birthdays = buildBirthdays();

    }

    public ArrayList<Integer> buildBirthdays() {
        ArrayList<Integer> birthdays = new ArrayList<>();
        for (int i = 0; i < 26; i++) {
            int randomBirthday = random.nextInt(364) + 1;
            birthdays.add(randomBirthday);
        }
        return birthdays;
    }

    public boolean checkForMatch() {
        for (int i = 0; i < birthdays.size(); i++) {
            for (int j = i + 1; j < birthdays.size(); j++) {
                if (birthdays.get(i) == birthdays.get(j)) {
                    return true;
                }
            }
        }
        return false;

    }
}
