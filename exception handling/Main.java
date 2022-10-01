import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        try {
            System.out.println("Enter a whole number divide: ");
            int x = scan.nextInt();

            System.out.println("Enter a whole number divide by: ");
            int y = scan.nextInt();

            int z = x/y;

            System.out.println("Result is: " + z);
        } catch (ArithmeticException e) { //idivual exception
            System.out.println("You can not divide by 0");
        } catch (InputMismatchException e) {
            System.out.println("Please enter a number");
        } catch (Exception e) {
            System.out.println("Something when wrong!!");
        } finally { //finally block is being excuted alaway
            scan.close(); // is a best way to close a scanner class
        }
    }
}