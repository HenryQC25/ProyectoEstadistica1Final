
package Contenido;

import java.awt.Graphics;
import java.awt.Image;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class InicioP extends javax.swing.JFrame {

    public void fondosT(){
    
    this.scImagen(this.tituloL,"src/imagenes/titulo.png");
    }
    public InicioP() {
        initComponents();
        setLocationRelativeTo(null);
    fondosT();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new fondoPanel();
        tituloL = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        teo1 = new javax.swing.JButton();
        teo2 = new javax.swing.JButton();
        teo3 = new javax.swing.JButton();
        teo4 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        teo5 = new javax.swing.JButton();
        teo6 = new javax.swing.JButton();
        teo7 = new javax.swing.JButton();
        teo8 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(153, 255, 204));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel1.add(tituloL, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 0, 380, 60));

        jPanel2.setOpaque(false);

        teo1.setBackground(new java.awt.Color(153, 102, 0));
        teo1.setFont(new java.awt.Font("Yu Gothic", 1, 14)); // NOI18N
        teo1.setText("Teorema 1");
        teo1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                teo1ActionPerformed(evt);
            }
        });

        teo2.setBackground(new java.awt.Color(153, 102, 0));
        teo2.setFont(new java.awt.Font("Yu Gothic", 1, 14)); // NOI18N
        teo2.setText("Teorema 2");
        teo2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                teo2ActionPerformed(evt);
            }
        });

        teo3.setBackground(new java.awt.Color(153, 102, 0));
        teo3.setFont(new java.awt.Font("Yu Gothic", 1, 14)); // NOI18N
        teo3.setText("Teorema 3");
        teo3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                teo3ActionPerformed(evt);
            }
        });

        teo4.setBackground(new java.awt.Color(153, 102, 0));
        teo4.setFont(new java.awt.Font("Yu Gothic", 1, 14)); // NOI18N
        teo4.setText("Teorema 4");
        teo4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                teo4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(teo1)
                    .addComponent(teo2)
                    .addComponent(teo3)
                    .addComponent(teo4))
                .addGap(0, 24, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(teo1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(teo2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(teo3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(teo4)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 360, -1, 160));

        jPanel3.setOpaque(false);

        teo5.setBackground(new java.awt.Color(153, 102, 0));
        teo5.setFont(new java.awt.Font("Yu Gothic", 1, 14)); // NOI18N
        teo5.setText("Teorema 5");
        teo5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                teo5ActionPerformed(evt);
            }
        });

        teo6.setBackground(new java.awt.Color(153, 102, 0));
        teo6.setFont(new java.awt.Font("Yu Gothic", 1, 14)); // NOI18N
        teo6.setText("Teorema 6");
        teo6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                teo6ActionPerformed(evt);
            }
        });

        teo7.setBackground(new java.awt.Color(153, 102, 0));
        teo7.setFont(new java.awt.Font("Yu Gothic", 1, 14)); // NOI18N
        teo7.setText("Teorema 7");
        teo7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                teo7ActionPerformed(evt);
            }
        });

        teo8.setBackground(new java.awt.Color(153, 102, 0));
        teo8.setFont(new java.awt.Font("Yu Gothic", 1, 14)); // NOI18N
        teo8.setText("Teorema 8");
        teo8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                teo8ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(teo5)
                    .addComponent(teo6)
                    .addComponent(teo7)
                    .addComponent(teo8))
                .addGap(0, 17, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(teo5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(teo6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(teo7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(teo8)
                .addContainerGap())
        );

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 370, 120, 160));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Henry Quenun");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 140, 110, 40));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Luis Yax");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 130, 60, 60));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Adonis Rodriguez");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 160, 140, 40));

        jLabel4.setBackground(new java.awt.Color(255, 255, 255));
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Presioname Master");
        jLabel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel4MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 260, -1, 60));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 952, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 566, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
 /////////////////////////////////////
    class fondoPanel extends JPanel {
    Image imagen;
    public void paint(Graphics i){
     imagen = new ImageIcon(getClass().getResource("/imagenes/fondoA.gif")).getImage();
    i.drawImage(imagen,0,0,getWidth(),getHeight(),this);  setOpaque(false);  //getWidth() y getHeigth() adopta el tamaño del panel
   super.paint(i); //pasa parametro i de la clase padre paint
    } 
    }    
    fondoPanel fondo =new fondoPanel(); //sirve para editar desde el panel de diseño 
    /////////////////////////////////////
     // esta funcion ajusta imagen y permite colocar en varios label
    ImageIcon imagen;String ruta; Icon icono;
    private void scImagen(JLabel lbl, String ruta){
    this.imagen = new ImageIcon(ruta);
    this.icono = new ImageIcon(this.imagen.getImage().getScaledInstance(lbl.getWidth(), lbl.getHeight(),Image.SCALE_DEFAULT)); 
    lbl.setIcon(this.icono);
    this.repaint();
    }
    ////////////////////////////////////
    private void teo1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_teo1ActionPerformed
       Teorema1 frame1 = new Teorema1();
       frame1.setVisible(true);
       dispose();
    }//GEN-LAST:event_teo1ActionPerformed

    private void teo2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_teo2ActionPerformed
      Teorema2 frame2 = new Teorema2();
       frame2.setVisible(true);
       dispose();  
    }//GEN-LAST:event_teo2ActionPerformed

    private void teo3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_teo3ActionPerformed
Teorema3 frame3 = new Teorema3();
       frame3.setVisible(true);
       dispose();    }//GEN-LAST:event_teo3ActionPerformed

    private void teo4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_teo4ActionPerformed
       Teorema4 frame4 = new Teorema4();
       frame4.setVisible(true);
       dispose();
    }//GEN-LAST:event_teo4ActionPerformed

    private void teo5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_teo5ActionPerformed
Teorema5 frame5 = new Teorema5();
       frame5.setVisible(true);
       dispose();    }//GEN-LAST:event_teo5ActionPerformed

    private void teo6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_teo6ActionPerformed
       Teorema6 frame6 = new Teorema6();
       frame6.setVisible(true);
       dispose();      
    }//GEN-LAST:event_teo6ActionPerformed

    private void teo7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_teo7ActionPerformed
        Teorema7 frame7 = new Teorema7();
       frame7.setVisible(true);
       dispose();
    }//GEN-LAST:event_teo7ActionPerformed

    private void jLabel4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseClicked
       FormulasXD framexd = new FormulasXD();
       framexd.setVisible(true);
       dispose(); 
    }//GEN-LAST:event_jLabel4MouseClicked

    private void teo8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_teo8ActionPerformed
     Teorema8 frame8 = new Teorema8();
       frame8.setVisible(true);
       dispose();
    }//GEN-LAST:event_teo8ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(InicioP.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(InicioP.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(InicioP.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InicioP.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new InicioP().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JButton teo1;
    private javax.swing.JButton teo2;
    private javax.swing.JButton teo3;
    private javax.swing.JButton teo4;
    private javax.swing.JButton teo5;
    private javax.swing.JButton teo6;
    private javax.swing.JButton teo7;
    private javax.swing.JButton teo8;
    private javax.swing.JLabel tituloL;
    // End of variables declaration//GEN-END:variables
}
