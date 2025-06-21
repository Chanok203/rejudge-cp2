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
    public final int id;
    public final String name;

    private static int minimum;
    private static int quantity;

    Product(String name,int minimum, int quantity){
        this.name = name;
        this.minimum = minimum;
        this.quantity = quantity;
        count++;
        this.id = count;
    }

    public int getQuantity(){
        return quantity;
    }

    public boolean setQuantity(int quantity){
        if (quantity >= minimum) {
            this.quantity = quantity;
            return true;
        }
        else {
            return false;
        }
    }

    public boolean isAvailable(){
        if (quantity - minimum <= 0) {
            return false;
        }
        else{
            return true;
        }
    }

    public void printInfo(boolean printname){
        if (printname == true) {
            System.out.println(id + " " + name + " " + minimum + " " + quantity + " " + isAvailable());
        }
        else {
            System.out.println(id + " " + name);
        }
    }

}

public class MiniGroceryStore {
    public static void seeProduct(ArrayList<Product> list,int id){
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).equals(list)) {
                System.out.println(list);
            }
        }
    }

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
                System.out.print("add new product: ");
            }
            // remove
            else if (action == 2) {
                int id = sc.nextInt();
                seeProduct(products, id);
                System.out.print("remove product: ");

                // TODO: write your code here
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