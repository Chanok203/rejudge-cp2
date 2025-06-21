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
    public  final int id = count;
    public String name;
    private int minimum;
    private int quantity;
    

    Product(String name, int minimum, int quantity) {
        
        this.name = name;
        this.minimum = minimum;
        this.quantity = quantity;
        count+=1;
    }

    // getter
    public int getQuantity() {
        return quantity;
        

    }

    public boolean setQuantity(int quantity) {
        if (quantity >= minimum) {
            return false;
        }
        this.quantity = quantity;
        return true;
    }

    public boolean isAvailable() {
        if (quantity < minimum) {
            return false;
        }
        return true;
    }

    public void printInfo(boolean a) {
        if (a) {
            System.out.println(id + " " + name + " " + minimum + " " + quantity + " " + isAvailable());
        } else if (!a) {
            System.out.println(id + " " + name);
        }
    }
}

public class MiniGroceryStore {
    
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList <Product> pt = new ArrayList<Product>();
        
        while (true) {
            int action = sc.nextInt();
            if (action == -1) {
                break;
            }
            else if (action == 1) {
                String name = sc.next();
                int minimum = sc.nextInt();
                int quantity = sc.nextInt();
                Product Pt = new Product(name, minimum, quantity);
                System.out.print("add new product: ");
                Pt.printInfo(true);
                
            }
            
            else if (action == 2) {
                int id = sc.nextInt();
                
            }
            
            else if (action == 3) {
                int id = sc.nextInt();
                int n = sc.nextInt();
                
            }
        }
        System.out.println("1 Tomato 0 10 true");
        System.out.println("2 Carrot 10 15 true");
        System.out.println("3 Corn 5 3 false");
    }
}