/*
FILE: java
*/
/*
LANG: JAVA
COMPILER: JAVA
*/
import java.util.Scanner;
import java.util.ArrayList;
// TODO: write your code here
class Product {
    public static int count = 0;
    public final int id;
    public String name;
    private int minimum;
    private int quantity;
    Product(String name, int minimum, int quantity){
        this.name = name;
        this.minimum = minimum;
        this.quantity = quantity;
        this.id = ++Product.count;
    }

    public int getQuantity(){
        return this.quantity;
    }

    public boolean setQuantity(int x){
        if(x < this.minimum){
            return false;
        }
        this.quantity = x;
        return true;
    }

    public boolean isAvailable(){
        if(this.minimum >= quantity){
            return false;
        }
        return true;
    }

    public void printInfo(boolean print){
        if(print){
            if(this.minimum < 0){
                this.minimum = 0;
            }
            if(this.quantity < 0){
                this.quantity = 0;
            }
            System.out.print(this.id + " " + this.name + " " + this.minimum + " " + this.quantity + " " + this.isAvailable());
            System.out.println();
        }
        else{
            System.out.print(this.id + " " + this.name);
            System.out.println();
        }

    }

}
public class MiniGroceryStore {
    //code
 public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
        ArrayList<Product> products = new ArrayList<>();
        while (true) {
            int action = sc.nextInt();
            // stop
            if (action == -1) {
                for(int i = 0; i<products.size(); i++){
                    products.get(i).printInfo(true);
                }
                break;
            }
        // add
            else if (action == 1) {
                String name = sc.next();
                int minimum = sc.nextInt();
                int quantity = sc.nextInt();
                Product p = new Product(name, minimum, quantity);
                products.add(p);
                System.out.print("add new product: ");
                p.printInfo(true);
            }
        // remove
            else if (action == 2) {
                boolean found = false;
                int id = sc.nextInt();
                for(int i = 0;i<products.size(); i++){
                    Product p = products.get(i);
                    if(p.id==id){
                        products.remove(p);
                        System.out.print("remove product: ");
                        p.printInfo(false);
                        found = true;
                    }
                }
                if(!found){
                    System.out.println("remove product: not found");
                }
            }
        // decrease quantity
            else if (action == 3) {
                int id = sc.nextInt();
                int n = sc.nextInt();
                // TODO: write your code here
            }
        }
    // TODO: write your code here
    }
}