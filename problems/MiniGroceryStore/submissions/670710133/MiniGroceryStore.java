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
    public final int id = 1;
    public String name;
    private int minimum;
    private int quantity;
    Product(String name, int minimum, int quantity){
        this.name = name;
        if(minimum<0){
            this.minimum = 0;
        }
        else{
            this.minimum = minimum;
        }
        if(quantity<0){
            this.quantity = 0;
        }
        else{
            this.quantity = quantity;
        }
        count++;
    }
    public int getQuantity(){
        return quantity;
    }
    public boolean setQuantity(int newQuantity){
        if(newQuantity>=minimum){
            this.quantity = newQuantity;
            return true;
        }
        else{
            this.quantity = quantity;
            return false;
        }
    }
    public boolean isAvailable(){
        if(!setQuantity(quantity) || minimum<0 || quantity<0){
            return false;
        }
        else{
            return true;
        }
    }
    public void printinfo(boolean isAvailable){
        if(isAvailable){
            System.out.println(id + " " + name + " " + minimum + " " + quantity + " " + isAvailable);
        }
        else{
            System.out.println(id + " " + name);
        }
    }
}

public class MiniGroceryStore {
    // static ArrayList<Product> main(int action){
    //     public static main getArrayList(int action) {
    //         return ArrayList;
    //     }
    //     public static void setArrayList(main arrayList) {
    //         ArrayList = arrayList;
    //     }
    // }
    void main(int action){
        ArrayList<Product> pd = new ArrayList<>();
        public static main getArrayList(int action){
            return ArrayList;
        }
        public static void setArrayList(main arrayList) {
            ArrayList = arrayList;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Product> pd = new ArrayList<>();
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
                pd.add(new Product(name, minimum, quantity));
            }
            // remove
            else if (action == 2) {
                int id = sc.nextInt();
                if(id>=0 && id<=pd.size()){
                    System.out.println("remove product: " + pd.get(id).printinfo(false));
                    pd.remove(id);
                }
                else{
                    System.out.println("remove product: not found");
                }
            }
            // decrease quantity
            else if (action == 3) {
                int id = sc.nextInt();
                int n = sc.nextInt();
                if(id<=0 || id>pd.size()){
                    System.out.println("decrease quantity: not found");
                }
                else if(n<=0){
                    System.out.println("decrease quantity: error n");
                }
                else{
                    pd.
                }
            }
        }
        for (int i = 0; i < pd.size(); i++) {
            pd.get(i).printinfo(true);
        }
    }
}
