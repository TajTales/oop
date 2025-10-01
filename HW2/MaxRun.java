import java.util.Scanner;

public class MaxRun {
    public static int maxRun(String str){
        char[] chars = str.toCharArray();
        int count;
        int max = 1;
        for (int i = 0; i < chars.length; i++) {
            count = 1;
            if (i > 0 && checkChar(chars[i - 1], chars[i])) {
                continue;
            }
            for (int j = i + 1; j < chars.length; j++) {
                if (checkChar(chars[i], chars[j])) {
                    count++;
                    if  (count > max) {
                        max = count;
                    }
                }
                else {
                    break;
                }
            }
        }
        return max;
    }
    public static boolean checkChar(char a, char b){
        if (a == b){
            return true;
        }
        return false;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println(maxRun(str));
    }
}
