/*
FILE: java
*/
/*
LANG: JAVA
COMPILER: JAVA
*/
import java.util.Scanner;

import java.util.ArrayList;

class Product {
    public static int count = 0;
    public final int id = count;
    public final String name;
    private int minimum;
    private int quantity;

    Product(String name, int minimum, int quantity) {
        this.name = name;
        if (minimum <= 0) {
            this.minimum = 0;
        } else {
            this.minimum = minimum;

        }
        if (quantity <= 0) {
            this.quantity = 0;
        } else {
            this.quantity = quantity;
        }

    }

    public int getQuantity() {
        return quantity;
    }

    public boolean setQuantity(int n) {
        if (n >= minimum) {
            quantity -= n;
            return true;
        } else {
            return false;
        }
    }

    public boolean isAvailable() {
        if (quantity <= minimum) {
            return false;
        } else {
            return true;
        }
    }

    public void printInfo(boolean isAvailable) {
        if (isAvailable == true) {
            System.out.println( this.id + " " + this.name + " " + this.minimum + " " + this.quantity + " " + this.isAvailable());
        } else {
            System.out.println(this.id + " " + this.name);
        }
    }

}

public class MiniGroceryStore {
    // TODO: write your code here
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Product> box = new ArrayList<>();
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
                Product.count++;
                box.add(new Product(name, minimum, quantity));
                System.out.print("add new product: "   );
                box.get(Product.count-1).printInfo(true);   
            }
            // remove
            else if (action == 2) {
                int id = sc.nextInt();
                for (int i = 0; i < box.size(); i++) {
                   if (id-1 >= 0 && id < box.size()){
                       box.remove(id-1);
                       System.out.println("remove product: ");
                       
                    }
                    else{
                        System.out.println("remove product: not found");
                        box.get(id-1).printInfo(false);
                    break;
                   }
                }
            }
            // decrease quantity
            else if (action == 3) {
                int id = sc.nextInt();
                int n = sc.nextInt();
                if (id-1 >= 0 && id < box.size()){
                    box.get(id).getQuantity();
                    box.get(id).setQuantity(n);
                    if(  box.get(id).setQuantity(n) == true){
                        System.out.println("decrease quantity: " );
                        box.get(id).printInfo(false);
                    }   else{
                        System.out.println("decrease quantity: error");
                    }
                }
                else if (n <= 0){
                    System.out.println("decrease quantity: error n");
                }
                else{
                 System.out.println( "decrease quantity: not found" );
                }
            }
        }
        for (int i = 0; i < box.size(); i++) {
            box.get(i).printInfo(true);
        }
    }
}
