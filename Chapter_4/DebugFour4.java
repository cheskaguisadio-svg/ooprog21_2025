
import java.util.Scanner;

public class DebugFour4
{
    public static void main(String args[])
    {
        Scanner input = new Scanner(System.in);
        String destinationCity;
        String departureCity;
        String mode;

        System.out.print("Enter destination city >> ");
        destinationCity = input.nextLine();

        System.out.print("Enter departure city >> ");
        departureCity = input.nextLine();

        System.out.print("Enter mode of transportation >> ");
        mode = input.nextLine();

        DebugTrip trip1 = new DebugTrip(destinationCity);
        DebugTrip trip2 = new DebugTrip(destinationCity, departureCity);
        DebugTrip trip3 = new DebugTrip(destinationCity, departureCity, mode);

        System.out.println("\nTrip 1 (1-argument constructor):");
        display(trip1);

        System.out.println("\nTrip 2 (2-argument constructor):");
        display(trip2);

        System.out.println("\nTrip 3 (3-argument constructor):");
        display(trip3);
    }

    public static void display(DebugTrip trip)
    {
        System.out.println("Going to " + trip.getDestination());
        System.out.println("Leaving from " + trip.getDepartureCity());
        System.out.println("Going by " + trip.getMode());
    }
}
