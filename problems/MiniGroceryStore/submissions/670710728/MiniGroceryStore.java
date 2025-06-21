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
    public static int count = 1;
    public int id;
    public String name;
    public int minimum;
    public int quantity;

    public Product(String name, int minimum, int quantity) {
        this.id = Product.count++;
        this.name = name;
        this.minimum = minimum;
        this.quantity = quantity;
    }

    public int getQuantity() {
        return quantity;
    }

    public boolean setQuantity(int c) {
        if (c < minimum) {
            return false;
        } else {
            this.minimum = c;
            return true;
        }
    }

    public boolean isAvailable() {
        if (minimum > quantity) {
            return false;
        } else {
            return true;
        }
    }

    public void printinfo() {
        System.out.println(id + " " + name + " " + minimum + " " + quantity + " " + isAvailable());
    }
}

public class MiniGroceryStore {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList <Product> product = new ArrayList<>();
        
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
                Product mini = new Product(name, minimum, quantity);
                product.add(mini);
                System.out.print("add new product: ");
                mini.printinfo();
                
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
        }
        for(int i = 0 ; i < product.size() ; i ++){
            
        }
       
    }
    
}
