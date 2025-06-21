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
    public String name;
    private int minimum;
    private int quantity;

    Product(String name, int minimum, int quantity) {
        this.name = name;
        if (minimum < 0) {
            this.minimum = 0;
        } else if (quantity < 0) {
            this.quantity = 0;
        }
        this.minimum = minimum;
        this.quantity = quantity;
        this.id = ++count;
    }

    int getQuantity() {
        return this.quantity;
    }

    public boolean setQuantity(int n) {
        if (n > this.minimum) {
            this.minimum = n;
            return true;
        } else {
            return false;
        }
    }

    public boolean isAvailable() {
        if (this.quantity > this.minimum) {
            return true;
        } else {
            return false;
        }
    }

    public void printlnfo(boolean t) {
        if (t) {
            System.out.println(
                    this.id + " " + this.name + " " + this.minimum + " " + this.quantity + " " + isAvailable());
        } else {
            System.out.println(this.id + " " + this.name);
        }
    }

}

public class MiniGroceryStore {
    MiniGroceryStore(ArrayList<Product> p, int id) {
        for (int i = 0; i < p.size(); i++) {
            if (p.get(i).id == id) {
                p.remove(i);
                System.out.println("remove product");
                p.get(i).printlnfo(false);
            } else {
                System.out.println("remove product: not found");
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Product> p = new ArrayList<>();

        while (true) {
            int action = sc.nextInt();
            int count = 0;
            // stop
            if (action == -1) {
                break;
            }
            // add
            else if (action == 1) {
                String name = sc.next();
                int minimum = sc.nextInt();
                int quantity = sc.nextInt();

                p.add(new Product(name, minimum, quantity));

                System.out.print("add new product: ");
                p.get(Product.count - 1).printlnfo(true);

            }
            // remove
            else if (action == 2) {
                int id = sc.nextInt();
                

            }
            // decrease quantity
            else if (action == 3) {
                int id = sc.nextInt();
                int n = sc.nextInt();
                
            }
            count++;
        }
        for (int i = 0; i < p.size(); i++) {
            p.get(i).printlnfo(true);
        }
    }
}
