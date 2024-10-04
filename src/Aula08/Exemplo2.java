import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
public class Exemplo2 {
    public static void main(String[] args) {
        //Escrita em um arquivo
        try {
            FileWriter writer = new FileWriter ("src\\arquivo.txt");
            writer.write("hahahhahahahahah.");
            writer.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}