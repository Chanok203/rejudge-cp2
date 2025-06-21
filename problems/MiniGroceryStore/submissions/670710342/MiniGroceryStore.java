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
    public final int id;
    public final String name;
    private int minimum;
    private int quantity;

    public Product(String name, int minimum, int quantity) {
        this.name = name;
        this.minimum = minimum;
        this.quantity = quantity;
        count+=1;
        id = count;
    }

    public int getQuantity() {

        return quantity;
    }

    public boolean setQuantity(int NewQuantity) {
        if (NewQuantity < minimum) {
            return false;
        } else {
            quantity -= NewQuantity;
            return true;
        }

    }

    boolean isAvailable() {
        if(quantity<=minimum){
            if(quantity<0){
                quantity=0;
            }
            if(minimum<0){
                minimum=0;
            }
            return false;
        }else{
            if(quantity<0){
                quantity=0;
            }
            if(minimum<0){
                minimum=0;
            }
            return true;
        }
       
    }

    public void printInfo(boolean IsPrivate) {
        if (IsPrivate) {
            isAvailable();
            System.out.println(id+" "+ name + " " + minimum + " " + quantity + " " + isAvailable());
        } else if (!IsPrivate) {
            System.out.println(id + " " + name);
        }
    }

}

public class MiniGroceryStore {
   
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Product> p = new ArrayList<>();
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
                System.out.print("add new product: ");
               
                p.add(new Product(name, minimum, quantity));
                
                p.get(p.size() - 1).printInfo(true);
            }
            // remove
            else if (action == 2) {
                int id = sc.nextInt();
                if (id > 0 && id < p.size()) {
                    System.out.print("remove product: ");
                    p.get(id-1).printInfo(false);
                    p.remove(id - 1);
                    
                } else if(id <= 0 || id >= p.size()) {
                    System.out.println("remove product: not found");
                }
            }
            // decrease quantity
            else if (action == 3) {
                int id = sc.nextInt();
                int n = sc.nextInt();
                if (id <=0 || id > p.size()) {
                    System.out.println("decrease quantity: not found");
                } 
                else if(n<=0) {
                    System.out.println("decrease quantity: error n");
                }
                else{
                    if(n<p.get(id-1).getQuantity()){
                    p.get(id-1).getQuantity();
                    p.get(id-1).setQuantity(n);
                    System.out.print("decrease quantity: ");
                    p.get(id-1).printInfo(true);
                    }else{
                        System.out.println("decrease quantity: error");
                    }
                    

                }
            }
        }
        for(int i=0;i<p.size();i++){
            p.get(i).printInfo(true);
        }
    }
}
