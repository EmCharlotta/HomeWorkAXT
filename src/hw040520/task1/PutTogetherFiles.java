package hw040520.task1;

import java.io.*;

public class PutTogetherFiles {
    public static void main(String[] args) {
        try (FileInputStream i1 = new FileInputStream("src/hw040520/task1/Test");
             FileInputStream i2 = new FileInputStream("src/hw040520/task1/Test1.txt");
             FileOutputStream f1 = new FileOutputStream("src/hw040520/task1/Test3.txt")) {
            SequenceInputStream stream = new SequenceInputStream(i1, i2);

            byte[] bytes = new byte[512];
            int data;
            while ((data = stream.read(bytes)) > 0) {
                f1.write(bytes, 0, data);
            }
        }
        catch (IOException e){
            System.out.println(e.getMessage());
        }
    }
}
