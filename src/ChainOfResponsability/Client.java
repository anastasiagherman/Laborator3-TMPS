package ChainOfResponsability;

public class Client {
    public static void main(String[] args) {
        Chain chain = new Chain();

        chain.distributor(new Product("computer"));
        chain.distributor(new Product("phone"));
        chain.distributor(new Product("headphones"));
    }
}
