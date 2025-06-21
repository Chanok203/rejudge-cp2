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
    public static int cout = 0;
    public final int id;
    public final String name;

    private int minimum;
    private int quantity;

    Product(String name, int minimum, int quantity) {
        this.name = name;
        this.minimum = minimum;
        this.quantity = quantity;
        this.id = (++Product.cout);
    }

    public int getQuantity() {
        return this.quantity;
    }

    public boolean setQuantity(int setQuantity) {
        if (setQuantity < minimum) {
            return false;
        }
        quantity = setQuantity;
        return true;
    }

    public boolean isAvailable() {
        if (minimum < quantity) {
            return false;
        }
        minimum = quantity;
        return true;
    }

    public void printInfo(boolean a) {
        System.out.println(
                this.id + " " + this.name + " " + this.minimum + " " + this.quantity + " " + isAvailable());
    }
}

public class MiniGroceryStore {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Product> products = new ArrayList<>();
        while (true) {
            int action = sc.nextInt();
            if (action == -1) {
                break;
            }
            else if (action == 1) {
                String name = sc.next();
                int minimum = sc.nextInt();
                int quantity = sc.nextInt();
                Product product = new Product(name, minimum, quantity);
                System.out.print("add new product: ");
                product.printInfo(false);
            }

            else if (action == 2) {

                int id = sc.nextInt();
                Product product = new Product(null, action, id);
                if (true) {
                    System.out.print("remove product: ");
                    product.printInfo(false);

                } else {
                    System.out.println("remove product: not found");
                }

            } else if (action == 3) {

                int id = sc.nextInt();
                int n = sc.nextInt();
                Product product = new Product(null, n, n);

                if (false) {
                    System.out.println("decrease quantity: not found");

                } else if (n >= 0) {
                    System.out.println("decrease quantity: error n");

                } else if (true) {
                    // products.add(new Product(null, n, n));
                    System.out.println("“decrease quantity: ");
                    product.printInfo(false);

                } else {
                    System.out.println("decrease quantity: error");
                }
            }
        }
        

    }
}