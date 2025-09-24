public class DebugBox
{
    private int width;
    private int length;
    private int height;

    public DebugBox()
    {
        length = 1;
        width = 1;
        height = 1;
    }

    public DebugBox(int width, int length, int height)
    {
        this.width = width;
        this.length = length;  
        this.height = height;  
    }

    public void showData()
    {
        System.out.println("Width: " + width + " Length: " +
            length + " Height: " + height);
    }

    public double getVolume()
    {
        double vol = length * width * height;
        return vol;
    }

   
    public static void main(String[] args)
    {
        DebugBox defaultBox = new DebugBox();
        defaultBox.showData();
        System.out.println("Volume: " + defaultBox.getVolume());

        DebugBox customBox = new DebugBox(3, 4, 5);
        customBox.showData();
        System.out.println("Volume: " + customBox.getVolume());
    }
}
