import java.io.*;

public class Main {
    public static void main(String[] args) {
        try {
            readFromFile();

        } catch (FileNotFoundException e) {
            System.out.println("An error occurred while reading the file: " + e);
        } catch (IOException e) {
            System.out.println("An error occurred while reading the file: " + e);
        }
    }

    private static void readFromFile() throws IOException {
        File file = new File("./src/Lincoln.txt");
        FileReader fileReader = new FileReader(file);
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        countWords(bufferedReader);
        bufferedReader.close();
        fileReader.close();

    }

    private static void countWords(BufferedReader bufferedReader) throws IOException {
        String line;
        long count = 0L;
        while ((line = bufferedReader.readLine()) != null) {
            String[] words = line.split("\\s+");
            for (String word : words) {
                if (!word.isBlank() && !word.equals("a") && !word.equals("--")) {
                    count++;
                }
            }
        }
        System.out.println(count);
    }
}