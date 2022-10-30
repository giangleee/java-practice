import java.util.Date;

public abstract class Ticket {
    protected Date issuedDate;
    protected int value;

    //create origin gate
    Gate origin;

    public void setOrigin (Gate gate) {
        this.origin = new Gate(gate);
    }

    public Gate getOrigin () {
        return origin;
    }

    public Ticket(Date issueDate, int value) {
        this.issuedDate = issueDate;
        this.adjustValue(value);
    }

    public int getValue() {
        return value;
    }

    public void adjustValue(int value) {
        this.value = value;
    }

    public abstract boolean isValid();
}
