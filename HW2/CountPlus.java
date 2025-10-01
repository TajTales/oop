import java.util.ArrayList;
import java.util.Scanner;

public class CountPlus {
    private static int count(char[][] array, int row, int col, int x,int y, char current) {
        int result = 0;
        row += x;
        col += y;
        while (row >= 0  && col >= 0 && row < array.length && col < array[row].length && col >= 0 && array[row][col] == current) {
            result ++;
            row += x;
            col += y;
        }
        return result;
    }

    public static int countPlus(char[][] array) {
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                char current = array[i][j];
                int up = count(array, i, j, -1, 0 , current);
                int down = count(array, i, j, 1, 0 , current);
                int left = count(array, i, j, 0, -1, current);
                int right = count(array, i, j, 0, 1, current);
                if (up > 1 && up == down && right == left && up == right) {
                    count++;
                }
            }
        }
        return count;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<ArrayList<Character>> list = new ArrayList<>();
        while (true) {
            String str = input.nextLine();
            if (str.equals("")) {
                break;
            }
            ArrayList<Character> temp = new ArrayList<>();
            for (int i = 0; i < str.length(); i++) {
                temp.add(str.charAt(i));
            }
            list.add(temp);
        }
        char[][] chars = new char[list.size()][list.get(0).size()];
        for (int i = 0; i < list.size(); i++) {
            for (int j = 0; j < list.get(i).size(); j++) {
                chars[i][j] = list.get(i).get(j);
            }
        }
        System.out.println(countPlus(chars));
    }
}
