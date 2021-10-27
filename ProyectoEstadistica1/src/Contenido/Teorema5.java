
package Contenido;

import java.awt.Image;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class Teorema5 extends javax.swing.JFrame {
ImageIcon imagen;String ruta; Icon icono;
    private void scImagen(JLabel lbl, String ruta){
    this.imagen = new ImageIcon(ruta);
    this.icono = new ImageIcon(this.imagen.getImage().getScaledInstance(lbl.getWidth(), lbl.getHeight(),Image.SCALE_DEFAULT)); 
    lbl.setIcon(this.icono);
    this.repaint();
    }
//////////////////////////   
    public void img(){
    this.scImagen(this.titulo5,"src/imagenes/T5.png");
    this.scImagen(this.formulalb,"src/imagenes/formulaT5.png");
    }
    
    
    
    public Teorema5() {
        initComponents();
        setLocationRelativeTo(null);
        img();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        atrasB5 = new javax.swing.JButton();
        titulo5 = new javax.swing.JLabel();
        formulalb = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        lbcanti = new javax.swing.JLabel();
        tx2 = new javax.swing.JTextField();
        tx3 = new javax.swing.JTextField();
        tx4 = new javax.swing.JTextField();
        tx5 = new javax.swing.JTextField();
        compBt = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        respT = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(153, 153, 153));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        atrasB5.setBackground(new java.awt.Color(255, 255, 102));
        atrasB5.setText("Atrás");
        atrasB5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                atrasB5ActionPerformed(evt);
            }
        });
        jPanel1.add(atrasB5, new org.netbeans.lib.awtextra.AbsoluteConstraints(19, 13, -1, -1));

        titulo5.setText("j");
        jPanel1.add(titulo5, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 30, 260, 70));
        jPanel1.add(formulalb, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 10, 370, 160));

        jLabel1.setText("De cuantas maneras puedo repartir mis peces en las peceras mencionadas?");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 210, 440, 70));

        jLabel2.setText("Tengo 9 peces y dos peceras cada una con capacidad de 2 peces, otra con capacidad de 4 peces y una ultima donde cabe solo un pez.  ");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 170, 810, 70));

        jLabel3.setFont(new java.awt.Font("Yu Gothic", 1, 24)); // NOI18N
        jLabel3.setText("-----------------------------------------------------------");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 330, 600, 70));

        lbcanti.setFont(new java.awt.Font("Yu Gothic", 1, 24)); // NOI18N
        lbcanti.setText("9");
        jPanel1.add(lbcanti, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 280, 70, 70));

        tx2.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jPanel1.add(tx2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 390, 100, 60));

        tx3.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jPanel1.add(tx3, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 390, 100, 60));

        tx4.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jPanel1.add(tx4, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 390, 100, 60));

        tx5.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jPanel1.add(tx5, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 390, 100, 60));

        compBt.setText("Comprobar respuesta");
        compBt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                compBtActionPerformed(evt);
            }
        });
        jPanel1.add(compBt, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 520, -1, -1));

        jLabel6.setFont(new java.awt.Font("Yu Gothic", 1, 36)); // NOI18N
        jLabel6.setText("!");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 400, 20, 40));

        jLabel7.setFont(new java.awt.Font("Yu Gothic", 1, 36)); // NOI18N
        jLabel7.setText("!");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 300, 20, 40));

        jLabel8.setFont(new java.awt.Font("Yu Gothic", 1, 36)); // NOI18N
        jLabel8.setText("!");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 400, 20, 40));

        jLabel9.setFont(new java.awt.Font("Yu Gothic", 1, 36)); // NOI18N
        jLabel9.setText("!");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 400, 20, 40));

        jLabel10.setFont(new java.awt.Font("Yu Gothic", 1, 36)); // NOI18N
        jLabel10.setText("!");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 400, 20, 40));

        jLabel11.setFont(new java.awt.Font("Yu Gothic", 1, 36)); // NOI18N
        jLabel11.setText("=");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 340, 40, 60));

        respT.setFont(new java.awt.Font("Yu Gothic", 1, 36)); // NOI18N
        respT.setText(".");
        jPanel1.add(respT, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 340, 230, 50));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 990, 700));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void atrasB5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_atrasB5ActionPerformed
        InicioP frame = new InicioP();
        frame.setVisible(true);
        dispose();
    }//GEN-LAST:event_atrasB5ActionPerformed

     public float Com(float cont){
    float resp = 0;
    float factorial=1;
    resp=cont;
   while ( resp!=0) {
  factorial=factorial*resp;
  resp--;
}
   return factorial;
 }
    private void compBtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_compBtActionPerformed
      try{
        float lbcanti1=Float.parseFloat(lbcanti.getText());float t2=Float.parseFloat(tx2.getText());
       float t3=Float.parseFloat(tx3.getText());float t4=Float.parseFloat(tx4.getText());float t5=Float.parseFloat(tx5.getText());
       float suma=t2+t3+t4+t5;
       if(suma==9){
       float result = Com(lbcanti1)/(Com(t2)*Com(t3)*Com(t4)*Com(t5));
       respT.setText(String.valueOf(result));
       }else{
       JOptionPane.showMessageDialog(null, "Analice nuevamente y distribuya los datos correctamente");
       tx2.setText("");tx3.setText("");tx4.setText("");tx5.setText("");
       }
      }catch(Exception e){
       JOptionPane.showMessageDialog(null, "Debe llenar todos los campos de correctamente");
       }
    }//GEN-LAST:event_compBtActionPerformed

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
            java.util.logging.Logger.getLogger(Teorema5.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Teorema5.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Teorema5.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Teorema5.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Teorema5().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton atrasB5;
    private javax.swing.JButton compBt;
    private javax.swing.JLabel formulalb;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lbcanti;
    private javax.swing.JLabel respT;
    private javax.swing.JLabel titulo5;
    private javax.swing.JTextField tx2;
    private javax.swing.JTextField tx3;
    private javax.swing.JTextField tx4;
    private javax.swing.JTextField tx5;
    // End of variables declaration//GEN-END:variables
}
