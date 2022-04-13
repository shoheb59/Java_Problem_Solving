import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class MyBirthday {
    public static void main(String[] args) throws ParseException {
        String myBirthdDate = "01/01/1995";
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/mm/yyyy");
        Date date1 = dateFormat.parse(myBirthdDate);
        Date date = new Date();

        long d = date.getTime() - date1.getTime();

        long year = d/ (1000l*60*60*24 *365);
        long month = d/ (1000*60*60*2);
        long day = d/(1000*60*60*24)% 365;

        System.out.println("Year: " +year);
        System.out.println("Month: " +month);
        System.out.println("Day: " +day);


    }
}
