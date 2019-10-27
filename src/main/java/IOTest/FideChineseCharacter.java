package IOTest;

import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;

public class FideChineseCharacter {
    public static void main(String[] args) throws UnsupportedEncodingException {

        //十六进制数转换为byte类型
        byte[] bytes ={(byte)0xE5, (byte)0xB1, (byte)0x8a};
        //byte再转换为设定编码的字符串类型
        String s = new String(bytes, Charset.forName("UTF-8"));
        System.out.println(s);
    }
}
