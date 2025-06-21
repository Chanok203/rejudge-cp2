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
    public int count;
    public int id;
    public String name;
    private int minimum;
    private int quantity;

    Product(String name ,  int minimum , int quantity , int l){
        this.name = name;
        this.minimum = minimum;
        this.quantity = quantity;
        count+= l;
        this.id = count;
    }

    public int getQuantity() {
        return quantity;
    }

    public boolean setQuantity(int n){
        if(n > this.minimum){
            return true;
        }
        return false;
    }

    //public boolean isAvailable(){
        
    //}

    public void printlnfo(int action){
        if(action == 1){
            System.out.println(this.id +" "+ this.name +" "+ this.minimum +" "+ this.quantity);
        }else if(action == 2){
            System.out.println(id +" "+ name +" "+ minimum +" "+ quantity);
        }else if(action == 3){
            System.out.println(id +" "+name);
        }
    }
}

public class MiniGroceryStore {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        ArrayList<Product> arr = new ArrayList<>();
        while (true) {
            int action = sc.nextInt();
            int l = 0;;
            // stop
            if (action == -1) {
                break;
            }
            // add
            else if (action == 1) {
                String name = sc.next();
                int minimum = sc.nextInt();
                int quantity = sc.nextInt();
                l+=1;
                Product P = new Product(name, minimum, quantity , l);
                arr.add(P);
                System.out.print("add new product: ");
                P.printlnfo(action);
                
            }
            // remove
            else if (action == 2) {
                int id = sc.nextInt();
                Product P = new Product(null, action, id , l);
                if(arr.get(id) == null){
                    System.out.print("remove product: not found");
                }else{
                    arr.remove(id);
                    System.out.print("remove product:");
                    P.printlnfo(action);
                }
            }
            // decrease quantity
            else if (action == 3) {
                int id = sc.nextInt();
                int n = sc.nextInt();
                Product P = new Product(null, id, n , l);
                if(arr.get(id) == null){
                    System.out.println("decrease quantity: not found");
                }else if(n <= 0){
                    System.out.println("decrease quantity: error n");
                }else{
                    P.getQuantity();
                    P.setQuantity(n);
                    if(P.setQuantity(n) == true){
                        System.out.println("decrease quantity:");
                        P.printlnfo(action);
                    }else{
                        System.out.println("decrease quantity: error");
                    }
                }
            }
        }
        Product P = new Product(null, 0, 0 , 0);
        int action = 1;
        for(int i = 0; i<10; i++){
            if(arr.get(i) != null){
                P.printlnfo(action);
            }
        }
    }
}
