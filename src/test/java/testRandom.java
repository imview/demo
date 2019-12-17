import org.junit.Test;

import java.text.SimpleDateFormat;
import java.util.*;

public class testRandom {

    @Test
    public void test(){
        int ra = 0;
        List<Integer> arr = new ArrayList<>();
        for(int i=0;i<10000;i++){
            ra = (int)(Math.random()*900)+100;
            arr.add(ra);
        }
        Collections.sort(arr);
        System.out.println(Arrays.toString(arr.toArray()));
    }

    @Test
    public void testSeqNo(){
        String seqNo = "";
        int ra = 0;
        SimpleDateFormat format = new SimpleDateFormat("yyyyMMddHHmmssSSS");
        List<String> arr = new ArrayList<>();
        for(int i=0;i<10000;i++){
            String date = format.format(new Date());
            ra = (int)(Math.random()*900)+100;
            String no = String.valueOf(ra);
            seqNo = date + no;
            arr.add(seqNo);
        }
        Collections.sort(arr);
        System.out.println(Arrays.toString(arr.toArray()));
    }

    @Test
    public void testASCII(){
        String text="95,84,67,107,95,106,83,45,76,103,54,49,97,65,46,46,96,106,49,51,86,107,79,109,94,65,108,46,78,82,"+
                    "87,64,74,65,97,67,75,82,67,64,76,81,87,64,78,45,87,66,75,65,75,67,74,65,83,65,74,65,86,46,78,82," +
                    "83,67,78,45,87,66,74,82,70,48,78,119,71,63,76,65,78,48";
        StringBuilder sbu = new StringBuilder();
        StringBuilder sbu3 = new StringBuilder();

        String[] line = text.split(",");
        for(String s:line){
//                String[] chars = s.split(" ");
//                for (String char1 : chars) {
            sbu.append((char) Integer.parseInt(s));
//                }

            sbu3.append((char) (Integer.parseInt(s)+3));

        }
        System.out.println(sbu.toString());
        System.out.println(sbu3.toString());
    }


}
