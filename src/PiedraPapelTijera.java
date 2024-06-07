import java.util.*;

public class PiedraPapelTijera {
    public static void main(String[] args) {
        // List of moves: each pair represents a game between Player 1 and Player 2
        List<String[]> moves = Arrays.asList(
                new String[]{"R", "S"},
                new String[]{"S", "R"},
                new String[]{"P", "S"}
        );

        // Call the function that calculates the winner
        String result = calculateWinner(moves);

        // Print the result
        System.out.println("Result: " + result);
    }

    public static String calculateWinner(List<String[]> moves) {
        int player1Wins = 0;
        int player2Wins = 0;

        // Iterate over all moves
        for (String[] move : moves) {
            String move1 = move[0];
            String move2 = move[1];

            // Determine the result of each game
            if (wins(move1, move2)) {
                player1Wins++;
            } else if (wins(move2, move1)) {
                player2Wins++;
            }
        }

        // Determine who won more games
        if (player1Wins > player2Wins) {
            return "Player 1";
        } else if (player2Wins > player1Wins) {
            return "Player 2";
        } else {
            return "Tie";
        }
    }

    // Helper function to determine if move1 beats move2
    public static boolean wins(String move1, String move2) {
        return (move1.equals("R") && move2.equals("S")) ||
                (move1.equals("S") && move2.equals("P")) ||
                (move1.equals("P") && move2.equals("R"));
    }
}
