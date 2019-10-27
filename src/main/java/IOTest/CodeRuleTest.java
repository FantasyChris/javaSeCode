package IOTest;

import java.io.UnsupportedEncodingException;

public class CodeRuleTest {
    public static void main(String[] args) throws UnsupportedEncodingException {
        String str = new String("中");
        byte[] gbks = str.getBytes("GBK");
        System.out.print("十六进制：");
        for (byte b:gbks
             ) {
            int i = b&0xff;

            System.out.print(Integer.toHexString(i));
        }
        System.out.print("二进制：");
        for (byte b:gbks
                ) {
            int i = b&0xff;
            System.out.println(Integer.toBinaryString(i));
        }

    }
}
