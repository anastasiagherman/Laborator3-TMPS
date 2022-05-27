package ChainOfResponsability;

public abstract class Distributor {
    private Distributor nextDistributor;

    public Distributor(Distributor nextDistributor){
        this.nextDistributor = nextDistributor;
    }

    public void distributor(Product product){
        if(nextDistributor != null)
            nextDistributor.distributor(product);
    }
}
