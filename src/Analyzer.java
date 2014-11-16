import java.io.File;

public class Analyzer {

    // TODO

    public static void main(String[] args) {
        new Analyzer();
    }

    public Analyzer() {

        File file = new File("/home/vako/Tmp");
        getChildren(file);
    }

    private void getChildren(File file) {
        if (file.isFile()) {
            ;
        } else {
            for (File f : file.listFiles()) {
                getChildren(f);
            }
        }
    }
}
