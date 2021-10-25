public class SellState implements StateInterface {

    public SellState() {
    }

    @Override
    public void doAction(VendingMachine vm) {
        System.out.println("Produto vendido M&M's.");

        vm.setState(this);
    }
}
