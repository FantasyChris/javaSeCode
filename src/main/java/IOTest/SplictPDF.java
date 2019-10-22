package IOTest;

import java.io.*;

public class SplictPDF {
    public static void main(String[] args) throws FileNotFoundException {
        //内存新建文件
        File file = new File("C:/Users/Chen/Desktop/苏宁支付业务简介--周文（14071387）.pdf");
        //建立输入流
        FileInputStream fileInputStream = new FileInputStream(file);
        FileOutputStream fileOutputStream = null;
        try {
            byte[] bytes = new byte[(int)file.length()];
            int read = fileInputStream.read(bytes);
            fileInputStream.close();
            int splictLength = read/3;
            //从内存将数据分割再发送到指定位置
            for (int i =0;i<4;i++) {
                File file1 = new File("C:/Users/Chen/Desktop/"+"splict"+i);
                fileOutputStream = new FileOutputStream(file1);
                if ((i+1)*500000>read) {
                    fileOutputStream.write(bytes, i*500000,read-i*500000 );
                }else {
                    fileOutputStream.write(bytes, i*500000,500000 );
                }

            }




        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (null!=fileOutputStream) {
                try {
                    fileOutputStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

    }
}
