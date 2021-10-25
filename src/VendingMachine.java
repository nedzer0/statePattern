public class VendingMachine {

    private StateInterface state;


    public VendingMachine() {
        this.state = null;
    }

    public void setState(StateInterface s) {
        this.state = s;
    }

    public StateInterface getState(){
        return state;
    }
}

