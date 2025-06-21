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
    public String name;
    private int minimum;
    private int quantity;
    Product(String name, int minimum, int quantity){
        this.name = name;
        this.minimum = minimum;
        if (this.minimum<0){
            this.minimum = 0;
        }
        this.quantity = quantity;
        if (this.quantity<0){
            this.quantity = 0;
        }
        this.id = count+1;
        count++;
    }
    public int getQuantity(){
        return this.quantity;
    }
    public boolean setQuantity(int newQuantity){
        boolean s = true;
        if (newQuantity < this.minimum){
            s = false;
        } else {
            this.quantity = this.quantity-newQuantity;
        }
        return s;
    }
    public boolean isAvailable(){
        if (this.quantity-this.minimum>0){
            return true;
        }
        return false;
    }
    public void printInfo(boolean s){
        if (s){
            System.out.println(this.id+" "+this.name+" "+this.minimum+" "+this.quantity+" "+isAvailable());
        } else {
            System.out.println(this.id+" "+this.name);
        }
    }

}
public class MiniGroceryStore {

 public static void main(String[] args) {
 Scanner sc = new Scanner(System.in);
 ArrayList<Product> pro = new ArrayList<Product>(11);
 while (true) {
 int action = sc.nextInt();
 if (action == -1) {
    break;
 }
 else if (action == 1) {
    String name = sc.next();
    int minimum = sc.nextInt();
    int quantity = sc.nextInt();
    pro.add(new Product(name, minimum, quantity));
    for (int i=0; i<pro.size(); i++){
        System.out.print("add new product: ");
        pro.get(i).printInfo(true);
    }
 }
 else if (action == 2) {
    int id = sc.nextInt();
    for (int i=0; i<pro.size(); i++){
        if (id-1 == i){
            System.out.print("remove product: ");
            pro.get(id).printInfo(false);;
        } else {
            System.out.println("remove product: not found");
        }
    }
 }
 else if (action == 3) {
    int id = sc.nextInt();
    int n = sc.nextInt();
    for (int i=0; i<pro.size(); i++){
        if (id == i){
            pro.get(i).getQuantity();
        }
    boolean newQ = pro.get(i).setQuantity(n);
    if (newQ){
        System.out.print("remove product: ");
        pro.get(id).printInfo(true);
    } else {
        System.out.println("remove product: not found");
    }    
    }
    
 }
 }
    for (int i=0; i<pro.size(); i++){
        pro.get(i).printInfo(true);
    }
 }
} 