import java.util.Scanner;

public class CharGird {
    public static void printArray2D (char[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
    public static char getArray (char[][] arr, int row, int col) {
        return arr[row][col];
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        sc.nextLine();
        char[][] chars = new char[n][];
        for (int i = 0; i < n; i++) {
            chars[i] = new char[m];
            String line = sc.nextLine();
            for (int j = 0; j < m; j++) {
                chars[i][j] = line.charAt(j);
            }
        }
        printArray2D(chars);
    }
}
