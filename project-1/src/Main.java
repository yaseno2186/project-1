import java.util.Random;

public class Main {
    public static void main(String[] args) {
        // Random method
        Random random = new Random();
        // Random number between 0 - 10
        int number = random.nextInt(11);
        double doubleNum = random.nextDouble();
        System.out.println(number);
        System.out.println(doubleNum);
    }
}