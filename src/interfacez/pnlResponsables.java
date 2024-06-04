
package interfacez;

import Clases.tablaMascotas;
import Clases.tablaResponsables;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import java.time.LocalDate;
import java.time.Period;

public class pnlResponsables extends javax.swing.JPanel {
    
    private String valor;

    public void setValor(String valor) {
        this.valor = valor;
    }
    
    
    tablaResponsables tablaResponsables= new tablaResponsables();
     
    ResultSet rs = null;
    int cantidad, mayor;
    public pnlResponsables() {
        initComponents();
        txtId.setEnabled(false);
        txtFechaRegistro.setText(LocalDate.now().toString());
        txtMascota.setEnabled(false);
    }

 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtId = new javax.swing.JTextField();
        txtNombre = new javax.swing.JTextField();
        txtApellido = new javax.swing.JTextField();
        txtEdad = new javax.swing.JTextField();
        btnAgregar = new javax.swing.JButton();
        btnModificar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        btnNuevo = new javax.swing.JButton();
        btnBuscar = new javax.swing.JButton();
        txtBuscar = new javax.swing.JTextField();
        ftxtFechaNacimiento = new javax.swing.JFormattedTextField();
        ftxtCelular = new javax.swing.JFormattedTextField();
        lblW = new javax.swing.JLabel();
        txtFechaRegistro = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txtMascota = new javax.swing.JTextField();

        setPreferredSize(new java.awt.Dimension(560, 620));

        jLabel1.setFont(new java.awt.Font("Sitka Small", 0, 18)); // NOI18N
        jLabel1.setText("Nombre ");

        jLabel2.setFont(new java.awt.Font("Sitka Small", 0, 18)); // NOI18N
        jLabel2.setText("Id del responsable");

        jLabel3.setFont(new java.awt.Font("Sitka Small", 0, 18)); // NOI18N
        jLabel3.setText("Apellido");

        jLabel4.setFont(new java.awt.Font("Sitka Small", 0, 18)); // NOI18N
        jLabel4.setText("Edad");

        jLabel5.setFont(new java.awt.Font("Sitka Small", 0, 18)); // NOI18N
        jLabel5.setText("Fecha de nacimiento");

        jLabel6.setFont(new java.awt.Font("Sitka Small", 0, 18)); // NOI18N
        jLabel6.setText("Celular");

        txtId.setFont(new java.awt.Font("Microsoft Sans Serif", 0, 18)); // NOI18N

        txtNombre.setFont(new java.awt.Font("Microsoft Sans Serif", 0, 18)); // NOI18N

        txtApellido.setFont(new java.awt.Font("Microsoft Sans Serif", 0, 18)); // NOI18N

        txtEdad.setFont(new java.awt.Font("Microsoft Sans Serif", 0, 18)); // NOI18N

        btnAgregar.setText("Agregar");
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
            }
        });

        btnModificar.setText("Modificar");
        btnModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarActionPerformed(evt);
            }
        });

        btnEliminar.setText("Eliminar");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        btnNuevo.setText("Nuevo");
        btnNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevoActionPerformed(evt);
            }
        });

        btnBuscar.setText("Buscar");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        ftxtCelular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ftxtCelularActionPerformed(evt);
            }
        });

        jLabel7.setText("Asignado a:");

        txtMascota.setText("jTextField1");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(lblW, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 89, Short.MAX_VALUE)
                        .addComponent(txtFechaRegistro, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnBuscar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLabel6)
                                            .addComponent(jLabel5))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(ftxtCelular, javax.swing.GroupLayout.DEFAULT_SIZE, 125, Short.MAX_VALUE)
                                            .addComponent(ftxtFechaNacimiento)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(10, 10, 10)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLabel4)
                                            .addComponent(jLabel3)
                                            .addComponent(jLabel1)
                                            .addComponent(jLabel2)
                                            .addComponent(jLabel7))
                                        .addGap(18, 18, 18)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(txtMascota, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(txtApellido, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGroup(layout.createSequentialGroup()
                                                    .addComponent(txtEdad)
                                                    .addGap(87, 87, 87))))))
                                .addGap(37, 37, 37))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnNuevo)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnAgregar)
                                .addGap(109, 109, 109)
                                .addComponent(btnModificar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnEliminar)))))
                .addGap(45, 45, 45))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAgregar)
                    .addComponent(btnModificar)
                    .addComponent(btnEliminar)
                    .addComponent(btnNuevo))
                .addGap(14, 14, 14)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(txtMascota, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtApellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtEdad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(ftxtFechaNacimiento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(ftxtCelular, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(55, 55, 55)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnBuscar)
                            .addComponent(txtBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(102, 102, 102)
                        .addComponent(lblW, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(txtFechaRegistro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(95, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        // TODO add your handling code here:
             if(txtId.getText().isEmpty()||txtNombre.getText().isEmpty()||txtApellido.getText().isEmpty()||txtEdad.getText().isEmpty()||ftxtFechaNacimiento.getText().isEmpty()||ftxtCelular.getText().isEmpty()){
            lblW.setText("Por favor, asegúrese de no dejar campos Nulos");
        }else{
                 tablaResponsables.eliminar(txtId.getText());
            lblW.setText("Se ha guardado con éxito");
            clean();
        }
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevoActionPerformed
        // TODO add your handling code here:
        txtMascota.setText(this.valor);
        
        txtFechaRegistro.setText(LocalDate.now().toString());
          rs = null;
        rs = tablaResponsables.contarRegistros();
        try {
            while (rs.next()) {
                cantidad = rs.getInt(1);
                if (cantidad != 0) {// si no es cero es porque hay datos
                    rs = null;
                    //método en clase Clientes
                    rs = tablaResponsables.mayorRegistro();
                    while (rs.next()) {
                        mayor = rs.getInt(1) + 1;
                        txtId.setText("" + mayor);

                    }
                }else{
                    mayor=1;
                    txtId.setText(""+mayor);
                }
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
    }//GEN-LAST:event_btnNuevoActionPerformed

    private void clean(){
        txtId.setText("");
        txtNombre.setText("");
        txtApellido.setText("");
        txtEdad.setText("");
        ftxtFechaNacimiento.setText("");
        ftxtCelular.setText("");
        
    }
    
    
    
    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
        // TODO add your handling code here:
        if(txtId.getText().isEmpty()||txtNombre.getText().isEmpty()||txtApellido.getText().isEmpty()||txtEdad.getText().isEmpty()||ftxtFechaNacimiento.getText().isEmpty()||ftxtCelular.getText().isEmpty()){
            lblW.setText("Por favor, asegúrese de no dejar campos Nulos");
        }else{
            String nombreM="";
            tablaResponsables.insertar(txtId.getText(), txtNombre.getText(), txtApellido.getText(), txtEdad.getText(), ftxtFechaNacimiento.getText(), ftxtCelular.getText(), txtFechaRegistro.getText());
            tablaResponsables.insertarM_R(valor, txtId.getText(),nombreM,txtNombre.getText());
            lblW.setText("Se ha guardado con éxito");
            clean();
        }
    }//GEN-LAST:event_btnAgregarActionPerformed

    private void btnModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarActionPerformed
        // TODO add your handling code here:
             if(txtId.getText().isEmpty()||txtNombre.getText().isEmpty()||txtApellido.getText().isEmpty()||txtEdad.getText().isEmpty()||ftxtFechaNacimiento.getText().isEmpty()||ftxtCelular.getText().isEmpty()){
            lblW.setText("Por favor, asegúrese de Cargar los datos");
        }else{
            tablaResponsables.modificar(txtId.getText(), txtNombre.getText(), txtApellido.getText(), txtEdad.getText(), ftxtFechaNacimiento.getText(), ftxtCelular.getText(), txtFechaRegistro.getText());
            lblW.setText("Se ha modificado con éxito");
            clean();
        }
        
    }//GEN-LAST:event_btnModificarActionPerformed

    private void ftxtCelularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ftxtCelularActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ftxtCelularActionPerformed

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        // TODO add your handling code here:
           rs=tablaResponsables.buscar(txtBuscar.getText());
        //JOptionPane.showMessageDialog(null, txtBusqueda.getText());
        try {
            while (rs.next()){
            
                txtId.setText(rs.getString(1));
                txtNombre.setText(rs.getString(2));
                txtApellido.setText(rs.getString(3));
                txtEdad.setText(rs.getString(4));
                ftxtFechaNacimiento.setText(rs.getString(5));
                ftxtCelular.setText(rs.getString(6));
                txtFechaRegistro.setText(rs.getString(7));
            
               
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
        
    }//GEN-LAST:event_btnBuscarActionPerformed

    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregar;
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnModificar;
    private javax.swing.JButton btnNuevo;
    private javax.swing.JFormattedTextField ftxtCelular;
    private javax.swing.JFormattedTextField ftxtFechaNacimiento;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel lblW;
    private javax.swing.JTextField txtApellido;
    private javax.swing.JTextField txtBuscar;
    private javax.swing.JTextField txtEdad;
    private javax.swing.JTextField txtFechaRegistro;
    private javax.swing.JTextField txtId;
    private javax.swing.JTextField txtMascota;
    private javax.swing.JTextField txtNombre;
    // End of variables declaration//GEN-END:variables
}
