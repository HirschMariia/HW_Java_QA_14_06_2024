import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;


import static org.junit.Assert.assertEquals;

public class FileCopyAppTest {

    @Test
    public void testFileCopyApp() {
        String input = "existingFile.txt newFile.txt";
        ByteArrayInputStream inputStream = new ByteArrayInputStream(input.getBytes());
        System.setIn(inputStream);

        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStream));



        String expectedOutput = "File has been copied successfully.\n";
        assertEquals(expectedOutput, outputStream.toString());
    }

}
