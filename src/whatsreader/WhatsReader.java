/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package whatsreader;

import java.awt.EventQueue;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import vista.WhatsFrame;

/**
 * Lee un archivo de texto de chat de whatsapp Aplica formato 
 * Identifica usuarios
 * Permite buscar entradas por usuaria
 *
 * @author r0b
 */
public class WhatsReader {

    public static File path = null;//S'omple quan es tria la ruta
    public static String text = null;//S'omple quan s'imprimeix el fitxer
    //Llista dels identificadors de l'arxiu
    private static List<String> identificadors = new ArrayList<String>();

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        //Llança la finestra UI
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    WhatsFrame frame = new WhatsFrame();
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }

        });

    }

    public static File getPath() {
        return path;
    }

    public static void setPath(File path) {
        WhatsReader.path = path;
    }

    public static String getText() {
        return text;
    }

    public static void setText(String text) {
        WhatsReader.text = text;
    }

    public static List<String> getIdentificadors() {
        return identificadors;
    }

    /**
     * 
     * Afegeix un element a la llista
     * Comprova previament que no hi sigui
     */
    public static void addIdentificador(String identificador) {
        if (!identificadors.contains(identificador)) {
            WhatsReader.identificadors.add(identificador);
        }

    }
    
    public static void esborraIdentificadors() {
        identificadors.clear();
        
    }

}
