package ChainOfResponsability;

public class Chain {
    Distributor chain;

    public Chain(){
        buildChain();
    }

    private void buildChain(){
        chain = new PhoneDistributor(new ComputerDistributor(new HeadphonesDistributor(null)));
    }

    public void distributor(Product product) {
        chain.distributor(product);
    }
}
