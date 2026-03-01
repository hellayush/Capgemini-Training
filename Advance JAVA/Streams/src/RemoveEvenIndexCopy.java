import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class RemoveEvenIndexCopy {
    public static void main(String[] args) throws IOException {

        FileInputStream fis = new FileInputStream("C:\\Users\\a8948\\IdeaProjects\\Streams\\src\\data.txt");
        FileOutputStream fos = new FileOutputStream("output.txt");

        int ch=0;

        while (ch  != -1) {
            ch= fis.read();
            if (ch% 2 != 0) {
                fos.write(ch);
            }
        }

        fis.close();
        fos.close();

        System.out.println("File copied successfully .");
    }
}
