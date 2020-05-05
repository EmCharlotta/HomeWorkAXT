package hw040520.task2;

import java.io.FileOutputStream;
import java.io.FilterOutputStream;
import java.io.OutputStream;
 //Ваш метод write шифрует данные и потом вызывает метод write fileoutputStream,
public class MyOutputStream extends FilterOutputStream {
    FileOutputStream fileOutput;

     public MyOutputStream(OutputStream out, FileOutputStream fileOutput) {
         super(out);
         this.fileOutput = fileOutput;
     }
 }
