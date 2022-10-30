import java.util.Date;

public class PrepaidCard extends Ticket implements ICard {

    public PrepaidCard(Date issueDate, int value) {
        super(issueDate, value);
    }

    @Override
    public boolean isValid() {
        // TODO Auto-generated method stub
        return false;
    }

    @Override
    public void add(int value) {
        int newValue = super.getValue() + value;
        super.adjustValue(newValue);
        
    }

    @Override
    public boolean deduct(int value) {
        if (super.getValue() < value) {
            return false;
        } else {
            int newValue = super.getValue() + value;
            super.adjustValue(newValue);
            return true;
        }
    }
    
}
