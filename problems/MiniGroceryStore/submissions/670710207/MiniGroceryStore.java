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
    public int count=0;
    public final int id;
    public String name;
    private int minimum;
    private int quantity;

    Product(String name, int minimum, int quantity) {
        this.name = name;
        this.minimum = minimum;
        this.quantity = quantity;
        this.id = count++;
        
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

    public boolean setQuantity(int q) {
        this.quantity = q;
        if (q < minimum) {
            return false;
        } else {
            q += count;
            return true;
        }
    }

    public boolean isAvailable() {
        if (minimum <= quantity) {
            return true;
        } else {
            return false;
        }
    }

    public void printlnfo(boolean t) {
        if (t = true) {
            System.out.print(id + " ");
            System.out.print(name + " ");
            System.out.print(minimum + " ");
            System.out.print(quantity + " ");
            System.out.println(isAvailable());
        } else if (t = false) {
            System.out.print(id+" ");
            System.out.print(name+" ");
        }
    }
}

public class MiniGroceryStore {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Product> products = new ArrayList<Product>();
        
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
                Product pdProduct = new Product(name, minimum, quantity);
                System.out.print("add new product: ");
                pdProduct.printlnfo(true);
            } 
            
            
            else if (action == 2) {
                int id = sc.nextInt();
                if (id > 0) {
                    products.remove(id);
                    System.out.println("remove product: " + products);
                } else {
                    System.out.println("remove product: not found");
                }

            }
            // decrease quantity
            else if (action == 3) {
                int id = sc.nextInt();
                int n = sc.nextInt();
                if (id <= 0) {
                    System.out.println("decrease quantity: not found");
                }
                if (n <= 0) {
                    System.out.println("decrease quantity: error n");
                }
                if (id > 0 && n > 0) {

                }
                else {
                    System.out.println("decrease quantity: error");
                }

            }

        }

    }
}