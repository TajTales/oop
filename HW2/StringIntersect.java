import java.util.HashSet;
import java.util.Scanner;

public class StringIntersect {
    public static boolean stringIntersect(String a, String b, int len) {
        HashSet<String> set = new HashSet<>();
        int n = a.length();
        int start = 0;
        while (start + len < n) {
            set.add(a.substring(start, start + len));
            start ++;
        }
        start = 0;
        while (start + len < b.length()) {
            if (set.contains(b.substring(start, start + len))) {
                return true;
            }
            start ++;
        }
        return false;
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        int len = scan.nextInt();
        System.out.println(stringIntersect(a, b, len));
        scan.close();
    }
}
