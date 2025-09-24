public class DebugPen {
    private String color;
    private String point;

    public DebugPen() {
        color = "black";
        point = "fine";
    }

    public DebugPen(String color, String point) {
        this.color = color;
        this.point = point;
    }

    public String getColor() {
        return color;
    }

    public String getPoint() {
        return point;
    }

    public static void main(String[] args) {
        DebugPen defaultPen = new DebugPen();
        System.out.println("Default Pen - Color: " + defaultPen.getColor() + ", Point: " + defaultPen.getPoint());

        DebugPen customPen = new DebugPen("blue", "medium");
        System.out.println("Custom Pen - Color: " + customPen.getColor() + ", Point: " + customPen.getPoint());
    }
}
