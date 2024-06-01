/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package logicaActivex.clasesLogica.clasesRutinasLogic;

import java.sql.ResultSet;
import java.sql.SQLException;

import conexionBD.Conexion;
import conexionBD.clasesDAO.clasesRutinasDAO.UsuarioEntrenamientoDAO;

public class UsuarioEntrenamiento {
    private int idUsuarioEntrenamiento;
    private int idUsuario;
    private int idEntrenamiento;

    public UsuarioEntrenamiento() {
    }

    public UsuarioEntrenamiento(int idUsuarioEntrenamiento) {
        this.idUsuarioEntrenamiento = idUsuarioEntrenamiento;
    }

    public UsuarioEntrenamiento(int idUsuarioEntrenamiento, int idUsuario, int idEntrenamiento) {
        this.idUsuarioEntrenamiento = idUsuarioEntrenamiento;
        this.idUsuario = idUsuario;
        this.idEntrenamiento = idEntrenamiento;
    }

    public String insertar(){
        Conexion conexion = new Conexion();
        UsuarioEntrenamientoDAO usuarioEntrenamientoDAO = new UsuarioEntrenamientoDAO(this.idUsuarioEntrenamiento, this.idUsuario, this.idEntrenamiento);
        String resultado = conexion.ejecutar(usuarioEntrenamientoDAO.insertar());
        conexion.cerrarConexion();
        return resultado;
    }
    
    public String eliminar(){
        Conexion conexion = new Conexion();
        UsuarioEntrenamientoDAO usuarioEntrenamientoDAO = new UsuarioEntrenamientoDAO(this.idUsuarioEntrenamiento);
        String resultado = conexion.ejecutar(usuarioEntrenamientoDAO.eliminar());
        conexion.cerrarConexion();
        return resultado;
    }
    
    public boolean consultar(){
        Conexion conexion = new Conexion();
        UsuarioEntrenamientoDAO usuarioEntrenamientoDAO = new UsuarioEntrenamientoDAO(this.idUsuarioEntrenamiento);
        ResultSet resultado = conexion.consultar(usuarioEntrenamientoDAO.consultar());
        try{
            if(resultado.next()){
                this.idUsuario = resultado.getInt("idUsuario");
                this.idEntrenamiento = resultado.getInt("idEntrenamiento");
                return true;
            }else{
                return false;
            }
        }catch(SQLException ex){
            ex.printStackTrace();
            return false;
        } finally {
            conexion.cerrarConexion();
        }
    }
    
    public String actualizar(){
        Conexion conexion = new Conexion();
        UsuarioEntrenamientoDAO usuarioEntrenamientoDAO = new UsuarioEntrenamientoDAO(this.idUsuarioEntrenamiento, this.idUsuario, this.idEntrenamiento);
        String resultado = conexion.ejecutar(usuarioEntrenamientoDAO.actualizar());
        conexion.cerrarConexion();
        return resultado;
    }
}
