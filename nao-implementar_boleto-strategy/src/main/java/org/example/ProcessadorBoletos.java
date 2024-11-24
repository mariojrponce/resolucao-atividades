package org.example;

import java.net.URI;
import java.util.List;

public class ProcessadorBoletos {
    private LeituraRetorno leituraRetorno;

    public ProcessadorBoletos(final LeituraRetorno leituraRetorno){
        this.leituraRetorno = leituraRetorno;
    }


    //Como não implementar
    public void processar(String nomeArquivo){
        if(nomeArquivo.contains("banco-brasil")){
            System.out.println("Boletos");
            System.out.println("----------------------------------------------------------------------------------");
            final List<Boleto> boletos = leituraRetorno.lerArquivo(caminhoArquivo);
            for (Boleto boleto : boletos) {
                System.out.println(boleto);
            }
        }
        else if(nomeArquivo.contains("bradesco")){
                    System.out.println("Boletos");
            System.out.println("----------------------------------------------------------------------------------");
            final List<Boleto> boletos = leituraRetorno.lerArquivo(caminhoArquivo);
            for (Boleto boleto : boletos) {
                System.out.println(boleto);
            }
        }
    }


    public void setLeituraRetorno(final LeituraRetorno leituraRetorno) {
        this.leituraRetorno = leituraRetorno;
    }
}