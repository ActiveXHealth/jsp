/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package logicaActivex.clasesLogica.clasesLoginLogic;

import java.sql.ResultSet;
import java.sql.SQLException;

import conexionBD.Conexion;
import conexionBD.clasesDAO.clasesLoginDAO.UsuarioObjetivoDiarioDAO;

public class UsuarioObjetivoDiario {
    private int idUsuarioObjetivoDiario;
    private int idUsuario;
    private int idObjetivoDiario;

    public UsuarioObjetivoDiario() {
    }

    public UsuarioObjetivoDiario(int idUsuarioObjetivoDiario) {
        this.idUsuarioObjetivoDiario = idUsuarioObjetivoDiario;
    }

    public UsuarioObjetivoDiario(int idUsuarioObjetivoDiario, int idUsuario, int idObjetivoDiario) {
        this.idUsuarioObjetivoDiario = idUsuarioObjetivoDiario;
        this.idUsuario = idUsuario;
        this.idObjetivoDiario = idObjetivoDiario;
    }

    public String insertar(){
        Conexion conexion = new Conexion();
        UsuarioObjetivoDiarioDAO usuarioObjetivoDiarioDAO = new UsuarioObjetivoDiarioDAO(this.idUsuarioObjetivoDiario, this.idUsuario, this.idObjetivoDiario);
        String resultado = conexion.ejecutar(usuarioObjetivoDiarioDAO.insertar());
        conexion.cerrarConexion();
        return resultado;
    }
    
    public String eliminar(){
        Conexion conexion = new Conexion();
        UsuarioObjetivoDiarioDAO usuarioObjetivoDiarioDAO = new UsuarioObjetivoDiarioDAO(this.idUsuarioObjetivoDiario);
        String resultado = conexion.ejecutar(usuarioObjetivoDiarioDAO.eliminar());
        conexion.cerrarConexion();
        return resultado;
    }
    
    public boolean consultar(){
        Conexion conexion = new Conexion();
        UsuarioObjetivoDiarioDAO usuarioObjetivoDiarioDAO = new UsuarioObjetivoDiarioDAO(this.idUsuarioObjetivoDiario);
        ResultSet resultado = conexion.consultar(usuarioObjetivoDiarioDAO.consultar());
        try{
            if(resultado.next()){
                this.idUsuario = resultado.getInt("idUsuario");
                this.idObjetivoDiario = resultado.getInt("idObjetivoDiario");
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
        UsuarioObjetivoDiarioDAO usuarioObjetivoDiarioDAO = new UsuarioObjetivoDiarioDAO(this.idUsuarioObjetivoDiario, this.idUsuario, this.idObjetivoDiario);
        String resultado = conexion.ejecutar(usuarioObjetivoDiarioDAO.actualizar());
        conexion.cerrarConexion();
        return resultado;
    }
}
