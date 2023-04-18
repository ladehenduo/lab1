package task3;
import java.io.*;
import task1.*;

public class Demo {
    public static void main(String args[]) throws IOException {
        File file = new File("E:\\JavaEE实验\\test1\\src\\task3\\io.txt");
        BufferedInputStream bin = new BufferedInputStream(new FileInputStream(file));
        BufferedOutputStream bout = new BufferedOutputStream(new FileOutputStream(file));

        byte[] bytes = {1, 2, 3, 4, 5, 6, 7, 8, 9, 100};
        byte[] bytes1 = new byte[20];

        bout.write(bytes);
        bout.flush();
        System.out.println("向文件" + file.getName() + "写入：" + bytes);

        bin.read(bytes1, 2, 5); //存储的起始位置， 读入的长度
        System.out.print("从文件" + file.getName() + "读出：");
        for(int i = 2; i < 7; i++) {
            System.out.print(bytes1[i] + ' ');
        }
        System.out.println();
        bin.close();
        bout.close();

        // 对象持久化：首先对象要能序列化，才能持久化，对象实现Serializable接口即实现序列化
        File file1 = new File("E:\\JavaEE实验\\test1\\src\\task3\\obj.txt");
        Person[] p = new Person[10];
        String baseName = "WW";
        int baseWeight = 100;
        double baseHigh = 150;
        for(int i = 0; i < 10; i++) {
            p[i] = new Person();    //给每个对象实例化
            p[i].setHigh(baseHigh + i * 0.1 + i * 10);
            p[i].setWeigh(baseWeight + i * 5);
            p[i].setName(baseName + i);
        }

        //先写
        ObjectOutputStream oout = new ObjectOutputStream(new FileOutputStream(file1));

        for(int i = 0; i < 10; i++) {
            oout.writeObject(p[i]);
        }
        oout.flush();
        // 文件不能为空，否则会有 EOF异常
        ObjectInputStream oin = new ObjectInputStream(new FileInputStream(file1));
        Person[] p1 = new Person[10];
        for(int i = 0; i < 10; i++) {
            try {
                p1[i] = (Person) oin.readObject();
                p1[i].show();
            } catch (ClassNotFoundException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
