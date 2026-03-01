import java.io.*;
public class RemoveAlternateWords {

public static void main(String[] args)  throws IOException {
    BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\a8948\\IdeaProjects\\Streams\\src\\data.txt"));
    BufferedWriter bw = new BufferedWriter(new FileWriter("output12.txt"));

    String line ;
    while((line = br.readLine()) != null)
    {
        String[] words = line.split("/s+");
        for(int i = 0 ; i < words.length ; i+=2)
        {
            bw.write(words[i] + "");
        }
        bw.newLine();
    }
    br.close();
    bw.close();
}
}
