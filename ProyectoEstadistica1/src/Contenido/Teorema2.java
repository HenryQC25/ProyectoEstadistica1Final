
package Contenido;

import java.awt.Image;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;


public class Teorema2 extends javax.swing.JFrame {

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
    this.scImagen(this.titulo2,"src/imagenes/T2.png");
    this.scImagen(this.formulalb,"src/imagenes/formulaT2.png");
    }
    
    public Teorema2() {
        initComponents();
        img();
        setLocationRelativeTo(null);
    }

  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        atrasB1 = new javax.swing.JButton();
        titulo2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        nTxt = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        respT = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        rTxt = new javax.swing.JTextField();
        nTxt2 = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        formulalb = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 204));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        atrasB1.setBackground(new java.awt.Color(255, 255, 102));
        atrasB1.setText("Atrás");
        atrasB1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                atrasB1ActionPerformed(evt);
            }
        });
        jPanel1.add(atrasB1, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 13, -1, -1));

        titulo2.setText("j");
        jPanel1.add(titulo2, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 30, 260, 70));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("Un grupo está formado por cinco personas, y desea formar una comisión integrada por presidente y secretario, ¿De cuántas maneras puede formarse esta comisión?");
        jLabel1.setFocusable(false);
        jLabel1.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 200, -1, -1));

        nTxt.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jPanel1.add(nTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 330, 120, 60));

        jLabel2.setFont(new java.awt.Font("Yu Gothic", 1, 36)); // NOI18N
        jLabel2.setText(")");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 470, 30, 60));

        jLabel3.setFont(new java.awt.Font("Yu Gothic", 1, 18)); // NOI18N
        jLabel3.setText("--------------------------------------------------");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 420, 420, -1));

        respT.setFont(new java.awt.Font("Yu Gothic", 1, 36)); // NOI18N
        respT.setText(".");
        jPanel1.add(respT, new org.netbeans.lib.awtextra.AbsoluteConstraints(980, 430, 540, 60));

        jLabel5.setFont(new java.awt.Font("Yu Gothic", 1, 36)); // NOI18N
        jLabel5.setText("(");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 470, 30, 60));

        rTxt.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jPanel1.add(rTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 470, 90, 60));

        nTxt2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jPanel1.add(nTxt2, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 470, 90, 60));

        jLabel6.setFont(new java.awt.Font("Yu Gothic", 1, 36)); // NOI18N
        jLabel6.setText("!");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 360, 30, 60));

        jLabel7.setFont(new java.awt.Font("Yu Gothic", 1, 36)); // NOI18N
        jLabel7.setText("-");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 470, 30, 60));

        jLabel8.setFont(new java.awt.Font("Yu Gothic", 1, 36)); // NOI18N
        jLabel8.setText("!");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 470, 30, 60));

        jLabel9.setFont(new java.awt.Font("Yu Gothic", 1, 36)); // NOI18N
        jLabel9.setText("nPr");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 400, 70, 70));

        jLabel10.setFont(new java.awt.Font("Yu Gothic", 1, 36)); // NOI18N
        jLabel10.setText("=");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 430, 30, 60));

        jLabel11.setFont(new java.awt.Font("Yu Gothic", 1, 36)); // NOI18N
        jLabel11.setText("=");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 410, 30, 60));

        jButton1.setText("Comprobar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 600, -1, -1));
        jPanel1.add(formulalb, new org.netbeans.lib.awtextra.AbsoluteConstraints(1190, 10, 320, 140));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 764, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void atrasB1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_atrasB1ActionPerformed
        InicioP frame = new InicioP();
        frame.setVisible(true);
        dispose();
    }//GEN-LAST:event_atrasB1ActionPerformed

      public float Com(float tx){
    float resp = 0;
    float factorial=1;
        resp=tx;
   while ( resp!=0) {
  factorial=factorial*resp;
  resp--;
    }
    return factorial;
     }
    
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
      
        
        try{
              float ntxt= Float.parseFloat(nTxt.getText());
        float ntxt2= Float.parseFloat(nTxt2.getText());
        float rtxt=Float.parseFloat(rTxt.getText());
             float resta=ntxt2-rtxt;
       if("5".equals(nTxt.getText()) && "5".equals(nTxt2.getText()) && "2".equals(rTxt.getText())){
        float resultado = Com(ntxt)/Com(resta);
        respT.setText(String.valueOf(resultado));}else{
       JOptionPane.showMessageDialog(null, "Debes analizar nuevamente el problema, ingresa el dato correcto");
        nTxt.setText(""); nTxt2.setText(""); rTxt.setText("");  respT.setText("");
       }}catch(Exception e){
       JOptionPane.showMessageDialog(null, "Debes llenar todos los campos");
       }
    }//GEN-LAST:event_jButton1ActionPerformed

    
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
            java.util.logging.Logger.getLogger(Teorema2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Teorema2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Teorema2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Teorema2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Teorema2().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton atrasB1;
    private javax.swing.JLabel formulalb;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField nTxt;
    private javax.swing.JTextField nTxt2;
    private javax.swing.JTextField rTxt;
    private javax.swing.JLabel respT;
    private javax.swing.JLabel titulo2;
    // End of variables declaration//GEN-END:variables
}
