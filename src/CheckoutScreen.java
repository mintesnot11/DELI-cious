import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class CheckoutScreen {
    private final Scanner scanner;
    private final Order order;

    public CheckoutScreen(Scanner scanner, Order order) {
        this.scanner = scanner;
        this.order = order;
    }

    public void display() {
        System.out.println("\n-- CHECKOUT --");
        System.out.println(order.getOrderSummary());

        System.out.print("\nConfirm order? (yes/no): ");
        String confirm = scanner.nextLine();

        if (confirm.equalsIgnoreCase("yes")) {
            saveReceipt(order);
            System.out.println("Order confirmed and receipt saved.");
        } else {
            System.out.println("Order cancelled.");
        }
    }

    private void saveReceipt(Order order) {
        try {

            java.io.File dir = new java.io.File("receipts");
            if (!dir.exists()) {
                dir.mkdirs();  // This creates the folder
            }


            String timestamp = new SimpleDateFormat("yyyyMMdd-HHmmss").format(new Date());
            String filename = "receipts/" + timestamp + ".txt";


            FileWriter writer = new FileWriter(filename);
            writer.write(order.getOrderSummary());
            writer.close();


            System.out.println("📄 Receipt saved to: " + filename);

        } catch (IOException e) {
            System.out.println("❌ Error saving receipt: " + e.getMessage());
        }
    }

}