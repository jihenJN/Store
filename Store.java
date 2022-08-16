import java.util.Scanner;
public class Store {

Scanner input = new Scanner(System.in);
Product [] T = new Product[2];

Store(){
    for (int i =0; i<T.length;i++){
        System.out.println("***Product["+i+"]***");
        T[i]= new Product();
   }
 }

public Product [] Add(){
     
    Product A[]= new Product[T.length+1];
     
     for(int i =0;i<T.length;i++)
        A[i] = T[i];
        System.out.println("***Product["+(T.length)+"]***");
        A[T.length]= new Product(); 
     return A;
   
     
 
} 

public void Delete (){
    int index=0;
    System.out.print("Enter product index: ");
    index = input.nextInt();
    T[index].Delete();
    

}
 
public void Modify(){
    int index=0,valueInt=0;
    double valueDouble=0.0;
    String valueTxt="";
    

    System.out.print("Enter product index: ");
    index = input.nextInt();
    
    System.out.print("New value id: ");
    valueInt = input.nextInt();
    T[index].setId(valueInt);

    System.out.print("New value name: ");
    valueTxt = input.next();
    T[index].setName(valueTxt);

    System.out.print("New value price: ");
    valueDouble = input.nextDouble();
    T[index].setPrice(valueDouble);

    System.out.print("New value Quantity: ");
    valueInt = input.nextInt();
    T[index].setQuantity(valueInt);

}

public void ListProducts (){
    System.out.println("List Products of this store");
    System.out.println("---------------------------");
    for (int i =0; i<T.length;i++) 
       T[i].Display();
}

public int welcomeScreen (){

        int choice;
        System.out.println();
        System.out.println("****____________________________*");
        System.out.println("* Welcome App Product Manegement*");
        System.out.println("****____________________________*");
        System.out.println(" 1- Add Product ");
        System.out.println(" 2- Modify Product ");
        System.out.println(" 3- Delete Product ");
        System.out.println(" 4- List Products ");
        System.out.println(" 5- Exit ");
        System.out.println("*_______________________________*");
        System.out.print (" Select your choice : ");
        choice= input.nextInt();
        System.out.println();
        return choice;   
   
}



}