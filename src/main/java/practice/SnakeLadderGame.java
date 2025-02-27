package practice;

import java.util.*;

public class SnakeLadderGame {

    // Class to represent a Snake or a Ladder with start and end positions and type
    static class BoardFeature {
        int startPos;  // Starting position of the snake or ladder
        int endPos;    // Ending position of the snake or ladder
        String featureType; // Type of feature - either "Snake" or "Ladder"

        // Constructor to initialize the feature
        BoardFeature(int startPos, int endPos, String featureType) {
            this.startPos = startPos;
            this.endPos = endPos;
            this.featureType = featureType;
        }
    }

    // Method to check if the target position is reachable based on the dice rolls
    static boolean isTargetPositionReachable(List<Integer> diceRolls, Map<Integer, Integer> gameBoard, int targetPosition) {
        int currentPosition = 1;  // Player always starts at position 1
        // Process each dice roll
        for (int roll : diceRolls) {
            if (currentPosition + roll <= 100) {
                currentPosition += roll;  // Update the current position with the dice roll
            }
            // Move according to any snake or ladder at the current position
            while (gameBoard.containsKey(currentPosition)) {
                currentPosition = gameBoard.get(currentPosition);  // Update position if it's a snake or ladder
            }
        }
        return currentPosition == targetPosition;  // Check if we reached the target position
    }

    // Main function to solve the problem
    static void executeGameScenario() {
        Scanner inputScanner = new Scanner(System.in);

        // Read the number of snakes and ladders
        int featureCount = inputScanner.nextInt();
        List<BoardFeature> boardFeatures = new ArrayList<>();
        Map<Integer, Integer> gameBoardMap = new HashMap<>();  // Represents the board with snakes and ladders

        // Read the positions of snakes and ladders
        for (int i = 0; i < featureCount; i++) {
            int startPosition = inputScanner.nextInt();
            int endPosition = inputScanner.nextInt();
            String featureType = (startPosition > endPosition) ? "Snake" : "Ladder";  // Determine if it's a Snake or Ladder
            boardFeatures.add(new BoardFeature(startPosition, endPosition, featureType));
            gameBoardMap.put(startPosition, endPosition);  // Add the feature to the board map
        }

        // Read remaining dice rolls and final position to reach
        List<Integer> diceRollsList = new ArrayList<>();
        while (inputScanner.hasNextInt()) {
            diceRollsList.add(inputScanner.nextInt());  // Collect all dice rolls
        }

        if (diceRollsList.isEmpty()) {
            System.out.print("Not reachable");  // No dice rolls, hence the target is not reachable
            return;
        }

        // Extract the target position from the last number in the dice rolls list
        int finalPosition = diceRollsList.get(diceRollsList.size() - 1);
        diceRollsList.remove(diceRollsList.size() - 1);  // Remove the target position from the list of dice rolls

        // Check if the target position is reachable with the given dice rolls and current board state
        if (isTargetPositionReachable(diceRollsList, gameBoardMap, finalPosition)) {
            System.out.print("Not affected");  // No need to change the board, the target is already reachable
            return;
        }

        // Try modifying one snake or ladder and check if the target becomes reachable
        for (BoardFeature feature : boardFeatures) {
            gameBoardMap.remove(feature.startPos);  // Temporarily remove the snake or ladder from the board
            int swappedStart = feature.endPos;  // Swap start and end positions for a change
            int swappedEnd = feature.startPos;
            String swappedType = feature.featureType.equals("Snake") ? "Ladder" : "Snake";  // Swap feature type

            // Avoid invalid swaps where the new start position conflicts with other features
            if (swappedStart == 1 || gameBoardMap.containsKey(swappedStart)) {
                gameBoardMap.put(feature.startPos, feature.endPos);  // Restore the board state
                continue;
            }

            gameBoardMap.put(swappedStart, swappedEnd);  // Place the swapped feature on the board

            // Check if the target position becomes reachable after the swap
            if (isTargetPositionReachable(diceRollsList, gameBoardMap, finalPosition)) {
                // If reachable, print the new feature type and positions
                System.out.print(swappedType + " " + swappedStart + " " + swappedEnd);
                return;
            }

            // If no solution found, restore the board to its original state
            gameBoardMap.remove(swappedStart);
            gameBoardMap.put(feature.startPos, feature.endPos);
        }

        System.out.print("Not reachable");  // If no solution found after trying all swaps, print "Not reachable"
    }

    // Main method that runs the solution
    public static void main(String[] args) {
        executeGameScenario();  // Start solving the game scenario
    }
}