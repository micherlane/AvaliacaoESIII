package q05;

import java.io.FileWriter;
import java.io.IOException;

public class ArmazenamentoArquivo {
    public static void salvarTransacao(String texto, String nomeArquivo) {
        try (FileWriter writer = new FileWriter(nomeArquivo, true)) {
            writer.write(texto);
        } catch (IOException e) {
            System.out.println("Erro ao salvar a transação: " + e.getMessage());
        }
    }
}
