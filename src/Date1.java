/**
 * Created by schaud3 on 8/8/16.
 */
import java.util.*;
import java.text.*;

public class Date1 {

    public static void main(String[] args) {
        String str = "2016-10-29T18:30:00.000Z";
        Date date;
        Date currDate = new Date();
        int year = Calendar.getInstance().get(Calendar.YEAR);
        System.out.println(year);
        System.out.println(currDate.getYear());
        DateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
        try {
            date = formatter.parse(str.substring(0,10));
            System.out.println(date.toString());
        } catch (ParseException e) {
            e.printStackTrace();
        }


    }
}
