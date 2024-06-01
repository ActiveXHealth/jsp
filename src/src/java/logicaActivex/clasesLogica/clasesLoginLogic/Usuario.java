/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package logicaActivex.clasesLogica.clasesLoginLogic;

import java.sql.ResultSet;
import java.sql.SQLException;

import conexionBD.Conexion;
import conexionBD.clasesDAO.clasesLoginDAO.UsuarioDAO;

public class Usuario {
    private int idUsuario;
    private String membresia;
    private String objetivoGeneral;
    private float pesoObjetivo;
    private float hidratacionObjetivo;
    private int racha;

    public Usuario() {
    }

    public Usuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }

    public Usuario(int idUsuario, String membresia, String objetivoGeneral, float pesoObjetivo, float hidratacionObjetivo, int racha) {
        this.idUsuario = idUsuario;
        this.membresia = membresia;
        this.objetivoGeneral = objetivoGeneral;
        this.pesoObjetivo = pesoObjetivo;
        this.hidratacionObjetivo = hidratacionObjetivo;
        this.racha = racha;
    }

    public String insertar(){
        Conexion conexion = new Conexion();
        UsuarioDAO usuarioDAO = new UsuarioDAO(this.idUsuario, this.membresia, this.objetivoGeneral, this.pesoObjetivo, this.hidratacionObjetivo, this.racha);
        String resultado = conexion.ejecutar(usuarioDAO.insertar());
        conexion.cerrarConexion();
        return resultado;
    }
    
    public String eliminar(){
        Conexion conexion = new Conexion();
        UsuarioDAO usuarioDAO = new UsuarioDAO(this.idUsuario);
        String resultado = conexion.ejecutar(usuarioDAO.eliminar());
        conexion.cerrarConexion();
        return resultado;
    }
    
    public boolean consultar(){
        Conexion conexion = new Conexion();
        UsuarioDAO usuarioDAO = new UsuarioDAO(this.idUsuario);
        ResultSet resultado = conexion.consultar(usuarioDAO.consultar());
        try{
            if(resultado.next()){
                this.membresia = resultado.getString("membresia");
                this.objetivoGeneral = resultado.getString("objetivoGeneral");
                this.pesoObjetivo = resultado.getFloat("pesoObjetivo");
                this.hidratacionObjetivo = resultado.getFloat("hidratacionObjetivo");
                this.racha = resultado.getInt("racha");
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
        UsuarioDAO usuarioDAO = new UsuarioDAO(this.idUsuario, this.membresia, this.objetivoGeneral, this.pesoObjetivo, this.hidratacionObjetivo, this.racha);
        String resultado = conexion.ejecutar(usuarioDAO.actualizar());
        conexion.cerrarConexion();
        return resultado;
    }
}

