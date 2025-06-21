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
    private int quatity;

    Product (String name,int minimum,int quatity){
        this.name = name;
        this.minimum = minimum;
        this.quatity = quatity;
        this.id = count;
    }
    public int getQuantity(){
        return quatity;
    }
    public boolean setQuantity(int quantity){
        if (quantity <= minimum){
            return false;
        }
        else{
            return true;
        }
    }
    public boolean isAvailable(){
        return setQuantity(count);
    }
    public void printInfo(boolean privates){
        if (privates){
            System.out.println(id + name + minimum + quatity + isAvailable());
        }
        else{
            System.out.println(id + name);
        }
    }
}

public class MiniGroceryStore {
   
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
       ArrayList<Product> pro = new ArrayList<>();
      
     
        while (true) {
            int action = sc.nextInt();
            break;
            if (action == -1) {
                break;
            }
            // add
          
            else if (action == 1) {
                String name = sc.next();
                int minimum = sc.nextInt();
                int quantity = sc.nextInt();
                
                pro.add(new Product(name, minimum, quantity));
               
               System.out.println("add new product: "+ );
               
               
            }
            
            // remove
            else if (action == 2) {
               int id = sc.nextInt();
                if (id<0){
                    System.out.println("remove product: not found");
                }
               }
               

            
            // decrease quantity
            else if (action == 3) {
                int id = sc.nextInt();
                int n = sc.nextInt();
                // TODO: write your code here
                if (n<=0){
                    System.out.println("decrease quantity: error n");
                }
            }
        }
        // TODO: write your code here
       

    }

   
}

