public class TurnOnState implements  StateInterface {

    public TurnOnState() {
    }


    @Override
    public void doAction(VendingMachine vm) {
        vm.setState(this);
        System.out.println("Vending machine turned ON!");
    }
}
