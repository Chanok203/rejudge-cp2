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

    Product(String name,int minimum,int quantity){
        this.id = ++count;
        this.name = name;
        if (minimum<0) {
            this.minimum = 0;
        }else{
            this.minimum = minimum;
        }
        if (quantity<0) {
            this.quantity = 0;
        }else{
            this.quantity = quantity;
        }
        
    }

    public int getQuantity(){
        return quantity;
    }

    public boolean setQuantity(int newQ){
        if (newQ>minimum) {
            this.quantity = quantity - newQ;
            return true;
        }
        return false;
    }

    public boolean isAvailable(){
        if (minimum>=quantity|| minimum == quantity) {
            return false;
        }
            return true;
        
        
    }

    public void printInfo(boolean B){
        if (B == true) {
            System.out.print(id + " " + name + " " + minimum + " " + quantity + " " + isAvailable());
            
        }else{
            System.out.print(id + " " + name);
            
        }
        System.out.println();
    }
}
public class MiniGroceryStore {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    ArrayList<Product> products = new ArrayList<>();
    int u = 0;
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
                products.add(new Product(name, minimum, quantity));
                boolean B = true;
                System.out.print("add new product: ");
                products.get(u).printInfo(B);
                u++;

            }
            // remove
            else if (action == 2) {
                int id = sc.nextInt();
                
                if (id<products.size()) {
                    System.out.print("remove product: ");
                    products.get(id).printInfo(false);
                    products.remove(id);
                }else{
                    System.out.println("remove product: not found");
                }
            }
                // decrease quantity
            else if (action == 3) {
                int id = sc.nextInt();
                int n = sc.nextInt();
                int k =0;
                if (id<products.size()) {
                    System.out.print("decrease quantity: ");
                    products.get(id-1).getQuantity();
                    products.get(id-1).setQuantity(n);
                    products.get(id-1).printInfo(true);
                }else{
                    System.out.println("decrease quantity: not found");
                }
                if (n<0) {
                    System.out.println("decrease quantity: error n");
                }
            }
        }
        for (int i = 0; i < products.size(); i++) {
            products.get(i).printInfo(true);
        }
        
    }
}
