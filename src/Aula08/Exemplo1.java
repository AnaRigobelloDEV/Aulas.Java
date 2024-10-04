import java.io.File;
import java.io.IOException;
public class Exemplo1 {
    public static void main(String[] args) throws IOException {
        File arquivo = new File("exemplo.txt");
        if (arquivo.exists()) {
            System.out.println("O arquivo já existe.");
        } else {
            if (arquivo.createNewFile()) {
                System.out.println("Arquivo criado" + arquivo.getName());
            } else {
                System.out.println("Falha ao criar arquivo.");
            }
        }

    }
}