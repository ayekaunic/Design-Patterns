import java.util.ArrayList;
import java.util.List;


// Product class representing the items in the shopping cart
class Product {
    private String name;
    private int quantity;
    private List<String> customizations;

    public Product(String name, int quantity, List<String> customizations) {
        this.name = name;
        this.quantity = quantity;
        this.customizations = customizations;
    }

    // Additional features can be added here, such as warranties, discounts, etc.

    @Override
    public String toString() {
        return "Product: " + name + ", Quantity: " + quantity + ", Customizations: " + customizations;
    }
}


// Builder interface for building products
interface ProductBuilder {
    void addName(String name);
    void addQuantity(int quantity);
    void addCustomization(String customization);
    Product build();
}


// Concrete builder for a specific type of product
class ConcreteProductBuilder implements ProductBuilder {
    private String name;
    private int quantity;
    private List<String> customizations;

    public ConcreteProductBuilder() {
        customizations = new ArrayList<>();
    }

    @Override
    public void addName(String name) {
        this.name = name;
    }

    @Override
    public void addQuantity(int quantity) {
        this.quantity = quantity;
    }

    @Override
    public void addCustomization(String customization) {
        this.customizations.add(customization);
    }

    @Override
    public Product build() {
        return new Product(name, quantity, customizations);
    }
}


// Director class that orchestrates the construction of products
class ShoppingCartDirector {
    private ProductBuilder productBuilder;

    public ShoppingCartDirector(ProductBuilder productBuilder) {
        this.productBuilder = productBuilder;
    }

    public void constructProduct(String name, int quantity, List<String> customizations) {
        productBuilder.addName(name);
        productBuilder.addQuantity(quantity);
        for (String customization : customizations) {
            productBuilder.addCustomization(customization);
        }
    }

    public Product getProduct() {
        return productBuilder.build();
    }
}


// Client code demonstrating how to use the builder pattern
public class ShoppingCartClient {
    public static void main(String[] args) {
        // Creating a concrete builder for a product type
        ConcreteProductBuilder builder = new ConcreteProductBuilder();

        // Creating a director for the builder
        ShoppingCartDirector director = new ShoppingCartDirector(builder);

        // Constructing a product with customizations
        director.constructProduct("Electronics", 2, List.of("Color: Blue", "Warranty: 1 Year"));
        Product product = director.getProduct();

        // Printing the detailed order summary
        System.out.println(product);
    }
}
