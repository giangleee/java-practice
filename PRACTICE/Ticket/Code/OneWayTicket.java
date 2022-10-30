import java.util.Date;

public class OneWayTicket extends Ticket {
    private boolean valid = true;

    public OneWayTicket(Date issueDate, int value) {
        super(issueDate, value);
    }

    public boolean getValid() {
        return valid;
    }

    @Override
    public boolean isValid() {
        // TODO Auto-generated method stub
        return false;
    }

    @Override
    public void setOrigin(Gate gate) {
        super.setOrigin(gate);
    }
    
}
