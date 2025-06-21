/*
FILE: java
*/
/*
LANG: JAVA
COMPILER: JAVA
*/
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
        this.quantity = quantity;
    }

    public void getQuantity() {
        return quantity;
    }

    public boolean setQuantity(int quantity) {
        if (quantity < minimum) {
            return false;
        } else {
            return true;
        }
    }

    public boolean isAvailable(){
        return setQuantity(quantity);
    }

    public void printlnfo(boolean printed){
        if(printed){
            System.out.println(id + " " + name + " " + minimum + " " + quantity + " " + isAvailable());
        } else if(!printed){
            System.out.println(id + " " + name);
        }
    }
}

public class MiniGroceryStore {
        public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();  
        Product[] product = new Product[N];
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
                System.out.println("add new product: ");
                product.printlnfo();
            }
            // remove
            else if (action == 2) {
                int id = sc.nextInt();
                System.out.println("remove product: ");
                product.printlnfo();
            }
            // decrease quantity
            else if (action == 3) {
                int id = sc.nextInt();
                int n = sc.nextInt();
                if(!id){
                    System.out.println("decrease quantity: not found");
                }
                if(n<=0){
                    System.out.println("decrease quantity: error n");
                } 
                if(getQuantity()==id && setQuantity()==n){
                    System.out.println("decrease quantity: ");
                } else { 
                    System.out.println("decrease quantity: error");
                }
            }
        }
        return -1;
    }
}