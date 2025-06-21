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
    public final int id = ++count;
    public final String name;
    private int minimum;
    private int quantity;

    Product(String name, int minimum, int quantity) {
        this.name = name;
        this.minimum = minimum;
        this.quantity = quantity;
    }

    public int getQuantity() {
        return this.quantity;
    }

    public boolean setQuantity(int n) {
        if ( n < this.minimum) {
            return false;
        } else {
            this.quantity = this.quantity - n ;
            return true;
        }
    }

    public boolean isAvailable() {
        if (this.quantity - this.minimum <= 0) {
            return false;
        } else {
            return true;
        }
    }

    public void printInfo(boolean setQuantity) {
        if (!setQuantity) { // private
            System.out.print(id + " " + name + " " + minimum + " " + quantity + " " + isAvailable());
        } else { // public
            System.out.print(id + " " + name);
        }
    }
}

public class MiniGroceryStore {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Product> product = new ArrayList<>();
        
        while (true) {
            int action = sc.nextInt();
            // stop
            if (action == -1) {
                break;
            }
            // add
            else if (action == 1) {
                String name = sc.next();
                int minimum = sc.nextInt(); // A need
                int quantity = sc.nextInt(); // all product
                if (minimum < 0) { minimum = 0 ; }
                if (quantity < 0) { quantity = 0;}
                Product pd = new Product(name, minimum, quantity);
                product.add(pd);
                System.out.print("add new product: ");
                pd.printInfo(false); // printInfo private
                System.out.println();
            }
            // remove
            else if (action == 2) {
                int id = sc.nextInt();
                if (id > product.size() || id <= 0) {
                    System.out.println("remove product: not found");
                } else {
                    Product pd = product.get( id - 1);
                    product.remove(pd);
                    System.out.print("remove product: ");
                    pd.printInfo(true); // printInfo public
                }
            }
            // decrease quantity
            else if (action == 3) {
                int id = sc.nextInt();
                int n = sc.nextInt();
                Product pd = product.get(id - 1);
                if ( id > product.size() || id <= 0 ) {
                    System.out.println("decrease quantity: not found");
                } else if (n < 1) {
                    System.out.println("decrease quantity: error n");
                } else {
                    pd.getQuantity();
                    if (pd.setQuantity(n)) {
                        System.out.print("decrease quantity: ");
                        pd.printInfo(false); // printInfo private
                        System.out.println();
                    } else {
                        System.out.println("decrease quantity: error");
                    }
                }
            }
        }
        for (int i = 0; i < product.size(); i++) {
            Product pd = product.get(i);
            pd.printInfo(false);
            System.out.println();
        }
    }
}