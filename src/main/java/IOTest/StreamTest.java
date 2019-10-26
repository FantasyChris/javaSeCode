package IOTest;

import java.io.*;

public class StreamTest {
    public static void main(String[] args) {
        File file = new File("D:\\test.txt");
        try {
            FileReader fileReader = new FileReader(file);
            char[] all = new char[(int)file.length()];
            for (char a:all
                    ) {
                System.out.print(a);
            }
            System.out.println("---------------------------");
            fileReader.read(all);

            fileReader.read(all);
            for (char a:all
                 ) {
                System.out.print(a);
            }
            File file2 = new File("D:\\test2.txt");
            FileWriter fileWriter = new FileWriter(file2);
            String s = "我是中国人";
            char[] chars = s.toCharArray();
            fileWriter.write(chars);
            fileWriter.flush();


        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
