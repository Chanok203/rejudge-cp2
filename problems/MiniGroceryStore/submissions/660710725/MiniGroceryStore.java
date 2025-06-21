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
    int count;
    public final int id;
    public final String name;
    private int Minimum;
    private int Quantity;
    Product(String name, int minimum, int quantity){
        this.count = 0;
        this.id = count++;
        this.name = name;
        this.Minimum = minimum;
        this.Quantity = quantity;
    }
    ArrayList <Product> prd;
    public int getQuantity(){
        return Quantity;
    }

    public boolean setQuantity(int quantity){
        if(quantity < Minimum){
            return false;
        }else{
            Quantity = quantity;
        }return true;
    }

    public boolean isAvailable(){
        if(Quantity > Minimum){
            return true;
        }
        else return false;
    }

    public void printinfo(boolean isAvailable){
        if(isAvailable){
            for (int i = 0; i < prd.size(); i++) {
                System.out.println(prd.get(i)+" true");
            }
        }else{
            for (int i = 0; i < prd.size(); i++) {
                System.out.println(prd.get(i)+" false");
            }
        }
    }
}

public class MiniGroceryStore {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList <Product> prd = new ArrayList<>();
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
                if(minimum < 0){
                    minimum = 0;
                }
                int quantity = sc.nextInt();
                if(quantity < 0){
                    quantity = 0;
                }
                Product pd = new Product(name, minimum, quantity);
                prd.add(pd);
                pd.printinfo(pd.isAvailable());
            }
            // remove
            else if (action == 2) {
                int id = sc.nextInt();
                if(prd.contains(id)){
                    System.out.println("remove product: "+prd.get(id));
                    prd.remove(id);
                }
                else{
                    System.out.println("remove product: not found");
                }
            }
            // decrease quantity
            else if (action == 3) {
                int id = sc.nextInt();
                int n = sc.nextInt();
                
            }
        }
        for (int i = 0; i < prd.size(); i++) {
            prd.get(i);
            
        }
    }
}