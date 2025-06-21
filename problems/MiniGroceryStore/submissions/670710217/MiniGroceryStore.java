/*
FILE: java
*/
/*
LANG: JAVA
COMPILER: JAVA
*/
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

// TODO: write your code here (ถาตองการใช lib อื่นสามารถ import เพิ่มได เชน ArrayList หรือMath เปนตน)
class Product {
    static public int count;
    public final int id;
    public final String name;
    private int minimum;
    private int quantity;

    Product(String name, int minimum, int quantity) {
        this.name = name;
        this.minimum = 0;
        this.quantity = 0;
        Product.count++;
        this.id = count;
    }

    public int getQuantity() {
        return quantity;
    }

    public boolean setQuantity(int x) {
        if (x >= minimum) {
            quantity = x;
            return true;
        } else {
            return false;
        }
    }

    public boolean isAvailable() {
        if (quantity > minimum){
            return true;
        } else {
            return false;
        }
    }

    public void printInfo(boolean a) {
        if (a) {
            System.out.println(id + " "+ name + " "+ minimum +" " + quantity +" "+ isAvailable());
        } else {
            System.out.println(id +" "+ name);
        }
    }

}

public class MiniGroceryStore {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ArrayList<Product> pd = new ArrayList<>();

        while (true) {
            int action = sc.nextInt();
            // stop
            if (action == -1) {
                pd.get(action).printInfo(true);
                break;
            }
            // add
            else if (action == 1) {
                String name = sc.next();
                int minimum = sc.nextInt();
                int quantity = sc.nextInt();
                pd.add(new Product(name, minimum, quantity));
                System.out.println("add new product:");
                pd.get(action).printInfo(true);
                
            }
            // remove
            else if (action == 2) {
                int id = sc.nextInt();
                boolean a = pd.get(id).equals(pd);
                if (a){
                    pd.remove(id);
                    System.out.println("“remove product: ");
                    pd.get(id).printInfo(true);
                }
            }
            // decrease quantity
            else if (action == 3) {
                int id = sc.nextInt();
                int n = sc.nextInt();
                if (n <= 0){
                    System.out.println("decrease quantity: error n");
                }
                // TODO: write your code here
            }
        }
        // TODO: write your code here
    }
}
