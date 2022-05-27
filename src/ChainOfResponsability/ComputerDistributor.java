package ChainOfResponsability;

public class ComputerDistributor extends Distributor{
    public ComputerDistributor(Distributor nextDistributor){
        super(nextDistributor);

    }

    public void distributor(Product product)
    {
        if (product.getProduct().equalsIgnoreCase("computer"))
        {
            System.out.println("Computer distributor is responsible for delivering: " + product.getProduct());
        }
        else
        {
            super.distributor(product);
        }
    }
}
