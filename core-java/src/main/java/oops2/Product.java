package oops2;
public class Product {
    private double price;
    public double getPrice() {
        return price;
    }
    public void setPrice(double price) {
        this.price = price;
    }

    // Overloaded getter method with quantity parameter
    public double getPrice(int quantity) {
        // Assuming a simple calculation for total price based on quantity
        return price * quantity;
    }

    public static void main(String[] args) {
        // Creating an instance of the Product class
        Product product = new Product();

        // Setting the price using the setter
        product.setPrice(10.0);

        // Getting the price using the overloaded getter with quantity parameter
        double totalPriceFor5Items = product.getPrice(5);

        // Displaying the results
        System.out.println("Price for single quantity: " + product.getPrice());
        System.out.println("Total price for 5 items: " + totalPriceFor5Items);
    }
}

