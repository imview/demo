import org.junit.Test;

import java.io.File;
import java.util.HashSet;
import java.util.Set;

public class testFile {

    @Test
    public void helloWorld(){
        Set<String> pathSet = new HashSet<>();
//        pathSet.add("I:\\zhuzhu\\BY8170");
//        pathSet.add("I:\\zhuzhu\\CMM105");
//        pathSet.add("I:\\zhuzhu\\DNLS54");
//        pathSet.add("I:\\zhuzhu\\GQMXXM128");
//        pathSet.add("I:\\zhuzhu\\MZMQ61");
//        pathSet.add("I:\\zhuzhu\\SM 79");
//
//
//        pathSet.add("G:\\zhuzhu\\YB97");
        pathSet.add("G:\\zhuzhu\\WMBJDL 60");
        pathSet.add("G:\\zhuzhu\\YJNN31");



        for(String path:pathSet) {
            File file = new File(path);
            File[] array = file.listFiles();
            for (int i = 0; i < array.length; i++) {
                if (array[i].isFile()) {
                    File person = array[i];
                    String fileName = person.getName();
                    String newFileName = "";
                    StringBuffer ic = new StringBuffer();
                    if (fileName != null && fileName.endsWith("删")) {
                        newFileName = path + "\\" + fileName.substring(0, fileName.length() - 1);
                    } else {
                        continue;
                    }

                    System.out.println("名字是：" + newFileName);
                    if (person.renameTo(new File(newFileName))) {
                        System.out.println("修改成功!");
                    } else {
                        System.out.println("修改失败");
                    }
                } else if (array[i].isDirectory()) {
                    //getFile(array[i].getPath());
                    System.out.println("错误了");
                }
            }
        }
    }

}
