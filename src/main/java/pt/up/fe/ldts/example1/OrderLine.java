package pt.up.fe.ldts.example1;

public class OrderLine {
    private Product product;
    private int quantity;


    public void setProduct(Product product) {
        this.product = product;
    }
    public Product getProduct() {
        return this.product;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
    public int getQuantity() {
        return this.quantity;
    }

    public OrderLine(Product product, int quantity) {
        this.product = product;
        this.quantity = quantity;
    }
    public double getTotal() {
        return getProduct().getPrice() * getQuantity();
    }

    public String getLineString() {
        return product.getName() + "(x" + quantity + "): " + getTotal() + "\n";
    }
    @Override
    public String toString() {
        return getProduct().getName() + "(x" + getQuantity() + "): " + (getTotal());
    }
}
