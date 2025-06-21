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
    public static int count=1 ;
    public final int id;
    public String name;
    public int minimum;
    public int quantity;

    public Product ( String name, int minimum, int quantity ){
        this.name = name;
        this.minimum = minimum;
        this.quantity = quantity;
        this.id = count++;
    }
    public int getQuantity (){
        return this.quantity;
    }

    public boolean setQuantity ( int x){
        boolean check = false;
        if ( x >= this.quantity ){
            x = this.quantity;
            return true;
        }else {
            return false;
        }
    }
    public boolean isAvailable (){
        int sum = this.quantity - this.minimum ;
        if ( sum > 0  ) {
            return true;
        }else {
            return false;
        }
    }
    public void printInfo (boolean isAvailable ){
    
        int sum = this.quantity - this.minimum ;
        if ( sum > 0 ) {
            isAvailable = true;
        }else {
            isAvailable = false;
        }

        if ( isAvailable = true ){
            System.out.println(this.id + " " + this.name + " " + this.minimum + " " +  this.quantity +  " " + this.isAvailable() );
        }
        if ( isAvailable = false ){
            System.out.println(this.id + " " + this.name );
        }
    }
}

public class MiniGroceryStore {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        ArrayList <Product> pp = new ArrayList<>();

        while (true) {
            int action = sc.nextInt();
            
            if (action == -1) {
                p.printInfo();
                break;
            }
            else if (action == 1) {
                String name = sc.next();
                int minimum = sc.nextInt();
                int quantity = sc.nextInt();
                if ( minimum <= 0 ){
                    minimum = 0;
                }
                if ( quantity<=0 ){
                    quantity =0 ;
                }

                Product p = new Product(name, minimum, quantity);
                pp.add(p);
                System.out.print("add new product: " );
                p.printInfo(false);
            }
            
            else if (action == 2) {
                Product p = new Product(null, action, action);
                pp.add(p);
                int id = sc.nextInt();
                if ( p.id == id ){
                    System.out.print("remove product: " + p.id + " " + p.name);
                    pp.remove(p.name);
                }else {
                    System.out.println("remove product: not found");
                }
            }
            
            else if (action == 3) {
                int id = sc.nextInt();
                int n = sc.nextInt();
                Product p = new Product(null, n, n);
                pp.add(p);
                if ( p.id == id ){
                    p.getQuantity();
                    p.setQuantity(n);
                    if ( p.setQuantity(n) == true ){
                        System.out.println("decrease quantity: ");
                    }else if ( n <= 0 ){
                        System.out.println("decrease quantity: error n");
                    }
                }
            }


        }
    }
}
