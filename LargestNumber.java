import java.util.Scanner;

public class LargestNumber {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print(" please Enter the first number: ");
        int num1 = input.nextInt();
        
        System.out.print(" please Enter the second number: ");
        int num2 = input.nextInt();
        
        System.out.print(" please Enter the third number: ");
        int num3 = input.nextInt();

        int largest;

        if (num1 >= num2 && num1 >= num3) {
            largest = num1;
        } else if (num2 >= num1 && num2 >= num3) {
            largest = num2;
        } else {
            largest = num3;
        }

        System.out.println("The largest number is: " + largest);
        
        input.close();
    }
}
