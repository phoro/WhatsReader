/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package whatsreader;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * Lee un archivo de texto
 *
 * @author GAME
 */
public class Reader {
    String text = "";
    String ruta = "";
 
    
    public Reader(String text, String ruta) {
        this.ruta = ruta;
         this.text = text;
    }

    /*
    llegeix el contingut de l'arxiu
    i el desa a this.text
     */
    public void llegeix() {
        System.out.println("comença a llegir");
        if (ruta == ""){
            System.out.println("ruta buida...reasignant");
            ruta = WhatsReader.path.toString();
        }
        try {
            Scanner input = new Scanner(new File(ruta));

            while (input.hasNextLine()) {
                String line = input.nextLine();
                text = text + "\n" + line;
                //System.out.println(line);
            }
            input.close();

        } catch (FileNotFoundException ex) {
            ex.printStackTrace();
        }

    }
    
    public String getRuta() {
        return ruta;
    }

    public void setRuta(String ruta) {
        this.ruta = ruta;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

}
