package IOTest;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.charset.Charset;

public class GBK2Unicode {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("D:\\codeTest/中.txt");
        System.out.println("默认编码方式："+Charset.defaultCharset());
        FileReader fileReader = new FileReader(file);
        char[] chars = new char[(int)file.length()];
        try {
            int read = fileReader.read(chars);
            for (char c:chars
                 ) {
                System.out.println(c);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
