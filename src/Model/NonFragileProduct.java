package Model;

public class NonFragileProduct extends Product {
   final double RATE = 0.5;

    public NonFragileProduct(String productId, String productName, double price) {
        super(productId, productName);
        this.price = price;
        this.charge = RATE;
    }

    @Override
    Double getCharge() {
        return charge;
    }

    @Override
    Double getTotalPrice() {
        return price * charge;
    }

    @Override
    public String getProductId() {
        return super.getProductId();
    }
}
