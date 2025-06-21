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
    public static int count = 1 ;
    public final int id = count ;
    public String name;

    private int minimum ; 
    private int quantity; //have

    public Product(String name, int minimum, int quantity) {
        this.name = name;
        if(minimum < 0){
            this.minimum = 0;
        }
        else{
            this.minimum = minimum;

        }

        if(quantity < 0){
            this.quantity = 0;
        }
        else{
            this.quantity = quantity;
        }

        Product.count ++;
    }

    public int getQuantity(){
        return this.quantity;
    }
    
    public Boolean setQuantity(int quantity){
        if(quantity > minimum){
            this.quantity = quantity;
            return true;
        }else{
            return false;
        }
    }

    public Boolean isAvailable(){
        if(minimum < quantity){
            return true;
        }
        else{
            return false;
        }
    }

    public void printInfo(boolean pp){
        if(pp == true){
            System.out.println(id +" "+name+" "+minimum+" "+quantity+" "+isAvailable());
        }
        else{
            System.out.println(id+" "+name);
        }
    }
}

public class MiniGroceryStore {
    Boolean findId(ArrayList pro, int id){
        boolean found = false;

        for(int i=0;i<pro.size();i++){

            if(pro.get(i).equals(id-1)){
                found = true;
            }
        }
        return found;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ArrayList<Product> pro = new ArrayList<>();
        MiniGroceryStore mini = new MiniGroceryStore();
        
    
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
                
                Product product = new Product(name, minimum, quantity);
                pro.add(product);
                System.out.print("add new product: ");
                product.printInfo(true);
            }
            // remove
            else if (action == 2) {
                int id = sc.nextInt();
                
                if(mini.findId(pro, id)){
                    System.out.print("remove product: ");
                    pro.get(id).printInfo(false);
                    pro.remove(id);
                }
                else{
                    System.out.println("remove product: not found");
                }
            }
            // decrease quantity
            else if (action == 3) {
                int id = sc.nextInt();
                int n = sc.nextInt();

                if(mini.findId(pro, id) && n > 0){
                    pro.get(id).getQuantity();
                    if(pro.get(id).setQuantity(n)){
                        System.out.println("decrease quantity: ");
                        pro.get(id).printInfo(true);
                    }
                    else{
                        System.out.println("decrease quantity: error");
                    }

                }
                else{
                    System.out.println("decrease quantity: not found");
                }
            }
        }
        for(int i=0;i<pro.size();i++){
            pro.get(i).printInfo(true);
        }
    }
}
