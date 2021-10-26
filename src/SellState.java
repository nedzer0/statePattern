public class SellState implements StateInterface {

    public SellState() {
    }

    public void doAction(VendingMachine vm) {
        vm.setState(this);
        System.out.println("Produto vendido M&M's.");
    }
}
