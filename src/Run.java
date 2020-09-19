public class Run {

    public static void main(String[] args) {
        System.out.println("Percentage of matching birthdays:");
        System.out.println(calculatePercentage() + "%");
    }

    private static int calculatePercentage() {
        int count = 0;
        int increment = 0;
        while (increment < 100) {
            Birthday birthday = new Birthday();
            boolean match = birthday.checkForMatch();
            if(match == true) {
                count++;
            }
            increment++;
        }
        return count;
    }
}
