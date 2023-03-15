/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utfpr.converter;

import static utfpr.Main.url_base;
import utfpr.http.ClienteHttp;

/**
 *
 * @author gui--
 */
public class Resultado {
    String resultado;
    ClienteHttp cliente = new ClienteHttp();
    public String getResultado(long CEP){
        resultado = cliente.buscaDados(url_base + CEP + "/json/");
        if (resultado.equals("{\n" +"  \"erro\": true\n" +"}")){
            throw new IllegalCallerException();
        }
        return resultado;
    }
}
