package invoice;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Generation {
    public void today(){
        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
        Date date = new Date();
        System.out.println(formatter.format(date));
    }


}
