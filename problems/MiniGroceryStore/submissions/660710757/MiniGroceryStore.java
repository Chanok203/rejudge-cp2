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
    public static int count=0;
    public final int id=count;
    public static  String name="";
    private static int minimum;
    private static int quantity;
    Product(String name,int minimum,int quantity){
        this.name=name;
        this.minimum=minimum;
        this.quantity=quantity;
        this.count=count++;
        
    }
    
    
    public int  getquantity(){
        return quantity;
    }
    boolean check=true;
     
    public  boolean setQuantity(int c){
        
        if(c>=minimum){
            c =quantity;
            check=true;
            
        }
        return check=false;

    }
    public boolean isAvailable(boolean keep){
        if(quantity>=minimum){
            keep=true;
        }
        return keep=false;
    }
    public void printInfo(boolean check){
        if(check==true){
            System.out.print(id+" "+name+" "+ minimum+" "+ quantity+" "+ check);

        }else if (check==false){
            System.out.print(id+" "+name+" "+ minimum+" "+ quantity+" "+ check);
        }
    }
} 
public class MiniGroceryStore { 
 // public int findpdbyid(int id){
   // for (int i = 0; i < products.size(); i++) {
   //     if(products.getid.equal this.count){
    //        return i;
      //  }

   private static Product pd;

// }
   // return -1;
 // }
 public static void main(String[] args) { 
 Scanner sc = new Scanner(System.in); 
 ArrayList<Product>products=new ArrayList<>();
 
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
 Product pd=new Product(name, minimum, quantity);
 products.add(pd);
 System.out.print("add new product: ");
 
 pd.printInfo(true);
 System.out.println();
 }
} 
 

 // remove 
 //else if (action == 2) { 
 //int id = sc.nextInt();
//products.remove(id);
//System.out.println("remove product: ");
//pd.printInfo();
//} 
// decrease quantity 
//else if (action == 3) { 
//int id = sc.nextInt(); 
//int n = sc.nextInt(); 
//products.add(id);
//if(products.get(id)==null){
   // System.out.println("decrease quantity: not found");
//}else if(n<0){
    //System.out.println("decrease quantity: error n");
//}else {
  //  Product pd=new Product(name, n, n)

//}
//} 
//} 
 
for (int i = 0; i < products.size(); i++) {
    
    pd.printInfo(true);
}
} 
}
