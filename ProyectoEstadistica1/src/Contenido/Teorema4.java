
package Contenido;

import java.awt.Image;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;


public class Teorema4 extends javax.swing.JFrame {
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
    this.scImagen(this.titulo4,"src/imagenes/T4.png");
    this.scImagen(this.formulalb,"src/imagenes/formulaT4.png");
    }
    
    public Teorema4() {
        initComponents();
        setLocationRelativeTo(null);
        img();
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        atrasB4 = new javax.swing.JButton();
        titulo4 = new javax.swing.JLabel();
        formulalb = new javax.swing.JLabel();
        resplb = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        comprobarbt = new javax.swing.JButton();
        tx1 = new javax.swing.JTextField();
        tx2 = new javax.swing.JTextField();
        tx3 = new javax.swing.JTextField();
        tx4 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(153, 187, 243));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        atrasB4.setBackground(new java.awt.Color(255, 255, 102));
        atrasB4.setText("Atrás");
        atrasB4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                atrasB4ActionPerformed(evt);
            }
        });
        jPanel1.add(atrasB4, new org.netbeans.lib.awtextra.AbsoluteConstraints(19, 13, -1, -1));

        titulo4.setText("j");
        jPanel1.add(titulo4, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 40, 260, 70));
        jPanel1.add(formulalb, new org.netbeans.lib.awtextra.AbsoluteConstraints(1010, 40, 240, 90));

        resplb.setFont(new java.awt.Font("Yu Gothic", 1, 36)); // NOI18N
        resplb.setText(".");
        jPanel1.add(resplb, new org.netbeans.lib.awtextra.AbsoluteConstraints(930, 430, 360, 50));

        jLabel2.setFont(new java.awt.Font("Yu Gothic", 1, 16)); // NOI18N
        jLabel2.setText("¿De cuántas formas diferentes se pueden arreglar 3 focos rojos, 4 amarillos y 2 azules en una serie de luces navideña con 9 portalámparas?");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 260, -1, 40));

        comprobarbt.setText("Comprobar Respuesta");
        comprobarbt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comprobarbtActionPerformed(evt);
            }
        });
        jPanel1.add(comprobarbt, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 680, -1, -1));

        tx1.setFont(new java.awt.Font("Yu Gothic", 1, 24)); // NOI18N
        jPanel1.add(tx1, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 380, 180, 60));

        tx2.setFont(new java.awt.Font("Yu Gothic", 1, 24)); // NOI18N
        jPanel1.add(tx2, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 490, 180, 60));

        tx3.setFont(new java.awt.Font("Yu Gothic", 1, 24)); // NOI18N
        jPanel1.add(tx3, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 490, 180, 60));

        tx4.setFont(new java.awt.Font("Yu Gothic", 1, 24)); // NOI18N
        jPanel1.add(tx4, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 490, 180, 60));

        jLabel3.setFont(new java.awt.Font("Yu Gothic", 1, 16)); // NOI18N
        jLabel3.setText("----------------------------------------------------------------------------------------");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 440, -1, 40));

        jLabel4.setFont(new java.awt.Font("Yu Gothic", 1, 36)); // NOI18N
        jLabel4.setText("!");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 510, 20, 40));

        jLabel5.setFont(new java.awt.Font("Yu Gothic", 1, 36)); // NOI18N
        jLabel5.setText("!");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 510, 20, 40));

        jLabel6.setFont(new java.awt.Font("Yu Gothic", 1, 36)); // NOI18N
        jLabel6.setText("!");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 510, 20, 40));

        jLabel7.setFont(new java.awt.Font("Yu Gothic", 1, 36)); // NOI18N
        jLabel7.setText("=");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 430, 40, 50));

        jLabel8.setFont(new java.awt.Font("Yu Gothic", 1, 36)); // NOI18N
        jLabel8.setText("!");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 380, 30, 60));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1621, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 789, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void atrasB4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_atrasB4ActionPerformed
        InicioP frame = new InicioP();
        frame.setVisible(true);
        dispose();
    }//GEN-LAST:event_atrasB4ActionPerformed
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
    
    private void comprobarbtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comprobarbtActionPerformed
        
           
            try{
                 float t1=Float.parseFloat(tx1.getText());float t2=Float.parseFloat(tx2.getText());
            float t3=Float.parseFloat(tx3.getText());float t4=Float.parseFloat(tx4.getText());
            if("9".equals(tx1.getText())&& "3".equals(tx2.getText())&&"4".equals(tx3.getText())&&"2".equals(tx4.getText())){
            float resp=Com(t1)/(Com(t2)*Com(t3)*Com(t4));
            String r=String.valueOf(resp);
            resplb.setText(r);
            }  else{
            JOptionPane.showMessageDialog(null, "Debes analizar nuevamente el problema, ingresa el dato correcto");
            tx1.setText("");tx2.setText("");tx3.setText("");tx4.setText("");resplb.setText("");
            }
          }catch(Exception e){
             JOptionPane.showMessageDialog(null, "Debes llenar todos los campos");
            }
    }//GEN-LAST:event_comprobarbtActionPerformed

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
            java.util.logging.Logger.getLogger(Teorema4.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Teorema4.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Teorema4.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Teorema4.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Teorema4().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton atrasB4;
    private javax.swing.JButton comprobarbt;
    private javax.swing.JLabel formulalb;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel resplb;
    private javax.swing.JLabel titulo4;
    private javax.swing.JTextField tx1;
    private javax.swing.JTextField tx2;
    private javax.swing.JTextField tx3;
    private javax.swing.JTextField tx4;
    // End of variables declaration//GEN-END:variables
}
