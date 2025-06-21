/*
FILE: java
*/
/*
LANG: JAVA
COMPILER: JAVA
*/
import java.util.Scanner;
import java.util.ArrayList;

class Product {
    public static int count = 0;
    public final int id;
    public final String name;
    private int minimum;
    private int quantity;

    public Product(String name, int minimum, int quantity) {
        this.name = name;
        this.minimum = minimum;
        this.quantity = quantity;
        this.id = count+=1;
    }

    public int getQuantity() {
        return quantity;
    }

    public boolean setQuantity(int n) {
        if (n <= minimum) {
            return false;
        }
        n += quantity;
        return true;
    }

    public boolean isAvailable() {
        if (minimum >= quantity) {
            return false;
        } else {
            return true;
        }

    }

    public void printlnfo(boolean check) {
        check = true;
        if (check) {
            System.out.println(id + " " + name + " " + minimum + " " + quantity + " " + isAvailable());
        }
        System.out.println(id + " " + name+ " " +minimum + " " + quantity + " " + isAvailable());
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
            } else if (action == 1) {
                String name = sc.next();
                int minimum = sc.nextInt();
                int quantity = sc.nextInt();

                Product p = new Product(name, minimum, quantity);
                products.add(p);
                System.out.print("add new product: ");
                p.printlnfo(false);
            } else if (action == 2) {
                int id = sc.nextInt();

                for (int i = 0; i < products.size(); i++) {
                    if (products.get(id).equals(products)) {
                        System.out.println("remove product: not found");
                    } else {
                        products.remove(products);
                        System.out.println("remove product");
                        products.get(id).printlnfo(false);
                    }
                }

            } else if (action == 3) {
                int id = sc.nextInt();
                int n = sc.nextInt();
                if (n <= 0) {
                    System.out.println("decrease quantity: error n");
                } else if (products.get(id).equals(products)) {
                    System.out.println("decrease quantity: not found");
                } else {
                    products.get(id).getQuantity();
                    // products.get(id).setQuantity();
                    System.out.println("decrease quantity: ");
                    products.get(id).printlnfo(false);
                }
                System.out.println("decrease quantity: error");
            }
        }
        // products.get(id).printlnfo(false);
    }
}
