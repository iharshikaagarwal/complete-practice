import java.util.LinkedList;
import java.util.Queue;

public class Assingment1_oranges {
    static class Pair {
        int row, col;

        public Pair(int row, int col) {
            this.row = row;
            this.col = col;
        }
    }

    public static int orangesRotting(int[][] grid) {
        int rows = grid.length;
        int cols = grid[0].length;

        // Directions for 4-way traversal
        int[][] directions = {{0, 1}, {0, -1}, {1, 0}, {-1, 0}};
//        {0, 1}: Moving one step to the right.
//{0, -1}: Moving one step to the left.
//{1, 0}: Moving one step downwards.
//{-1, 0}: Moving one step upwards.

        Queue<Pair> queue = new LinkedList<>();
        int freshOranges = 0;

        // Enqueue all the rotten oranges initially and count fresh oranges
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (grid[i][j] == 2) {
                    queue.add(new Pair(i, j));
                } else if (grid[i][j] == 1) {
                    freshOranges++;
                }
            }
        }

        int minutes = 0;
        while (!queue.isEmpty()) {
            int size = queue.size();
            boolean changed = false;
            for (int i = 0; i < size; i++) {
                Pair curr = queue.poll();

                for (int[] dir : directions) {
                    int newRow = curr.row + dir[0];
                    int newCol = curr.col + dir[1];

                    if (newRow >= 0 && newRow < rows && newCol >= 0 && newCol < cols &&
                            grid[newRow][newCol] == 1) {
                        grid[newRow][newCol] = 2;
                        freshOranges--;
                        queue.add(new Pair(newRow, newCol));
                        changed = true;
                    }
                }
            }
            if (changed) {
                minutes++;
            }
        }

        return freshOranges == 0 ? minutes : -1;
    }

    public static void main(String[] args) {
        int[][] grid1 = {{2, 1, 1}, {1, 1, 0}, {0, 1, 1}};
        System.out.println("Output for grid1: " + orangesRotting(grid1)); // Output: 4

        int[][] grid2 = {{2, 1, 1}, {0, 1, 1}, {1, 0, 1}};
        System.out.println("Output for grid2: " + orangesRotting(grid2)); // Output: -1

        int[][] grid3 = {{0, 2}};
        System.out.println("Output for grid3: " + orangesRotting(grid3)); // Output: 0
    }
}
