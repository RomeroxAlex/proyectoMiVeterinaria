
package interfacez;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;


public class frmIntercambio extends javax.swing.JFrame {

   
    public frmIntercambio() {
        initComponents();
        

    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlContenido = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtBuscarId = new javax.swing.JTextField();
        btnBuscar = new javax.swing.JButton();
        btnLimpiar = new javax.swing.JButton();
        cbxCambioPaneles = new javax.swing.JComboBox<>();
        btnNuevo = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Veterinaria Mascota Feliz");
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setLocation(new java.awt.Point(0, 0));
        setResizable(false);

        pnlContenido.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        javax.swing.GroupLayout pnlContenidoLayout = new javax.swing.GroupLayout(pnlContenido);
        pnlContenido.setLayout(pnlContenidoLayout);
        pnlContenidoLayout.setHorizontalGroup(
            pnlContenidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 893, Short.MAX_VALUE)
        );
        pnlContenidoLayout.setVerticalGroup(
            pnlContenidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jLabel1.setText("Buscar Id");

        txtBuscarId.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtBuscarIdKeyTyped(evt);
            }
        });

        btnBuscar.setText("Buscar");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        btnLimpiar.setText("Limpiar");

        cbxCambioPaneles.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Responsables", "Mascotas", "Citas", "Consultas" }));
        cbxCambioPaneles.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxCambioPanelesActionPerformed(evt);
            }
        });

        btnNuevo.setText("Nuevo");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(531, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(txtBuscarId, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnBuscar)
                .addGap(35, 35, 35)
                .addComponent(btnLimpiar)
                .addGap(18, 18, 18)
                .addComponent(btnNuevo)
                .addGap(31, 31, 31))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(cbxCambioPaneles, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(pnlContenido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(16, 16, 16))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnLimpiar)
                    .addComponent(txtBuscarId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBuscar)
                    .addComponent(jLabel1)
                    .addComponent(btnNuevo))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(cbxCambioPaneles, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 568, Short.MAX_VALUE))
                    .addComponent(pnlContenido, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cbxCambioPanelesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxCambioPanelesActionPerformed
       

            if (cbxCambioPaneles.getSelectedItem().equals("Responsables")) {
                pnlResponsables pnlResponsable = new pnlResponsables();
                pnlResponsable.setSize(900, 580);
                pnlResponsable.setLocation(2, 3);
                pnlContenido.removeAll();
                pnlContenido.add(pnlResponsable, BorderLayout.CENTER);
                pnlContenido.revalidate();
                pnlContenido.repaint();

            } else if (cbxCambioPaneles.getSelectedItem().equals("Mascotas")) {
                pnlMascotas pnlM = new pnlMascotas();
                pnlM.setSize(900, 580);
                pnlM.setLocation(2, 3);
                pnlContenido.removeAll();
                pnlContenido.add(pnlM, BorderLayout.CENTER);
                pnlContenido.revalidate();
                pnlContenido.repaint();
            } else if (cbxCambioPaneles.getSelectedItem().equals("Citas")) {
                pnlCitas pnlC = new pnlCitas();
                pnlC.setSize(900, 580);
                pnlC.setLocation(2, 3);
                pnlContenido.removeAll();
                pnlContenido.add(pnlC, BorderLayout.CENTER);
                pnlContenido.revalidate();
                pnlContenido.repaint();

            } else if (cbxCambioPaneles.getSelectedItem().equals("Consultas")) {
                pnlConsultas pnlCo = new pnlConsultas();
                pnlCo.setSize(900, 580);
                pnlCo.setLocation(2, 3);
                pnlContenido.removeAll();
                pnlContenido.add(pnlCo, BorderLayout.CENTER);
                pnlContenido.revalidate();
                pnlContenido.repaint();
            }
        

    }//GEN-LAST:event_cbxCambioPanelesActionPerformed

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        if (txtBuscarId.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Por favor ingrese un id");

        }
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void txtBuscarIdKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBuscarIdKeyTyped
        char validar = evt.getKeyChar();

        //Character.is Digit(validar)--> Si lo que quiero escribir son letras
        //Character.isLetter(validar)--> Si lo que quiero escribir son números
        if (Character.isLetter(validar)) {
            getToolkit().beep();
            evt.consume();
            JOptionPane.showMessageDialog(null, "Solo números");
        }
    }//GEN-LAST:event_txtBuscarIdKeyTyped

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
            java.util.logging.Logger.getLogger(frmIntercambio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmIntercambio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmIntercambio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmIntercambio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmIntercambio().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JButton btnNuevo;
    private javax.swing.JComboBox<String> cbxCambioPaneles;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel pnlContenido;
    private javax.swing.JTextField txtBuscarId;
    // End of variables declaration//GEN-END:variables
}
