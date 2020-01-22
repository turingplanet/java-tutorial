import java.io.File;
import java.io.IOException;
import java.io.FileWriter;
import java.util.Scanner;
import java.io.FileNotFoundException;

public class CreateFile {
    public static void main(String[] args) {
    }

    public static void createFile(){
        File newFile = new File("./newFolder/newFile.txt");
        try {
            newFile.createNewFile();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void writeToFile() {
        try {
            FileWriter writer = new FileWriter("newFile.txt");
            writer.write("Hello World!");
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void readFile() {
        try {
            File myFile = new File("newFile.txt");
            Scanner scanner = new Scanner(myFile);
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                System.out.println(line);
            }
            scanner.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    public static void getMoreFileInfo() {
        File newFile = new File("newFile.txt");
        if(newFile.exists()) {
            System.out.println("File name: " + newFile.getName());
            System.out.println("Absolute path: " + newFile.getAbsolutePath());
            System.out.println("Writeable: " + newFile.canWrite());
            System.out.println("Readable: : " + newFile.canRead());
            System.out.println("File size in bytes: : " + newFile.length());
        } else {
            System.out.println("The file does not exist");
        }
    }

    public static void deleteFile() {
        File newFile = new File("newFile.txt"); // Delete file
        if (newFile.delete()) {
            System.out.println("Deleted file: " + newFile.getName());
        } else {
            System.out.println("Failed to delete the file.");
        }
        File newFolder = new File("./newFolder"); // Delete folder
        if (newFolder.delete()) {
            System.out.println("Delete folder: " + newFolder.getName());
        } else {
            System.out.println("Failed to delete the folder.");
        }
    }
}
