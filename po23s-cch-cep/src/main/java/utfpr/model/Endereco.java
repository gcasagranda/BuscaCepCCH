/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utfpr.model;

import java.util.stream.Stream;


public class Endereco {
    String CEP, DDD, logradouro, complemento, bairro, localidade, UF;
    String resultado;

    public String getCEP() {
        return CEP;
    }

    public String getDDD() {
        return DDD;
    }

    public String getLogradouro() {
        return logradouro;
    }

    public String getComplemento() {
        return complemento;
    }

    public String getBairro() {
        return bairro;
    }

    public String getLocalidade() {
        return localidade;
    }

    public String getUF() {
        return UF;
    }
    
    public void setEndereco(String resultado){
        this.resultado = resultado.replaceAll("\"", "");
        this.resultado = this.resultado.replaceAll(",", "");
        String[] linhas = this.resultado.split("\n");
        CEP = linhas[1].substring(7);
        logradouro = linhas[2].substring(14);
        complemento = linhas[3].substring(15);
        bairro = linhas[4].substring(10);
        localidade = linhas[5].substring(14);
        UF = linhas[6].substring(6);
        DDD = linhas[9].substring(7);
        
    }
    
}
