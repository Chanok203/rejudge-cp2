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

    Product(String name, int m, int q) {
        this.name = name;
        this.minimum = m;
        this.quantity = q;

        this.id = ++Product.count;
        if (minimum < 0) {
            minimum = 0;
        }
        if (quantity < 0) {
            quantity = 0;
        }
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
        if (minimum < quantity) {
            return true;
        } else {
            return false;
        }
    }

    public void printInfo(boolean valid) {
        System.out.println(id + " " + name + " " + minimum + " " + quantity + " " + isAvailable());
    }
}

public class MiniGroceryStore {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ArrayList<Product> pd = new ArrayList<>();

        while (true) {
            int action = sc.nextInt();
            if (action == -1) {
                for (int i = 0; i < pd.size(); ++i) {
                    pd.get(i).printInfo(pd.get(Product.count - 1).isAvailable());
                }
                break;
            } else if (action == 1) {
                String name = sc.next();
                int minimum = sc.nextInt();
                int quantity = sc.nextInt();

                pd.add(new Product(name, minimum, quantity));
                System.out.print("add new product: ");
                pd.get(Product.count - 1).printInfo(pd.get(Product.count - 1).isAvailable());
            } else if(action == 2){
                int id = sc.nextInt() ;
            }
        }
    }
}
