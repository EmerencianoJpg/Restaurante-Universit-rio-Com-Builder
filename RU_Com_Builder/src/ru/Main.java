
package ru;

import View.Janela;
import java.util.ArrayList;
import java.util.List;
import javax.swing.SwingUtilities;


public class Main {

    public static void main(String[] args) {
        
        List<CardapioDados> cardapioDados = new ArrayList<>();
        
        SwingUtilities.invokeLater(() -> new Janela());
    }
    
}
