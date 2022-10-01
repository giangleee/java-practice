import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Animal animal;

        System.out.println("What animal do you want?");
        System.out.println("(1=dog) or (2=cat)");
        
        int choice = scan.nextInt();

        switch (choice) {
            case 1:
                animal = new Dog();
                animal.speak();
                break;
            case 2:
                animal = new Cat();
                animal.speak();
                break;
            default:
                animal = new Animal();
                animal.speak();
                break;
        }
    }
}