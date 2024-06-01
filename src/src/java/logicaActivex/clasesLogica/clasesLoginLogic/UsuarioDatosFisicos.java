/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package logicaActivex.clasesLogica.clasesLoginLogic;

import java.sql.ResultSet;
import java.sql.SQLException;

import conexionBD.Conexion;
import conexionBD.clasesDAO.clasesLoginDAO.UsuarioDatosFisicosDAO;

public class UsuarioDatosFisicos {
    private int idUsuarioDatosFisicos;
    private int idUsuario;
    private int idDatosFisicos;

    public UsuarioDatosFisicos() {
    }

    public UsuarioDatosFisicos(int idUsuarioDatosFisicos) {
        this.idUsuarioDatosFisicos = idUsuarioDatosFisicos;
    }

    public UsuarioDatosFisicos(int idUsuarioDatosFisicos, int idUsuario, int idDatosFisicos) {
        this.idUsuarioDatosFisicos = idUsuarioDatosFisicos;
        this.idUsuario = idUsuario;
        this.idDatosFisicos = idDatosFisicos;
    }

    public String insertar(){
        Conexion conexion = new Conexion();
        UsuarioDatosFisicosDAO usuarioDatosFisicosDAO = new UsuarioDatosFisicosDAO(this.idUsuarioDatosFisicos, this.idUsuario, this.idDatosFisicos);
        String resultado = conexion.ejecutar(usuarioDatosFisicosDAO.insertar());
        conexion.cerrarConexion();
        return resultado;
    }
    
    public String eliminar(){
        Conexion conexion = new Conexion();
        UsuarioDatosFisicosDAO usuarioDatosFisicosDAO = new UsuarioDatosFisicosDAO(this.idUsuarioDatosFisicos);
        String resultado = conexion.ejecutar(usuarioDatosFisicosDAO.eliminar());
        conexion.cerrarConexion();
        return resultado;
    }
    
    public boolean consultar(){
        Conexion conexion = new Conexion();
        UsuarioDatosFisicosDAO usuarioDatosFisicosDAO = new UsuarioDatosFisicosDAO(this.idUsuarioDatosFisicos);
        ResultSet resultado = conexion.consultar(usuarioDatosFisicosDAO.consultar());
        try{
            if(resultado.next()){
                this.idUsuario = resultado.getInt("idUsuario");
                this.idDatosFisicos = resultado.getInt("idDatosFisicos");
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
        UsuarioDatosFisicosDAO usuarioDatosFisicosDAO = new UsuarioDatosFisicosDAO(this.idUsuarioDatosFisicos, this.idUsuario, this.idDatosFisicos);
        String resultado = conexion.ejecutar(usuarioDatosFisicosDAO.actualizar());
        conexion.cerrarConexion();
        return resultado;
    }
}
