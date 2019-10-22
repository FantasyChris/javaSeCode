package IOTest;

import java.io.*;

public class TestStream {
    public static void main(String[] args) {
        File file = new File("D:/xyz/abc/def/lol2.txt");
        try {
            boolean mkdirs = file.getParentFile().mkdirs();
          //  file.createNewFile();
                FileOutputStream fileOutputStream = new FileOutputStream(file);
                byte b[] = {83};
                fileOutputStream.write(b);
                fileOutputStream.close();


        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
