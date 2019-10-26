package IOTest;

import java.io.File;

public class TestFile2 {
    static String maxName="";
    static String minName="";
    static long maxLength = 0;
    static long minLength = Integer.MAX_VALUE;

    public static void main(String[] args) {
        File file = new File("D:/jdk/");
        listFile(file);
        System.out.println("最大文件是："+maxName+"大小为："+maxLength);
        System.out.println("最小文件是："+minName+"大小为："+minLength);
    }
    public static void listFile(File f) {

        //如果是文件就比较字节大小

            if (f.isFile()) {
                if (f.length()>maxLength) {
                    maxLength = f.length();
                    maxName = f.getName();
                }
                if (f.length()<minLength) {
                    minLength = f.length();
                    minName = f.getName();
                }
                return;
            }
                //如果该文件是目录，则递归调用
            if (f.isDirectory()) {
                File[] fs = f.listFiles();
                for (File ff:fs
                     ) {
                    System.out.println(ff.getName());
                    listFile(ff);
                }
            }
    }

}
