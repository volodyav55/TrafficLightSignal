package package1;

import java.util.Scanner;

public class TrafficLightSignal {
    private static final int SIZE = 3;
    private String[] Color = {"GREEN", "YELLOW", "RED"};
    private ColorSignal[] colorSignals = new ColorSignal[SIZE];

    // Initialization
    public void Init() {
        for (int i = 0; i < SIZE; i++) {
            String color = Color[i];
            int timeColor = getTimeColor(color);
            colorSignals[i] = new ColorSignal(color, timeColor);
        }
    }

    // To determine time for a signal
    public int getTimeColor(String color) {
        System.out.println(color + " - time duration in minutes : ");
        int timeColor = 0;
        Scanner scanner = new Scanner(System.in);
        if (scanner.hasNextInt()) {
            timeColor = scanner.nextInt();
        } else {
            scanner.nextLine();
        }
        return timeColor;
    }

    // Switching of a light signal
    public void Switching() {
        for (int i = 0; i < SIZE; i++) {
            colorSignals[i].Shine();
        }
    }
}
