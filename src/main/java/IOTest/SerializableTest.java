package IOTest;

import java.io.*;

public class SerializableTest {
    public static void main(String[] args) {
        Hero[] heroes = new Hero[10];
        for(int i=0;i<10;i++) {
            Hero hero = new Hero("hero:" + i);
            heroes[i] = hero;
        }
        File f =new File("D:\\codeTest/heros.lol");
        FileOutputStream fileOutputStream = null;
        try {
            fileOutputStream = new FileOutputStream(f);
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
            objectOutputStream.writeObject(heroes);
            ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream(f));
            Hero[] heroesNew = (Hero[]) objectInputStream.readObject();
            for (Hero h:heroesNew
                 ) {
                System.out.println(h.getName());
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }


    }
}
