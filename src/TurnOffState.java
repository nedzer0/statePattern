public class TurnOffState implements StateInterface {

    public TurnOffState() {
    }

    public void doAction(VendingMachine vm) {
        vm.setState(this);
        System.out.println("Vending machine turned OFF!");
    }
}