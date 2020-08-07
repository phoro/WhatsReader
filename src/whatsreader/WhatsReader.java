/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package whatsreader;

import java.awt.EventQueue;
import java.io.File;
import vista.WhatsFrame;

/**
 * Lee un archivo de texto de chat de whatsapp
 * Aplica formato
 * Permite buscar entradas por usuaria
 * 
 * @author r0b
 */
public class WhatsReader {
    
public static File path = null;//S'omple quan es tria la ruta
public static String text = null;//S'omple quan es llegeix el fitxer
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //String ruta = "text.txt";
        //Reader lector = new Reader(ruta);
        //Controlador control = new Controlador(ruta);
        
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    WhatsFrame frame  = new WhatsFrame();
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
      
        });
        
        System.out.println(path +"\n" + text);
        
        
        
        
    }
    
}
