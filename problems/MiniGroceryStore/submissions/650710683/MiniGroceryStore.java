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
        public static int count=0;
        public final int id = count;
        public final String name;
        private int minimum;
        private int  quantity;

        Product(String name,int minimum,int quantity){
                this.name = name;
                this.minimum = minimum;
                this.quantity = quantity;
                this.count=id;
        }
       public void getQuantity(){
       this.quantity = quantity;
        return;
        }
      public  boolean setQuantity(int number){
            if(number<minimum){
                    return false;
            }else{
                this.quantity=number;
                return true;
            }
        }
       public void isAvailable(){
          
        return;
        }
        public void printInfo(boolean p){
          
            if(p){
                System.out.println(id+" "+name+" "+minimum+" "+quantity+" ");
                isAvailable();
            }else{
                System.out.println(id+" "+name);
            }
        }
}
public class MiniGroceryStore {
        // TODO: write your code here (ถาตองการเขียน method
        // เพื่อชวยใหทำงานงายขึ้นสามารถเขียนเพิ่มเติมได เชน การตามหา object ดวย id
        // เปนตน)
        public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N =sc.nextInt();
      Product[] p =new Product[N];
        while (true) {
        int action = sc.nextInt();
        // stop
        if (action == -1) {
            
         }
          // add
        else if (action == 1) {
        String name = sc.next();
        int minimum = sc.nextInt();
        int quantity = sc.nextInt();
        int product = sc.nextInt();
        p[product] = new Product(name, minimum, quantity);
        System.out.println("add new product: ");
        p[product].printInfo(false);

        }
        // remove
        else if (action == 2) {
        int id = sc.nextInt();
        if(id){
            System.out.println("remove product: ");
            p[product].printInfo(false);
        }
        }
        // decrease quantity
        else if (action == 3) {
        int id = sc.nextInt();
        int n = sc.nextInt();
        // TODO: write your code here
        }
        }
        // TODO: write your code here
        }
} 
