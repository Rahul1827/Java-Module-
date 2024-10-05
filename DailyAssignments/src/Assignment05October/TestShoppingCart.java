package Assignment05October;


 class Product {
    private String name;
    private double price;

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}


 class ShoppingCart {
    private Product[] products;
    private int count;

    public ShoppingCart(int capacity) {
        products = new Product[capacity];
        count = 0;
    }

  
    public void addProduct(Product product) {
        if (count < products.length) {
            products[count] = product;
            count++;
            System.out.println("Added: " + product);
        } else {
            System.out.println("Cart is full. Cannot add more products.");
        }
    }

    
    public double calculateTotalCost() {
        double totalCost = 0.0;
        for (int i = 0; i < count; i++) {
            totalCost = totalCost +products[i].getPrice();
        }
        return totalCost;
    }

  
    public void displayCartContents() {
        if (count == 0) {
            System.out.println("The cart is empty.");
            return;
        }
        System.out.println("Products in the cart:");
        for (int i = 0; i < count; i++) {
            System.out.println(products[i]);
        }
        System.out.printf("Total Cost: $%.2f%n", calculateTotalCost());
    }
}


public class TestShoppingCart {

	    public static void main(String[] args) {
	        ShoppingCart cart = new ShoppingCart(5); 

	        Product product1 = new Product("Laptop", 999.99);
	        Product product2 = new Product("Smartphone", 499.99);
	        Product product3 = new Product("Headphones", 199.99);
	        
	        cart.addProduct(product1);
	        cart.addProduct(product2);
	        cart.addProduct(product3);

	        cart.displayCartContents();

	        Product product4 = new Product("Mouse", 29.99);
	        Product product5 = new Product("Keyboard", 49.99);
	        Product product6 = new Product("Monitor", 299.99); 

	        cart.addProduct(product4);
	        cart.addProduct(product5);
	        cart.addProduct(product6); 

	        cart.displayCartContents();
	    }
	}

