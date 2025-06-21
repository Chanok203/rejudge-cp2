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
    static int count = 0;
    final int id;
    final String name;
    private int minimum;
    private int quantity;

    Product(String name, int minimum, int quantity) {
        this.name = name;
        this.minimum = minimum;
        this.quantity = quantity;
        count++;
        this.id = count;
    }

    public int getQuantity() {
        return quantity;
    }

    public boolean setQuantity(int quantity) {
        if (quantity < minimum) {
            return false;
        } else {
            this.quantity = quantity;
            return true;
        }
    }

    public boolean isAvailable() {
        if (count>0) {
            return true;
        } else {
            return false;
        }
    }

    public void printInfo(boolean isAvailable) {
        if (isAvailable() == true) {
            System.out.print("<" + id + "> ");
            System.out.print("<" + name + "> ");
            System.out.print("<" + minimum + "> ");
            System.out.print("<" + quantity + "> ");
            System.out.println("<" + isAvailable() + ">");
        } else {
            System.out.print("<" + id + "> ");
            System.out.println("<" + name + ">");
        }
    }
}

public class MiniGroceryStore {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Product> Add=new ArrayList<>();
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
                Add.add(new Product(name, minimum, quantity));
                System.out.print("add new product:");
                Add.get(Product.count).printInfo(true);
            }
            // remove
            else if (action == 2) {
                int id = sc.nextInt();
                boolean x=false;
                    for(int i=0;i<Product.count;i++){
                        if (id==Add.get(i).id) {
                            x=true;
                        }
                    }
                if (x==true) {
                    System.out.print("remove product:");
                        Add.get(Product.count).printInfo(false);
                }
                else if (x==false) {
                    System.out.println("remove product: not found");
                }
            }
            // decrease quantity
            else if (action == 3) {
                int id = sc.nextInt();
                int n = sc.nextInt();
                boolean x=false;
                for(int i=0;i<Product.count;i++){
                    if (id==Add.get(i).id) {
                        x=true;
                    }
                }
                if (n<=0) {
                    System.out.println("decrease quantity: error n");
                }
                else if (x==false) {
                    System.out.println("decrease quantity: not found");
                }
                else{
                    Add.get(Product.count).getQuantity();
                    Add.get(Product.count).setQuantity(n)
                }
            }
        }
        for(int i=0;i<Product.count;i++){
            if (Add.get(Addd.id).equals(true)) {
                Addd.printInfo(true);
            }
        }
    }
}
