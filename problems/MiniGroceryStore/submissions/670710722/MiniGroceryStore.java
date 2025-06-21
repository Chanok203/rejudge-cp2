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
    Product(String name,int minimum,int quantity){
        this.name = name;
        this.minimum = minimum;
        this.quantity = quantity;
        this.id = count++;
    }
    public int getQuantity(){
        return this.quantity;
    }
    public boolean setQuantity(int quantity){
        if(quantity<minimum){
            return false;
        }
        quantity = quantity;
        return true;
    }
    public boolean isAvailable(){
        if(minimum<quantity){
            return true;
        }
        return false;
    }
    public void printInfo(boolean priv){
        if(priv==true){
            System.out.println((this.id+1)+" "+this.name+" "+minimum+" "+quantity+" "+isAvailable());
        }
        else{
            System.out.println((this.id+1)+" "+this.name+" "+minimum+" "+quantity+" "+isAvailable());
        }
    }
    
}
public class MiniGroceryStore {
    // static public int find(ArrayList<Product> products ,String name){
    //     for(int i=0 ; i<products.size() ; i++){
    //         Product a = products.get(i);
    //         if(a.Product(id).equals(i)){
    //             return i;
    //         }
    //     }
    //     return -1;
    // }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Product> products = new ArrayList<>();
        while (true) {
            int action = sc.nextInt();
            if (action == -1) {
                break;
            }
            else if (action == 1) {
                String name = sc.next();
                int minimum = sc.nextInt();
                int quantity = sc.nextInt();
                Product a = new Product(name, minimum, quantity);
                products.add(a);
                
                System.out.print("add new product: ");
                products.get(products.size()-1).printInfo(true);
        
                
                
            }
            
            else if (action == 2) {
                int id = sc.nextInt();

            }
            // // decrease quantity
            else if (action == 3) {
                int id = sc.nextInt();
                int n = sc.nextInt();
                 //: write your code here
            }
        }
        for(int i=0 ; i<products.size() ; i++){
            products.get(i).printInfo(false);
        }
        
    }
}