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
    public int id;
    public String name;
    private int minimum;
    private int quanlity;

    public Product(String name, int minimum, int quanlity) {
        this.name = name;
        this.minimum = minimum;
        this.quanlity = quanlity;
        this.id = count++;
        if(this.minimum <1||this.quanlity <1){
            this.minimum =0;
        }
        }

    public int getQuantity() {
        return this.quanlity;
    }

    public boolean setQuantity(int set) {
        if (this.quanlity < this.minimum) {
            return false;
        } else {
            set = this.quanlity;
            return true;
        }
    }

    public boolean isAvailable() {
        if (this.quanlity - this.minimum > 0) {
            return true;
        } else {
            return false;
        }
    }

    public void printInfo(boolean check) {
        if (check) {
            System.out.print(this.id + " " + this.name + " " + this.minimum + " " + this.quanlity + " " + isAvailable());
          
        } else {
            System.out.println(this.id + " " + this.name);
           
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
                products.add(new Product(name, minimum, quantity));
                Product p = new Product(name, minimum, quantity);
                for(int i=0;i<products.size();i++){
                    System.out.println("add new product: ");
                }
                
            }
            // remove
            else if (action == 2) {
                int id = sc.nextInt();
                
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
