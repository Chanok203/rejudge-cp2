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
    public static final int id = count;
    public final String name;
    private int minimum = 0;
    private int quantity = 0;
    
    Product(String name, int minimum, int quantity){
        this.name = name;
        this.minimum = minimum;
        this.quantity = quantity;
        if(id == count){
            count++;
        }
    }

    public int getQuantity(){
        return this.quantity;
    }

    public boolean setQuantity(int set){
        if(set < minimum){
            return false;
        }else{
            return true;
        }
    }

    public boolean isAvailable(){
        if(minimum >= quantity){
            return true;
        }
        return false;
    }

    public void printInfo(boolean found){
        if(found){
            System.out.println(id + " " + name +" " + minimum + " " + quantity + " " + isAvailable());
        }else{
            System.out.println(id + " " + name);
        }
    }
}

public class MiniGroceryStore {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Product> products = new ArrayList<>();
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
                Product p = new Product(name, minimum, quantity);
                System.out.println("add new product: ");
            }
            // remove
            else if (action == 2) {
                int id = sc.nextInt();
                Product pa = new Product(null, action, id);
                if(pa.equals(id)){
                    Product p = products.get(id);
                    System.out.println("remove product: ");
                }else{
                    System.out.println("remove product: not found");
                }
            }
            // decrease quantity
            else if (action == 3) {
                int id = sc.nextInt();
                int n = sc.nextInt();
                if(id != n){
                    System.out.println("decrease quantity: not found");
                }else if(n <= 0){
                    System.out.println("decrease quantity: error n");
                }else{
                    Product p = products.get(n);
                    if(p.getQuantity() == 0 && p.setQuantity(n)){
                        System.out.println("decrease quantity: ");
                    }else{
                        System.out.println("decrease quantity: error");
                    }
                }
            }
        }
        Product p = new Product(null, 0, 0);
        p.printInfo(false);
    }
}