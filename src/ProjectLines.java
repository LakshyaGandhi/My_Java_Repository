import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.Objects;

public class ProjectLines {
    public static void main(String[] args) throws IOException {
        String filePath = "C:/Users/laksh/Desktop/My Java Projects/src";
        // File with the most Lines & least Lines
        int maxLines = 0;
        int minLines = Integer.MAX_VALUE;
        String maxFile = "", minFile = "";
        for (File file : Objects.requireNonNull(new File(filePath).listFiles())) {
            if (file.getName().endsWith(".java")) {
                String[] lines = Files.readAllLines(file.toPath()).toArray(new String[0]);
                int numLines = lines.length;
                if (numLines > maxLines) {
                    maxLines = numLines;
                    maxFile = file.getName();
                }
                if (numLines < minLines) {
                    minLines = numLines;
                    minFile = file.getName();
                }
            }
        }
        System.out.println("File with the most lines: " + maxFile);
        System.out.println("Number of lines: " + maxLines);
        System.out.println("File with the least lines: " + minFile);
        System.out.println("Number of lines: " + minLines + "\n##############");
        //Number of lines for each file
        for (File file : Objects.requireNonNull(new File(filePath).listFiles())) {
            if (file.getName().endsWith(".java")) {
                String[] lines = Files.readAllLines(file.toPath()).toArray(new String[0]);
                int dots = 50 - file.getName().length();
                String padding = new String(new char[Math.max(dots, 1)]).replace('\0', '.');
                System.out.format("%s %s %4d lines\n", file.getName(), padding, lines.length);
            }
        }
    }
}