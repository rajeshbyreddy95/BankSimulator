import java.util.Random;

public class AccountNumberGenerator {
    private static final Random rand = new Random();

    public static String generate() {
        int number = 10000000 + rand.nextInt(90000000); // ensures 8 digits
        return String.valueOf(number);
    }
}