import java.util.Scanner;

public class exercise54 {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Please enter a value of n");
        int n = keyboard.nextInt();

        for (int i = 0; i < n; i++) {
            for (int j = n; j >= i; j--) {
                System.out.print(" ");
            }
            for (int j = 1; j <= 2*i + 1; j = j + 1) {
                System.out.print("x");
            }

            System.out.println();
        }
    }
}
