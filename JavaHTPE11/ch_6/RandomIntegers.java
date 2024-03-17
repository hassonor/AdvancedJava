package JavaHTPE11.ch_6;

import java.security.SecureRandom;

// int number = shiftingValue + differenceBetweenValues*randomNumbers.nextInt(scalingFactor);

public class RandomIntegers {
    public static void main(String[] args) {
        SecureRandom randomNumbers = new SecureRandom();

        for (int counter = 1; counter <= 20; counter++) {
            int face = 1 + randomNumbers.nextInt(6);

            System.out.printf("%d ", face);

            if (counter % 5 == 0) {
                System.out.println();
            }
        }
    }
}
