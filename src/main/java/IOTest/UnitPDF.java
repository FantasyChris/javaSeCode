package IOTest;

import java.io.*;

public class UnitPDF {
    public static void main(String[] args) {
        File unitFile = new File("C:/Users/Chen/Desktop/" + "unit.pdf");
        //合并文件
        try (FileOutputStream unitFileOutputStream = new FileOutputStream(unitFile)) {
            for (int i = 0; i < 4; i++) {
                File file1 = new File("C:/Users/Chen/Desktop/" + "splict" + i);

                FileInputStream readIn = new FileInputStream(file1);

                byte[] bytes1 = new byte[(int) file1.length()];
                unitFileOutputStream.write(bytes1);
                unitFileOutputStream.flush();
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
