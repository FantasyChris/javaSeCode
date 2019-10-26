package IOTest;

import java.io.*;
import java.util.Arrays;
import java.util.List;

public class SecrectTest {
    public static void encodeFile(File encodingFile, File encodedFile) throws IOException {

        FileReader fileReader = new FileReader(encodingFile);
        char[] chars = new char[(int)encodingFile.length()];
        fileReader.read(chars);
        for (int j = 0; j<chars.length; j++) {
            char c = chars[j];
            int flag = ajust(c);
            if (flag==9) {
                c = '0';
            }else if (flag>=0&&flag<9) {
                c= (char)((int)c+1);
            }else if (flag==35||flag==61) {
                c= (char)((int)c-25);
            }else if (flag>=10) {
                c= (char)((int)c+1);
            }
            chars[j] = c;
        }

        FileWriter fileWriter = new FileWriter(encodedFile);
        fileWriter.write(chars);
        fileWriter.flush();
        fileWriter.close();
    }

    public static int ajust(char c) {
        String letterOrDigital = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";
        int i = letterOrDigital.indexOf(c);
        return i;
    }

    public static void main(String[] args){
        File encodingFile = new File("D:/test.txt");
        File encodedFile = new File("D:/test2.txt");
        try {
            SecrectTest.encodeFile(encodingFile,  encodedFile);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
