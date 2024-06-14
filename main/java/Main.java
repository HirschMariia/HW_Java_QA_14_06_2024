import java.io.File;
import java.io.IOException;
import org.apache.commons.io.FileUtils;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the path to the existing folder:");
        String sourcePath = scanner.nextLine();

        System.out.println("Enter the name of the new folder:");
        String destinationPath = scanner.nextLine();

        File sourceFolder = new File(sourcePath);

        if (!sourceFolder.exists()) {
            System.out.println("Folder does not exist!");
            return;
        }

        File destinationFolder = new File(destinationPath);
        destinationFolder.mkdirs();

        try {
            FileUtils.copyDirectory(sourceFolder, destinationFolder);
            System.out.println("Folder successfully copied.");
        } catch (IOException e) {
            System.out.println("An error occurred during folder copy: " + e.getMessage());
        }
    }
}