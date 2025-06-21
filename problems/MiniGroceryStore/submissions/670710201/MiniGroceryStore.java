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
    public static int cnt = 0;
    public static Object remove;
    static int id = 0;
    public static String name ;
    static int minimum ;
    private static int quantity ;

    public Product (String name , int minimum , int quantity){
        this.id = ++cnt;
        this.name = name;
        if (minimum < 0) {
            this.minimum = 0;
        }
        else{
            this.minimum = minimum;
        }
        
        if (quantity < 0) {
            this.quantity = 0;
        }
        else{
            this.quantity = quantity;
        }
    }

    public static int getQuantity(){
        return quantity;
    }
    public boolean setQuantity(int n){
        if (n > minimum) {
            this.quantity = n;
            return true;
        }
        else{
            return false;
        }
    }
    
    static boolean isAvailable(){
        if (quantity < minimum) {
            return false;
        }
        else{
            return true;
        }
    }
    public void printInfo(boolean check){
        if (check == true) {
            System.out.println(id + " " + name + " " + minimum + " " + quantity + " " + isAvailable());
            
        }
        else if(check == false){
            System.out.println(id + " " + name);
        }
        
    }
    public static void print(){
        System.out.println(name + " " + minimum + " " + quantity + " " + isAvailable());
    }
    public int getid(int id){
        return id;
    }
   
  

    
}

public class MiniGroceryStore {
   
    private static int[] name2;
    public static int findid(ArrayList<Product> products , int id){
        for(int i = 0;i < products.size() ;i++){
            if (products.get(i).equals(id)) {
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        ArrayList<Product> products = new ArrayList<>();
        int cnt = 0;
       
        while (true) {
            int action = sc.nextInt();
            // stop
            if (action == -1) {
                break;
            }
            // add
            else if (action == 1) {
                String name = sc.next();
                int minimum = sc.nextInt();
                int quantity = sc.nextInt();
                products.add(new Product(name, minimum, quantity));
                String[] name2 = {name};
                cnt++;
                System.out.println("add new product:" + " " + cnt + " " + name + " " + minimum + " " + quantity + " " + Product.isAvailable());
            }
            // remove
            else if (action == 2) {
                int id = sc.nextInt();
                int idx = findid(products, id);
                if (idx == -1) {
                    System.out.println("remove product: not found" );
                }
                else{
                    products.remove(products.get(idx));
                    System.out.println("remove product:" );
                }
            }
            // decrease quantity
            else if (action == 3) {
                int id = sc.nextInt();
                int n = sc.nextInt();
                int idx = findid(products, id);
                if (n < 0 || n == 0) {
                    System.out.println("decrease quantity");
                }
                else if (idx == -1) {
                    System.out.println("decrease quantity: not found");
                }
                else if (idx != -1 && n > 0) {
                    if(products.get(idx).setQuantity(n) == true){
                        System.out.println("decrease quantity:" + " " );
                    }
                    else{
                        System.out.println("decrease quantity: error");
                    }
                }
        
            }
        }
       
     
       
    }
   
}
