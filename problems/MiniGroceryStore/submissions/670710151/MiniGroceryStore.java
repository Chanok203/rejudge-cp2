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
    public final int id;
    public final String name;
    private int minimum;
    private int quantity;

    Product(String name, int minimum, int quantity) {
        this.name = name;
        if(minimum<0){
            this.minimum =0;
        }
        else{
            this.minimum = minimum;
        }
        if(quantity<0){
            this.quantity =0;
        }
        else{
            this.quantity = quantity;
        }
        this.count++;
        this.id = count;
    }

    public int getQuantity() {
        return this.quantity;
    }

    public boolean setQuantity(int n) {
        if(n<=this.quantity&&isAvailable()){
            this.quantity = this.quantity - n;
            return true;
        }
        else if (n>=this.minimum&&n<=this.quantity) {
            this.quantity = this.quantity - n;
            return true;
        } else {
            return false;
        }
    }

    public boolean isAvailable() {
        if ((this.quantity - this.minimum) > 0) {
            return true;
        } else {
            return false;
        }
    }

    public void printInfo(boolean t) {
        if (t) {
            System.out.println((this.id) + " " + this.name + " " + this.minimum + " " +
                    this.quantity + " " + isAvailable());
        } else {
            System.out.println(this.id + " " + this.name);
        }
    }
}

public class MiniGroceryStore {
    static int getID(ArrayList<Product> products, int id) {
        for(int i =0;i<products.size();i++){
            if(products.get(i).id==id){
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Product> products = new ArrayList<Product>();
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
                System.out.print("add new product: ");
                products.get(products.size()-1).printInfo(true);
            }
            // remove
            else if (action == 2) {
                int id = sc.nextInt();
                int t = getID(products,id);
                if (t>=0) {
                    System.out.print("remove product: ");
                    products.get(t).printInfo(false);
                    products.remove(t);
                    
                } else {
                    System.out.println("remove product: not found");
                }
            }
            // decrease quantity
            else if (action == 3) {
                int id = sc.nextInt();
                int n = sc.nextInt();
                int t = getID(products,id);
                if (t>=0) {
                    if (n <= 0) {
                        System.out.println("decrease quantity: error n");
                    } else {
                        int g =products.get(t).getQuantity();
                        boolean p = products.get(t).setQuantity(n);
                        if (p) {
                            System.out.print("decrease quantity: ");
                            products.get(t).printInfo(true);
                        } else {
                            System.out.println("decrease quantity: error");
                        }
                    }
                } else {
                    System.out.println("decrease quantity: not found");
                }
            }
        }
        for (int i = 0; i < products.size(); i++) {
            products.get(i).printInfo(true);
        }
    }
}
