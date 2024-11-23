import org.example.*;

import java.net.URI;
import java.net.URISyntaxException;

public class Principal {
    public static void main(String[] args) throws URISyntaxException {
        // Configurando estratégias
        final var processadorBB = new ProcessadorBoletos(new LeituraRetornoBancoBrasil());
        final var processadorBradesco = new ProcessadorBoletos(new LeituraRetornoBradesco());

        // URI do arquivo do Banco do Brasil
        URI caminhoArquivoBB = Principal.class.getResource("banco-brasil-1.csv").toURI();
        System.out.println("Lendo arquivo " + caminhoArquivoBB + "\n");
        processadorBB.processar(caminhoArquivoBB);

        // URI do arquivo do Bradesco
        URI caminhoArquivoBradesco = Principal.class.getResource("bradesco-1.csv").toURI();
        System.out.println("Lendo arquivo " + caminhoArquivoBradesco + "\n");
        processadorBradesco.processar(caminhoArquivoBradesco);
    }
}