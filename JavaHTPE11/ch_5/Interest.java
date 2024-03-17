package JavaHTPE11.ch_5;

public class Interest {
    public static void main(String[] args) {
        double principal = 1000000.0;
        double rate = 0.05;

        System.out.printf("%s%20s%n", "Year", "Amount of deposit");

        for (int year = 0; year < 11; year++) {
            double amount = principal * Math.pow(1.0 + rate, year);
            System.out.printf("%4d%, 20.2f%n", year, amount);
        }
    }
}
