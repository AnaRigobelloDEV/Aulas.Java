import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
public class Exemplo5 {
    public static void main(String[] args) {
        File arquivo = new File("src\\arquivo.txt");
        if (arquivo.exists()){
            try {
                FileWriter fileWriter = new FileWriter(arquivo);
                BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
                bufferedWriter.write("\nHAHAHAHHAHAHAHAHHAHAHAHAHHAHAHHA");
                bufferedWriter.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
