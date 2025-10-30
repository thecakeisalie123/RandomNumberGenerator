import java.util.Random;

public class RandomNumberGenerator {
    public static void main(String[] args) {
        // Create an instance of Random
        Random random = new Random();

        // Generate and print 100 random numbers
        System.out.println("Generating 100 random numbers:");
        for (int i = 1; i <= 100; i++) {
            // Generate a random number (can customize range if needed)
            int randomNumber = random.nextInt();
            System.out.println("Number " + i + ": " + randomNumber);
        }
    }
}