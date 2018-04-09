package exception;

import java.io.FileNotFoundException;

public class NotFoundPropertyException extends FileNotFoundException {
    private String fileName;
    public NotFoundPropertyException(String fileName) {
        this.fileName = fileName;
        System.out.println("Property file " + fileName  + " is not found!");
    }
}
