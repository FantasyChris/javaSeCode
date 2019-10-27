package IOTest;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.Arrays;

public class RemoveBOM {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("D:\\codeTest/无BOM测试.txt");
        FileInputStream fileInputStream = new FileInputStream(file);
        byte[] bytes = new byte[(int) file.length()];
        try {
            int read = fileInputStream.read(bytes);
            System.out.println("首先确认按照UTF-8识别出来有？");
            String s = new String(bytes, Charset.forName("UTF-8"));
            System.out.println(s);
            System.out.print("打印出文件里所有的数据的16进制是：");
            for (byte b:bytes
                 ) {
                //byte转int
                int i = b & 0xff;

                System.out.print(Integer.toHexString(i)+" ");
            }
            System.out.println("除去bom的16进制是：");
            byte[] bom = new byte[4];
            bom[0] = (byte)0xef;
            bom[1] = (byte)0xbb;
            bom[2] = (byte)0xbf;
            bom[3] = (byte)0x3f;
            byte[] bytes1 = Arrays.copyOfRange(bytes, bom.length, bytes.length);
            for (byte bb:bytes1
                 ) {
                int j = bb & 0xff;

                System.out.print(Integer.toHexString(j)+" ");
            }
            System.out.println("除去bom后的结果：");
            String s2 = new String(bytes1, "UTF-8");
            System.out.println(s2);

        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
