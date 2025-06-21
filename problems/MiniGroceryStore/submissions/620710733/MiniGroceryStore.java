/*
FILE: java
*/
/*
LANG: JAVA
COMPILER: JAVA
*/
import java.util.Scanner;
import java.util.ArrayList;

public class MiniGroceryStore {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        ArrayList<Product> p = new ArrayList<>();
        int c = 0;
        for (int i = 0;; i++) {
            int op = scan.nextInt();

            if (op == -1) {
                for (int j = 0; j < c ; j++) {
                    p.get(j).printInfo(p.get(j).isAvailable());
                    System.out.println();
                }
                break;
            } else if (op == 1) {
                String name = scan.next();
                int minimum = scan.nextInt();
                int quantity = scan.nextInt();
                c++;
                p.add(new Product(name, minimum, quantity));
                System.out.print("add new product: ");
                p.get(i).printInfo(p.get(i).isAvailable());
                System.out.println();
            } else if (op == 2) {
                int n = scan.nextInt();
                if (n > p.size()) {
                    System.out.println("remove product: not found");
                } else {
                    for (int j = 0; j < p.size(); j++) {
                        if (p.get(j).id + 1 == n) {

                        }
                    }
                }

            } else if (op == 3) {
                int n = scan.nextInt();
                if (n > p.size()) {
                    System.out.println("decrease quantity: not found");
                } else if (n <= 0) {
                    System.out.println("decrease quantity: error n");
                } else {
                    for (int j = 0; j < p.size(); j++) {
                        if (p.get(j).id + 1 == n) {
                            if (p.get(j).setQuantity(n) == true) {
                                p.get(j).printInfo(true);
                            } else {
                                System.out.println("decrease quantity: error");
                            }

                        }

                    }
                }

            }
        }

    }
}

class Product {
    public static int count = 0;
    public final int id = count;
    public String name;
    private int minimum;
    private int quantity;

    public Product(String name, int minimum, int quantity) {
        this.name = name;
        this.minimum = minimum;
        this.quantity = quantity;
        count++;
    }

    public int getQuantity() {
        return quantity;
    }

    public boolean setQuantity(int n) {
        if (n < minimum) {

            return false;
        }
        this.quantity = n;
        return true;
    }

    public boolean isAvailable() {
        if (quantity < 0) {
            quantity = 0;
        }
        if (minimum < 0) {
            minimum = 0;
        }
        if (quantity - minimum > 0) {
            // quantity -= minimum;
            return true;
        }
        return false;
    }

    void printInfo(boolean x) {

        if (id >= 0) {

            System.out.print(id + 1 + " " + name + " " + minimum + " " + quantity + " " + isAvailable());
        } else {

            System.out.print(id + 1 + " " + name);
        }

    }

}