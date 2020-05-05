package hw040520.task1;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
//Вопросы: разница между FileInput(Output)Stream & ByteArrayInput(Output)Stream
//offset в методах write/read

public class DivideFile {
    public static void main(String[] args) {
        File file = new File("src/hw040520/task1/Test");
        try (FileInputStream fin = new FileInputStream(file);
             FileOutputStream fos1 = new FileOutputStream("src/hw040520/task1/Test1.txt");
             FileOutputStream fos2 = new FileOutputStream("src/hw040520/task1/Test2.txt")) {
            byte[] buffer = new byte[(int) file.length()];
            fin.read(buffer, 0, buffer.length/2);
            fos1.write(buffer, 0, buffer.length/2);
            fin.read(buffer, 0, buffer.length);
            fos2.write(buffer, 0, buffer.length);
        } catch (IOException ex) {

            System.out.println(ex.getMessage());
        }
    }
}
