/*
FILE: java
*/
/*
LANG: JAVA
COMPILER: JAVA
*/
import java.util.ArrayList;
import java.util.Scanner;

// : write your code here
class Product {
    public static int count = 0;
    public final int id;
    public final String name;
    public int minimum;
    public int quantity;
    // : write your code here
    Product(String name,int minimum,int quantity){
        this.name = name;
        if(minimum < 0){
            this.minimum = 0;
        }else{
            this.minimum = minimum;
        }
        if(quantity < 0){
            this.quantity = 0;
        }else{
            this.quantity = quantity;
        }
        this.id = ++count;
    }

    public int getQuantity(){
        return this.quantity;
    }

    public boolean setQuantity(int quantity){
        if(quantity > minimum){
            this.quantity = quantity;
            return true;
        }
        return false;
    }

    public boolean isAvailable(){
        if(quantity <= minimum){
            return false;
        }
        return true;
    }

    public void printInfo(boolean setQuantity){
        if(setQuantity){
            System.out.println(this.id+" "+this.name+" "+this.minimum+" "+this.quantity+" "+isAvailable());
        }else{
            System.out.println(this.id+" "+this.name);
        }
    }
}

public class MiniGroceryStore {
    // : write your code here
    /**
     * @param args
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // : write your code here
        ArrayList<Product> products = new ArrayList<>();
        while (true) {
            int action = sc.nextInt();
            // stop
            if (action == -1) {
                // : write your code here
                //pp.printInfo(true);
                for(int i=0;i<products.size();i++){
                    System.out.println(products.get(i).id+" "+products.get(i).name+" "+products.get(i).minimum+" "+products.get(i).quantity+" "+products.get(i).isAvailable());
                }
                break;
            }
            // add
            else if (action == 1) {
                String name = sc.next();
                int minimum = sc.nextInt();
                int quantity = sc.nextInt();
                // : write your code here
                Product pp = new Product(name, minimum, quantity);
                products.add(pp);
                System.out.println("add new product: "+pp.id+" "+pp.name+" "+pp.minimum+" "+pp.quantity+" "+pp.isAvailable());
                //pp.printInfo(true);
            }
            // remove
            else if (action == 2) {
                int id = sc.nextInt();
                // : write your code here
                boolean ch = false;
                for(int i=0;i<products.size();i++){
                    if(products.get(i).id == id-1){
                        products.remove(i);
                        System.out.println("remove product: "+products.get(i).id+" "+products.get(i).name+" "+products.get(i).isAvailable());
                        ch = true;
                    }
                }
                if(!ch){
                    System.out.println("remove product: not found");
                }
            }
            // decrease quantity
            else if (action == 3) {
                int id = sc.nextInt();
                int n = sc.nextInt();
                // : write your code here
                for(int i=0;i<products.size();i++){
                    // if(products.get(i).id != id){
                    //     System.out.println("decrease quantity: not found");
                    // }
                }
            }
        }
        // : write your code here
    }
}
