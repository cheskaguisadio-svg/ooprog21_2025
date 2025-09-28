public class DebugTrip {
    private String destination;
    private String departure;
    private String mode;

    private static final String DEFAULT_CITY = "Atlanta";
    private static final String DEFAULT_MODE = "car";

    
    public DebugTrip(String destination) {
        this(destination, DEFAULT_CITY, DEFAULT_MODE);
    }

 
    public DebugTrip(String destination, String departure) {
        this(destination, departure, DEFAULT_MODE);
    }

    
    public DebugTrip(String destination, String departure, String mode) {
        this.destination = destination;
        this.departure = departure;
        this.mode = mode;
    }

    public String getDestination() {
        return destination;
    }

    public String getDepartureCity() {
        return departure;
    }

    public String getMode() {
        return mode;
    }


    public static void main(String[] args) {
        DebugTrip trip1 = new DebugTrip("New York");
        DebugTrip trip2 = new DebugTrip("Los Angeles", "Chicago");
        DebugTrip trip3 = new DebugTrip("Miami", "Houston", "plane");

        System.out.println("Trip 1: Destination = " + trip1.getDestination() + ", Departure = " + trip1.getDepartureCity() + ", Mode = " + trip1.getMode());
        System.out.println("Trip 2: Destination = " + trip2.getDestination() + ", Departure = " + trip2.getDepartureCity() + ", Mode = " + trip2.getMode());
        System.out.println("Trip 3: Destination = " + trip3.getDestination() + ", Departure = " + trip3.getDepartureCity() + ", Mode = " + trip3.getMode());
    }
}
