package Clases;

import java.sql.ResultSet;

public class tablaResponsables {
    
    //instanciar un objeto de tipo Conexion
    conexionResponsables cn = new conexionResponsables();
//idResponsable pk, nT Responsables
    
    public void insertar(String idResponsable,String nombres,String apellidos,String edad,String fechaNacimiento,String celular,String fechaRegistro) { 
        cn.UID("INSERT INTO responsables " + "VALUES(' " + idResponsable + " ','" + nombres + "','" + apellidos + "','" + edad + "','"  
                + fechaNacimiento + "','" + celular + "','" + fechaRegistro + "')");
    }
   
    public void modificar(String idResponsable,String nombres,String apellidos,String edad,String fechaNacimiento,String celular,String fechaRegistro) {
        cn.UID("UPDATE responsables SET nombres='" + nombres + "',apellidos='" + apellidos + "',edad='" + edad + "',fechaNacimiento='" + fechaNacimiento + "',celular='" + celular + "',fechaRegistro='" + fechaRegistro + "' WHERE idResponsable='" + idResponsable + "'");
    }

    public void eliminar(String idResponsable) {
        cn.UID("DELETE FROM responsables WHERE idResponsable=' " + idResponsable + " ' ");
    }

    public ResultSet buscar(String idResponsable) {
        return (cn.getValores("SELECT * FROM responsables WHERE idResponsable='" + idResponsable + "'"));
    }
    
    public ResultSet contarRegistros() {
        return (cn.getValores("SELECT COUNT(idResponsable) FROM responsables"));
    }

    public ResultSet mayorRegistro() {
        return (cn.getValores("SELECT MAX(idResponsable) FROM responsables"));
    }

    
     public void insertarM_R(String idMascota,String idResponsable,String nombreM,String nombreR) { 
        cn.UID("INSERT INTO mascotas_responsables " + "VALUES(' " + idMascota + " ','" + idResponsable + "','"+nombreM+"','"+nombreR+"')");
    }
    
    
    
    public ResultSet llenarTabla() {
        return (cn.getValores("SELECT codigo,apellido1,nombre,celular FROM clientes"));
    }
}
