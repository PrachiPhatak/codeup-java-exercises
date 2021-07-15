package fileIO;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class IOUtil {

    public static List<String> readFromFile(Path path) throws IOException {
        return Files.readAllLines(path);
    }

    public static void printFileContent(List<String> content){
        for (String line : content) {
            System.out.println(line);
        }
    }

    public  static void tryPrintContent(Path path){
        try {
            IOUtil.printFileContent(IOUtil.readFromFile(path));
        } catch (IOException e) {
            System.out.println("Unable to read contents of the file at : " + path);
        }
    }
}
