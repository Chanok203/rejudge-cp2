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
    public static int count=0;
    public static final int id=1;
    public String name;
    private int minimum;
    private int quantity;

    Product(String name,int minimum,int quantity){
        this.name=name;
        this.minimum=minimum;
        this.quantity=quantity;
        
        if(this.minimum<0){
            this.minimum=0;
        }
        if(this.quantity<0){
            this.quantity=0;
        }
    }

    int getQuantity(){
        return quantity;
    }

    boolean setQuantity(){
        return true;
    }

    boolean isAvailable(){
        if(this.quantity>this.minimum){
            return true;
        }else{
            return false;
        }
    }

    void printInfo(){
        this.count++;
        System.out.println("add new product: "+this.count+" "+this.name+" "+this.minimum+" "+this.quantity+" "+isAvailable());
        System.out.println(this.count+" "+this.name+" "+this.minimum+" "+this.quantity+" "+isAvailable());
    }
}
public class MiniGroceryStore {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Product> PD=new ArrayList<Product>();
        
        while (true) {
            int action = sc.nextInt();
  
            if (action == -1) {
                break;
            }

            else if (action == 1) {
                String name = sc.next();
                int minimum = sc.nextInt();
                int quantity = sc.nextInt();
                PD.add(new Product(name, minimum, quantity));

            }

            else if (action == 2) {
                int id = sc.nextInt();

            }

            else if (action == 3) {
                int id = sc.nextInt();
                int n = sc.nextInt();
            }
        }
        for(int i=0;i<3;i++){
            PD.get(i).printInfo();
        }
    }
} 
