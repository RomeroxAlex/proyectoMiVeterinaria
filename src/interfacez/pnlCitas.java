
package interfacez;

import Clases.tablaCitas;
import Clases.tablaMascotas;
import Clases.tablaResponsables;
import java.awt.PopupMenu;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class pnlCitas extends javax.swing.JPanel {
    String nMascota;
    DefaultComboBoxModel responsables = new DefaultComboBoxModel();
    DefaultComboBoxModel nombresResponsables = new DefaultComboBoxModel();
    DefaultComboBoxModel mascotas = new DefaultComboBoxModel();
    DefaultComboBoxModel nombresMascotas = new DefaultComboBoxModel();
    DefaultTableModel modeloClientes = new DefaultTableModel();
    ArrayList<String> encabezados = new ArrayList<>();
    
    ResultSet rstResponsables = null;
    ResultSet rstMascotas = null;
    ResultSet rstClientes = null;
    tablaResponsables tablaResponsables = new tablaResponsables();
    tablaMascotas tablaMascota = new tablaMascotas();
    
    private String valor;
    ResultSet rs = null;
    tablaCitas tablaCitas = new tablaCitas();
    int cantidad, mayor;
    
    

    public void setValor(String valor) {
        this.valor = valor;
    }
    
    public void Columnas() {
        encabezados.clear();
        encabezados.add("Id");
        encabezados.add("Nombre");
        encabezados.add("Apellido");
        encabezados.add("Departamento");
        encabezados.add("Municipio");
        encabezados.add("Nombre Departamento");
        encabezados.add("Nombre Municipio");
    }

    public pnlCitas() {
        initComponents();
        cbxResponsables.setModel(responsables);
        txtIdCita.setEnabled(false);
    }

  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtBuscarCita = new javax.swing.JTextField();
        btnBuscarCita = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        txtIdCita = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        ftxtfechaCita = new javax.swing.JFormattedTextField();
        btnAgregar = new javax.swing.JButton();
        btnModificarCita = new javax.swing.JButton();
        btnEliminarCita = new javax.swing.JButton();
        btnLimpiar = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel5 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        ftxtHoraCita = new javax.swing.JFormattedTextField();
        jLabel6 = new javax.swing.JLabel();
        cbxResponsables = new javax.swing.JComboBox<>();
        txtMascota = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();

        txtBuscarCita.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtBuscarCitaKeyTyped(evt);
            }
        });

        btnBuscarCita.setText("Cargar C");
        btnBuscarCita.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarCitaActionPerformed(evt);
            }
        });

        jLabel2.setText("Id de la cita");

        txtIdCita.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtIdCitaKeyTyped(evt);
            }
        });

        jLabel3.setText("Mascota");

        jLabel4.setText("Fecha de la cita");

        try {
            ftxtfechaCita.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        btnAgregar.setText("Agregar");
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
            }
        });

        btnModificarCita.setText("Modificar");

        btnEliminarCita.setText("Eliminar");

        btnLimpiar.setText("Limpiar");

        jButton1.setText("Nuevo");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jLabel5.setText("Citas en el Sistema");

        jLabel1.setText("Hora Cita");

        jLabel6.setText("Responsable");

        cbxResponsables.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cbxResponsables.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbxResponsablesItemStateChanged(evt);
            }
        });

        txtMascota.addContainerListener(new java.awt.event.ContainerAdapter() {
            public void componentAdded(java.awt.event.ContainerEvent evt) {
                txtMascotaComponentAdded(evt);
            }
        });
        txtMascota.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtMascotaKeyTyped(evt);
            }
        });

        jButton2.setText("jButton2");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(100, 100, 100)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel1)
                            .addComponent(jLabel6))
                        .addGap(40, 40, 40)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtIdCita, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ftxtfechaCita)
                            .addComponent(ftxtHoraCita)
                            .addComponent(cbxResponsables, 0, 97, Short.MAX_VALUE)
                            .addComponent(txtMascota))
                        .addGap(29, 29, 29)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel5)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 662, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(btnModificarCita, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnAgregar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(btnBuscarCita, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtBuscarCita, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnEliminarCita, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnLimpiar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnBuscarCita)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(txtBuscarCita, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(96, 96, 96)
                        .addComponent(jButton1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnAgregar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnModificarCita))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnEliminarCita)
                        .addGap(31, 31, 31)
                        .addComponent(btnLimpiar))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(txtIdCita, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(txtMascota, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton2))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(cbxResponsables, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(ftxtfechaCita, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(ftxtHoraCita, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(75, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void txtBuscarCitaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBuscarCitaKeyTyped
        char validar = evt.getKeyChar();

        //Character.is Digit(validar)--> Si lo que quiero escribir son letras
        //Character.isLetter(validar)--> Si lo que quiero escribir son números
        if (Character.isLetter(validar)) {
            getToolkit().beep();
            evt.consume();
            JOptionPane.showMessageDialog(null, "Solo números");
        }
    }//GEN-LAST:event_txtBuscarCitaKeyTyped

    private void btnBuscarCitaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarCitaActionPerformed
        if (txtBuscarCita.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "por favor ingrese el id de la cita");
        }
    }//GEN-LAST:event_btnBuscarCitaActionPerformed

    private void txtIdCitaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtIdCitaKeyTyped
     char validar = evt.getKeyChar();

        //Character.is Digit(validar)--> Si lo que quiero escribir son letras
        //Character.isLetter(validar)--> Si lo que quiero escribir son números
        if (Character.isLetter(validar)) {
            getToolkit().beep();
            evt.consume();
            JOptionPane.showMessageDialog(null, "Solo números");
        }
    }//GEN-LAST:event_txtIdCitaKeyTyped

    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
      if (txtIdCita.getText().isEmpty() || ftxtfechaCita.getText().equals("  /  /    ")){
          JOptionPane.showMessageDialog(null, "Por favor rellene los campos solicitados");
      }
    }//GEN-LAST:event_btnAgregarActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        txtIdCita.setText(this.valor);
        
        rs = null;
        rs = tablaCitas.contarRegistros();
        try {
            while (rs.next()) {
                cantidad = rs.getInt(1);
                if (cantidad != 0) {// si no es cero es porque hay datos
                    rs = null;
                    //método en clase Clientes
                    rs = tablaCitas.mayorRegistro();
                    while (rs.next()) {
                        mayor = rs.getInt(1) + 1;
                        txtIdCita.setText("" + mayor);

                    }
                }else{
                    mayor=1;
                    txtIdCita.setText(""+mayor);
                }
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void cbxResponsablesItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbxResponsablesItemStateChanged
        //lblMunicipioSeleccionado.setText(String.valueOf(mascotas.getElementAt(posicion)));
    
    }//GEN-LAST:event_cbxResponsablesItemStateChanged

    private void txtMascotaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtMascotaKeyTyped
        // TODO add your handling code here:
        
    }//GEN-LAST:event_txtMascotaKeyTyped

    private void txtMascotaComponentAdded(java.awt.event.ContainerEvent evt) {//GEN-FIRST:event_txtMascotaComponentAdded
        String componente="",temporal="",idM="";
        temporal=txtMascota.getText();
        rs = null;
        rs = tablaCitas.getIdM(temporal);
        //JOptionPane.showMessageDialog(null, txtBusqueda.getText());
        try {
            while (rs.next()) {
                idM = rs.getString(1);

            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex);
        }

        rs = null;
        rs = tablaCitas.getDatos(idM);

        try {
            while (rs.next()) {
                cbxResponsables.addItem(rs.getString(4));
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex);
        }

        
        
    }//GEN-LAST:event_txtMascotaComponentAdded

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        String componente="",temporal="",idM="",idR="";
        temporal=txtMascota.getText();
        rs=null;
        rs=tablaCitas.getIdM(temporal);
        //JOptionPane.showMessageDialog(null, txtBusqueda.getText());
        try {
            while (rs.next()){
            idM=rs.getString(1);
     
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
       rs=tablaCitas.getDatos(idM);
         try {
            while (rs.next()){
                componente=rs.getString(4);
                cbxResponsables.addItem(componente);
     
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
       

    }//GEN-LAST:event_jButton2ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregar;
    private javax.swing.JButton btnBuscarCita;
    private javax.swing.JButton btnEliminarCita;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JButton btnModificarCita;
    private javax.swing.JComboBox<String> cbxResponsables;
    private javax.swing.JFormattedTextField ftxtHoraCita;
    private javax.swing.JFormattedTextField ftxtfechaCita;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField txtBuscarCita;
    private javax.swing.JTextField txtIdCita;
    private javax.swing.JTextField txtMascota;
    // End of variables declaration//GEN-END:variables

    private void setLocationRelativeTo(Object object) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
