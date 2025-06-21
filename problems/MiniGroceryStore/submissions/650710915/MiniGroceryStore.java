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
    public static int count;
    public static final int id =count++;
    public static final String name ="";
    
    private int minimum;
    private int quantity;
    public Product(String name, int minimum, int quantity) {
        this.minimum = minimum;
        this.quantity = quantity;
        this.count = 0;
        // this.id = 2
    }
    public int getQuantity(){
        return quantity;
    }
    public boolean setQuantity(int n){
        if (n > minimum){
            return false;
        }
        else {
            return true;
        }
    }
    public boolean isAvailable(){
        if (minimum < quantity){
            return true;
        }
        else{
            return false;
        }
    }
    // public  printInfo(boolean x){
    //     if (){
    //         System.out.println("<id>");
    //     }
    // }


}

public class MiniGroceryStore {
    //
   
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    ArrayList<Product> products = new ArrayList<>();
    while (true) {
        int action = sc.nextInt();
        // stop
        if (action == -1) {
            // TODO: write your code here
        }
        // add
        else if (action == 1) {
            String name = sc.next();
            int minimum = sc.nextInt();
            int quantity = sc.nextInt();
            // TODO: write your code here
        }
        // remove
        else if (action == 2) {
            int id = sc.nextInt();
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