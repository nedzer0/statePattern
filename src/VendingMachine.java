import java.util.ArrayList;
import java.util.List;

public class VendingMachine {

    private StateInterface state;
    private List<Product> stock;

    public VendingMachine() {
        this.stock = new ArrayList<>();
        this.state = null;
    }

    public void setState(StateInterface s) {
        this.state = s;
    }

    public StateInterface getState(){
        return state;
    }
}

