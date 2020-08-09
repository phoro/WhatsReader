/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import control.Controlador;
import java.awt.Font;


import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import whatsreader.WhatsReader;

/**
 *
 * @author GAME
 */
public class WhatsFrame extends javax.swing.JFrame {

    Controlador control = new Controlador();
    JFileChooser filechoos = new JFileChooser();

    /**
     * Creates new form WhatsFrame
     */
    public WhatsFrame() {
        initComponents();

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jEditorPane1 = new javax.swing.JEditorPane();
        labelinfo = new javax.swing.JLabel();
        labelids = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        obrir = new javax.swing.JButton();
        surt = new javax.swing.JButton();
        neteja = new javax.swing.JButton();
        busca = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Whats Reader");

        jEditorPane1.setContentType("text/html"); // NOI18N
        jEditorPane1.setFont(new java.awt.Font("Verdana", 0, 11)); // NOI18N
        jScrollPane1.setViewportView(jEditorPane1);

        labelinfo.setForeground(new java.awt.Color(153, 153, 153));
        labelinfo.setText("cap arxiu seleccionat");

        labelids.setText("Ids: 0");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(labelinfo, javax.swing.GroupLayout.PREFERRED_SIZE, 355, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(labelids)
                .addGap(23, 23, 23))
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 763, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(0, 488, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelinfo, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelids)))
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 482, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 36, Short.MAX_VALUE)))
        );

        obrir.setText("Selecciona");
        obrir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                obrirActionPerformed(evt);
            }
        });

        surt.setText("Surt");
        surt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                surtActionPerformed(evt);
            }
        });

        neteja.setText("Neteja");
        neteja.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                netejaActionPerformed(evt);
            }
        });

        busca.setText("Busca");
        busca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buscaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addComponent(obrir, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(46, 46, 46)
                .addComponent(neteja, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(busca, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 86, Short.MAX_VALUE)
                .addComponent(surt, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(41, 41, 41))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 16, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(obrir, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(surt, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(neteja, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(5, 5, 5)
                        .addComponent(busca, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void obrirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_obrirActionPerformed

        //Obra selector d'arxius i i desa l'opció triada
        int seleccio = filechoos.showOpenDialog(jPanel1);

        if (seleccio == JFileChooser.APPROVE_OPTION) {

            //TODO
            //no funciona, fins que no acaba de llegir no canvia
            // potser processament en paral·lel pel Reader
            labelinfo.setText("processant...");
            control.neteja();

            //Desa la ruta
            WhatsReader.path = filechoos.getSelectedFile();

            //canvia el nom a l'etiqueta
            labelinfo.setText(WhatsReader.path.toString());

            //Informa al controlador 
            control.setLectorRuta(WhatsReader.path.toString());
            control.setLectorText("");

            control.llegeix();// llegeix el fitxer

            control.imprimeix();//escriu el text a  WhatsReader.text

            jEditorPane1.setContentType("text/html");
            //jEditorPane1.setFont(new Font("Verdana", 1, 31));

            // Dona format i escriu el text a l'UI
            jEditorPane1.setText("<font face=\"verdana\" size=4 >" + WhatsReader.text + "</font>");

            control.imprimeixLlista(WhatsReader.getIdentificadors());

            nombreids();

        }


    }//GEN-LAST:event_obrirActionPerformed

    private void surtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_surtActionPerformed

        control.surt();
    }//GEN-LAST:event_surtActionPerformed

    private void netejaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_netejaActionPerformed

        jEditorPane1.setText("");
        labelinfo.setText("cap arxiu seleccionat");
        control.neteja();


    }//GEN-LAST:event_netejaActionPerformed

    private void buscaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscaActionPerformed
        // TODO controlar el clic abans d'omplir identificadors

        String opcio = null;

        try {
            // Obra un finestra i mostra una llista dels identificadors disponibles     
            opcio = (String) JOptionPane.showInputDialog(null, "Tria identificador", "identificadors", JOptionPane.QUESTION_MESSAGE, null, WhatsReader.getArrayIdentificadors(), WhatsReader.getArrayIdentificadors()[0]);
        } catch (ArrayIndexOutOfBoundsException e) {
            labelinfo.setText("no hi ha identificadors disponibles");
            System.out.println("llista buida");

        }

        if (opcio == null) {

        } else {
            int posicio = control.busca(opcio); //desa l'opcio triada al controlador
            //TODO mou la vista a la posició
            // segurament falla per les cadenes html, comprobar
            // no coincideix la posicio obtinguda amb la caretposition
            
            try {
                // Focus the text area
                jEditorPane1.requestFocusInWindow();
                
                //posiciona la vista
                //jEditorPane1.moveCaretPosition(posicio);
                jEditorPane1.setCaretPosition(posicio);
                
            } catch (Exception ex) {
                ex.printStackTrace();

            }

        }

        //System.out.println(opcio);
    }//GEN-LAST:event_buscaActionPerformed
    // actualitza el nombre d'identificadors del xat
    private void nombreids() {
        labelids.setText("Ids:" + WhatsReader.getIdentificadors().size());
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton busca;
    private javax.swing.JEditorPane jEditorPane1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel labelids;
    private javax.swing.JLabel labelinfo;
    private javax.swing.JButton neteja;
    private javax.swing.JButton obrir;
    private javax.swing.JButton surt;
    // End of variables declaration//GEN-END:variables
}
