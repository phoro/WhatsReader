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
 * @author r0b
 */
public class Reader {

    String ruta = "";
    String text = "";
    String query = "";

    public Reader(String ruta) {
        this.ruta = ruta;

    }

    public Reader(String ruta, String text) {
        this.ruta = ruta;
        this.text = text;
    }
    
    //Torna la posició de la cadena donada
    public int busca(String identificador){
        int posicio = text.indexOf(identificador);
        System.out.println(posicio);
        return posicio;
        
    }

    /**
   * llegeix el contingut de l'arxiu
    *i el desa a this.text
    *crida a  formata()
    *que formata el text i obté identificadors
     */
    public void llegeix() {
        // busca la ruta
        if (ruta == "") {

            ruta = WhatsReader.path.toString();
        }
        try {
            Scanner input = new Scanner(new File(ruta));
            System.out.println("Scanner llegint " + ruta);

            while (input.hasNextLine()) {
                String lineformat;
                String line = input.nextLine();

                // no format
                lineformat = formata(line);
                text = text + "\n" + lineformat;

                //System.out.println(line);
            }
            //System.out.println("fitxer llegit");
            input.close();

        } catch (FileNotFoundException ex) {
            ex.printStackTrace();
        }

    }

    /**
     * formata el text i obte l'identificador i el desa
     *
     */
    public String formata(String line) {
        String lineformat = "";

        /*obté els index d'inici i final de l'identificador*/
 /*això podria ser un mètode indepentdent*/
        int indexguio = line.indexOf("-");
        int indexpunts = line.indexOf(":", indexguio);

        //TODO millorar el filtre per evitar identificadors erronis
        if (indexpunts < 0) {
            lineformat = line + "<br>";//si no troba els signe ":" no aplica format
        } else {
            char plus = '+';

            //extreu l'id
            String identificador = line.substring(indexguio + 2, indexpunts);

            // s'ha d'arreglar el format abans del replace per evitar errors pel char ("+")
            //Talla la cadena si el primer caràcter és '+'
            while (identificador.charAt(0) == plus) {
                identificador = identificador.substring(1);
            }

            //Afegeix l'identificador a la llista
            WhatsReader.addIdentificador(identificador);

            //afegeix negreta a l'identificador
            lineformat = line.replaceFirst(identificador, "<b>" + identificador + "</b>") + "<br>";

        }
        return lineformat;
    }

    /*getters i setters*/
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

    public String getQuery() {
        return query;
    }

    public void setQuery(String query) {
        this.query = query;
    }

}
