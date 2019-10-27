package IOTest;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileInputStreamGBK2JDK {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("D:\\codeTest/中.txt");
        FileInputStream fileInputStream = new FileInputStream(file);
        byte[] bytes = new byte[(int) file.length()];
        try {
            int read = fileInputStream.read(bytes);
            for (byte b:bytes
                    ) {
                //byte是8位，i是32位，所以按位与取后8位
                int i = b&0x000000ff;
                System.out.print(Integer.toHexString(i));
            }
            //拿着字节数组到GBK编码集中可以找到"中"
            String gbk = new String(bytes, "GBK");
            System.out.println(gbk);

        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
