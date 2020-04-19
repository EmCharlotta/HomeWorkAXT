package hw170420.exceptions;

import java.io.FileNotFoundException;
import java.nio.file.AccessDeniedException;
import java.util.jar.JarException;

public class Except {

}
     enum Status{

    FILE_NOT_FOUND{
        @Override
        public void throwExceptions(Status status) throws FileNotFoundException {
        throw new FileNotFoundException("Ойой");
        }
    }, ACCESS_DENIED{
        @Override
        public void throwExceptions (Status status) throws AccessDeniedException {
        throw new AccessDeniedException("Ошибочка");
        }
    }, JAR_ERROR{
        @Override
        public void throwExceptions(Status status) throws JarException {
        throw new JarException();
        }
    };

    public abstract void throwExceptions (Status status) throws FileNotFoundException, AccessDeniedException, JarException;
}

