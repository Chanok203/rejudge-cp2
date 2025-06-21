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
    public static int count;
    public int id;
    String name;
    private int minimum;
    private int quantity;

    Product(String name, int minimum, int quantity) {
        this.count = count++;
        this.name = name;
        this.minimum = minimum;
        this.quantity = quantity;
        this.minimum = count;
    }

    public int getQuantity() {
        return quantity;
    }

    public boolean setQuantity(int setquantity) {
        if (setquantity > minimum) {
            setquantity = quantity;
            return true;
        }
        return false;
    }

    public boolean isAvailable() {
        if (setQuantity(quantity) == true) {
            return true;
        }
        return false;
    }

    public void printInfo(boolean isPrivate) {
        if (isPrivate == true) {
            System.out.println(id + " " + name + " " + minimum + " " + quantity + " " + isAvailable());
        } else {
            System.out.println(id + " " + name);
        }
    }
}

public class MiniGroceryStore {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        Product[] P = new Product[N];
        while (true) {
            int action = sc.nextInt();
            // stop
            if (action == -1) {
                break;
            }
            // add
            else if (action == 1) {
                for (int i = 0; i < N; i++) {
                    String name = sc.next();
                    int minimum = sc.nextInt();
                    int quantity = sc.nextInt();
                    P[i] = new Product(name, minimum, quantity);
                    System.out.println("add new product: ");
                    P[i].printInfo(true);
                }
            }
            // remove
            else if (action == 2) {
                int id = sc.nextInt();
                if(id >= 0){
                    
                }
            }
            // decrease quantity
            else if (action == 3) {
                int id = sc.nextInt();
                int n = sc.nextInt();
                // TODO: write your code here
            }
        }
        
    }
}