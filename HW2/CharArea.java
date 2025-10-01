import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class CharArea {
    public static int charArea(char[][] arr,char ch) {
        int minRow = arr.length;
        int minCol = arr[0].length;
        int maxRow = 0;
        int maxCol = 0;
        boolean exist = false;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] == ch) {
                    exist = true;
                    if (i < minRow) {
                        minRow = i;
                    }
                    if (j < minCol) {
                        minCol = j;
                    }
                    if (i > maxRow) {
                        maxRow = i;
                    }
                    if (j > maxCol) {
                        maxCol = j;
                    }
                }
            }
        }
        if (!exist) {
            return 0;
        }
        return Math.abs(maxRow + 1 - minRow) * Math.abs(maxCol + 1 - minCol);
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<ArrayList<Character>> array = new ArrayList<>();
        while (input.hasNext()) {
            String str = input.nextLine();
            if (str.equals("")) {
                break;
            }
            ArrayList<Character> temp = new ArrayList<>();
            for (int i = 0; i < str.length(); i++) {
                temp.add(str.charAt(i));
            }
            array.add(temp);
        }
        char inputChar = input.next().charAt(0);
        char[][] chars = new char[array.size()][array.get(0).size()];
        for (int i = 0; i < array.size(); i++) {
            for (int j = 0; j < array.get(i).size(); j++) {
                chars[i][j] = array.get(i).get(j);
            }
        }
        System.out.println(charArea(chars, inputChar));
    }

}
