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
    public final int id = count;
    public final String name;
    private int minimum;
    private int quantity;

    Product(String name, int minimum, int quantity) {
        this.name = name;
        if(minimum<0){
            minimum=0;
        }
        else{
            this.minimum = minimum;
        }
        if(quantity<0){
            quantity=0;
        }
        else{
            this.quantity = quantity;
        }
    }

    public int getQuantity(){
        return  quantity;
    }

    public boolean setQuantity(int qu){
        if(qu < quantity){
            return false;
        }
        else{
            quantity = qu; 
            return  true;
        }
    }

    public boolean isAvailable(){
        if(minimum>=quantity){
            return false;
        }
        else{
            return true;
        }
    }

    public void printInfo(boolean print) {
        System.out.println(count+" "+name+" "+minimum+" "+quantity+" "+isAvailable());
    }
}

public class MiniGroceryStore {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Product> pda = new ArrayList<>();
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
                Product pd = new Product(name, minimum, quantity);
                pd.count++;
                pda.add(new Product(name, minimum, quantity));
                System.out.print("add new product: ");
                pd.printInfo(true);
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
