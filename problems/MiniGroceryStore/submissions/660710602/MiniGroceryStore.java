/*
FILE: java
*/
/*
LANG: JAVA
COMPILER: JAVA
*/
import java.util.Scanner;

class  Product{
    public static int count = 0;
    public final int id;
    public final String name;

    private int minimum = 0;

    private int quantity = 0;

    Product(String name, int minimum, int quantity){
        this.name = name;
        this.minimum = minimum;
        this.quantity = quantity;
        this.id = ++count;
    }

    public int getQuantity(){
        return quantity;
    }

    public boolean setQuantity(int x){
        boolean check = false;
        if(x>minimum){
            quantity = x;
            check = true;
        }
        return check;
    }

    public boolean isAvailable(){
        boolean check = false;
        if(minimum < quantity){
            check = true;
        }
        return check;
    }

    public void printInfo(boolean a){
        if(a==true){
            System.out.print(id + " " + name + " " + minimum + " " + quantity + " " + isAvailable());
            System.out.println();
        }else{
            System.out.print(id + " " + name);
            System.out.println();
        }
    }
}

public class MiniGroceryStore {
    public static int check(Product[] product, int id){
        for(int i=0; i<product.length; i++){
            if(product[i].id != id){
                return -1;
            }
        }
        return 1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Product[] product = new Product[10];
        int countt = 0;
        while (true) {
            int action = sc.nextInt();
            if (action == -1) {
                break;
            }
            else if (action == 1) {
                String name = sc.next();
                int minimum = sc.nextInt();
                int quantity = sc.nextInt();
                if (minimum < 0) minimum = 0;
                if (quantity <0) quantity = 0;
                product[countt] = new Product(name, minimum, quantity);
                System.out.print("add new product: ");
                product[countt].printInfo(true);
                countt++;
            }
            else if (action == 2) {
                int id = sc.nextInt();
                int a = MiniGroceryStore.check(product, id);
                if(a==1){
                    System.out.print("remove product: ");
                    product[id].printInfo(false);
                    product[id] = null;
                }else{
                    System.out.println("not found");
                }
            }
            else if (action == 3) {
                int id = sc.nextInt();
                int n = sc.nextInt();
                int a = MiniGroceryStore.check(product, id);
                if(a==1 && n>0){
                    product[id].getQuantity();
                    boolean b = product[id].setQuantity(n);
                    if(b==true){
                        System.out.print("decrease quantity: ");
                        product[id].printInfo(false);
                    }else{
                        System.out.println("decrease quantity: error");
                    }
                }else if(a==-1){
                    System.out.println("decrease quantity: not found");
                }else if(n<=0){
                    System.out.println("decrease quantity: error n");
                }
            }
        }
        for(int i=0; i<countt; i++){
            product[i].printInfo(true);
        }
    }
}
