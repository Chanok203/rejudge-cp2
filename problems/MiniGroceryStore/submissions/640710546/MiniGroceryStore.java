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
    public static final String id = "";
    private String name;
    private int minimum;
    private int quantity;
    int N = 0;
    boolean isvail = true;
    public Product(String name,int minimum,int quantity){
        this.name = String.format("%s%d", Product.id,++Product.count);
        if(minimum<0){
            this.minimum = 0;
        }
        if(quantity<0)   
        this.quantity = 0;
    }
    public void getQuantity(){
        
    }
    public boolean setQuantity(){
        if(quantity>minimum){
            N = quantity;
            isvail = true;
            return isvail;
        }return false;
    }
    public boolean isAvailable(){
        if(isvail){
            return true;
        }return false;
    }
    public void printInfo(boolean isvail){
        System.out.println(id+" "+name+" "+minimum+" "+quantity+" "+isvail);
        System.out.println(id+" "+name);
    }
}
public class MiniGroceryStore {
 public static void main(String[] args) {
 Scanner sc = new Scanner(System.in);
 ArrayList<Product> M = new ArrayList<Product>();
 while (true) {
 int action = sc.nextInt();
 //stop
 if (action == -1) {
    break;
 }
//add
 else if (action == 1) {
 String name = sc.next();
 int minimum = sc.nextInt();
 int quantity = sc.nextInt();
 M.add(Product).get(name);
 System.out.println("add new product"   );
 }
//remove
 else if (action == 2) {
 int id = sc.nextInt();
 M.remove(id);
 }
 // decrease quantity
 else if (action == 3){
 int id = sc.nextInt();
 int n = sc.nextInt();
System.out.println("decrease quantity: error"); 
        }
    }
  }
} 