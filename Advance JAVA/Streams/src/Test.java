import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Test {
    public static void main(String[] args) throws IOException {
        // TODO Auto-generated method stub
        FileInputStream fin = new FileInputStream("C:\\Users\\a8948\\IdeaProjects\\Streams\\src\\data.txt");
        FileOutputStream fout = new FileOutputStream("dataCopy.txt");
        int ch  = 0 ;
        while(ch != -1)
        {
            ch = fin.read();
            if(ch==-1) break;
            fout.write(ch);
        }
        fin.close();
        fout.close();
        System.out.println("File copied");
        System.out.println(System.getProperty("user.dir"));
    }
}
