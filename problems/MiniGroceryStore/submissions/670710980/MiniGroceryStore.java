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

    Product(String name, int minimum, int quantity) {
        this.name = name;
        this.minimum = minimum;
        this.quantity = quantity;
        this.id = count;

    }

    public int getQuantity() {
        return quantity;
    }

    public boolean setQuantity(int n) {
        if (n >= minimum) {
            quantity = n;
            return true;
        } else {
            return false;
        }
    }

    public boolean isAvailable() {
        if (minimum > quantity) {
            return false;
        } else {
            return true;
        }
    }

    public void printInfo(boolean isAvailable) {
        if (isAvailable) {
            System.out.println(id + " " + name + " " + minimum + " " + quantity + " " + isAvailable);
        } else {
            System.out.println(id + " " + name);
        }
    }

}

public class MiniGroceryStore {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Product> pd = new ArrayList<Product>();
        while (true) {
            int action = sc.nextInt();
            if (action == -1) {
                for (int i = 0; i < pd.size(); i++) {

                }
            }

            else if (action == 1) {
                String name = sc.next();
                int minimum = sc.nextInt();
                int quantity = sc.nextInt();
                pd.add(new Product(name, minimum, quantity));
            }

            else if (action == 2) {
                int id = sc.nextInt();
                for (int i = 0; i < pd.size(); i++) {
                    Product c = pd.get(i);
                    if (c.id == id) {
                        System.out.println("remove product: ");

                    } else {
                        System.out.println("remove product: not found");
                    }
                }

            }

            else if (action == 3) {
                int id = sc.nextInt();
                int n = sc.nextInt();
                for (int i = 0; i < pd.size(); i++) {
                    Product c = pd.get(i);
                    if (c.id != id) {
                        System.out.println("decrease quantity: not found");
                    }
                    if (n <= 0) {
                        System.out.println("decrease quantity: error n");
                    } else {
                        System.out.println("decrease quantity: error");

                    }
                }

            }
        }
    }
}