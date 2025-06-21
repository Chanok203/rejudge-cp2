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
    public int count=1;
    public final int id = 0;
    public final String name;
    private int minimum;
    private int quantity;

    public Product(String name, int minimum, int quantity) {
        
        
        this.name = name;
        this.minimum = minimum;
        this.quantity = quantity;
        this.count += this.id ;
    }

    public int getQuantity() {
        return this.quantity;
    }

    public boolean setQuantity(int k) {
        if (k < this.minimum) {
            return false;
        } else {
            this.quantity += k;
            return true;
        }
    }

    public boolean isAvailable() {
        if (this.quantity > this.minimum) {
            return true;

        } else {
            return false;
        }
    }

    public void printInfo(boolean p) {
        if (p == true) {
            
            System.out.print(this.id+this.count + " ");
            System.out.print(this.name + " ");
            System.out.print(this.minimum + " ");
            System.out.print(this.quantity + " ");
            System.out.println(isAvailable() + " ");
            this.count++;
        } else {
            System.out.print(this.id + " ");
            System.out.println(this.name + " ");
        }
    }

}

public class MiniGroceryStore {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Product> p1 = new ArrayList<>();
        
        int cnt=1;
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
                Product r1 = new Product(name, minimum, quantity);
                System.out.print("add new product: ");
                r1.printInfo(true);
                
                
                
            
                
            }
            // remove
            else if (action == 2) {
                int id = sc.nextInt();
                Product l = new Product(null, id, cnt);
                if(id==cnt){
                    p1.remove(id);
                    System.out.println("remove product: ");
                    l.printInfo(false);
                }else{
                    System.out.println("remove product not found");
                }
                
            }
            // decrease quantity
            else if (action == 3) {
                int id = sc.nextInt();
                int n = sc.nextInt();
                if(n<=0){
                    System.out.println("decrease quantity: error n");
                }
            }
        }
        
    }
}
