import org.junit.Test;

import javax.xml.crypto.Data;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;

public class testHelloWorld {
    @Test
    public void helloWorld(){
        System.out.println("Hello World!");
        System.out.println("demo init success!");
        System.out.println("master change!");

        String seperator="0x02";
        System.out.println("seperator:" + seperator);

        if(seperator.contains("0x")){
            String str[] = seperator.split("0x");
            seperator = str[1];
            System.out.println(Arrays.toString(str));
            byte[] sc = {(byte)Integer.parseInt(seperator,16)};
            seperator = new String(sc);
            System.out.println(Arrays.toString(sc));

            System.out.println("after seperator:" + seperator);
        }

        System.out.println("byte:" + Integer.parseInt("2", 16));
        byte[] aa = {(byte)Integer.parseInt("2",16)};
        String ff = new String(aa);
        if(ff.equals(seperator)){
            System.out.println(true);
        }else{
            System.out.println(false);
        }
        if(ff.equals(" ")){
            System.out.println(true);
        }else{
            System.out.println(false);
        }
    }

    @Test
    public void test2() throws  Exception{
        String sysDate = getDatetime("yyyyMMdd");
        SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd");
        Date date = sdf.parse(sysDate);
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        calendar.add(Calendar.DAY_OF_MONTH,-1);
        date = calendar.getTime();

        System.out.println(sdf.format(date));
    }

    private String getDatetime(String str){
        SimpleDateFormat format = new SimpleDateFormat(str);
        return format.format(new Date());
    }
}
