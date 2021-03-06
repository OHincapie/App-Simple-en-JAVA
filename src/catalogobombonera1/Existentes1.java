/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package catalogobombonera1;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;

/**
 *
 * @author admin
 */
public class Existentes1 extends javax.swing.JPanel {

    /**
     * Creates new form Existentes1
     */
    
    Imagenes claseImegenes = new Imagenes ();
    String[] imagenes = claseImegenes.buscar();
    int contador = 0;
    
    ImageIcon ImagenesI[] = new ImageIcon[imagenes.length];
    public Existentes1() {
        initComponents();
        cargarImagenes();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        adelanteButton = new javax.swing.JButton();
        imagenesLabel = new javax.swing.JLabel();
        agregarAgotados = new javax.swing.JButton();
        atrasButton = new javax.swing.JButton();

        adelanteButton.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        adelanteButton.setText(">");
        adelanteButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                adelanteButtonActionPerformed(evt);
            }
        });

        imagenesLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        agregarAgotados.setText("AGREGAR A AGOTADOS");
        agregarAgotados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                agregarAgotadosActionPerformed(evt);
            }
        });

        atrasButton.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        atrasButton.setText("<");
        atrasButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                atrasButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(79, 79, 79)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(agregarAgotados, javax.swing.GroupLayout.PREFERRED_SIZE, 509, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(atrasButton, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(adelanteButton, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(imagenesLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 934, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(80, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(agregarAgotados, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(atrasButton, javax.swing.GroupLayout.DEFAULT_SIZE, 44, Short.MAX_VALUE)
                    .addComponent(adelanteButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(imagenesLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 764, Short.MAX_VALUE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    public void siguiente(){
        if(contador == ImagenesI.length-1){
            contador=0;
        } else {
            contador++;
        }
        imagenesLabel.setIcon(ImagenesI[contador]);
    }
    
    
    public void atras(){
        if(contador ==0){
           contador=imagenes.length-1;
        } else {
           contador--;
        }
        imagenesLabel.setIcon(ImagenesI[contador]); 
    }
    
    private void adelanteButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_adelanteButtonActionPerformed
        // TODO add your handling code here:
        siguiente();
    }//GEN-LAST:event_adelanteButtonActionPerformed

    private void agregarAgotadosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_agregarAgotadosActionPerformed
        // TODO add your handling code here:
        try {
            // TODO add your handling code here
            moverAExistente(imagenes[contador]);
            cargarImagenes();
        } catch (IOException ex) {
            Logger.getLogger(Agotados1.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_agregarAgotadosActionPerformed

    private void cargarImagenes(){
        imagenes = claseImegenes.buscar();
    
        
      for (int i = 0; i < imagenes.length; i++) {
            //String[] extension = imagenes[i].split(".");
            ImagenesI[i] = new ImageIcon("D:/Ventas1/" + imagenes[i]);
        }
        imagenesLabel.setIcon(ImagenesI[contador]);   
    }
    
    private void moverAExistente(String archivo) throws IOException{
        Path temp = Files.move
        (Paths.get("D:\\Ventas1\\"+archivo), 
        Paths.get("D:\\AGOTADOS1\\"+archivo));
  
    }
    
    
    private void atrasButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_atrasButtonActionPerformed
        // TODO add your handling code here:
        atras();
    }//GEN-LAST:event_atrasButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton adelanteButton;
    private javax.swing.JButton agregarAgotados;
    private javax.swing.JButton atrasButton;
    private javax.swing.JLabel imagenesLabel;
    // End of variables declaration//GEN-END:variables
}
