package package1;

public class ColorSignal {
    private static final int MINUTE = 60000; // one minute
    private String color;
    private int timeColor;

    public ColorSignal(String color, int timeColor) {
        this.color = color;
        this.timeColor = timeColor;
    }

    public void Shine() {
        System.out.println(color);
        try {
            Thread.sleep(timeColor * MINUTE);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
