/*
FILE: java
*/
/*
LANG: JAVA
COMPILER: JAVA
*/
import java.util.ArrayList;
import java.util.Scanner;

//  write your code here 
class Product {
    public static int count=0;
    public final int id;
    public final String name;
    private int minimum;
    private int quantity;
    //  write your code here
    Product(String name,int minimum,int quantity){
        if(minimum<0){
            this.minimum=0;
        }else{
            this.minimum=minimum;
        }
        if(quantity<0){
            this.quantity=0;
        }else{
            this.quantity=quantity;

        }
        this.name=name;
        
        
        count++;
        this.id=count;
    }
    public int getQuantity(){
        return quantity;
    }
    public boolean setQuantity(int quantity){
        if(this.quantity-quantity>=this.minimum){
            this.quantity-=quantity;
            return true;
        }
        return false;
    }
    public boolean isAvailable(){
        if(this.quantity>this.minimum){
            return true;
        }
        return false;
    }
    public void printInfo(boolean chek){
        if(chek){
            System.out.println(this.id+" "+this.name+" "+this.minimum+" "+this.quantity+" "+isAvailable());
        }else{
            System.out.println(this.id+" "+this.name);
        }
    }
}

public class MiniGroceryStore {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //  write your code here
        ArrayList<Product>aa=new ArrayList<>();
        Product f;
        while (true) {
            int action = sc.nextInt();
            // stop
            if (action == -1) {
                //  write your code here
                break;
            }
            // add
            else if (action == 1) {
                String name = sc.next();
                int minimum = sc.nextInt();
                int quantity = sc.nextInt();
                f=new Product(name, minimum, quantity);
                aa.add(f);
                System.out.print("add new product: "); 
                f.printInfo(true);
                //  write your code here
            }
            // remove
            else if (action == 2) {
                int id = sc.nextInt();
                
                if(id<aa.get(1).count&&id>0){
                    
                    System.out.print("remove product: ");
                    aa.get(id-1).printInfo(false);
                    aa.remove(id-1);
                }else{
                    System.out.println("remove product: not found");
                }
                
                //  write your code here
            }
            // decrease quantity
            else if (action == 3) {
                int id = sc.nextInt();
                int n = sc.nextInt();
                // write your code here
                if(id>aa.get(1).id&&id>0){
                    System.out.println("decrease quantity: not found");
                }else if(n<=0){
                    System.out.println("decrease quantity: error n");
                }else{
                    aa.get(id).getQuantity();
                    boolean c=aa.get(id-1).setQuantity(n);
                    if(c){
                        System.out.print("decrease quantity: ");
                        aa.get(id-1).printInfo(c);
                    }else{
                        System.out.println("decrease quantity: error");
                    }
                }
                
            }
        }
        //  write your code here
        for (int i = 0; i < aa.size(); i++) {
            aa.get(i).printInfo(true);
        }
    }
}



//40