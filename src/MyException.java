import java.io.File;

public class MyException extends Exception {

    File file;

    public MyException(File file) {
        this.file = file;
    }

    public MyException(Throwable cause, File file) {
        super(cause);
        this.file = file;
    }

    public File getFile() {
        return file;
    }

    public void setFile(File file) {
        this.file = file;
    }
}