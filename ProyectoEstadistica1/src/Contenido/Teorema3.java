
package Contenido;

import java.awt.Image;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;


public class Teorema3 extends javax.swing.JFrame {
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
    this.scImagen(this.t3,"src/imagenes/T3.png");
    this.scImagen(this.imgM,"src/imagenes/PCircular.jpg");
    }
//////////////////////// 
   
    public Teorema3() {
        initComponents();
        img();
        setLocationRelativeTo(null);
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        t3 = new javax.swing.JLabel();
        imgM = new javax.swing.JLabel();
        atrasB = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        respuestaL = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        tx2 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        comp = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        tx1 = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(168, 205, 175));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        t3.setText("t3");
        jPanel1.add(t3, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 10, 261, 95));

        imgM.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        imgM.setText(".");
        imgM.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jPanel1.add(imgM, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 140, 430, 420));

        atrasB.setBackground(new java.awt.Color(255, 255, 102));
        atrasB.setText("Atrás");
        atrasB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                atrasBActionPerformed(evt);
            }
        });
        jPanel1.add(atrasB, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, -1, -1));

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel3.setText("Permutacion Circular: Las permutaciones circulares son un caso particular de las permutaciones.     Se utilizan cuando los elementos se han de ordenar \"en círculo\",\n(por ejemplo, los comensales en una mesa), de modo que el primer elemento que \"se sitúe\" en la muestra determina el principio y el final de muestra.");
        jLabel3.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jLabel3.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 120, 1000, 40));

        respuestaL.setFont(new java.awt.Font("Yu Gothic", 1, 18)); // NOI18N
        respuestaL.setText("Respuesta");
        jPanel1.add(respuestaL, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 290, 110, 40));

        jLabel2.setText("¿De cuántas maneras se pueden sentar 5 amigos alrededor de una mesa circular?");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 170, 480, 90));
        jPanel1.add(tx2, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 290, 60, 30));

        jLabel4.setFont(new java.awt.Font("Yu Gothic", 1, 18)); // NOI18N
        jLabel4.setText("PCn=");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 280, 50, 60));

        jLabel5.setFont(new java.awt.Font("Yu Gothic", 1, 18)); // NOI18N
        jLabel5.setText("=");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 290, 30, 40));

        comp.setBackground(new java.awt.Color(255, 255, 102));
        comp.setText("Comprobar Respuesta");
        comp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                compActionPerformed(evt);
            }
        });
        jPanel1.add(comp, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 370, -1, -1));

        jLabel6.setFont(new java.awt.Font("Yu Gothic", 1, 24)); // NOI18N
        jLabel6.setText(")");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 290, 30, 40));
        jPanel1.add(tx1, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 290, 60, 30));

        jLabel7.setFont(new java.awt.Font("Yu Gothic", 1, 18)); // NOI18N
        jLabel7.setText("!");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 290, 30, 40));

        jLabel8.setFont(new java.awt.Font("Yu Gothic", 1, 24)); // NOI18N
        jLabel8.setText("-");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 290, 30, 40));

        jLabel9.setFont(new java.awt.Font("Yu Gothic", 1, 24)); // NOI18N
        jLabel9.setText("(");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 290, 30, 40));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1160, 650));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void atrasBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_atrasBActionPerformed
       InicioP frame = new InicioP();
     frame.setVisible(true);
     dispose();
    }//GEN-LAST:event_atrasBActionPerformed
///////////////////////
    public float Com(){
    float resp = 0;
    float factorial=1;
    float txt1= Float.parseFloat(tx1.getText());
    float txt2= Float.parseFloat(tx2.getText());
    resp=txt1-txt2;
   while ( resp!=0) {
  factorial=factorial*resp;
  resp--;
}
    
    return factorial;
    }
    //////////////////////
    private void compActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_compActionPerformed
        String r= String.valueOf(Com());
        respuestaL.setText(r);
        
    }//GEN-LAST:event_compActionPerformed

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
            java.util.logging.Logger.getLogger(Teorema3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Teorema3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Teorema3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Teorema3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Teorema3().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton atrasB;
    private javax.swing.JButton comp;
    private javax.swing.JLabel imgM;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel respuestaL;
    private javax.swing.JLabel t3;
    private javax.swing.JTextField tx1;
    private javax.swing.JTextField tx2;
    // End of variables declaration//GEN-END:variables
}
