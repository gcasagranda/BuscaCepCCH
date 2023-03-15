/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utfpr.model;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import static utfpr.gui.HistoricoJDialog.modeloLista;

/**
 *
 * @author gui--
 */
public class Historico {
    
    
    ArrayList<String> historico = new ArrayList<>();
    public void addHistorico(String CEP, String log, String comp, String bairro, String loc, String uf, String ddd){
        Date d = new Date();
        SimpleDateFormat formDia = new SimpleDateFormat("dd-MM-yyyy");
        String dia = formDia.format(d);
        String entrada = "Data: " + dia + ", CEP: " + CEP + ", Logradouro: " + log + ", Complemento: " + comp + ", Bairro: " +
                bairro + ", Localidade: " + loc + ", UF: " + uf + ", DDD: " + ddd +".";
        historico.add(entrada);
        modeloLista.addElement(entrada);
    }
    
}
