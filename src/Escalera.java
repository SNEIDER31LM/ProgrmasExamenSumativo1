import java.util.Scanner;

public class Escalera {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingresa el número de escalones: ");
        int steps = scanner.nextInt();
        drawStaircase(steps);
    }

    public static void drawStaircase(int steps) {
        if (steps > 0) {
            // Draw an ascending staircase
            for (int i = 0; i < steps; i++) {
                for (int j = 0; j < steps - i - 1; j++) {
                    System.out.print(" ");
                }
                System.out.println("_|");
            }
        } else if (steps < 0) {
            // Draw a descending staircase
            for (int i = 0; i < Math.abs(steps); i++) {
                for (int j = 0; j < i; j++) {
                    System.out.print(" ");
                }
                System.out.println("_|");
            }
        } else {
            // Draw a staircase with two underscores
            System.out.println("__");
        }
    }
}
