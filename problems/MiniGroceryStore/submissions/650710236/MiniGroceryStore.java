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
    public  static int count =0;
    public static final int id=1;
    public static final String name="";
    private static int minimum;
    private static int quantity;

    Product(String name, int minimum,int quantity){
        /*this.name = name;
        if(this.quantity >=0){
            this.quantity =quantity;
        }else{
            this.quantity =0;
        }if(this.minimum >=0){
            this.minimum =minimum;
        }else{
            this.minimum =0;
        }
        this.minimum = minimum;
        this.quantity = quantity;*/
        
       // this.name = name.format("%s%d"Product.id ++Product.count);
    }
    public static int getQuantity(){
        return quantity;
    }
    public static boolean setQuantity(int Q){
        if(Q<minimum){
            return false;
        }else{
            return true;
        }
    }
    public static boolean isAvailable(){
        if(minimum-quantity!=0){
            return true;
        }else{
            return false;
        }
    }
    public static void printInfo(boolean  r){
        
    }
}

public class MiniGroceryStore {
    public static int StoreVP(ArrayList<Product> products, String name ){
        for(int i=0; i<products.size();i++){
            Product p = products.get(i);
            if(p.name.equals(p.id)){
                return i;
            }
        }return -1;
        
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Product> products = new ArrayList<>();
        while (true) {
            int action = sc.nextInt();
            // stop
            if (action == -1) {
                // TODO: write your code here
            }
            // add
            else if (action == 1) {
                String name = sc.next();
                int minimum = sc.nextInt();
                int quantity = sc.nextInt();
                // TODO: write your code here
            }
            // remove
            else if (action == 2) {
                int id = sc.nextInt();
                // TODO: write your code here
            }
            // decrease quantity
            else if (action == 3) {
                int id = sc.nextInt();
                int n = sc.nextInt();
                // TODO: write your code here
            }
        }
        // TODO: write your code here
    }
}
