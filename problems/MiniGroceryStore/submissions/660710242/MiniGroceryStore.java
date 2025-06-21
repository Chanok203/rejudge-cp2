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
        if (minimum <0) {
            this.minimum = 0;
        }else{
            this.minimum = minimum;
        }
        if (quantity < 0) {
            this.quantity = 0;
        }else{
            this.quantity = quantity;
        }
        this.id = ++count;
    }
    public int getQuantity(){
        return quantity;
    }
    public boolean setQuantity(int a){
        if (a>=minimum) {
            this.quantity -= a;
            if (quantity<0) {
                quantity = 0;
                return false;
            }
            return true;
        }else{
            return false;
        }
    }
    public boolean isAvailable(){
        int b = quantity - minimum;
        if (b<=0) {
            return false;
        }else{
            return true;
        }
    }
    public void printInfo(boolean g){
        if (g==false) {
            boolean j = isAvailable();
            System.out.println(id + " " + name + " " + minimum + " " + quantity + " " + j);
        }else{
            System.out.println(id + " " + name);
        }
    }
    // : write your code here
}

public class MiniGroceryStore {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Product> H = new ArrayList<Product>();
        ArrayList<Boolean> l = new ArrayList<Boolean>();
        // : write your code here
        while (true) {
            int action = sc.nextInt();
            // stop
            if (action == -1) {
                break;
                // : write your code here
            }
            // add
            else if (action == 1) {
                String name = sc.next();
                int minimum = sc.nextInt();
                int quantity = sc.nextInt();
                Product fd = new Product(name, minimum, quantity);
                H.add(fd);
                l.add(true);
                System.out.print("add new product: ");
                fd.printInfo(false);
                // : write your code here
            }
            // remove
            else if (action == 2) {
                int id = sc.nextInt() - 1;
                //int j = H.get(id).id;
                if (id < H.size()) {
                    if (id>=0&&l.get(id)==true) {
                        System.out.print("remove product: ");
                        H.get(id).printInfo(true);
                        H.remove(id);
                        l.set(id, false);
                    }else{
                        System.out.println("remove product: not found");
                    }
                    
                }else{
                    System.out.println("remove product: not found");
                }
                // : write your code here
            }
            // decrease quantity
            else if (action == 3) {
                int id = sc.nextInt() -1;
                int n = sc.nextInt();
                if (id>=H.size() || id<0 ||l.get(id)==false) {
                    System.out.println("decrease quantity: not found");
                }else if (n<=0) {
                    System.out.println("decrease quantity: error n");
                }else{
                    if (id>=0){
                        boolean k = H.get(id).setQuantity(n);
                        H.get(id).getQuantity();
                        if (k == true) {
                            System.out.print("decreas quantity: ");
                            H.get(id).printInfo(false);
                        }else{
                            System.out.println("decrease quantity: error");
                        }
                    }
                }
                // : write your code here
            }
        }
        for (int i = 0; i < H.size(); i++) {
            H.get(i).printInfo(false);
        }
        // : write your code here
    }
}
