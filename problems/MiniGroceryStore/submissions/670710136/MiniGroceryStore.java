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
    public String name;
    private int minimum;   
    private int quantity;   
    Product(String name, int minimum, int quantity){
        this.name = name;
        if(minimum >= 0){
            this.minimum = minimum;
        }
        if(quantity >= 0){
            this.quantity = quantity;
        }
        this.id = count++;
    }
    public int getQuantity(){
        return this.quantity;
    }
    public boolean setQuantity(int N){
        if(N >= this.minimum){
            this.quantity = N;
            return true;
        }
        this.quantity = 0;
        return false;
    }
    public boolean isAvailable(){
        if(quantity > minimum){
            return true;
        }
        return false;
    }
    public void printInfo(boolean check){
        if(check == true){
            System.out.println(this.id + " " + this.name);
        }
        else{
            System.out.println(this.id + " "  + this.name + " " + this.minimum + " " + this.quantity + " " + isAvailable());
        }
    }
}

public class MiniGroceryStore {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Product> pro = new ArrayList<>(10);
        boolean check = false;
        while (true) {
            int action = sc.nextInt();
            if (action == -1) {
                break;
            }
            else if (action == 1) {
                String name = sc.next();
                int minimum = sc.nextInt();
                int quantity = sc.nextInt();
                pro.add(new Product(name, minimum, quantity));
                if(Product.count >= 1 && Product.count <= pro.size()){
                    System.out.print("add new product: ");
                    check = false;
                    Product p = pro.get(Product.count - 1);
                    p.printInfo(check);
                    
                }
            }
            else if (action == 2) {
                int id = sc.nextInt();
                if(id <= 0 || id > pro.size()){
                    System.out.println("remove product: not found");
                }
                else{
                    System.out.print("remove product: ");
                    pro.remove(Product.count - 1);
                    check = true;
                    pro.get(id - 1).printInfo(check);
                }
            }
            
            else if (action == 3) {
                int id = sc.nextInt();
                int n = sc.nextInt();
               
                if(id <= 0 || id > pro.size()){
                    System.out.println("decrease quantity: not found");
                }
                else if(n <= 0){
                    System.out.println("decrease quantity: error n");
                }
                else{
                    pro.get(id - 1).setQuantity(n);
                    pro.get(id - 1).getQuantity();
                    System.out.print("decrease quantity: ");
                    check = false;
                    pro.get(id - 1).printInfo(check);
                }
            }
        }
       
        for (int i = 0; i < Product.count; i++) {
            pro.get(i).printInfo(check);
        }
    }
}