public class Hero extends Person {
    private String power;

    public Hero(String name, int age, String power) {
        super(name, age);
       this.power = power;
    }

    public String toString() {
        return super.toString() + "\n" + this.power;
    }
}
