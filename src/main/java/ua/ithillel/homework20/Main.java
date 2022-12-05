package ua.ithillel.homework20;

import org.apache.commons.io.FileUtils;
import org.apache.commons.io.FilenameUtils;

import java.io.*;
import java.net.URL;
import java.util.List;

public class Main {


    public Main() throws IOException {
    }

    public static void main(String[] args) throws IOException {

        final Client client = new Client(445, "Test", 20.25);
        final Client user = new Client();
        user.setId(445);
        user.setClientName("Test");
        user.setBalance(20.25);
        System.out.println(client.equals(user));

        try (InputStream in = new URL("https://commons.apache.org").openStream()) {
            InputStreamReader inR = new InputStreamReader(in);
            BufferedReader buf = new BufferedReader(inR);
            String line;
            while ((line = buf.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    File file = new File("/commons/io/project.properties");
    List<String> lines = FileUtils.readLines(file, "UTF-8");

    String filename = "C:/commons/io/../lang/project.xml";
    String normalized = FilenameUtils.normalize(filename);
    // result is "C:/commons/lang/project.xml"
}