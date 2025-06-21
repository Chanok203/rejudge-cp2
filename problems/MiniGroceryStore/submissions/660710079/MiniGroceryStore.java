/*
FILE: java
*/
/*
LANG: JAVA
COMPILER: JAVA
*/
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;


    class Product{
    public static int count = 0;
    public final int id;
    public final String name;
    private int minimum;
    private int quantity;

    public Product(String name, int minimum, int quantity){
        count++;
        this.id = count;
        this.name = name;
        this.minimum = Math.max(0, minimum);
        this.quantity = Math.max(0, quantity);
    }

    public int Getquantity(){
        return quantity;
    }
    public int Getminimum(){
        return minimum;
    }
    public boolean isAvailable(){
        return quantity > minimum;
    }
    public void printinfo(boolean full)
    {
        if(full){
            System.out.printf("%d  %s %d %d %b%n", id, name, minimum, quantity, isAvailable());
        }else{
            System.out.printf("%d %s%n" , id, name);
            }
        }
        public void setQuantity(int newQ){
            this.quantity = newQ;
            }
        
        }
        public class MiniGroceryStore{
            public static void main(String[] args){
                Scanner sc = new Scanner(System.in);
                List<Product> store = new ArrayList<>();
                while(true){
                    int action = sc.nextInt();
                    if(action == -1) break;
                    else if(action == 1){
                        String name = sc.next();
                        int minimum = sc.nextInt();
                        int qty = sc.nextInt();
                        Product p = new Product(name, minimum, qty);
                        store.add(p);
                        System.out.print("add new product: ");
                        p.printinfo(true);
                    }else if(action == 2){
                        int id = sc.nextInt();
                        Product found = null;
                        for(Product p : store)if(p.id == id){ found = p; break; }
                            if(found == null)
                            System.out.println("remove product: not found");
                        else{
                            store.remove(found);
                            System.out.print("remove product: ");
                            found.printinfo(false);
                            }
                        }
                        else if(action == 3){
                            int id = sc.nextInt();
                            int n = sc.nextInt();
                            Product found = null;
                            for(Product p : store)if(p.id == id){ found = p; break; }
                            if(found == null){
                                System.out.println("decrease quantity: not found");
                            }
                            else if(n <= 0){
                                System.out.printf("decrease quantity: error %d%n", n);
                            }
                            else if(found.Getquantity()- n < found.Getminimum()){
                                System.out.println("decrease quantity: error");
                            }
                            else{
                                found.setQuantity(found.Getquantity() - n);

                                System.out.print("decrease quantity: ");
                                found.printinfo(true);
                            }
                    }
                }
                store.sort(Comparator.comparingInt(p ->p.id));
                for(Product p : store)
                p.printinfo(true);
            }
        }
    
    