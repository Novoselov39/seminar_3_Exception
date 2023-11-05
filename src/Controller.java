import Exception.DataException;

import Exception.DateException;
import Exception.GenderException;
import Exception.WriteToFileExceptoin;



public class Controller {
    Service service = new Service();
    
    public void createUser (String dataUser){
        try {
            service.createUser(dataUser); 
            
        }    
        catch (GenderException  e) {
           System.out.println(e.getMessage());
        }         
        catch (DateException e) {
           System.out.println(e.getMessage());
        }
        catch (DataException e){
            System.out.println(e.getMessage());
        }
        catch (Exception e) {
           System.out.println(e.getMessage());
        }
        
        
        
    }


    public void printConsoleUser(){
       service.printConsoleUser();        
    }

    public void WriteToFile (User user){
        try {
            service.writeToFile(user);  
            
        } catch (WriteToFileExceptoin e) {
            System.out.println(e.getMessage());
        }
        catch (Exception e) {
            
        }
         
        
    }
    // public void PrintConsoleUser(){
    //     for (User user : userList) {
    //         System.out.println(user.toString());
            
    //     }        
    // }
}