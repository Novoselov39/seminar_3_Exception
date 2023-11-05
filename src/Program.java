


public class Program {
    public static void main(String[] args){
        Controller controller = new Controller();      
        


        // Scanner in = new Scanner(System.in);
        // System.out.print("Введите данные пользователя: ");
        // String data = in.nextLine();  
        String data ="Новоселов Анатолий Викторович 01.02.1997 89087060821 m";
        controller.createUser(data);
        controller.printConsoleUser();
        controller.WriteToFile(null);
   
      
      
        
          
        
       
    }

    
}
