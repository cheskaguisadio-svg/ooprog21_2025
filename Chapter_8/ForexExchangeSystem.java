import java.util.Scanner;

public class ForexExchangeSystem {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String[] currencies = {"USD", "EUR", "JPY", "GBP", "AUD"};
        double[][] rates = new double[5][5]; // 5 currencies × 5 days

        System.out.println();

        // INPUT SECTION WITH ARROWS (▶▶)
        for (int i = 0; i < currencies.length; i++) {

            System.out.println("Currency: " + currencies[i]);

            for (int d = 0; d < 5; d++) {
                System.out.print("▶▶ Rate on Nov " + (d + 1) + ": ");
                rates[i][d] = sc.nextDouble();
            }

            System.out.println();
        }

        // SUMMARY TABLE
        System.out.println("============== FOREX SUMMARY (Nov 1 - Nov 5) ==============");
        System.out.printf("%-10s | %-6s %-6s %-6s %-6s %-6s %-6s %-6s\n",
                "Currency", "Nov1", "Nov2", "Nov3", "Nov4", "Nov5", "Peak", "Lowest");
        System.out.println("------------------------------------------------------------");

        for (int i = 0; i < currencies.length; i++) {

            double peak = rates[i][0];
            double low = rates[i][0];

            // find peak and lowest
            for (int d = 1; d < 5; d++) {
                if (rates[i][d] > peak) peak = rates[i][d];
                if (rates[i][d] < low) low = rates[i][d];
            }

            System.out.printf("%-10s | ", currencies[i]);

            for (int d = 0; d < 5; d++) {
                System.out.printf("%-6.2f", rates[i][d]);
            }

            System.out.printf("%-6.2f %-6.2f\n", peak, low);
        }

        System.out.println("------------------------------------------------------------\n");

        // DAILY CHANGES SECTION
        System.out.println("=== DAILY CHANGES (Comparison From Previous Day) ===");
        System.out.println("(+ increase / - decrease / no change for same value)\n");

        for (int i = 0; i < currencies.length; i++) {

            System.out.println(currencies[i] + ":");

            for (int d = 1; d < 5; d++) {

                double prev = rates[i][d - 1];
                double curr = rates[i][d];

                if (curr > prev) {
                    System.out.printf("Nov %d to Nov %d: + (%.2f → %.2f)\n",
                            d, d + 1, prev, curr);
                } else if (curr < prev) {
                    System.out.printf("Nov %d to Nov %d: - (%.2f → %.2f)\n",
                            d, d + 1, prev, curr);
                } else {
                    System.out.printf("Nov %d to Nov %d: no change (%.2f)\n",
                            d, d + 1, curr);
                }
            }

            System.out.println();
        }

        sc.close();
    }
}
