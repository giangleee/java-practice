public abstract class Vehicle {
    double speed;

    protected void go() {
        System.out.println("Go");
    }

    protected void stop () {
        System.out.println("Stop");
    }

    protected abstract void call();
}
