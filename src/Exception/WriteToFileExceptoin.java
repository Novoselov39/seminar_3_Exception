package Exception;

import java.io.IOException;

public class WriteToFileExceptoin extends IOException{
    public WriteToFileExceptoin(String message){
        super("Ошибка записи в файл");
    }

    @Override
    public String getMessage() {
        // TODO Auto-generated method stub
        return super.getMessage();
    }
    
    
}
