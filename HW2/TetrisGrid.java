import java.util.ArrayList;
import java.util.Scanner;

public class TetrisGrid {
    public boolean[][] grid;
    public TetrisGrid(boolean[][] grid) {
        boolean[][] temp = new boolean[grid.length][grid[0].length];
        for (int i = 0; i < temp.length; i++) {
            for (int j = 0; j < temp[0].length; j++) {
                temp[i][j] = grid[temp.length -1 - i][j];
            }
        }
        this.grid = temp;
    }
    public static void printGrid(TetrisGrid grids) {
        for (int x = 0; x < grids.grid.length; x++ ) {
            for (int y = 0; y < grids.grid[0].length; y++ ) {
                System.out.print(grids.grid[x][y] + " ");
            }
            System.out.println();
        }
    }
    public void clearRow(int row) {
        for (int i = row; i < grid.length - 1; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                grid[i][j] = grid[i+1][j];
            }
        }
        for (int j = 0; j < grid[0].length; j++) {
            grid[grid.length - 1][j] = false;
        }
    }
    public static void main(String[] args) {
        boolean[][] grid = {
                {true, false, false},
                {true, false, true},
                {true, true, false},
        };
        TetrisGrid grid1 = new TetrisGrid(grid);
        grid1.clearRow(2);
        printGrid(grid1);
    }
}
