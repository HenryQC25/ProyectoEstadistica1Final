
package Contenido;

import java.awt.Image;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;


public class Teorema1 extends javax.swing.JFrame {
///////////////////////////
     ImageIcon imagen;String ruta; Icon icono;
    private void scImagen(JLabel lbl, String ruta){
    this.imagen = new ImageIcon(ruta);
    this.icono = new ImageIcon(this.imagen.getImage().getScaledInstance(lbl.getWidth(), lbl.getHeight(),Image.SCALE_DEFAULT)); 
    lbl.setIcon(this.icono);
    this.repaint();
    }
//////////////////////////   
    public void img(){
    this.scImagen(this.titulo1,"src/imagenes/T1.png");
    
    }
////////////////////////    
    public Teorema1() {
        initComponents();
        img();
        setLocationRelativeTo(null);
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        titulo1 = new javax.swing.JLabel();
        atrasB = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        Cnum = new javax.swing.JTextField();
        lasResp = new javax.swing.JLabel();
        comBoton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(0, 204, 204));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Yu Gothic", 1, 24)); // NOI18N
        jLabel1.setText("¿Cuántos números de  5  cifras diferentes se pueden formar con los dígitos: 1,2,3,4,5 ?");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 160, 1050, 40));

        titulo1.setText("j");
        jPanel1.add(titulo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 30, 260, 70));

        atrasB.setBackground(new java.awt.Color(255, 255, 102));
        atrasB.setText("Atrás");
        atrasB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                atrasBActionPerformed(evt);
            }
        });
        jPanel1.add(atrasB, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        jLabel2.setFont(new java.awt.Font("Yu Gothic", 1, 48)); // NOI18N
        jLabel2.setText("! =");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 300, 110, -1));
        jPanel1.add(Cnum, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 320, 100, 40));

        lasResp.setFont(new java.awt.Font("Yu Gothic", 1, 48)); // NOI18N
        lasResp.setText(".");
        jPanel1.add(lasResp, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 300, 430, 80));

        comBoton.setText("Comprobar respuesta");
        comBoton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comBotonActionPerformed(evt);
            }
        });
        jPanel1.add(comBoton, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 410, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1230, 540));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void atrasBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_atrasBActionPerformed
     InicioP frame = new InicioP();
     frame.setVisible(true);
     dispose();
    }//GEN-LAST:event_atrasBActionPerformed
////////
     public float Com(){
    float resp = 0;
    float factorial=1;
    float txt1= Float.parseFloat(Cnum.getText());
    if(txt1==0){
        lasResp.setText("1");
    }else{
        resp=txt1;
   while ( resp!=0) {
  factorial=factorial*resp;
  resp--;
}
    }
    return factorial;
     }
    private void comBotonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comBotonActionPerformed
         String r= String.valueOf(Com());
        lasResp.setText(r);
    }//GEN-LAST:event_comBotonActionPerformed

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
            java.util.logging.Logger.getLogger(Teorema1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Teorema1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Teorema1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Teorema1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Teorema1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Cnum;
    private javax.swing.JButton atrasB;
    private javax.swing.JButton comBoton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lasResp;
    private javax.swing.JLabel titulo1;
    // End of variables declaration//GEN-END:variables
}
