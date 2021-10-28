
package Contenido;

import java.awt.Image;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class Teorema8 extends javax.swing.JFrame {

  ImageIcon imagen;String ruta; Icon icono;
    private void scImagen(JLabel lbl, String ruta){
    this.imagen = new ImageIcon(ruta);
    this.icono = new ImageIcon(this.imagen.getImage().getScaledInstance(lbl.getWidth(), lbl.getHeight(),Image.SCALE_DEFAULT)); 
    lbl.setIcon(this.icono);
    this.repaint();
    }
//////////////////////////   
    public void img(){
   this.scImagen(this.titulo8,"src/imagenes/T8.png");
   this.scImagen(this.formulalb,"src/imagenes/formulaT8.png");
    }
    public Teorema8() {
        initComponents();
        img();
        setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        atrasB6 = new javax.swing.JButton();
        titulo8 = new javax.swing.JLabel();
        formulalb = new javax.swing.JLabel();
        respT = new javax.swing.JLabel();
        titulo10 = new javax.swing.JLabel();
        titulo11 = new javax.swing.JLabel();
        Comprobarbt = new javax.swing.JButton();
        tx4 = new javax.swing.JTextField();
        tx1 = new javax.swing.JTextField();
        tx2 = new javax.swing.JTextField();
        tx3 = new javax.swing.JTextField();
        titulo12 = new javax.swing.JLabel();
        titulo13 = new javax.swing.JLabel();
        titulo14 = new javax.swing.JLabel();
        titulo15 = new javax.swing.JLabel();
        titulo16 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        atrasB6.setBackground(new java.awt.Color(153, 255, 153));
        atrasB6.setText("Atrás");
        atrasB6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                atrasB6ActionPerformed(evt);
            }
        });
        jPanel1.add(atrasB6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        titulo8.setForeground(new java.awt.Color(255, 255, 255));
        titulo8.setText("t");
        jPanel1.add(titulo8, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 30, 370, 90));

        formulalb.setForeground(new java.awt.Color(255, 255, 255));
        formulalb.setText("t");
        jPanel1.add(formulalb, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 110, 810, 90));

        respT.setFont(new java.awt.Font("Yu Gothic", 1, 18)); // NOI18N
        respT.setForeground(new java.awt.Color(255, 255, 255));
        respT.setText(".");
        jPanel1.add(respT, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 370, 310, 50));

        titulo10.setForeground(new java.awt.Color(255, 255, 255));
        titulo10.setText("Las probabilidades de que Luis compre una nueva laptop de la marca MSI, DELL, HP o Asus son de 0.11,0.13,0.15,0.29, ");
        jPanel1.add(titulo10, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 200, 750, 40));

        titulo11.setForeground(new java.awt.Color(255, 255, 255));
        titulo11.setText("Cual es la probabilidad de que Luis compre su laptop de una de esas marcas?  Recuarda que son mutuamente exluyentes");
        jPanel1.add(titulo11, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 250, 710, 40));

        Comprobarbt.setText("Comprobar Respuesta");
        Comprobarbt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ComprobarbtActionPerformed(evt);
            }
        });
        jPanel1.add(Comprobarbt, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 470, -1, -1));
        jPanel1.add(tx4, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 380, 50, -1));
        jPanel1.add(tx1, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 380, 50, -1));
        jPanel1.add(tx2, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 380, 50, -1));
        jPanel1.add(tx3, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 380, 50, -1));

        titulo12.setFont(new java.awt.Font("Yu Gothic", 1, 18)); // NOI18N
        titulo12.setForeground(new java.awt.Color(255, 255, 255));
        titulo12.setText("P(m∪d∪h∪a)=");
        jPanel1.add(titulo12, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 340, 150, 100));

        titulo13.setFont(new java.awt.Font("Yu Gothic", 1, 18)); // NOI18N
        titulo13.setForeground(new java.awt.Color(255, 255, 255));
        titulo13.setText("+");
        jPanel1.add(titulo13, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 370, 30, 40));

        titulo14.setFont(new java.awt.Font("Yu Gothic", 1, 18)); // NOI18N
        titulo14.setForeground(new java.awt.Color(255, 255, 255));
        titulo14.setText("+");
        jPanel1.add(titulo14, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 370, 30, 40));

        titulo15.setFont(new java.awt.Font("Yu Gothic", 1, 18)); // NOI18N
        titulo15.setForeground(new java.awt.Color(255, 255, 255));
        titulo15.setText("+");
        jPanel1.add(titulo15, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 370, 30, 40));

        titulo16.setFont(new java.awt.Font("Yu Gothic", 1, 18)); // NOI18N
        titulo16.setForeground(new java.awt.Color(255, 255, 255));
        titulo16.setText("=");
        jPanel1.add(titulo16, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 370, 30, 40));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1180, 640));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void atrasB6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_atrasB6ActionPerformed
        InicioP frame = new InicioP();
        frame.setVisible(true);
        dispose();
    }//GEN-LAST:event_atrasB6ActionPerformed

    private void ComprobarbtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ComprobarbtActionPerformed
try{
     float t1=Float.parseFloat(tx1.getText());float t2=Float.parseFloat(tx2.getText());float t3=Float.parseFloat(tx3.getText());float t4=Float.parseFloat(tx4.getText());
      if("0.11".equals(tx1.getText())&&"0.13".equals(tx2.getText())&&"0.15".equals(tx3.getText())&&"0.29".equals(tx4.getText())){
        float resp=t1+t2+t3+t4;
        respT.setText(String.valueOf(resp));}else{
        JOptionPane.showMessageDialog(null, "Analiza los datos e intenta de nuevo, suerte");
        tx1.setText("");tx2.setText("");tx3.setText("");
        }
                } catch(Exception e){
        JOptionPane.showMessageDialog(null, "Debe llenar todos los campos de correctamente");
        }
    }//GEN-LAST:event_ComprobarbtActionPerformed

   
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
            java.util.logging.Logger.getLogger(Teorema8.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Teorema8.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Teorema8.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Teorema8.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Teorema8().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Comprobarbt;
    private javax.swing.JButton atrasB6;
    private javax.swing.JLabel formulalb;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel respT;
    private javax.swing.JLabel titulo10;
    private javax.swing.JLabel titulo11;
    private javax.swing.JLabel titulo12;
    private javax.swing.JLabel titulo13;
    private javax.swing.JLabel titulo14;
    private javax.swing.JLabel titulo15;
    private javax.swing.JLabel titulo16;
    private javax.swing.JLabel titulo8;
    private javax.swing.JTextField tx1;
    private javax.swing.JTextField tx2;
    private javax.swing.JTextField tx3;
    private javax.swing.JTextField tx4;
    // End of variables declaration//GEN-END:variables
}
