/*
FILE: java
*/
/*
LANG: JAVA
COMPILER: JAVA
*/
import java.util.Scanner;
import java.util.ArrayList;
class Product {
    public static int count = 0;
    public static final int id = count+=1;
    public final String name;
    private int minimum;
    private int quantity;

    public Product(String name, int minimum, int quantity) {
        this.name = name;
        this.minimum = minimum;
        this.quantity = quantity;
    }
    public int getQuantity(){
        return this.quantity;
    }
    public boolean setQuantity(int x){
        if(x > minimum){
            return false;
        }
        else{
            this.quantity = x;
            return true;
        }
    }
    public boolean isAvailable(){
        
        if(minimum < quantity){
            return true;
        }
        else{
            return false;
        }
    }
    public void printInfo(boolean isAvailable){
        if(isAvailable==true){
            System.out.println(id + " " + name + " " + minimum + " " + quantity + " " + isAvailable);

        }
        else{
            System.out.println(id + " " + name);
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

                Product products2 = new Product(name, minimum, quantity);
                System.out.print("add new product: ");
                products2.printInfo(true);
            }
            
            else if (action == 2) {
                int id = sc.nextInt();

                if(Product.id == 4){
                
                    System.out.print("“remove product: ");
                    
                }
                else{
                    System.out.print("remove product: not found");
                }
            }
            
            else if (action == 3) {
                int id = sc.nextInt();
                int n = sc.nextInt();
                
                if(Product.id == 0){
                    System.out.println("decrease quantity: not found");
                }
                else{
                    
                }
                if(n <= 0){
                    System.out.println("decrease quantity: error n");
                }
                   
            }
        }
        
    }
} 

