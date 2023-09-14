package ToyShop.FileHandler;

import java.io.FileWriter;
import java.io.IOException;

public class WriteIO {
    FileWriter writer;
    private final String path = "text.txt";

    public void writeFile(String fileDate) {
        try {
            this.writer = new FileWriter(path, true);
            writer.append(fileDate);
            writer.flush();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
