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
    public final int id = count;
    public final String name;
    private int minimum;
    private int quantity;
    public Product(String name, int minimum, int quantity) {
        this.name = name;
        this.minimum = minimum;
        if(this.minimum < 0){
            this.minimum = 0;
        }
        this.quantity = quantity;
        if(this.quantity < 0){
            this.quantity = 0;
        }
    }
    
    public int getQuantity() {
        return this.quantity;
    }
    
    public boolean setQuantity(int quantity) {
        if (this.quantity > minimum) {
            this.quantity = quantity;
            return true;
        }
        return false;
    }
    
    public boolean isAvailable() {
        if(this.quantity < this.minimum){
            return false;
        } else {
            return true;
        }
    }
    
    public void printlnfo(boolean check){
        
        if(check){
            System.out.println(this.id +" "+this.name+" "+this.minimum+" "+this.quantity+" "+isAvailable());
        } else {
            System.out.println(this.id +" "+ this.name);
        }
    }

}

public class MiniGroceryStore {
    public static int FindId(ArrayList<Product> p, int id){
        for (int i = 1; i <= p.size(); i++) {
            if(p.get(i).equals(id)){
                return i - 1;
            }
        }
        return -1;
    }

    

    public static void main(String[] args) {
        ArrayList<Product> p = new ArrayList<Product>();
        Scanner sc = new Scanner(System.in);
        while (true) {
            int action = sc.nextInt();
            boolean check = true;
            if (action == -1) {
                break;
            } else if (action == 1) {
                String name = sc.next();
                int minimum = sc.nextInt();
                int quantity = sc.nextInt();
                p.add(new Product(name, minimum, quantity));
                Product.count++;
                System.out.print("add new product: ");
                Product a = new Product(name, minimum, quantity);
                a.printlnfo(check);
            }
            else if (action == 2) {
                int id = sc.nextInt();
                check = false;
                
                if(FindId(p, id) == -1){
                    System.out.println("remove product: not found");
                }else {
                    p.remove(FindId(p, id));
                    System.out.print("remove product: ");
                    Product a = new Product(null, action, id);
                    a.printlnfo(check);
                }
            }
            
            else if (action == 3) {
                int id = sc.nextInt();
                int n = sc.nextInt();
                boolean invalid_size = id < p.size() || id > p.size();
                if(invalid_size){
                    System.out.println("decrease quantity: not found");
                }else if(n <= 0){
                    System.out.println("decrease quantity: error n");
                } else {
                    Product a = new Product(null, n, n);
                    a.printlnfo(check);
                }
            }
        }

    }
    
}