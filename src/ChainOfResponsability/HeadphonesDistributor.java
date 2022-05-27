package ChainOfResponsability;

public class HeadphonesDistributor extends Distributor{
    public HeadphonesDistributor(Distributor nextDistributor){
        super(nextDistributor);

    }

    public void distributor(Product product)
    {
        if (product.getProduct().equalsIgnoreCase("headphones"))
        {
            System.out.println("Computer distributor is responsible for delivering: " + product.getProduct());
        }
        else
        {
            super.distributor(product);
        }
    }
}
