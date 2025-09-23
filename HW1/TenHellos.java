public class TenHellos {
    public static void main(String[] args) {
        int i = 1;
        while (i <= 10) {
            if (i == 1) {
                System.out.println("1st Hello");

            }
            else if (i == 2) {
                System.out.println("2nd Hello");
            }
            else if (i == 3) {
                System.out.println("3rd Hello");
            }
            else {
                System.out.println(i + "th Hello");
            }
            i++;
        }

    }
}