import java.util.Arrays;
import java.util.List;

public class RobotGrid {
    public static void main(String[] args) {
        // Example sequence of steps
        List<Integer> steps = Arrays.asList(10, 5, -2);

        // Call the function that calculates the final position
        int[] finalPosition = calculateFinalPosition(steps);

        // Print the final position
        System.out.println("Final Position: (x: " + finalPosition[0] + ", y: " + finalPosition[1] + ")");
    }

    public static int[] calculateFinalPosition(List<Integer> steps) {
        int x = 0;
        int y = 0;
        int direction = 0; // 0: up, 1: left, 2: down, 3: right

        for (int step : steps) {
            switch (direction) {
                case 0: // Moving along y-axis
                    y += step;
                    break;
                case 1: // Moving along x-axis
                    x -= step;
                    break;
                case 2: // Moving along y-axis
                    y -= step;
                    break;
                case 3: // Moving along x-axis
                    x += step;
                    break;
            }
            // Change direction counterclockwise
            direction = (direction + 1) % 4;
        }

        return new int[]{x, y};
    }
}
