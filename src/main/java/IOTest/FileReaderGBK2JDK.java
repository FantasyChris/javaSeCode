package IOTest;

import java.io.*;
import java.nio.charset.Charset;

public class FileReaderGBK2JDK {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("D:\\codeTest/中.txt");
        System.out.println("默认编码方式:"+Charset.defaultCharset());
        FileReader fileReader = new FileReader(file);
        char[] chars = new char[(int) file.length()];
        try {
            fileReader.read(chars);
            for (char c:chars
                 ) {
                System.out.println(c);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        InputStreamReader inputStreamReader = new InputStreamReader(new FileInputStream(file), Charset.forName("GBK"));
        char[] chars2 = new char[(int) file.length()];
        try {
            int read = inputStreamReader.read(chars2);
            for (char c:chars2
                 ) {
                System.out.println(c);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}
