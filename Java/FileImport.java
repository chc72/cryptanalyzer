import java.io.*;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;

class FileImport {
    public String readFile(String filePath) {
        StringBuilder content = new StringBuilder();

        if (filePath == null || filePath.isEmpty()) {
            System.out.println("Ошибка: путь к файлу не указан");
            return "";
        }

        try (BufferedReader reader = new BufferedReader(
                new InputStreamReader(new FileInputStream(filePath), StandardCharsets.UTF_8))) {
            String line;
            while ((line = reader.readLine()) != null) {
                content.append(line).append("\n");
            }
            System.out.println("Файл успешно прочитан: " + filePath);
        } catch (IOException e) {
            System.out.println("Ошибка чтения файла: " + e.getMessage());
            return "";
        }

        return content.toString();
    }

    public void saveFile(String location, String content) throws IOException {
        Files.writeString(Paths.get(location), content);
    }

}