package ChainOfResponsability;

public class PhoneDistributor extends Distributor{

    public PhoneDistributor(Distributor nextDistributor){
        super(nextDistributor);

    }

    public void distributor(Product product)
    {
        if (product.getProduct().equalsIgnoreCase("phone"))
        {
            System.out.println("Phone distributor is responsibel for delivering: " + product.getProduct());
        }
        else
        {
            super.distributor(product);
        }
    }
}
