package hw040520.task2;

import java.io.FileInputStream;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
//метод read вызывает метод read fileinputStream и потом дешифрует полученниые данные.
public class MyInputStream extends FilterInputStream {
    FileInputStream fileInput;
    int b;

    public MyInputStream(InputStream in, FileInputStream fileInput) {
        super(in);
        this.fileInput = fileInput;


    }

    @Override
    public int read() throws IOException {
        encode;
    }

    public byte[] encode(String key, FileInputStream fileInput) throws IOException {
        byte[] bInput = null;
        byte[] bKey = key.getBytes();

        fileInput.read(bInput);

        byte[] result = new byte[fileInput.available()];

        for (int i = 0; i < bInput.length; i++) {
            result[i] = (byte) (bInput[i] ^ bKey[i % bKey.length]);
        }
        return result;
    }
}
