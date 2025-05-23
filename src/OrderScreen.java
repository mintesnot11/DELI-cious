import java.util.Scanner;

public class OrderScreen {
    private final Scanner scanner;
    private final Order order;

    public OrderScreen(Scanner scanner, Order order) {
        this.scanner = scanner;
        this.order = order;
    }

    public void display() {
        System.out.println("\n(Order screen coming soon...)\n");
    }
}
