/*
FILE: java
*/
/*
LANG: JAVA
COMPILER: JAVA
*/
import java.util.ArrayList;
import java.util.Scanner;
class Product {
    public static int count=0;
    public final int id;
    public String name;
    private int minimum;
    private int quantity;
    public Product(String name, int minimum, int quantity) {
        this.name = name;
        if (minimum<=0) {
            this.minimum = 0;
        }
        else {
            this.minimum = minimum;
        }
        if (quantity<=0) {
            this.quantity = 0;
        }
        else {
            this.quantity = quantity;
        }
        ++count;
        this.id = count;
    }
    public int  getQuantity() {
        return this.quantity;
    }
    public boolean setQuantity(int newQuantity) {
        if (newQuantity>this.minimum) {
            this.quantity = newQuantity;
            return true;
        }
        return false;
    }
    public boolean isAvailable() {
        if (this.quantity-this.minimum>0) {
            return true;
        }
        return false;
    }
    public void printInfo(boolean priVate) {
        if (priVate) {
            System.out.println(this.id+" "+this.name+" "+this.minimum+" "+this.quantity+" "+isAvailable());
        }
        else {
            System.out.println(this.id+" "+this.name);
        }
    }
}
public class MiniGroceryStore {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        ArrayList<Product> products = new ArrayList<>();
        while (true) {

            String line = input.nextLine();
            String[] parts = line.trim().split("\\s+");
            int action = Integer.parseInt(parts[0]);

            if (action == -1) {
                break;
            }
            else if (action == 1) {
                String name = parts[1];
                int minimum = Integer.parseInt(parts[2]);
                int quantity = Integer.parseInt(parts[3]);
                Product product = new Product(name, minimum, quantity);
                System.out.print("add new product: ");
                product.printInfo(true);
                products.add(product);
            }
            else if (action == 2) {
                int id = Integer.parseInt(parts[1]);
                boolean found = false;
                for (Product product : products) {
                    if (product.id == id) {
                        System.out.print("remove product: ");
                        product.printInfo(false);
                        products.remove(product);
                        found = true;
                        break;
                    }
                }
                if (!found) {
                    System.out.println("remove product: not found");
                }
            }
            else if (action == 3) {
                int id = Integer.parseInt(parts[1]);
                int n = Integer.parseInt(parts[2]);
                boolean found = false;
                for (Product product : products) {
                    if (product.id == id) {
                        found = true;
                        if (n<=0) {
                            System.out.println("decrease quantity: error n");
                        }
                        else {
                            product.getQuantity();
                            if (product.setQuantity(n)) {
                                System.out.print("decrease quantity: ");
                                product.printInfo(true);
                            }
                            else {
                                System.out.println("decrease quantity: error");
                            }
                        }
                    }
                }
                if (!found) {
                    System.out.println("decrease quantity: not found");
                }
            }
        }
        for (int i=1; i<=Product.count; i++) {
            for (Product product : products) {
                if (i == product.id) {
                    product.printInfo(true);
                }
            }
        }
        input.close();
    }
}
