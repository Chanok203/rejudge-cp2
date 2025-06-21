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
    int count;
    int id;
    String name;
    private int minimum;
    private int quantity;

    public Product(String name, int minimum, int quantity) {
        this.name = name;
        this.minimum = minimum;
        this.quantity = quantity;
        count = 0;
        id=1;
    }

    public int getQuantity() {
        return quantity;
    }

    public boolean setQuantity(int setquantity) {
        if (setquantity < minimum) {
            minimum = 0;

            return false;
        }
        quantity = setquantity;
        return true;
    }

    public boolean isAvailable() {
        if (minimum > quantity) {

            return false;
        }

        return true;
    }

    public void printInfo() {
        System.out.println(id + " " + name + " " + minimum + " " + quantity);
        id+=1;
    }

}

public class MiniGroceryStore {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<MiniGroceryStore> miniGroceryStores = new ArrayList<>();

        while (true) {
            int action = sc.nextInt();
            if (action == -1) {
                break;

            }

            else if (action == 1) {

                String name = sc.next();
                int minimum = sc.nextInt();
                int quantity = sc.nextInt();
                Product product = new Product(name, minimum, quantity);
                System.out.print("add new product:");
               product.printInfo();
            }

            else if (action == 2) {
                int id = sc.nextInt();

            }

            else if (action == 3) {
                int id = sc.nextInt();
                int n = sc.nextInt();

            }
        }

    }
}