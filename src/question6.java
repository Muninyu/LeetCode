import java.text.SimpleDateFormat;
import java.util.Date;

public class question6 {
    public static void main(String[] args){
        Date date1 = new Date(0);
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
        System.out.println(date1);
        System.out.println(sdf.format(date1));
    }
}
