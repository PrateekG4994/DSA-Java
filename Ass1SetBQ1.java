import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
public class Ass1SetBQ1{
    public static void main(String[] args) {
        Date date = new Date();
        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
        String strDate = formatter.format(date);
        System.out.println("Current Date is:" +strDate);

        formatter = new SimpleDateFormat("MM-dd-yyyy");
        strDate = formatter.format(date);
        System.out.println("Current Date is:" +strDate);

        formatter = new SimpleDateFormat("EEEEEEE MM");
        
        
    }

}
