import javax.naming.NamingEnumeration;

public class Gate {
    private String name;
    private int distance;

    public Gate (String name, int distance) {
        this.name = name;
        this.distance = distance;
    }

    public Gate (Gate gate) {
        this.name = gate.name;
        this.distance = gate.distance;
    }

    public void open() {
        System.out.println("Gate NO." + this.name + " is Open.");
    }

    public void close() {
        System.out.println("Gate NO." + this.name + " is Close.");
    }

    public void enter(Ticket ticket) {
        if (ticket.value <= 9000) {
            this.close();
        } else {
            this.open();
        }
    }

    public void exit (Ticket ticket) {

    }
}