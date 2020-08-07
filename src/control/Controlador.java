/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import whatsreader.Reader;

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
        System.out.println("controlador: --> a llegir");
        lector.llegeix();
    }

    public void imprimeix() {
        System.out.println(lector.getText());

    }

    public void donaformat() {

    }

    public void busca() {

    }

    public void crealector(String ruta, String text) {
        Reader lector = new Reader(ruta, text);
    }

}
