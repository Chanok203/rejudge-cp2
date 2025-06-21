/*
FILE: java
*/
/*
LANG: JAVA
COMPILER: JAVA
*/
import java.util.Scanner;
class Product {
    public static int count=0;
    public final int id;
    public final String name;
    private int minimum;
    private int quantity;
    Product(String name,int minimum,int quantity){
        this.name = name;
        if(minimum<0){
            this.minimum = 0;
        }else{
            this.minimum = minimum;
        }
        if(quantity<0){
            this.quantity = 0;
        }else{
            this.quantity = quantity;
        }
        id = ++count;
    }
    int getQuantity(){
        return this.quantity;
    }
    public boolean setQuantity(int id){
        if(id<this.minimum){
            return false;
        }else{
            this.quantity = id;
            return true;
        }
    }
    public boolean isAvailable(){
        if(this.quantity-this.minimum<=0){
            return false;
        }else{
            return true;
        }
    }
    public void printInfo(boolean x){
        if(x==true){
            System.out.println(id+" "+name+" "+minimum+" "+quantity+" "+isAvailable());
        }else if(x==false){
            System.out.println(id+" "+name);
        }
    }
}
public class MiniGroceryStore {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Product [] store = new Product[999];
        int i=0;
        while (true) {
            int action = sc.nextInt();
            if (action == -1) {
                break;
            }
            else if (action == 1) {
                String name = sc.next();
                int minimum = sc.nextInt();
                int quantity = sc.nextInt();
                store[i] = new Product(name,minimum,quantity);
                System.out.print("add new product: ");
                store[i].printInfo(true);
                ++i;
            }
            else if (action == 2) {
                int id = sc.nextInt();
                if(store[id].setQuantity(id)==false){
                    System.out.println("remove product: not found");
                }else{
                    System.out.print("remove product: ");
                    store[id] = new Product("",0,0);
                    store[id].printInfo(false);
                }
            }
            else if (action == 3) {
                int id = sc.nextInt();
                int n = sc.nextInt();
                if(store[id].setQuantity(id)==false){
                    System.out.println("decrease quantity: not found");
                }
                if(n<=0){
                    System.out.println("decrease quantity: error n");
                }
                if(store[id].setQuantity(id)==true && n>0){
                    store[id].getQuantity();
                    boolean A = store[id].setQuantity(n);
                    if(A==true){
                        System.out.print("decrease quantity: ");
                        store[id].printInfo(true);
                    }else{
                        System.out.println("decrease quantity: error");
                    }
                }
            }
        }
        for(int o=0;o<Product.count;o++){
            store[o].printInfo(true);
        }
    }
}
