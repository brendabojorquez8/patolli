/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package frames;

import frames.FrmJuego;
import frames.FrmEntrada;
import frames.CrearSala;
import javax.swing.JOptionPane;
import objetosNegocio.Jugador;
import static javax.swing.JOptionPane.WARNING_MESSAGE;
import static objetosNegocio.Sectores.CERO;
import static objetosNegocio.Sectores.DOS;
import static objetosNegocio.Sectores.TRES;
import static objetosNegocio.Sectores.UNO;

/**
 *
 * @author Zannie
 */
public class FrmUsuarioConfig extends javax.swing.JFrame {
    protected Jugador jugadorP, jugador2, jugador3, jugador4;
    /**
     * Creates new form FrmUsuarioConfig
     */
    public FrmUsuarioConfig() {
        initComponents();
        jugadorP = new Jugador();
        jugador2 = new Jugador("Jugador 2");
        jugador3 = new Jugador("Jugador 3");
        jugador4 = new Jugador("Jugador 4");
        jugadorP.setApuesta(CrearSala.apuesta);
        jugador2.setApuesta(CrearSala.apuesta);
        jugador3.setApuesta(CrearSala.apuesta);
        jugador4.setApuesta(CrearSala.apuesta);
        jugadorP.setSector(CERO);
        jugador2.setSector(UNO);
        jugador3.setSector(DOS);
        jugador4.setSector(TRES);
        jugadorP.setFichas(CrearSala.nFichas);
        jugador2.setFichas(CrearSala.nFichas);
        jugador3.setFichas(CrearSala.nFichas);
        jugador4.setFichas(CrearSala.nFichas);
            
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        btnMorado = new javax.swing.JButton();
        btnAzul = new javax.swing.JButton();
        btnRojo = new javax.swing.JButton();
        btnRosa = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        btnContinuar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Yu Gothic UI Semilight", 0, 24)); // NOI18N
        jLabel1.setText("Configuración de Jugador");

        jLabel2.setText("Nombre de Usuario:");

        btnMorado.setBackground(new java.awt.Color(102, 102, 255));
        btnMorado.setForeground(new java.awt.Color(153, 153, 255));
        btnMorado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMoradoActionPerformed(evt);
            }
        });

        btnAzul.setBackground(new java.awt.Color(0, 153, 255));
        btnAzul.setForeground(new java.awt.Color(0, 204, 255));
        btnAzul.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAzulActionPerformed(evt);
            }
        });

        btnRojo.setBackground(new java.awt.Color(255, 51, 51));
        btnRojo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRojoActionPerformed(evt);
            }
        });

        btnRosa.setBackground(new java.awt.Color(255, 102, 255));
        btnRosa.setForeground(new java.awt.Color(255, 102, 255));
        btnRosa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRosaActionPerformed(evt);
            }
        });

        jLabel3.setText("Seleccionar Color:");

        btnContinuar.setText("Continuar");
        btnContinuar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnContinuarActionPerformed(evt);
            }
        });

        btnCancelar.setText("Cancelar");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(107, 107, 107))
            .addGroup(layout.createSequentialGroup()
                .addGap(59, 59, 59)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(jLabel2)
                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 253, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnMorado, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(32, 32, 32)
                        .addComponent(btnAzul, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(27, 27, 27)
                        .addComponent(btnRojo, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(32, 32, 32)
                        .addComponent(btnRosa, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(150, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnCancelar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnContinuar)
                .addGap(38, 38, 38))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLabel1)
                .addGap(84, 84, 84)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 66, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addGap(45, 45, 45)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnRosa, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnMorado, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnAzul, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnRojo, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(86, 86, 86)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCancelar)
                    .addComponent(btnContinuar))
                .addGap(23, 23, 23))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnContinuarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnContinuarActionPerformed
        if(txtNombre.getText().equals("")|| txtNombre.getText().equals(null)){
            JOptionPane.showMessageDialog(this, "No puedes iniciar partida sin asignar un nombre", "CUIDADO", WARNING_MESSAGE);
        }else{
        jugadorP.setNombre(txtNombre.getText());
        if(jugadorP.getColor() == (null)){
            JOptionPane.showMessageDialog(this, "No puedes iniciar partida sin asignar un color", "CUIDADO", WARNING_MESSAGE);
        }else{
            
        FrmJuego juego = new FrmJuego();
        juego.setVisible(true);
        this.setVisible(false);
        }
        }
        
    }//GEN-LAST:event_btnContinuarActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        FrmEntrada entrada = new FrmEntrada();
        entrada.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void btnMoradoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMoradoActionPerformed
        jugadorP.setColor(btnMorado.getForeground());
        jugador2.setColor(btnAzul.getForeground());
        jugador3.setColor(btnRojo.getForeground());
        jugador4.setColor(btnRosa.getForeground());
    }//GEN-LAST:event_btnMoradoActionPerformed

    private void btnAzulActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAzulActionPerformed
        jugadorP.setColor(btnAzul.getForeground());
        jugador2.setColor(btnRojo.getForeground());
        jugador3.setColor(btnRosa.getForeground());
        jugador4.setColor(btnMorado.getForeground());
    }//GEN-LAST:event_btnAzulActionPerformed

    private void btnRojoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRojoActionPerformed
        jugadorP.setColor(btnRojo.getForeground());
        jugador2.setColor(btnRosa.getForeground());
        jugador3.setColor(btnMorado.getForeground());
        jugador4.setColor(btnAzul.getForeground());
    }//GEN-LAST:event_btnRojoActionPerformed

    private void btnRosaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRosaActionPerformed
        jugadorP.setColor(btnRosa.getForeground());
        jugador2.setColor(btnMorado.getForeground());
        jugador3.setColor(btnAzul.getForeground());
        jugador4.setColor(btnRojo.getForeground());
    }//GEN-LAST:event_btnRosaActionPerformed

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
            java.util.logging.Logger.getLogger(FrmUsuarioConfig.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmUsuarioConfig.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmUsuarioConfig.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmUsuarioConfig.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmUsuarioConfig().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAzul;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnContinuar;
    private javax.swing.JButton btnMorado;
    private javax.swing.JButton btnRojo;
    private javax.swing.JButton btnRosa;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JTextField txtNombre;
    // End of variables declaration//GEN-END:variables
}
