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
    public  final int id  ;
    public final String name;
    private int minimum ;
    private int quantity ;

    public Product (String name , int minimum , int quantity){
        this.name = name;
        this.minimum = minimum;
        this.quantity = quantity;
        this.id = ++Product.count;
        if ( this.minimum <= 0  ){
            this.minimum = 0;
        }
        if (  this.quantity <= 0 ){
            this.quantity = 0;
        }
    }
    public int getQuantity(){
        return this.quantity;
    }
    public boolean setQuantity(int quantity){
        if ( quantity > minimum ){
            this.quantity = quantity;
            return true;
        }
        else{
            return false;
        }
    }
    public boolean isAvailable(){
        if ( setQuantity(quantity) ){
            return true;
        }
        else{
            return false;
        }
    }
    public void printInfo( boolean check){
        if ( check == true ){
            System.out.println( this.id + " " + this.name + " "
            + this.minimum + " " + this.quantity + " " + this.isAvailable());
        }
        else{
            System.out.println(this.id + " " + this.name );
        }
    }
}

public class MiniGroceryStore {
    // static int findId(ArrayList<Product> products , int id){
    //     for ( int i=0 ; i< products.size() ; i++){
    //         products  a = products.get(i);
    //     }
    // }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Product> products = new ArrayList<>();
        while (true) {
            int action = sc.nextInt();
            // stop
            if (action == -1) {
                for ( int i=0 ; i< products.size() ; i++){
                    products.get(i).printInfo(true);
                }
                return ;
            }
            // add
            else if (action == 1) {
                String name = sc.next();
                int minimum = sc.nextInt();
                int quantity = sc.nextInt();
                Product a = new Product(name, minimum, quantity);
                products.add(a);
                System.out.print("add new product: " );
                a.printInfo(true);
            }
            // remove
            else if (action == 2) {
                int id = sc.nextInt();
                
            }
            // decrease quantity
            else if (action == 3) {
                int id = sc.nextInt();
                int n = sc.nextInt();
                
            }
        }
        
    }
}
