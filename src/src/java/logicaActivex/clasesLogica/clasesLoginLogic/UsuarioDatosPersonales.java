/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package logicaActivex.clasesLogica.clasesLoginLogic;

import java.sql.ResultSet;
import java.sql.SQLException;

import conexionBD.Conexion;
import conexionBD.clasesDAO.clasesLoginDAO.UsuarioDatosPersonalesDAO;

public class UsuarioDatosPersonales {
    private int idUsuarioDatosPersonales;
    private int idUsuario;
    private int idDatosPersonales;

    public UsuarioDatosPersonales() {
    }

    public UsuarioDatosPersonales(int idUsuarioDatosPersonales) {
        this.idUsuarioDatosPersonales = idUsuarioDatosPersonales;
    }

    public UsuarioDatosPersonales(int idUsuarioDatosPersonales, int idUsuario, int idDatosPersonales) {
        this.idUsuarioDatosPersonales = idUsuarioDatosPersonales;
        this.idUsuario = idUsuario;
        this.idDatosPersonales = idDatosPersonales;
    }

    public String insertar(){
        Conexion conexion = new Conexion();
        UsuarioDatosPersonalesDAO usuarioDatosPersonalesDAO = new UsuarioDatosPersonalesDAO(this.idUsuarioDatosPersonales, this.idUsuario, this.idDatosPersonales);
        String resultado = conexion.ejecutar(usuarioDatosPersonalesDAO.insertar());
        conexion.cerrarConexion();
        return resultado;
    }
    
    public String eliminar(){
        Conexion conexion = new Conexion();
        UsuarioDatosPersonalesDAO usuarioDatosPersonalesDAO = new UsuarioDatosPersonalesDAO(this.idUsuarioDatosPersonales);
        String resultado = conexion.ejecutar(usuarioDatosPersonalesDAO.eliminar());
        conexion.cerrarConexion();
        return resultado;
    }
    
    public boolean consultar(){
        Conexion conexion = new Conexion();
        UsuarioDatosPersonalesDAO usuarioDatosPersonalesDAO = new UsuarioDatosPersonalesDAO(this.idUsuarioDatosPersonales);
        ResultSet resultado = conexion.consultar(usuarioDatosPersonalesDAO.consultar());
        try{
            if(resultado.next()){
                this.idUsuario = resultado.getInt("idUsuario");
                this.idDatosPersonales = resultado.getInt("idDatosPersonales");
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
        UsuarioDatosPersonalesDAO usuarioDatosPersonalesDAO = new UsuarioDatosPersonalesDAO(this.idUsuarioDatosPersonales, this.idUsuario, this.idDatosPersonales);
        String resultado = conexion.ejecutar(usuarioDatosPersonalesDAO.actualizar());
        conexion.cerrarConexion();
        return resultado;
    }
}

