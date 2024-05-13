/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import controlador.UsuarioController;
import javax.swing.JOptionPane;
import modelo.Usuario;

public class RegistroContratoFinanzas extends javax.swing.JFrame {
    UsuarioController userController = new UsuarioController();

    /**
     * Creates new form RegistroContratoFelicidad
     */
    public RegistroContratoFinanzas() {
        initComponents();
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
        PlanAhorros = new javax.swing.JCheckBox();
        PagosAutomaticos = new javax.swing.JCheckBox();
        registrar = new javax.swing.JButton();
        Username = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        ReducirTarifas = new javax.swing.JCheckBox();
        FiltrosCorreos = new javax.swing.JCheckBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Registrar felicidad");
        setResizable(false);

        jLabel1.setText("Contrato de Finanzas");

        PlanAhorros.setText("Plan de ahorro automático");
        PlanAhorros.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PlanAhorrosActionPerformed(evt);
            }
        });

        PagosAutomaticos.setText("Pagos automáticos");

        registrar.setText("Registrar");
        registrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registrarActionPerformed(evt);
            }
        });

        jLabel2.setText("Nombre");

        ReducirTarifas.setText("Explorar formas de reducir tarifas");

        FiltrosCorreos.setText("Filtors de correo electrónicos para rastrear gastos");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Username))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(FiltrosCorreos)
                            .addComponent(ReducirTarifas)
                            .addComponent(jLabel1)
                            .addComponent(PagosAutomaticos)
                            .addComponent(PlanAhorros))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(98, 98, 98)
                .addComponent(registrar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Username, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(PlanAhorros)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(PagosAutomaticos)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ReducirTarifas)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(FiltrosCorreos)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(registrar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void PlanAhorrosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PlanAhorrosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PlanAhorrosActionPerformed

    private void registrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registrarActionPerformed
        String username = this.Username.getText();
        Usuario usuarioExistente= UsuarioController.buscarUsuario(username);
        if (usuarioExistente == null) {
            JOptionPane.showMessageDialog(null, "¡Error! No existe un usuario con el nombre " + username + ".", "Error", JOptionPane.ERROR_MESSAGE);
        } else {
            usuarioExistente.getContratoFinanzas().setPlanAhorroAutomatico(this.PlanAhorros.isSelected());
            usuarioExistente.getContratoFinanzas().setPagosAutomaticos(this.PagosAutomaticos.isSelected());
            usuarioExistente.getContratoFinanzas().setReduceTarifasServicios(this.ReducirTarifas.isSelected());
            usuarioExistente.getContratoFinanzas().setCancelaTvCable(this.FiltrosCorreos.isSelected());
            JOptionPane.showMessageDialog(null, "Contrato de Finanzas del usuario " + username + " fué modificado exitosamente.", "Éxito", JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_registrarActionPerformed

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
            java.util.logging.Logger.getLogger(RegistroContratoFinanzas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RegistroContratoFinanzas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RegistroContratoFinanzas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RegistroContratoFinanzas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RegistroContratoFinanzas().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox FiltrosCorreos;
    private javax.swing.JCheckBox PagosAutomaticos;
    private javax.swing.JCheckBox PlanAhorros;
    private javax.swing.JCheckBox ReducirTarifas;
    private javax.swing.JTextField Username;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JButton registrar;
    // End of variables declaration//GEN-END:variables
}
