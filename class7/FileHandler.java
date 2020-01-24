import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileHandler {

    public static void main(String[] args) {
        String filename = "myFile.txt";
        FileHandler.createOrDeleteFile(filename, true);
        FileHandler.writeToFile(filename, "Hello World");
        System.out.println(FileHandler.readFile(filename));
        FileHandler.createOrDeleteFile(filename, false);
    }

    public static void createOrDeleteFile(String filename, boolean create) {
        try {
            File newFile = new File(filename);
            if (create) {
                newFile.createNewFile();
            } else {
                newFile.delete();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void writeToFile(String filename, String content) {
        try {
            FileWriter writer = new FileWriter(filename);
            writer.write(content);
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public static String readFile(String filename) {
        String content = "";
        try {
            File myFile = new File(filename);
            Scanner scanner = new Scanner(myFile);
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                content += line;
            }
            scanner.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return content;
    }
}
