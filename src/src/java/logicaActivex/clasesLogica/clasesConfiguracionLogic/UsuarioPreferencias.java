/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package logicaActivex.clasesLogica.clasesConfiguracionLogic;

import java.sql.ResultSet;
import java.sql.SQLException;

import conexionBD.Conexion;
import conexionBD.clasesDAO.clasesConfiguracionDAO.UsuarioPreferenciasDAO;

public class UsuarioPreferencias {
    private int idUsuarioPreferencias;
    private int idUsuario;
    private int idPreferencias;

    public UsuarioPreferencias() {
    }

    public UsuarioPreferencias(int idUsuarioPreferencias) {
        this.idUsuarioPreferencias = idUsuarioPreferencias;
    }

    public UsuarioPreferencias(int idUsuarioPreferencias, int idUsuario, int idPreferencias) {
        this.idUsuarioPreferencias = idUsuarioPreferencias;
        this.idUsuario = idUsuario;
        this.idPreferencias = idPreferencias;
    }

    public String insertar(){
        Conexion conexion = new Conexion();
        UsuarioPreferenciasDAO usuarioPreferenciasDAO = new UsuarioPreferenciasDAO(this.idUsuarioPreferencias, this.idUsuario, this.idPreferencias);
        String resultado = conexion.ejecutar(usuarioPreferenciasDAO.insertar());
        conexion.cerrarConexion();
        return resultado;
    }
    
    public String eliminar(){
        Conexion conexion = new Conexion();
        UsuarioPreferenciasDAO usuarioPreferenciasDAO = new UsuarioPreferenciasDAO(this.idUsuarioPreferencias);
        String resultado = conexion.ejecutar(usuarioPreferenciasDAO.eliminar());
        conexion.cerrarConexion();
        return resultado;
    }
    
    public boolean consultar(){
        Conexion conexion = new Conexion();
        UsuarioPreferenciasDAO usuarioPreferenciasDAO = new UsuarioPreferenciasDAO(this.idUsuarioPreferencias);
        ResultSet resultado = conexion.consultar(usuarioPreferenciasDAO.consultar());
        try{
            if(resultado.next()){
                this.idUsuario = resultado.getInt("idUsuario");
                this.idPreferencias = resultado.getInt("idPreferencias");
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
        UsuarioPreferenciasDAO usuarioPreferenciasDAO = new UsuarioPreferenciasDAO(this.idUsuarioPreferencias, this.idUsuario, this.idPreferencias);
        String resultado = conexion.ejecutar(usuarioPreferenciasDAO.actualizar());
        conexion.cerrarConexion();
        return resultado;
    }
    
    public String[][] buscar(String filtro){
        Conexion con = new Conexion();
        UsuarioPreferenciasDAO usuarioPreferenciasDAO = new UsuarioPreferenciasDAO();
        ResultSet resultado = con.consultar(usuarioPreferenciasDAO.buscar(filtro));
        String[][] datos = null;
        try{
            resultado.last();
            datos = new String[resultado.getRow()][3];
            resultado.beforeFirst();
            int i = 0;
            while(resultado.next()){
                datos[i][0] = resultado.getString("idUsuarioPreferencias");
                datos[i][1] = resultado.getString("idUsuario");
                datos[i][2] = resultado.getString("idPreferencias");
                i++;
            }
        }catch(SQLException ex){
            ex.printStackTrace();
        } finally {
            con.cerrarConexion();
        }
        return datos;
    }
}
