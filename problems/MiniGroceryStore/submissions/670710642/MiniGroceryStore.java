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
 
    public static int count = 0 ;
    public final int id ;
    public String name;
    private int minimum = 0; 
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

    public boolean setQuantity(int newQuan){
        if(newQuan < minimum){
            return false;
        }
        else{
            this.quantity = newQuan;
             return true;
        }
        
    }

    public boolean  isAvailable(){
        if(minimum > quantity){
            return false;
        }
        else{
            return true;
        }
    }

    public void printInfo(boolean isPrivate){
        if(isPrivate){
            System.out.print(this.id+" "+name+" "+minimum+" "+quantity+" "+isAvailable());
        }
        else{
            System.out.print(this.id+" "+name+" ");
        }
    }

}       


    public class MiniGroceryStore {
 
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
    products.add(new Product(name, minimum, quantity));
    System.out.print("add new product: ");
    boolean t  = true;
    Product p = new Product(name, minimum, quantity);
    p.printInfo(t);
    System.out.println();

    }
 
    else if (action == 2) {
    int id = sc.nextInt();
    for (int i = 0; i < products.size(); i++) {
        Product p = products.get(i);
        
    }
    }

    else if (action == 3) {
    int id = sc.nextInt();
    int n = sc.nextInt();
  
    }
    }
    boolean t  = true;
    for (int i = 0; i < products.size(); i++) {
        products.get(i).printInfo(t);
        System.out.println();
    }

    }
    } 
