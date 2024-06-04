package Clases;

import java.sql.ResultSet;

public class tablaCitas {
    
    //instanciar un objeto de tipo Conexion
    conexionResponsables cn = new conexionResponsables();
//idCita pk,citas nT
    public void insertar(String idCita,String idMascota,String idResponsable,String fechaCita,String horaCita) { 
        cn.UID("INSERT INTO citas " + "VALUES(' " + idCita + " ','" + idMascota + "','" + idResponsable + "','" + fechaCita + "','"  
                + horaCita +"')");
    }
   
    public void modificar(String idCita,String idMascota,String idResponsable,String fechaCita,String horaCita) {
        cn.UID("UPDATE citas SET idMascota='" + idMascota + "',idResponsable='" + idResponsable + "',fechaCita='" + fechaCita + "',horaCita='" + horaCita + "' WHERE idCita='" + idCita + "'");
    }

    public void eliminar(String idCita) {
        cn.UID("DELETE FROM citas WHERE idCita=' " + idCita + " ' ");
    }

    public ResultSet buscar(String idCita) {
        return (cn.getValores("SELECT * FROM citas WHERE idCita='" + idCita + "'"));
    }
    
    public ResultSet contarRegistros() {
        return (cn.getValores("SELECT COUNT(idCita) FROM citas"));
    }

    public ResultSet mayorRegistro() {
        return (cn.getValores("SELECT MAX(idCita) FROM citas"));
    }

    //Existe tabla tipo_raza
     public ResultSet mascota_responsable(String idMascota) {
        return (cn.getValores("select * from tipo_raza where idMascota='"+idMascota+"'"));
    }
      public ResultSet getIdM(String clave) {
        return (cn.getValores("select * from mascotas where nombres='"+clave+"'"));
    }
    
       public ResultSet getDatos(String idM) {
        return (cn.getValores("select * from mascotas_responsables where idMascota='"+idM+"'"));
    }
    
    public ResultSet llenarTabla() {
        return (cn.getValores("SELECT codigo,apellido1,nombre,celular FROM clientes"));
    }
}
