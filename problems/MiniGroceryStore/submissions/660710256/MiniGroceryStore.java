/*
FILE: java
*/
/*
LANG: JAVA
COMPILER: JAVA
*/
import java.util.ArrayList;
import java.util.Scanner;
class Product{
    public int count = 0;
    final int id;
    String name;
    private int minimum ;
    private int quantity;
    Product(String name,int minimum,int quantity){
        this.name = name;
        this.minimum = minimum;
        this.quantity = quantity;
        this.id = count;
    }
    public int getQuantity(){
        return this.quantity;
        
    }
    public boolean setQuantity(int newvalue){
        if(newvalue >= minimum){
            quantity = newvalue;
            return true;
        }
        return false;
    }
    public boolean isAvailable(){
        return setQuantity(quantity);
    }
    public void printInfo(boolean check){
        if(check){
            System.out.println(id+" "+name+" "+minimum+" "+quantity+" "+isAvailable());
           
        }
        else{
            System.out.println(id+" "+name);
        }
        
    }
    
}
public class MiniGroceryStore {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        ArrayList<Product> products = new ArrayList<>();
        for(;;){            int action = sc.nextInt();
            if(action == -1){
                break;
            }
            if(action == 1){
                String name = sc.next();
                int minimum = sc.nextInt();
                int quantity = sc.nextInt();
                Product product = new Product(name, minimum, quantity);
                products.add(product);
                System.out.print("add new product: ");
                product.printInfo(true);
            }
        }
    }
}
