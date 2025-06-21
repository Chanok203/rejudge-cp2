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
    public static String printinfo;
    public  final int id;
    public  final String name;
    private int minimum;
    private int quantity;

    Product(String name, int minimum, int quantity){
        this.name = "product: ";
        this.minimum = minimum;
        this.quantity = quantity;
        this.id = (++Product.count);
        
    }
    public int getQuantity(){
        return this.quantity;
    }
    
    public boolean setQuantity(int newquantity){
        if(newquantity > this.minimum){
            this.quantity = newquantity;
            return true;
        }
        return false;
    }
    public boolean isAvailable(){
        if(quantity > minimum){
            return true;
        }

        return false;
    }
    public void printinfo(boolean pv){
        pv = true;
        if(pv = true){
            System.out.println(id + name + minimum + quantity + isAvailable());
        } else{
            System.out.println(id + name);
        }
    }
}

public class MiniGroceryStore {
    
    class Main{
        Product np = new Product(null, 0, 0);
        
    }
    public static void main(String[] args, boolean getQuantity) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Product> products = new ArrayList<>();
        while (true) {
            int action = sc.nextInt();
            
            if (action == -1) {
                return;
            }
            
            else if (action == 1) {
                String name = sc.next();
                int minimum = sc.nextInt();
                int quantity = sc.nextInt();
                Product np = new Product(name, minimum, quantity);
                products.add(np);
                System.out.println("add new product: " + Product.printinfo);
            }
            
            else if (action == 2) {
                int id = sc.nextInt();
                if(){
                    products.remove();
                    System.out.println("remove product: " + Product.printinfo);
                } else {
                    System.out.println("remove product not found");
                }
            }
            
            else if (action == 3) {
                int id = sc.nextInt();
                int n = sc.nextInt();
                if(){
                    System.out.println("“decrease quantity: not found");
                } else if(n <= 0){
                    System.out.println("decrease quantity: error n");
                } else if(n > 0){
                    
                }
            }
        }
        for (int i = 0; i < products.size(); i++) {
            
        }
    }
}


