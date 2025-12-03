import java.util.Scanner;

public class ForexExchangeSystem {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        String[] currencies = {"USD", "EUR", "JPY", "GBP", "AUD"};
        double[][] rates = new double[5][5];  // 5 currencies × 5 days

        System.out.println("=== FOREX EXCHANGE SYSTEM ===");

        // INPUT SECTION
        for (int i = 0; i < currencies.length; i++) {
            System.out.println("\nEnter exchange rates for " + currencies[i] + ":");
            for (int day = 0; day < 5; day++) {
                System.out.print("Day " + (day + 1) + ": ");
                rates[i][day] = sc.nextDouble();
            }
        }

        // DISPLAY TABLE
        System.out.println("\n\n================= CURRENCY EXCHANGE RATE =================");
        System.out.printf("%-10s | %-8s %-8s %-8s %-8s %-8s | %-8s %-8s\n",
                "Currency", "Day1", "Day2", "Day3", "Day4", "Day5", "Peak", "Lowest");
        System.out.println("-----------------------------------------------------------------------");

        for (int i = 0; i < currencies.length; i++) {
            double peak = rates[i][0];
            double low = rates[i][0];

            // compute peak and lowest
            for (int d = 1; d < 5; d++) {
                if (rates[i][d] > peak) peak = rates[i][d];
                if (rates[i][d] < low) low = rates[i][d];
            }

            System.out.printf("%-10s | ", currencies[i]);
            for (int d = 0; d < 5; d++) {
                System.out.printf("%-8.2f", rates[i][d]);
            }
            System.out.printf("| %-8.2f %-8.2f\n", peak, low);
        }

        // DISPLAY DAILY CHANGES
        System.out.println("\n================= DAILY CHANGES =================");
        for (int i = 0; i < currencies.length; i++) {
            System.out.println("\n" + currencies[i] + " Changes:");

            for (int d = 1; d < 5; d++) {
                double prev = rates[i][d - 1];
                double curr = rates[i][d];

                if (curr > prev) {
                    System.out.printf("Day %d to Day %d: Increase (%.2f → %.2f)\n",
                            d, d + 1, prev, curr);
                } else if (curr < prev) {
                    System.out.printf("Day %d to Day %d: Decrease (%.2f → %.2f)\n",
                            d, d + 1, prev, curr);
                } else {
                    System.out.printf("Day %d to Day %d: No Change (%.2f)\n",
                            d, d + 1, curr);
                }
            }
        }

        sc.close();
    }
}
