package Clases;

import java.sql.ResultSet;

public class tablaMascotas {
    
    //instanciar un objeto de tipo Conexion
    conexionResponsables cn = new conexionResponsables();
//Tabla mascotas idMascotaPK
    public void insertar(String idMascota, String nombres, String tipo, String altura, String peso, String raza, String fechaNacimiento,String edad,String fechaRegistro,String diagnostico) { 
        cn.UID("INSERT INTO mascotas " + "VALUES(' " + idMascota + " ','" + nombres + "','" + tipo + "','" + altura + "','"  
                + peso + "','" + raza + "','" + fechaNacimiento + "','"+edad+"','"+fechaRegistro+"','"+diagnostico+"')");
    }
   
    public void modificar(String idMascota, String nombres, String tipo, String altura, String peso, String raza, String fechaNacimiento,String edad,String fechaRegistro,String diagnostico) {
        cn.UID("UPDATE mascotas SET nombres='" + nombres + "',tipo='" + tipo + "',altura='" + altura+ "',peso='" + peso + "',raza='" + raza +"',fechaNacimiento='" + fechaNacimiento + "',edad='" + edad +"',fechaRegistro='" + fechaRegistro +"',diagnostico='" + diagnostico + "' WHERE idMascota='" + idMascota+ "'");
    }

    public void eliminar(String idMascota) {
        cn.UID("DELETE FROM mascotas WHERE idMascota=' " + idMascota + " ' ");
    }

    public ResultSet buscar(String codigo) {
        return (cn.getValores("SELECT * FROM mascotas WHERE idMascota='" + codigo + "'"));
    }
    
    public ResultSet contarRegistros() {
        return (cn.getValores("SELECT COUNT(idMascota) FROM mascotas"));
    }

    public ResultSet mayorRegistro() {
        return (cn.getValores("SELECT MAX(idMascota) FROM mascotas"));
    }

    
    
    
    
    
    public ResultSet llenarTabla() {
        return (cn.getValores("SELECT codigo,apellido1,nombre,celular FROM clientes"));
    }
}
