package IOTest;

import java.io.File;
import java.io.IOException;

public class TestFile {
    public static void main(String[] args) throws IOException {
        File file = new File("D:/");
        System.out.println("当前文件是"+file);
        File[] files = file.listFiles();
        long maxLength=0L;
        String maxLenName = "";
        long minLength=Integer.MAX_VALUE;
        String minLenName = "";

        for (File f:files
             ) {
            if (f.length()>maxLength) {
                maxLength = f.length();
                maxLenName = f.getName();
            }
            if (f.length()<minLength) {
                minLength = f.length();
                minLenName = f.getName();
            }

        }
        System.out.println("最大文件是"+maxLenName+"长度为:"+maxLength);
        System.out.println("最小文件是"+minLenName+"长度为:"+minLength);


    }
}
