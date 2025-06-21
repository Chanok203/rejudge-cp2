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
    public int id;
    public String name;
    private int minimum;
    private int quantity;

    Product(String name, int minimum, int quantity){
        this.name = name;
        this.minimum = minimum;
        this.quantity = quantity;
        if(this.minimum < 0 && quantity < 0){
            this.minimum = 0;
            this.quantity = 0;
        }
        this.count++;
    }
    public int getQuantity(){
        return quantity;
    }

    public boolean setQuantity(int qu){
        if(this.quantity < this.minimum){
            return false;
        }
        else {
            qu = this.quantity;
            return true;
        }
    }
    public  boolean isAvailable(){
        if((this.minimum - this.quantity) < 0){
            return true;
        }
        else {
            return false;
        }
        
    }
    public void printInfo(){
        
            System.out.println(id + " " + name + " " + minimum + " " + quantity + " " + isAvailable());
        
       
    }

}
public class MiniGroceryStore {
    static int f(ArrayList<Product> arr_p, int id){
        for(int i = 0;i < arr_p.size();i++){
            arr_p.get(id).equals(i);
            return i;
        }
        return 0;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Product> arr_p = new ArrayList<Product>();
        while (true) {
        int action = sc.nextInt();
        
        if (action == -1) {
            break;
        }
        
        else if (action == 1) {
            String name = sc.next();
            int minimum = sc.nextInt();
            int quantity = sc.nextInt();
            
            Product b = new Product(name, minimum, quantity);
            System.out.print("add new product: ");
            b.printInfo();
        }
        
        else if (action == 2) {
            int id = sc.nextInt();
            if(true){
                arr_p.remove(id);
                System.out.println("remove product: ");
                
            }
            else {
                System.out.println("remove product: not found");
            }
        }
        
        else if (action == 3) {
            int id = sc.nextInt();
            int n = sc.nextInt();
            
        }
    }
}
}
    
