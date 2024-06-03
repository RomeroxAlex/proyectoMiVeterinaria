package Clases;

import java.sql.ResultSet;

public class responsablesRegistro {
    
    //Instanciamos un objeto de tipo conexionCalistenia
    conexionResponsables cn = new conexionResponsables();
    
    public void agregar(String Id, String nombre, String apellido, String edad, String fechaNacimiento, String celular){
        cn.UID("INSERT INTO responsablesM " + "VALUES(' " + Id + " ','" + nombre + "','" + apellido + "','" + edad + "','"  
                + fechaNacimiento + "','" + celular + "')");
    }
    
    public void modificar(String Id, String nombre, String apellido, String edad, String fechaNacimiento, String celular){
        cn.UID("UPDATE responsablesM SET Id='" + Id + "',nombre='" + nombre + "',apellido='" + apellido + "',edad='" + edad + "',fechaNacimiento='" + fechaNacimiento + "',celular='" + celular + "' WHERE Id='" + Id + "'");
    
    }
    public void eliminar(String Id) {
        cn.UID("DELETE FROM responsalesM WHERE Id=' " + Id + " ' ");
    }

    public ResultSet buscar(String Id) {
        return (cn.getValores("SELECT * FROM responsablesM WHERE Id='" + Id + "'"));
    }
    
    public ResultSet contarRegistros() {
        return (cn.getValores("SELECT COUNT(Id) FROM responsablesM"));
    }

    public ResultSet mayorRegistro() {
        return (cn.getValores("SELECT MAX(Id) FROM responsablesM"));
    }
}
