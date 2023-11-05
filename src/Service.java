import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import Exception.DataException;
import Exception.DateException;
import Exception.GenderException;
import Exception.WriteToFileExceptoin;

public class Service {
    private static List<User> userList = new ArrayList<>();
    public void createUser (String dataUser) throws GenderException,DateException, WriteToFileExceptoin, DataException{

        
        String[] userDataList = dataUser.split(" ");

        if (userDataList.length<6){
            throw new DataException("Введены не все данные");
        }

        String secondName = userDataList[0];
        String firstName = userDataList[1];
        String lastName = userDataList[2];
        Long numberPhone = Long.parseLong(userDataList[4]);
        char gender =  userDataList[5].charAt(0);
        if (gender != 'F' && gender != 'm'){
            throw new GenderException("Неверно указан пол");
        }

        try {
            String[] userDate = userDataList[3].split("\\.");
            int day = Integer.parseInt(userDate[0]);
            int mouth = Integer.parseInt(userDate[1]);
            int year = Integer.parseInt(userDate[2]);
            if (day<=0 || day>31 || mouth>12 || mouth < 0 || year< 1900 || year>2050){
                throw new DateException("Неверный формат даты");
            }
        } catch (Exception e) {
                throw new DateException("Неверный формат даты");
        }
        
       
        

                // Date date = new Date(userDataList[3]);
                String date = userDataList[3];
                User user = User.Create(secondName, 
                                        firstName, 
                                        lastName, 
                                        date, 
                                        numberPhone, 
                                        gender);
                userList.add(user);
                writeToFile(user);
            
        
        
    }

    public void writeToFile (User user) throws WriteToFileExceptoin {
        String fileName ="Iskluchenia\\Seminar_3\\Seminar#3\\src\\data\\"+ user.getSecondName()+ ".txt";
        try(FileWriter writer = new FileWriter(fileName,true)){
            writer.write(user.toStringFile());
        }
        catch (IOException e) {
            throw new WriteToFileExceptoin("Ошибка записи в файл");
        }
        
           
        
    }
    public void printConsoleUser(){
        for (User user : userList) {
            System.out.println(user.toString());
            
        }        
    }
    
    
}
