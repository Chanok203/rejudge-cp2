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
    public static int count;
    public int id;
    public String name = "";
    private int minimum;
    private int quantity;

    Product(String name, int minimum, int quantity) {
        this.name = name;
        this.minimum = minimum;
        this.quantity = quantity;
        this.id = count;
        count++;
    }

    public int getQuantity() {
        return quantity;
    }

    boolean setQuantity(int quantity) {
        if (quantity < minimum) {
            return false;
        } else {
            this.quantity = quantity;
            return true;
        }
    }

    public boolean isAvailable() {
        if(quantity >= minimum){
            return true;
        }else{
            return false;
        }
    }

    public void printInfo(boolean check) { // true = private , false = public
        if (check == true) {
            // <id> <name> <minimum> <quantity> <isAvailable>
            System.out.println(id + " " + name + " " + minimum + " " + quantity + " " + isAvailable());
        } else {
            System.out.println(id + " " + name);
        }
    }
}

public class MiniGroceryStore {
    static int findID(ArrayList<Product> pd, int id) {
        for (int i = 0; i < pd.size(); i++) {
            Product d = pd.get(i);
            if (d.equals(id)) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Product> pd = new ArrayList<>();
        //Product cr [] = new Product[10];
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
                System.out.print("add new product: ");
                pd.get(Product.count).printInfo(true);
            }
            // remove
            else if (action == 2) {
                int id = sc.nextInt();
                if(findID(pd, id) == -1){
                    System.out.println("remove product: not found");
                }else{
                    System.out.print("remove product: ");
                    pd.get(Product.count).printInfo(false);
                }
            }
            // decrease quantity
            else if (action == 3) {
                int id = sc.nextInt();
                int n = sc.nextInt();
                if(findID(pd, id) == -1){
                    System.out.println("decrease quantity: not found");
                }else if(n <= 0){
                    System.out.println("decrease quantity: error n");
                }else if(findID(pd, id) == 1 && n > 0){
                    pd.get(id).getQuantity();
                    pd.get(id).setQuantity(n);
                    pd.get(Product.count).printInfo(true);
                }else{
                    System.out.println("decrease quantity: error");
                }
            }
        }
        for(int i = 0 ; i < pd.size() ; i++){
            System.out.println(pd.get(i));
        }
    }
}
