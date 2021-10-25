public class SellState implements StateInterface {

    private String product;
    private int value;

    public SellState(String product, int value) {

        this.product = product;
        this.value = value;
    }

    @Override
    public void doAction(VendingMachine vm) {

        System.out.println("Produto vendido " + this.product);

        vm.setState(this);
    }
}
