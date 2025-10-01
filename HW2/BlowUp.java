import java.util.Scanner;

public class BlowUp {
    public static String blowUp (String str){
        char[] array = str.toCharArray();
        int n = array.length;
        String newStr = "";
        for (int i = 0; i < n; i++) {
            if (i != n - 1){
                if (checkNum(array[i]) && checkAlpha(array[i + 1])) {
                    int number = array[i] - '0';
                    for (int j = 0; j < number; j++) {
                        newStr += array[i + 1];
                    }
                }
                else  {
                    newStr += array[i];
                }
            }
            else {
                if (checkAlpha(array[i])) {
                    newStr += array[i];
                }
                else {
                    return  newStr;
                }
            }
        }
        return newStr;
    }
    public static boolean checkAlpha(char chr) {
        if (chr >= 'A' && chr <= 'z') {
            return true;
        }
        return false;
    }
    public static boolean checkNum(char chr) {
        if (chr >= '0' && chr <= '9') {
            return true;
        }
        return false;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println(blowUp(str));
    }
}
