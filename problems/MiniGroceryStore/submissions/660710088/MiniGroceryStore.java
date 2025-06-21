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
    public int count = 0;
    public int id = 0;
    public String name;
    private int minimum;
    private int quantity;
    

    Product(String name, int minimum, int quantity) {
        this.name = name;
        this.minimum = 0;
        this.quantity = 0;
        this.id = count;
        
    }

    public int getQuantity() {
        return quantity;
    }

    public boolean setQuantity(int n){
        if (n>=minimum) {
            return false;
        }
        else{
            quantity = n;
            return true;
        }
    }

    public boolean isAvailable(){
        boolean b = false;
        if (quantity <= minimum) {
            return true;
        }
        return b;
    }
    public void printInfo(boolean a){
        
        if (a) {
            System.out.println(id +" "+ name +" "+minimum +" "+quantity +" "+isAvailable());
        }
        else{
            System.out.println(id +" "+name);
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
    System.out.print("add new product:"+" ");
    p.printInfo(false);
    
    }
    // remove
    else if (action == 2) {
    int id = sc.nextInt();
    Product i = new Product(null, action, id);
    if (id==0) {
        System.out.print("remove product:"+" ");
        i.printInfo(false);
    }
    else{
        System.out.print("remove product: not found"+" ");
    }
    }
    // decrease quantity
    else if (action == 3) {
    int id = sc.nextInt();
    int n = sc.nextInt();
    Product in = new Product(null, n, n);
    if (id<=0) {
        System.out.print("decrease quantity: not found"+" ");
    }
    if (n<0) {
        System.out.print("decrease quantity: error n"+" ");
    }
    else{
        in.getQuantity();
        in.setQuantity(n);

    }

    }
    }
    System.out.println(products);
    }
}
