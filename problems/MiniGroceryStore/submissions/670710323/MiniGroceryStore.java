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
    // TODO: write your code here
    public int conunt = 0;
    final public int id = this.conunt;  
    public String name;
    private int minimum;
    private int quantity;
    Product(String name, int minimum, int quantity){
        this.name = name;
        this.minimum = minimum;
        this.quantity = quantity;
    }
    public  int getQuantity(){
      return quantity;  
    }
    
    public boolean setQuantity(int a){
        if(a < minimum){
            return false;
        }
        return true;
    }
    boolean check = true;
    public boolean isAvailable(){
        if(!check){
            return false;
        }
        return true;
    }
    boolean check2 = true;
    public void printInfo(boolean check2){
        if(check2){
            System.out.println(id+" "+name+" "+minimum+" "+quantity+" "+isAvailable());
        }else{
            System.out.println(id+" "+name);
        }
    }


}
public class MiniGroceryStore {
    // TODO: write your code here
    
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // TODO: write your code here 
        ArrayList<Product> p = new ArrayList<>();
        
        
        
        while (true) {
        int action = sc.nextInt();
        // stop
        if (action == -1) {
            // TODO: write your code here
            break;
        }
        // add
        else if (action == 1) {
        String name = sc.next();
        int minimum = sc.nextInt();
        int quantity = sc.nextInt();
        // TODO: write your code here
        //p.add(name,minimum,quantity);
        System.out.println("add new product: ");
        }
        // remove
        else if (action == 2) {
        int id = sc.nextInt();
        // TODO: write your code here
        for(int i=0;i<p.size();i++){
            if(p.get(id).equals(id)){
                p.remove(id);
                System.out.println("remove product: ");
            }else{
                System.out.println("remove product: not found");
            }
        }
        }
        // decrease quantity
        else if (action == 3) {
        int id = sc.nextInt();
        int n = sc.nextInt();
        // TODO: write your code here
        for(int i=0;i<p.size();i++){
          if(!p.get(id).equals(id)){
            System.out.println("decrease quantity: not found");
          }else if(n <=0){
            System.out.println("decrease quantity: error n");
          }else{
            //p.getQuantiry;
            //p.setQuantity;
            if(p.get(id).equals(id)){
                System.out.println("decrease quantity: ");
                
            }else{
                System.out.println("decrease quantity: error");
            }
          }
        }
        
        }
                }
        // TODO: write your code here
        //p.printInfo;
        }
} 
