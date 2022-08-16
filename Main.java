import java.io.File;  // Import the File class
import java.io.FileWriter;  
import java.io.IOException;  // Import the IOException class to handle errors

public class Main {
    public static void main(String[] args) {
        String list;
        Store s = new Store();
        int choice =0 ;
    do{ choice =  s.welcomeScreen();
        //System.out.println(choice);
        switch(choice){
            case 1: 
            s.Add();
            break;
            case 2: 
            //System.out.println("Modify");
            s.Modify();
            break;
            case 3: 
            s.Delete();
            break;
            case 4: 
            //System.out.println("List");
            s.ListProducts();
            break;
            case 5: 
            System.out.println("Bye Bye !");
            System.out.println();
            break;
            default: System.out.println("Invalid Command"); }
     }while(choice!=5);
     
    

    //file creation 
    
    try {
        File myObj = new File("ListProducts.txt");
        if (myObj.createNewFile()) {
          System.out.println("File created: " + myObj.getName());
        } else {
          System.out.println("File already exists.");
        }
      } catch (IOException e) {
        System.out.println("An error occurred.");
        e.printStackTrace();
      }

       
    // file write
    try {
        FileWriter myWriter = new FileWriter("ListProducts.txt");
        myWriter.write("welcome to our Store!");
        myWriter.write("\n----List Products----");
        
        for(int i=0 ; i<s.T.length;i++){
            
            myWriter.write(s.T[i].DisplayTXT());
           
        }
        
        myWriter.close();
        
      } catch (IOException e) {
        System.out.println("An error occurred.");
        e.printStackTrace();
      }
      
      
    }
   

    
}
