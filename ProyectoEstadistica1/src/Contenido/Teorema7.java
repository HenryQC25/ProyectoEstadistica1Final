
package Contenido;

import java.awt.Image;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;


public class Teorema7 extends javax.swing.JFrame {
ImageIcon imagen;String ruta; Icon icono;
    private void scImagen(JLabel lbl, String ruta){
    this.imagen = new ImageIcon(ruta);
    this.icono = new ImageIcon(this.imagen.getImage().getScaledInstance(lbl.getWidth(), lbl.getHeight(),Image.SCALE_DEFAULT)); 
    lbl.setIcon(this.icono);
    this.repaint();
    }
//////////////////////////   
    public void img(){
   this.scImagen(this.titulo7,"src/imagenes/T7.png");
   this.scImagen(this.formulalb,"src/imagenes/formulaT6.png");
    }
  
    public Teorema7() {
        initComponents();
        setLocationRelativeTo(null);
        img();
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        atrasB6 = new javax.swing.JButton();
        formulalb = new javax.swing.JLabel();
        titulo7 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 204));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        atrasB6.setBackground(new java.awt.Color(153, 255, 153));
        atrasB6.setText("Atrás");
        atrasB6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                atrasB6ActionPerformed(evt);
            }
        });
        jPanel1.add(atrasB6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        formulalb.setText("                                                                 ");
        jPanel1.add(formulalb, new org.netbeans.lib.awtextra.AbsoluteConstraints(658, 13, 265, 82));

        titulo7.setBackground(new java.awt.Color(255, 204, 204));
        titulo7.setText("                                                                 ");
        titulo7.setOpaque(true);
        jPanel1.add(titulo7, new org.netbeans.lib.awtextra.AbsoluteConstraints(316, 13, 265, 82));

        jLabel1.setFont(new java.awt.Font("Yu Gothic", 1, 16)); // NOI18N
        jLabel1.setText("Sean A y B dos sucesos de un espacio muestral tal que P(A)=0.75, P(B)=0.35 y P(A∩B)=0.25.  calcule P(A∪B)");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 190, 890, 60));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 950, 650));

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
            java.util.logging.Logger.getLogger(Teorema7.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Teorema7.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Teorema7.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Teorema7.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Teorema7().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton atrasB6;
    private javax.swing.JLabel formulalb;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel titulo7;
    // End of variables declaration//GEN-END:variables
}
