/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import whatsreader.Reader;
import whatsreader.WhatsReader;

/**
 *
 * @author GAME
 */
public class Controlador {

    Reader lector = new Reader("", "");

    public Controlador() {
        lector.setRuta("");
        lector.setText("");
        
    }

    public void llegeix() {

        lector.llegeix();
    }

    /*Assigna el text llegit a WhatsReader.text*/
    public void imprimeix() {
        //System.out.println(lector.getText());
        WhatsReader.text = lector.getText();

    }
    public void surt(){
        System.exit(0);
    }

    public void busca() {
        // TODO
    } 

    
    
    public void neteja() {
        //System.out.println(WhatsReader.path + "\n" + WhatsReader.text+ "\n");
        WhatsReader.setText("");
        WhatsReader.setPath(null);
        //System.out.println(WhatsReader.path + "\n" + WhatsReader.text);
    }
    
    public Reader getLector() {
        return lector;
    }

    public void setLectorRuta(String ruta) {
        lector.setRuta(ruta);
    }
    
    public void setLectorText(String text) {
        lector.setText(text);
    }

}
