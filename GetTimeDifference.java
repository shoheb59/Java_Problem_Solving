import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class GetTimeDifference {
    public static void main(String[] args) throws ParseException {
        String thatDay = "15/08/2020 01:15:47 PM";
        SimpleDateFormat dformate = new SimpleDateFormat("dd/MM/yyyy hh:mm:ss aa");
        Date date1 = dformate.parse(thatDay);
        Date date2 = new Date();

        long d  = date2.getTime() - date1.getTime();
        long year = d/(1000l * 60 * 60 * 24 * 365);
        long day = d/(1000*60*60*24)% 365;
        long hour = (d/(1000*60*60))%24;
        long minutes = (d/(1000*60)) % 60;
        long seconds = (d/1000) % 60;

        System.out.println("Year: " +year);
        System.out.println("Day: " +day);
        System.out.println("Hour: " +hour);
        System.out.println("Minutes: " +minutes);
        System.out.println("Seconds: " +seconds);


    }
}
