/*
FILE: java
*/
/*
LANG: JAVA
COMPILER: JAVA
*/
import java.util.Scanner;

class Product {
    public int cnt = 0;
    public final int id ;
    public final String name;
    private int minimum;
    private int quantity;
    
    Product(String name,int minimum,int quantity){
        this.id = ++cnt;
        this.name = name;
        if (minimum<0) {
            minimum = 0;
            this.minimum = minimum;
        }
        else{
            this.minimum = minimum;
        }
        if (quantity<0) {
            quantity = 0;
            this.quantity = quantity;
        }
        else{
            this.quantity = quantity;
        }
    }
    public int getQuantity(){
        return this.quantity;
    }
    public boolean setQuantity(int quantity){
        if (quantity>minimum) {
            this.quantity = quantity;
            return true;
        }
        else{
            return false;
        }
    }
    public boolean isAvailable(){
        return setQuantity(quantity);
    }
    public static void printInfo(boolean x){
        if (x==true) {
            System.out.println();
        }
        else{
            System.out.println();
        }
    }
}

public class MiniGroceryStore {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //ArrayList <Product> fruit = new ArrayList<>();
        while (true) {
            int action = sc.nextInt();

            if (action == -1) {
                break;
            }

            else if (action == 1) {
                String name = sc.next();
                int minimum = sc.nextInt();
                int quantity = sc.nextInt();
                    
            }

            else if (action == 2) {
                int id = sc.nextInt();

            }

            else if (action == 3) {
                int id = sc.nextInt();
                int n = sc.nextInt();

            }
        }
    }
}
