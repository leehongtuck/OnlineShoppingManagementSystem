package Model;

public class FragileProduct extends Product {
    final double RATE = 0.15;

    public FragileProduct(String productId, String productName, Double price) {
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
}
