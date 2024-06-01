/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package logicaActivex.clasesLogica.clasesObjetivosLogic;

import java.sql.ResultSet;
import java.sql.SQLException;

import conexionBD.Conexion;
import conexionBD.clasesDAO.clasesObjetivosDAO.*;

public class UsuarioObjetivoSemanal {
    private int idUsuarioObjetivoSemanal;
    private int idUsuario;
    private int idObjetivo;

    public UsuarioObjetivoSemanal() {
    }

    public UsuarioObjetivoSemanal(int idUsuarioObjetivoSemanal) {
        this.idUsuarioObjetivoSemanal = idUsuarioObjetivoSemanal;
    }

    public UsuarioObjetivoSemanal(int idUsuarioObjetivoSemanal, int idUsuario, int idObjetivo) {
        this.idUsuarioObjetivoSemanal = idUsuarioObjetivoSemanal;
        this.idUsuario = idUsuario;
        this.idObjetivo = idObjetivo;
    }

    public String insertar(){
        Conexion conexion = new Conexion();
        UsuarioObjetivoSemanalDAO usuarioObjetivoSemanalDAO = new UsuarioObjetivoSemanalDAO(this.idUsuarioObjetivoSemanal, this.idUsuario, this.idObjetivo);
        String resultado = conexion.ejecutar(usuarioObjetivoSemanalDAO.insertar());
        conexion.cerrarConexion();
        return resultado;
    }
    
    public String eliminar(){
        Conexion conexion = new Conexion();
        UsuarioObjetivoSemanalDAO usuarioObjetivoSemanalDAO = new UsuarioObjetivoSemanalDAO(this.idUsuarioObjetivoSemanal);
        String resultado = conexion.ejecutar(usuarioObjetivoSemanalDAO.eliminar());
        conexion.cerrarConexion();
        return resultado;
    }
    
    public boolean consultar(){
        Conexion conexion = new Conexion();
        UsuarioObjetivoSemanalDAO usuarioObjetivoSemanalDAO = new UsuarioObjetivoSemanalDAO(this.idUsuarioObjetivoSemanal);
        ResultSet resultado = conexion.consultar(usuarioObjetivoSemanalDAO.consultar());
        try{
            if(resultado.next()){
                this.idUsuario = resultado.getInt("idUsuario");
                this.idObjetivo = resultado.getInt("idObjetivo");
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
        UsuarioObjetivoSemanalDAO usuarioObjetivoSemanalDAO = new UsuarioObjetivoSemanalDAO(this.idUsuarioObjetivoSemanal, this.idUsuario, this.idObjetivo);
        String resultado = conexion.ejecutar(usuarioObjetivoSemanalDAO.actualizar());
        conexion.cerrarConexion();
        return resultado;
    }
}

