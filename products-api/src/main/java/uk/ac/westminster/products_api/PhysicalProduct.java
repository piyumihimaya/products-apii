package uk.ac.westminster.products_api;

// A PhysicalProduct IS-A Product because it is a kind of product with an id, name and price, plus shipping details.
// A ShoppingCart would NOT pass this test: a cart HAS products, it is not itself a product.
public class PhysicalProduct extends Product {

    private double weightKg;
    private String dimensions;

    public PhysicalProduct() {
    }

    public PhysicalProduct(Long id, String name, double price,
                           double weightKg, String dimensions) {
        super(id, name, price);
        this.weightKg = weightKg;
        this.dimensions = dimensions;
    }

    public double getWeightKg() {
        return weightKg;
    }

    public String getDimensions() {
        return dimensions;
    }
}