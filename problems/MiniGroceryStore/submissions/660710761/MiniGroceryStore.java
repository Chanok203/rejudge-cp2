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
    public static int count = 0;
    public final int id;
    public final String name;
    private int minimum; // self
    private int quantity;

    public Product(String n, int m, int q) {
        this.name = n;
        if (m < 0) {
            this.minimum = 0;
        } else {
            this.minimum = m;
        }
        if (q < 0) {
            this.quantity = 0;
        } else {
            this.quantity = q;
        }

        this.id = ++Product.count;

    }

    public int getQuantity() {
        return quantity;
    }

    public boolean setQuantity(int newQ) {
        if (newQ < minimum) {
            return false;
        } else {
            quantity = newQ;
            return true;
        }
    }

    public boolean isAvailable() {
        if (minimum <= quantity) {
            return true;
        }
        return false;
    }

    boolean isPrivate = isAvailable();

    public void printInfo(boolean isPrivate) {
        if (isPrivate == true) {
            System.out.println(id + " " + name + " " + minimum + " " + quantity + " " + isAvailable());
        } else {
            System.out.println(id + " " + name);
        }

    }
}

public class MiniGroceryStore {

    static int findbtID(ArrayList<Product> P, int id) {
        for (int i = 0; i < P.size(); i++) {
            if (P.get(i).id == id) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        ArrayList<Product> P = new ArrayList<>(11);
        boolean isPrivate;

        while (true) {

            int action = scan.nextInt();
            // stop
            if (action == -1) {
                break;
            }
            // add
            else if (action == 1) {
                String name = scan.next();
                int minimum = scan.nextInt();
                int quantity = scan.nextInt();
                isPrivate = true;
                Product Pro = new Product(name, minimum, quantity);
                P.add(Pro);
                System.out.print("add new product: ");
                Pro.printInfo(isPrivate);
            }
            // remove
            else if (action == 2) {
                int id = scan.nextInt();
                int found = findbtID(P, id);
                if (found == -1) {
                    System.out.println("remove product: not found");
                } else {
                    P.remove(found);
                    System.out.println("remove product: ");
                    P.get(found).printInfo(false);
                }

            }
            // decrease quantity
            else if (action == 3) {
                int id = scan.nextInt();
                int n = scan.nextInt();
                int found = findbtID(P, id);

                if (found == -1) {
                    System.out.println("decrease quantity: not found");
                } else {
                    if (n <= 0) {
                        System.out.println("decrease quantity: error n");
                    } else {
                        P.get(found).getQuantity();
                        // ???
                        System.out.println("decrease quantity: ");
                    }
                }
            }

        }
        for (int i = 0; i < P.size(); i++) {
            P.get(i).printInfo(true);
        }
    }
}
