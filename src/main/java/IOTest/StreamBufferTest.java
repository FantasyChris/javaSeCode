package IOTest;

import java.io.*;

public class StreamBufferTest {
    public static void main(String[] args) {
        File file = new File("D:\\codeTest/buffer.txt");
        System.out.println(file.exists());
        System.out.println(file.length());
        removeComments(file);
    }

    private static void removeComments(File file) {
        StringBuffer sb = new StringBuffer();
        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
            while (true) {

                    String line = bufferedReader.readLine();
                    if (line==null) {
                        break;
                    }
                    if (!line.startsWith("//")) {
                        sb.append(line).append("\r\n");
                    }

            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        PrintWriter printWriter = null;
        try {
            printWriter = new PrintWriter(new FileWriter(file));
            printWriter.write(sb.toString());
            printWriter.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
