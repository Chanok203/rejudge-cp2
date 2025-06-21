/*
FILE: java
*/
/*
LANG: JAVA
COMPILER: JAVA
*/
import java.util.ArrayList;
import java.util.Scanner;;

class Product {
    // attribites 5 ตัว
    public static int count = 1;
    public final int id;
    public final String name;
    public int minimum;
    public int quantity;

    Product(String name, int minimum, int quantity) {
        this.name = name;
        if(minimum>0){
            this.minimum = minimum;
        }else{
            this.minimum=0;
        }
        if(quantity>0){
            this.quantity = quantity;
        }
        else{
            this.quantity=0;
        }
        this.id = Product.count++;
        System.out.print("add new product: ");
        printInfo(true);
    }

    public int getQuantity() {
        return quantity;
    }

    
    public boolean setQuantity(int newQuantity) {
        
        if (newQuantity > minimum) {
            return false;
        }
        this.quantity = newQuantity;
        return true;

    }

    public boolean isAvailable() {
        if (this.quantity > this.minimum) {
            return true;
        }
        return false;
    }

    public void printInfo(boolean isPrivate) {
        if (isPrivate) {
            boolean isAvailable = isAvailable();
            System.out.println(this.id + " " + this.name + " " + this.minimum + " " + this.quantity + " " + isAvailable);
        } else {
            System.out.println(id + " " + name);
        }

    }

}

public class MiniGroceryStore {
    static int findObj(ArrayList<Product> products, int id) {
        for (int i = 0; i < products.size(); i++) {
            if (products.get(i).id == id) {
                return 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Product> products = new ArrayList<>();
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

                Product data = new Product(name, minimum, quantity);
                products.add(data);

            }
            // remove
            else if (action == 2) {
                int id = sc.nextInt();
                int found = findObj(products, id);
                if(found!=-1){
                    products.remove(id-1);
                    System.out.print("remove product: ");
                    products.get(id-1).printInfo(false);
                }
                else{
                    System.out.println("remove product: not found");
                }

            }
            // decrease quantity
            else if (action == 3) {
                int id = sc.nextInt();
                int n = sc.nextInt();
                int found = findObj(products, id);
                if(found!=-1){
                    
                    if (id > 0 && id < products.size()) {
                        products.get(id-1).quantity = products.get(id-1).quantity-n;
                        if(products.get(id-1).quantity<0){
                            products.get(id-1).quantity=0;
                        }
                    } else if (id <= 0) {
                        System.out.println("decrease quantity: error n");
                }
                } else {
                    
                    System.out.println("decrease quantity: not found");
                }
            }
        }

        for (int i = 0; i < products.size(); i++) {
            products.get(i).printInfo(true);
        }

    }
}
