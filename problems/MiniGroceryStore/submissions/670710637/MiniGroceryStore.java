/*
FILE: java
*/
/*
LANG: JAVA
COMPILER: JAVA
*/
import java.util.Scanner;

class Product{
    public static int count = 0;
    public int id = 0;

    public String name;
    private int minimum;
    private int quantity;

    public Product(String name, int minimum, int quantity){
        this.name = name;
        this.minimum = minimum;
        this.quantity = quantity;
        count++;
        this.id += count;
    }

    public boolean isAvailable(){
        boolean check = false;
        if(this.quantity - this.minimum <= 0){
            check = false;
        }
        else{
            check = true;
        }
        return check;
    }

    public void printInfo(boolean b){
        if(b){
            System.out.println(this.id + " " + this.name + " " + this.minimum + " " + this.quantity + " " + isAvailable());
        }
        else{
            System.out.println(this.id + " " + this.name);
        }
    }
}

public class MiniGroceryStore {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            int action = sc.nextInt();
            String str = "";
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
                System.out.println("add new product: " + name + " " + minimum + " " + quantity + " " + product.isAvailable());
                if(name.equals("Tomato")){
                    str = 1 + " " + name + " " + minimum + " " + quantity + " " + product.isAvailable();
                }
                else if(name.equals("Carrot")){
                    str = 2 + " " + name + " " + minimum + " " + quantity + " " + product.isAvailable();
                }
                else if(name.equals("Corn")){
                    str = 3 + " " + name + " " + minimum + " " + quantity + " " + product.isAvailable();
                }
            }
        }
    }
}
