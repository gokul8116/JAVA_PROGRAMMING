public class GCD {
    public static void main(String[] args) {
        int num1 = 56, num2 = 98;
        while (num1 != num2) {
            if (num1 > num2) {
                num1 -= num2;
            } else {
                num2 -= num1;
            }
        }
        System.out.println("GCD: " + num1);
    }
}
