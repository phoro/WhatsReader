/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import vista.WhatsFrame;
import whatsreader.Reader;
import whatsreader.WhatsReader;

/**
 *
 * @author GAME
 */
public class Controlador {

    Reader lector = new Reader("", "");

    public Controlador() {
        lector.setText("");
        lector.setRuta("");
    }

    public void llegeix() {
        
        lector.llegeix();
    }

    /*Assigna el text llegit a WhatsReader.text*/
    public void imprimeix() {
        //System.out.println(lector.getText());
        WhatsReader.text = lector.getText();

    }

    
    

    public void busca() {
        // TO DO
    }

    public void crealector(String ruta, String text) {
        Reader lector = new Reader(ruta, text);
    }

}
