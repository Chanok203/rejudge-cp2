/*
FILE: java
*/
/*
LANG: JAVA
COMPILER: JAVA
*/
import java.util.Scanner;

class Product {
    public static int count = 1;
    public int id;
    public String name;
    private int minimum;
    private int quantity;

    Product(String name, int minimum, int quantity) {
        this.name = name;
        this.minimum = minimum;
        this.quantity = quantity;
        this.id = count;
    }

    public int getQuantity() {
        return quantity;
    }

    public boolean setQuantity(int num) {
        num = quantity;
        if (num < minimum) {
            return false;
        } 
        else {
            return true;
        }
    }

    public boolean isAvailable() {
        return setQuantity(minimum);
    }

    public void printInfo(boolean yourself) {
        if (!yourself) {
            count++;
            System.out.println(id + " " + name + " " + minimum + " " + quantity + " " + isAvailable());
        } else {
            count++;
            System.out.println(id + " " + name);
        }
    }
}

public class MiniGroceryStore {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Product po = new Product(null, 0, 0);
        while (true) {
            int action = sc.nextInt();
            if (action == -1) {
                break;
            }
            else if (action == 1) {
                String name = sc.next();
                int minimum = sc.nextInt();
                int quantity = sc.nextInt();
                Product p = new Product(name, minimum, quantity);
                System.out.println("add new product: "+ Product.count+" "+name+" "+minimum+" "+quantity+" "+p.isAvailable());
                p.printInfo(false);
            }
            else if (action == 2) {
                int id = sc.nextInt();
                if(id > 0){
                    System.out.println("remove product: ");
                }
                else{
                    System.out.println("remove product: not found ");
                }
                po.printInfo(false);
            }
            
            else if (action == 3) {
                int id = sc.nextInt();
                int n = sc.nextInt();
                
            }
        }
    }
}