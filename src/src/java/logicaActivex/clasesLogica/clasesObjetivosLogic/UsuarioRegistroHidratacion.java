/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package logicaActivex.clasesLogica.clasesObjetivosLogic;

import java.sql.ResultSet;
import java.sql.SQLException;

import conexionBD.Conexion;
import conexionBD.clasesDAO.clasesObjetivosDAO.*;

public class UsuarioRegistroHidratacion {
    private int idUsuarioRegistroHidratacion;
    private int idUsuario;
    private int idRegistroHidratacion;

    public UsuarioRegistroHidratacion() {
    }

    public UsuarioRegistroHidratacion(int idUsuarioRegistroHidratacion) {
        this.idUsuarioRegistroHidratacion = idUsuarioRegistroHidratacion;
    }

    public UsuarioRegistroHidratacion(int idUsuarioRegistroHidratacion, int idUsuario, int idRegistroHidratacion) {
        this.idUsuarioRegistroHidratacion = idUsuarioRegistroHidratacion;
        this.idUsuario = idUsuario;
        this.idRegistroHidratacion = idRegistroHidratacion;
    }

    public String insertar(){
        Conexion conexion = new Conexion();
        UsuarioRegistroHidratacionDAO usuarioRegistroHidratacionDAO = new UsuarioRegistroHidratacionDAO(this.idUsuarioRegistroHidratacion, this.idUsuario, this.idRegistroHidratacion);
        String resultado = conexion.ejecutar(usuarioRegistroHidratacionDAO.insertar());
        conexion.cerrarConexion();
        return resultado;
    }
    
    public String eliminar(){
        Conexion conexion = new Conexion();
        UsuarioRegistroHidratacionDAO usuarioRegistroHidratacionDAO = new UsuarioRegistroHidratacionDAO(this.idUsuarioRegistroHidratacion);
        String resultado = conexion.ejecutar(usuarioRegistroHidratacionDAO.eliminar());
        conexion.cerrarConexion();
        return resultado;
    }
    
    public boolean consultar(){
        Conexion conexion = new Conexion();
        UsuarioRegistroHidratacionDAO usuarioRegistroHidratacionDAO = new UsuarioRegistroHidratacionDAO(this.idUsuarioRegistroHidratacion);
        ResultSet resultado = conexion.consultar(usuarioRegistroHidratacionDAO.consultar());
        try{
            if(resultado.next()){
                this.idUsuario = resultado.getInt("idUsuario");
                this.idRegistroHidratacion = resultado.getInt("idRegistroHidratacion");
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
        UsuarioRegistroHidratacionDAO usuarioRegistroHidratacionDAO = new UsuarioRegistroHidratacionDAO(this.idUsuarioRegistroHidratacion, this.idUsuario, this.idRegistroHidratacion);
        String resultado = conexion.ejecutar(usuarioRegistroHidratacionDAO.actualizar());
        conexion.cerrarConexion();
        return resultado;
    }
}
