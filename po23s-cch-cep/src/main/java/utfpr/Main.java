
package utfpr;

import utfpr.gui.cepJFrame;
import utfpr.http.ClienteHttp;
import utfpr.model.Historico;

/**
 *
 * @author evand
 */
public class Main {
    public static String url_base = "https://viacep.com.br/ws/";
    public static Historico hist = new Historico();
    public static void main(String[] args) {
       
        cepJFrame janela = new cepJFrame();
        janela.setVisible(true);
        
        
    }
}
