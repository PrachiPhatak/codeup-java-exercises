package fileIO;

import javax.imageio.IIOException;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

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



        IOUtil.tryWriteToFile(path, getContent());
        IOUtil.tryPrintContent(path);
    }

    public static List<String>  getContent(){
        List<String> contentToWrite = new ArrayList<String>();
        contentToWrite.add("This is Prachi Phatak");
        contentToWrite.add("This is Prachi Phatak1");
        contentToWrite.add("This is Prachi Phatak2");

        return contentToWrite;
    }
}
