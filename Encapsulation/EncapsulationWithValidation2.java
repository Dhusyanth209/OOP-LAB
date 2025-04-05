class Product {
    private double price;

    public void setPrice(double price) {
        if (price > 0) {
            this.price = price;
        } else {
            System.out.println("Price must be positive.");
        }
    }

    public double getPrice() {
        return price;
    }
}

public class EncapsulationWithValidation2 {
    public static void main(String[] args) {
        Product p = new Product();
        p.setPrice(25.50);
        System.out.println("Product Price: $" + p.getPrice());
    }
}