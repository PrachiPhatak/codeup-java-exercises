package fileIO;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.util.List;

public class IOUtil {

    public static void tryPrintContent(Path path) {
        try {
            IOUtil.printFileContent(IOUtil.readFromFile(path));
        } catch (IOException e) {
            System.out.println("Unable to read contents of the file at : " + path);
        }
    }

    public static List<String> readFromFile(Path path) throws IOException {
        return Files.readAllLines(path);
    }

    public static void printFileContent(List<String> content) {
        for (String line : content) {
            System.out.println(line);
        }
    }

    public static void tryWriteToFile(Path path, List<String> content) {
        try{
            Files.write(path, content, StandardOpenOption.APPEND);
        }catch(IOException e){
            System.out.println("Unable to write contents to the file at : " + path);
        }
    }
}
