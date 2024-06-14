import java.io.*;

public class FileCopyApp { public static void main(String[] args) { BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));


    try {
        System.out.println("Enter the path of the existing file: ");
        String existingFilePath = reader.readLine().replace("\"", ""); // Удаляем кавычки с пути файла

        System.out.println("Enter the name of the new file: ");
        String newFileName = reader.readLine();


        File existingFile = new File(existingFilePath);
        File newFile = new File(newFileName);

        FileReader fileReader = new FileReader(existingFile);
        FileWriter fileWriter = new FileWriter(newFile);

        int character;
        while ((character = fileReader.read()) != -1) {
            fileWriter.write(character);
        }

        fileReader.close();
        fileWriter.close();

        System.out.println("File has been copied successfully.");

    } catch (IOException e) {
        System.out.println("An error occurred: " + e.getMessage());
    }
}
}