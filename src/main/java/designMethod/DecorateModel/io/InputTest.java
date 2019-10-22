package designMethod.DecorateModel.io;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class InputTest {
    public static void main(String[] args) throws IOException {
        int c;
        InputStream lowerCaseInputStream = new LowerCaseInputStream(new BufferedInputStream(new FileInputStream("D:/test.txt")));
        System.out.println(lowerCaseInputStream.read());
        while ((c=lowerCaseInputStream.read())>=0) {
            System.out.print((char)c);
        }
        lowerCaseInputStream.close();
    }
}
