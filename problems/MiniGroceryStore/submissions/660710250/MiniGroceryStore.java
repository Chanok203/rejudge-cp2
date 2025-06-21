/*
FILE: java
*/
/*
LANG: JAVA
COMPILER: JAVA
*/
import java.util.Scanner;

class Product {
    public int count = 0;
    public int id;
    public String name;
    private int minimum;
    private int quantity;

    Product(String name, int minimum, int quantity){
        this.name = name;
        this.minimum = minimum;
        this.quantity = quantity;
        this.id = id;
    }
    public int getQuantity(){
        return quantity;
    }
    public boolean setQuantity(int n){
        if(n > minimum){
            return true;
        }
        return false;
    }
    public boolean isAvailable(){
        int total = quantity - minimum;
        if(total >= 0){
            return true;
        }
        return false;
    }
    public void printInfo(boolean isAvailable){
        if(isAvailable == true){
            System.out.println(name + " "+ minimum + " " + quantity + " " + isAvailable);
        }
        else {
            System.out.println(id + name);
        }
    }
}
public class MiniGroceryStore1 {

    private static Product id;
    private static final Product ArrayList = id;
    private static final Product Product = null;

    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    
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
        System.out.print("add new product: " + action + " ");
        p.printInfo(true);
    }
    //remove
    else if (action == 2) {
        int id = sc.nextInt();

        Product p = new Product(null, action, id);
        if(id == p.id){
            System.out.println("remove product: " + action + " " + id);
            p.printInfo(true);
        }
        else {
            System.out.println("remove product: not found");
        }
    }
    // decrease quantity
    else if (action == 3) {
        int id = sc.nextInt();
        int n = sc.nextInt();
        Product p = new Product(null, n, n);
        // if(id == p.id){
        //     System.out.println("remove product: " + action + " " + id);
        //     p.printInfo(true);
        // }
        if(n <= 0) { 
            System.out.println("decrease quantity: error n");
        }
    }
    }
     //TODO: write your code here
    }
}
