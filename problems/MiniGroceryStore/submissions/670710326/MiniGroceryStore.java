/*
FILE: java
*/
/*
LANG: JAVA
COMPILER: JAVA
*/
import java.util.Scanner;

class Product {
    public int count = 0;
    public int id    ;
    public String name;
    private int minimum;
    private int quantity;
    
    public Product(String name, int minimum, int quantity) {
        this.name = name;
        this.minimum = minimum;
        this.quantity = quantity;
        if(this.minimum <0){
            this.minimum = 0;
        }
        if(this.quantity <0){
            this.quantity = 0 ;
        }
       this.id = count++;
    }

    public int getQuantity() {
        return this.quantity;
    }

    public boolean setQuantity(int lol) {
        lol = quantity;
        if (lol < this.minimum) {
            
            return false;
        } else {
           
            return true;
        }
    }

    public boolean isAvailable() {
        if (this.minimum < this.quantity) {
            
            return true;
        } else {
            
            return false;
        }
    }

    public void printInfo(boolean or) {
        
        if (or = true) {   
            System.out.println(this.id+" " + name+" " + minimum+" " + quantity+" " + isAvailable());
            
        } else {
            System.out.println(this.id + name);
            
        }
    }
}

public class MiniGroceryStore {
    
 public static void main(String[] args) {
 Scanner sc = new Scanner(System.in);
  String array [] = new String[100]; 
    int count = 0;
 while (true) {
 int action = sc.nextInt();
 count ++;
 
 if (action == -1) {
    break ;
 }
 
 else if (action == 1) {
 String name = sc.next();
 int minimum = sc.nextInt();
 int quantity = sc.nextInt();
 Product ac = new Product(name, minimum, quantity);
 System.out.print("add new product: ");
    ac.id = count;
   ac.printInfo(true);
Product c = new Product(name, minimum, quantity);
c.id = count; 
c.printInfo(true);
   
   
 }

 else if (action == 2) {
 int id = sc.nextInt();
   System.out.print("remove product: ");
   if(id == 0 || id>=4){
   System.out.println("remove product: not " + "found ");
   }
 }

 else if (action == 3) {
 int id = sc.nextInt();
 int n = sc.nextInt();
 if(n<0){
    System.out.println("decrease quantity: error "+n);
 } 
 else if(id<0|| id>=4)
 System.out.print("“decrease quantity: not found ");
  
    
 }
 }

 }

}
