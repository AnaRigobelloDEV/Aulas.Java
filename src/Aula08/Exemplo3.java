import java.io.FileWriter;
import java.io.IOException;
public class Exemplo3 {
    public static void main(String[] args) {
        //Escrita em um arquivo
        try {
            FileWriter writer = new FileWriter ("src\\arquivo.txt",true);
            writer.write("\nARTHUR.");
            writer.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}