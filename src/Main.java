// 1. Definition of the Car class
class Car {
    // Private fields (Encapsulation)
    private String model;
    private String brand;
    private int year;
    private double price;
    private String color;
    private int quantity;

    // Parameterized Constructor
    public Car(String model, String brand, int year, double price, String color, int quantity) {
        this.model = model;
        this.brand = brand;
        this.year = year;
        this.price = price;
        this.color = color;
        this.quantity = quantity;
    }

    // --- Getter Methods ---
    public String getModel() {
        return model;
    }

    public String getBrand() {
        return brand;
    }

    public int getYear() {
        return year;
    }

    public double getPrice() {
        return price;
    }

    public String getColor() {
        return color;
    }

    public int getQuantity() {
        return quantity;
    }

    // --- Setter Methods ---
    public void setModel(String model) {
        this.model = model;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    // --- Custom Inventory Methods ---
    // Simulates receiving new stock (increases quantity)
    public void delivery(int amount) {
        this.quantity += amount;
    }

    // Simulates selling stock (decreases quantity)
    public void sell(int amount) {
        if (this.quantity >= amount) {
            this.quantity -= amount;
        } else {
            System.out.println("Not enough inventory to sell " + amount + " cars.");
        }
    }

    // --- Overridden toString Method ---
    @Override
    public String toString() {
        return "Car [" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", year=" + year +
                ", price=" + price +
                ", color='" + color + '\'' +
                ", quantity=" + quantity +
                ']';
    }
}
// 2. Main class to test the functionality
public class Main {
    public static void main(String[] args) {
        // Step 1: Instantiate a Car object using the constructor
        Car myCar = new Car("Civic", "Honda", 2022, 25000.00, "Black", 10);

        // Step 2: Call and print the output of the toString() method
        System.out.println("--- Initial State (toString) ---");
        System.out.println(myCar.toString());

        // Step 3: Call the sell() method to reduce inventory
        System.out.println("\nSelling 3 cars...");
        myCar.sell(3);

        // Step 4: Print all fields using getter methods individually
        System.out.println("\n--- Individual Fields (using Getters) ---");
        System.out.println("Brand: " + myCar.getBrand());
        System.out.println("Model: " + myCar.getModel());
        System.out.println("Year: " + myCar.getYear());
        System.out.println("Price: $" + myCar.getPrice());
        System.out.println("Color: " + myCar.getColor());
        System.out.println("Quantity remaining: " + myCar.getQuantity());

        // Step 5: Update some fields using setter methods
        System.out.println("\nUpdating price and color using setters...");
        myCar.setPrice(23500.00);
        myCar.setColor("Matte Black");

        // Step 6: Print toString() again to observe modifications
        System.out.println("\n--- Updated State (toString) ---");
        System.out.println(myCar.toString());
    }
}