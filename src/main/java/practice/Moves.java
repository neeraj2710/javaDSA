package practice;

import java.util.*;

public class Moves {
    public static int leastMoves(int n, String[] directions) {
        String[] tile = {"up", "down", "right", "left"};
        Map<String, Integer> idxOfTheTile = new HashMap<>();
        for (int i = 0; i < tile.length; i++) {
            idxOfTheTile.put(tile[i], i);
        }

        int INF = Integer.MAX_VALUE / 2;
        int[][][] dp = new int[n + 1][4][4];

        // Initializing the DP Table
        for (int i = 0; i <= n; i++) {
            for (int a = 0; a < 4; a++) {
                for (int b = 0; b < 4; b++) {
                    dp[i][a][b] = INF;
                }
            }
        }

        // setting initial position which can be any two tiles
        for (int a = 0; a < 4; a++) {
            for (int b = 0; b < 4; b++) {
                if (a != b) {
                    dp[0][a][b] = 0;
                }
            }
        }

        // filling the DP table
        for (int i = 1; i <= n; i++) {
            int dir = idxOfTheTile.get(directions[i - 1]);
            for (int a = 0; a < 4; a++) {
                for (int b = 0; b < 4; b++) {
                    if (a == b) continue; // because legs cannot be on the same tiles

                    // moving lest leg to the desired tile
                    dp[i][dir][b] = Math.min(dp[i][dir][b], dp[i - 1][a][b] + (a == dir ? 0 : 1));

                    // moving right leg to the desired tile
                    dp[i][a][dir] = Math.min(dp[i][a][dir], dp[i - 1][a][b] + (b == dir ? 0 : 1));
                }
            }
        }

        // calculating minimum moves
        int minimumMoves = INF;
        for (int a = 0; a < 4; a++) {
            for (int b = 0; b < 4; b++) {
                if (a != b) {
                    minimumMoves = Math.min(minimumMoves, dp[n][a][b]);
                }
            }
        }

        return minimumMoves;
    }

    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);

        int x = kb.nextInt();
        kb.nextLine();
        String[] directions = new String[x];

        for (int i = 0; i < x; i++) {
            directions[i] = kb.nextLine();
        }

        System.out.print(leastMoves(x, directions));

        kb.close();
    }
}