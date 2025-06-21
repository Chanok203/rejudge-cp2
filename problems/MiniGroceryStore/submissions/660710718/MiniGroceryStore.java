/*
FILE: java
*/
/*
LANG: JAVA
COMPILER: JAVA
*/
import java.util.*;
class Product {
    public static int count = 0;
    public final int id;
    public final String name;
    private int minimum;
    private int quantity;

    Product(String name, int minimum, int quantity){
        this.name = name;
        this.minimum = minimum;
        this.quantity = quantity;
        this.id = ++Product.count;

        if(minimum < 0){
            minimum = 0;
        }
        if(quantity < 0){
            quantity = 0;
        }
    }

    public int getQuantity(){
        return quantity;
    }

    public boolean setQuantity(int newQty){
        if(newQty < minimum){
            return false;
        }
        else {
            return true;
        }
    }

    public boolean isAvailable(){
        if(minimum > quantity){
            return false;
        }
        else {
            return true;
        }
    }

    public void printInfo(boolean privated){
        if(privated){
            System.out.println(id + " " + name + " " + minimum + " " + quantity + " " + isAvailable());
        }
        else {
            System.out.println(id + " " + name);
        }
    }
}
public class MiniGroceryStore {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Product> products = new ArrayList();
        while (true) {
            int action = sc.nextInt();
            if(action == -1){
                break;
            }
            else if(action == 1){
                String name = sc.next();
                int minimum = sc.nextInt();
                int quantity = sc.nextInt();
                boolean privated = true;
                System.out.print("add new product: ");
                product.printInfo(true);
            }
            else if(action == 2){
                int id = sc.nextInt();
                boolean privated = false;
                Product product = new Product(null, action, id);
                for (int i = 0; i < products.size(); i++) {
                    Product p = products.get(i);
                    if(p.equals(id)){
                        products.remove(p);
                        System.out.println("remove product: ");
                        product.printInfo(f);
                    }
                    else {
                        System.out.println("remove product: not found");
                    }
                }
                
            }
            else if(action == 3){
                int id = sc.nextInt();
                int n = sc.nextInt();
                for (int i = 0; i < products.size(); i++) {
                    Product p = products.get(i);
                    if(p.equals(id)){
                        if(n > 0){
                            product.getQuantity();
                            product.setQuantity(n);
                            System.out.println("decrease quantity: ");
                            product.printInfo(true);
                        }
                        else {
                            System.out.println("decrease quantity: error");
                        }
                    }
                    else {
                        System.out.println("decrease quantity: not found");
                    }
                }
            }
        }
        product.printInfo(true);
    }
}