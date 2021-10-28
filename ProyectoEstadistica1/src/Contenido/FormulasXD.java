
package Contenido;

import java.awt.Graphics;
import java.awt.Image;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;


public class FormulasXD extends javax.swing.JFrame {

   
    public FormulasXD() {
        initComponents();
        img();
        setLocationRelativeTo(null);
    }

    class fondoPanel extends JPanel {
    Image imagen;
    public void paint(Graphics i){
     imagen = new ImageIcon(getClass().getResource("/imagenes/fondo gato.gif")).getImage();
    i.drawImage(imagen,0,0,getWidth(),getHeight(),this);  setOpaque(false);  //getWidth() y getHeigth() adopta el tamaño del panel
   super.paint(i); //pasa parametro i de la clase padre paint
    } 
    }    
    fondoPanel fondo =new fondoPanel(); //sirve para editar desde el panel de diseño 
    /////////////////////////////////////
    ImageIcon imagen;String ruta; Icon icono;
    private void scImagen(JLabel lbl, String ruta){
    this.imagen = new ImageIcon(ruta);
    this.icono = new ImageIcon(this.imagen.getImage().getScaledInstance(lbl.getWidth(), lbl.getHeight(),Image.SCALE_DEFAULT)); 
    lbl.setIcon(this.icono);
    this.repaint();
    }
//////////////////////////   
    public void img(){
    this.scImagen(this.t1,"src/imagenes/formulaT1.png");
     this.scImagen(this.t2,"src/imagenes/formulaT2.png");
      this.scImagen(this.t3,"src/imagenes/formulaT3.png");
       this.scImagen(this.t4,"src/imagenes/formulaT4.png");
        this.scImagen(this.t5,"src/imagenes/formulaT5.png");
         this.scImagen(this.t6,"src/imagenes/formulaT6.png");
         this.scImagen(this.t7,"src/imagenes/formulaT7.png");
         this.scImagen(this.t8,"src/imagenes/formulaT8.png");
    }
    //////////////////////////////
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new fondoPanel();
        atrasB6 = new javax.swing.JButton();
        t1 = new javax.swing.JLabel();
        t3 = new javax.swing.JLabel();
        t4 = new javax.swing.JLabel();
        t5 = new javax.swing.JLabel();
        t6 = new javax.swing.JLabel();
        t7 = new javax.swing.JLabel();
        t8 = new javax.swing.JLabel();
        t2 = new javax.swing.JLabel();
        t9 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        atrasB6.setBackground(new java.awt.Color(255, 255, 102));
        atrasB6.setText("Atrás");
        atrasB6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                atrasB6ActionPerformed(evt);
            }
        });
        jPanel1.add(atrasB6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 720, -1, -1));

        t1.setBackground(new java.awt.Color(255, 0, 51));
        t1.setText("      ");
        t1.setOpaque(true);
        jPanel1.add(t1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 440, 130, 80));

        t3.setBackground(new java.awt.Color(255, 0, 51));
        t3.setText("      ");
        t3.setOpaque(true);
        jPanel1.add(t3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 200, 150, 90));

        t4.setBackground(new java.awt.Color(255, 0, 51));
        t4.setText("      ");
        t4.setOpaque(true);
        jPanel1.add(t4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, 170, 110));

        t5.setBackground(new java.awt.Color(255, 0, 51));
        t5.setText("      ");
        t5.setOpaque(true);
        jPanel1.add(t5, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 30, 260, 130));

        t6.setBackground(new java.awt.Color(255, 0, 51));
        t6.setText("      ");
        t6.setOpaque(true);
        jPanel1.add(t6, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 50, 140, 90));

        t7.setBackground(new java.awt.Color(255, 0, 51));
        t7.setText("      ");
        t7.setOpaque(true);
        jPanel1.add(t7, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 50, 190, 90));

        t8.setBackground(new java.awt.Color(255, 0, 51));
        t8.setText("      ");
        t8.setOpaque(true);
        jPanel1.add(t8, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 50, 550, 90));

        t2.setBackground(new java.awt.Color(255, 0, 51));
        t2.setText("      ");
        t2.setOpaque(true);
        jPanel1.add(t2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 320, 140, 90));

        t9.setBackground(new java.awt.Color(255, 255, 255));
        t9.setFont(new java.awt.Font("Yu Gothic", 1, 36)); // NOI18N
        t9.setText("Aqui tienes un hack, suerte! ;)");
        jPanel1.add(t9, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 570, 540, 120));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -2, 1380, 760));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void atrasB6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_atrasB6ActionPerformed
        InicioP frame = new InicioP();
        frame.setVisible(true);
        dispose();
    }//GEN-LAST:event_atrasB6ActionPerformed

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
            java.util.logging.Logger.getLogger(FormulasXD.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormulasXD.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormulasXD.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormulasXD.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormulasXD().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton atrasB6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel t1;
    private javax.swing.JLabel t2;
    private javax.swing.JLabel t3;
    private javax.swing.JLabel t4;
    private javax.swing.JLabel t5;
    private javax.swing.JLabel t6;
    private javax.swing.JLabel t7;
    private javax.swing.JLabel t8;
    private javax.swing.JLabel t9;
    // End of variables declaration//GEN-END:variables
}
