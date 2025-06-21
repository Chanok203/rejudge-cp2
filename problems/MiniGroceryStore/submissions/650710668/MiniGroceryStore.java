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
    static public int count = 0;
    public final int id;
    public final String name;
    private int minimum;
    private int quantity;

    Product(String name, int minimum, int quantity) {
        this.name = name;
        this.minimum = minimum;
        this.quantity = quantity;
        this.id = count++;
    }

    public int getQuantity() {
        return quantity;
    }

    public boolean setQuantity(int new_quantity) {
        if(new_quantity > minimum) {
            this.quantity = new_quantity;
            return true;
        }else {
            return false;
        }
    }

    public boolean isAvalible() {
        boolean wow =false;
        if(minimum > 0) {
            System.out.println("true");
            wow = true;
        }
        System.out.println("false");
        return wow;
    }
    
    public void printInfo(boolean check) {
        if(check) {
            System.out.println(id + " " + name + " " + minimum + " " + quantity + isAvalible());
        }else {
            System.out.println(id + " " + name);
        }
    }
}

public class MiniGroceryStore {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Product> products = new ArrayList<>();
        Product product = null;
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
                boolean check = true;
                // TODO: write your code here
                products.add(new Product(name, minimum, quantity));
                System.out.println("add new product: ");

            }
            // remove
            else if (action == 2) {
                int id = sc.nextInt();
                // TODO: write your code here
                for(int i=0; i<products.size(); i++) {
                    if(products.equals(id)) {
                        products.remove(id);
                        System.out.println("remove product " + products);
                    }else {
                        System.out.println("remove product not found");
                    }
                }
            }
            // decrease quantity
            else if (action == 3) {
                int id = sc.nextInt();
                int n = sc.nextInt();
                // TODO: write your code here

            }
        }
        // TODO: write your code here
        for(int i=0; i<products.size(); i++) {
            product.printInfo(true);
        }
    }
}
