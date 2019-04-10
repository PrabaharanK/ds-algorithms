import java.text.ParseException;
import java.text.SimpleDateFormat;

public class DateIssue {
    public static void main(String[] args) {
        SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy-MM-dd'T08'HH:mm:ss.SSS'Z'");
        String s = "6-Jun-2018";
        try {
            System.out.println(sdf1.parse(s));
        } catch (ParseException e) {
            e.printStackTrace();
        }


    }
}
