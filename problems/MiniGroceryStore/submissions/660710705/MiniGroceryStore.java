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
        count++;
        this.id = count;
    }

    public int getQuantity() {
        return quantity;
    }

    public boolean setQuantity(int newquantity) {

        if (newquantity < minimum) {
            return false;
        } else {
            if (quantity - newquantity<=0) {
                quantity =0;
            }
            else{
                this.quantity -= newquantity;

            }
            return true;
        }

    }

    public boolean isAvailable() {
        if (quantity - minimum > 0) {
            return true;
        } else {
            return false;
        }
    }

    public void printInfo(boolean pri) {
        boolean isAvailable = true;
        if (pri) {
            if (minimum >= quantity) {
                isAvailable = false;
            }
            System.out.printf("%d %s %d %d %b", id, name, minimum, quantity, isAvailable);
            System.out.println();
        } else {
            System.out.printf("%d %s", id, name);
            System.out.println();
        }
    }
}

public class MiniGroceryStore {
    void addProduct(ArrayList<Product> pd, String name, int minimum, int quantity) {
        if (minimum<0) {
            minimum =0;
        }
        if (quantity<0) {
            quantity =0;
        }
        Product add = new Product(name, minimum, quantity);
        pd.add(add);
        System.out.print("add new product: ");
        add.printInfo(true);
    }

    void removeProduct(ArrayList<Product> pd, int Id) {

        for (int i = 0; i < pd.size(); i++) {
            Product collect = pd.get(i);
            if (collect.id == Id) {
                System.out.print("remove product: ");
                pd.remove(collect);
                collect.printInfo(false);
                return;
            }
        }
        System.out.println("remove product: not found ");
    }

    void reduceProduct(ArrayList<Product> pd, int Id, int n) {

        if (n <= 0) {
            System.out.println("decrease quantity: error n");
        }
        for (int i = 0; i < pd.size(); i++) {
            Product collect = pd.get(i);
            if (collect.id == Id) {
                if (collect.setQuantity(n) == true) {
                    System.out.print("decrease quantity: ");
                    collect.getQuantity();
                    
                    collect.printInfo(true);
                }
            }

            return;
        }
        System.out.println("decrease product: not found ");
    }


public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    ArrayList<Product> pd = new ArrayList<>();
    MiniGroceryStore obj = new MiniGroceryStore();

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
            obj.addProduct(pd, name, minimum, quantity);

        }
        // remove
        else if (action == 2) {
            int id = sc.nextInt();
            obj.removeProduct(pd, id);
        }
        // decrease quantity
        else if (action == 3) {
            int id = sc.nextInt();
            int n = sc.nextInt();
            obj.reduceProduct(pd, id, n);
        }
    }
    for(int i = 0; i<pd.size();i++){
        Product collect = pd.get(i);
        collect.printInfo(true);
    }
}
}