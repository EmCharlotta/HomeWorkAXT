package hw170420.exceptions;

import java.io.FileNotFoundException;
import java.nio.file.AccessDeniedException;
import java.util.jar.JarEntry;
import java.util.jar.JarException;

public class Main {

    public static void main(String[] args) throws AccessDeniedException {
        Status status1=Status.JAR_ERROR;
        try{
    status1.throwExceptions(status1);
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
            System.out.println("Файл не найден");
        } catch (AccessDeniedException e) {
            System.out.println(e.getMessage());
            throw new AccessDeniedException("УПС");
        } catch (JarException e) {
            e.printStackTrace();
        }
    }
}
