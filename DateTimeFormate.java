import java.text.SimpleDateFormat;
import java.util.Date;

public class DateTimeFormate {
    public static void main(String[] args) {
        //Take Date formate
        Date date = new Date();
        //System.out.println(date);

        //Take timestamp formate
        long timestamp = date.getTime();
        System.out.println(timestamp);

        //Take timestamp/date format into a format
        SimpleDateFormat dformate = new SimpleDateFormat("dd-MM-YYYY hh:mm:ss aa");
        //String todayDate = dformate.format(timestamp);
        String todayDate = dformate.format(date);
        System.out.println(date);


    }
}
