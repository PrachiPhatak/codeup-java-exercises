package fileIO;

import javax.imageio.IIOException;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;

public class FileIO {
    public static void main(String[] args) {
        init();
    }

    public static void init() {
        //Create directory
        Path path = FileDirectoryUtil.getPath("src", "fileIO", "files");
        FileDirectoryUtil.tryCreateDirectory(path);

        //create file
        path = Paths.get(path.toString(), "test.txt");
        FileDirectoryUtil.tryCreateFile(path);

        IOUtil.tryPrintContent(path);
    }

}
