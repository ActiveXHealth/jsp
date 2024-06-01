/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package logicaActivex.clasesLogica.clasesObjetivosLogic;

import java.sql.ResultSet;
import java.sql.SQLException;

import conexionBD.Conexion;
import conexionBD.clasesDAO.clasesObjetivosDAO.*;

public class UsuarioRegPeso {
    private int idUsuarioRegPeso;
    private int idRegistroPeso;
    private int idUsuario;

    public UsuarioRegPeso() {
    }

    public UsuarioRegPeso(int idUsuarioRegPeso) {
        this.idUsuarioRegPeso = idUsuarioRegPeso;
    }

    public UsuarioRegPeso(int idUsuarioRegPeso, int idRegistroPeso, int idUsuario) {
        this.idUsuarioRegPeso = idUsuarioRegPeso;
        this.idRegistroPeso = idRegistroPeso;
        this.idUsuario = idUsuario;
    }

    public String insertar(){
        Conexion conexion = new Conexion();
        UsuarioRegPesoDAO usuarioRegPesoDAO = new UsuarioRegPesoDAO(this.idUsuarioRegPeso, this.idRegistroPeso, this.idUsuario);
        String resultado = conexion.ejecutar(usuarioRegPesoDAO.insertar());
        conexion.cerrarConexion();
        return resultado;
    }
    
    public String eliminar(){
        Conexion conexion = new Conexion();
        UsuarioRegPesoDAO usuarioRegPesoDAO = new UsuarioRegPesoDAO(this.idUsuarioRegPeso);
        String resultado = conexion.ejecutar(usuarioRegPesoDAO.eliminar());
        conexion.cerrarConexion();
        return resultado;
    }
    
    public boolean consultar(){
        Conexion conexion = new Conexion();
        UsuarioRegPesoDAO usuarioRegPesoDAO = new UsuarioRegPesoDAO(this.idUsuarioRegPeso);
        ResultSet resultado = conexion.consultar(usuarioRegPesoDAO.consultar());
        try{
            if(resultado.next()){
                this.idRegistroPeso = resultado.getInt("idRegistroPeso");
                this.idUsuario = resultado.getInt("idUsuario");
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
        UsuarioRegPesoDAO usuarioRegPesoDAO = new UsuarioRegPesoDAO(this.idUsuarioRegPeso, this.idRegistroPeso, this.idUsuario);
        String resultado = conexion.ejecutar(usuarioRegPesoDAO.actualizar());
        conexion.cerrarConexion();
        return resultado;
    }
}
