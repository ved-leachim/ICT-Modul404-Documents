import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Main {

    public static void main(String[] args) {
        BufferedReader bufferedReader;
        String pathToFile = "resources/Gefunden.txt";
        try {
            bufferedReader = readFile(pathToFile);
            printText(bufferedReader);
        } catch (IOException exception) {
            exception.printStackTrace();
        }
    }

    public static BufferedReader readFile(String path) throws IOException {
        try {
            var bufferedReader = new BufferedReader(new FileReader(path));
            return bufferedReader;
        } catch (FileNotFoundException exception) {
            exception.printStackTrace();
        }
        return null;
    }

    public static void printText(BufferedReader bufferedReader) throws IOException {
        String text;
        while ((text = bufferedReader.readLine()) != null) {
            System.out.println(text);
        }
    }
}
