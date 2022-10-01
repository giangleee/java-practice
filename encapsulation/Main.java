public class Main {
    public static void main(String[] args) {
        Car car = new Car("Viet nam", "Ha noi", 2001);

        System.out.println(car.getMake());
        car.setYear(2022);
        System.out.println(car.getYear());
    }
}