public class DebugCircle {
    private int radius;
    private static final double PI = 3.14159;

    public DebugCircle(int r) {
        radius = r;
    }

    public int getRadius() {
        return radius;
    }

    public int getDiameter() {
        return 2 * radius;
    }

    public double getArea() {
        return PI * radius * radius;
    }

    public static void main(String[] args) {
        DebugCircle c = new DebugCircle(5);
        System.out.println("Radius: " + c.getRadius());
        System.out.println("Diameter: " + c.getDiameter());
        System.out.println("Area: " + c.getArea());
    }
}
