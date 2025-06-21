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
    private int minimum;
    private int quantity;

    public Product(String name, int minimum, int quantity) {
        this.id = ((count++) / 2) + 1;
        this.name = name;
        this.minimum = minimum;
        if (this.minimum < 0) {
            this.minimum = 0;
        }
        this.quantity = quantity;
        if (this.quantity < 0) {
            this.quantity = 0;
        }
    }

    public int getQuantity() {
        return quantity;
    }

    public boolean setQuantity(int num) {
        if (num < quantity) {
            return false;
        } else {
            quantity = num;
            return true;
        }
    }

    public boolean isAvailable() {
        boolean check = quantity > (minimum);
        if (check)
            return check;
        return check;
    }

    public void printInfo(boolean found) {
        if (!found) {
            System.out.println(id + " " + name);
        } else {
            System.out.println(id + " " + name + " " + minimum + " " + quantity + " " + isAvailable());
        }
    }
}

public class MiniGroceryStore {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ArrayList<Product> pr = new ArrayList<>();
        while (true) {
            int action = sc.nextInt();
            // stop
            if (action == -1) {
                break;
            }
            // add
            else if (action == 1) {
                String name = sc.next();
                int minimum = sc.nextInt();
                int quantity = sc.nextInt();
                pr.add(new Product(name, minimum, quantity));
                System.out.print("add new product: ");
                Product pro = new Product(name, minimum, quantity);
                pro.printInfo(true);
            }
            // remove
            else if (action == 2) {
                int id = sc.nextInt();
                if (id > pr.size()) {
                    pr.get(id - 1).printInfo(false);
                    System.out.println("remove product: not found");
                }
            }
            // decrease quantity
            else if (action == 3) {
                int id = sc.nextInt();
                int n = sc.nextInt();

                if (n < 0 || n == 0) {
                    System.out.println("decrease quantity: error n");
                }
            }
        }
        for (int i = 0; i < pr.size(); i++) {
            pr.get(i).printInfo(true);
        }
    }
}
