import java.util.Scanner;
public class Product {
int id ;
String name;
double price;
int quantity;

Scanner input = new Scanner(System.in);
Product (){
    System.out.print("Enter id : ");
    id = input.nextInt();
    System.out.print("Enter name : ");
    name= input.next();
    System.out.print("Enter price of unit: ");
    price = input.nextDouble();
    System.out.print("Enter quantity : ");
    quantity = input.nextInt();

}

public void setId(int i){
      id=i;
}

public void setName(String n){
    name=n;
}

public void setPrice(Double p){
    price=p;
}
public void setQuantity(int q){
    quantity = q;
    
}


public void Delete(){
    id = 0 ;
    name="-";
    price = 0;
    quantity =0;

}
 
public void Display (){
   System.out.println("Id:"+id+"  Name:"+name+ 
   "  Price:"+price+"dt"+"  Quantity:"+quantity);

}
public String DisplayTXT (){
    String ch ="";
    ch= "\n Id:"+id+"  Name:"+name+ "  Price:"+price+"dt"+"  Quantity:"+quantity;
    return ch;
 }

}


