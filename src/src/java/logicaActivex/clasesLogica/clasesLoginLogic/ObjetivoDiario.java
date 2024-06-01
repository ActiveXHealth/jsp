/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package logicaActivex.clasesLogica.clasesLoginLogic;

import java.sql.ResultSet;
import java.sql.SQLException;

import conexionBD.Conexion;
import conexionBD.clasesDAO.clasesLoginDAO.ObjetivoDiarioDAO;

public class ObjetivoDiario {
    private int idObjetivoDiario;
    private String descripcion;
    private int progreso;
    private String descripcionPaso;

    public ObjetivoDiario() {
    }

    public ObjetivoDiario(int idObjetivoDiario) {
        this.idObjetivoDiario = idObjetivoDiario;
    }

    public ObjetivoDiario(int idObjetivoDiario, String descripcion, int progreso, String descripcionPaso) {
        this.idObjetivoDiario = idObjetivoDiario;
        this.descripcion = descripcion;
        this.progreso = progreso;
        this.descripcionPaso = descripcionPaso;
    }

    public String insertar(){
        Conexion conexion = new Conexion();
        ObjetivoDiarioDAO objetivoDiarioDAO = new ObjetivoDiarioDAO(this.idObjetivoDiario, this.descripcion, this.progreso, this.descripcionPaso);
        String resultado = conexion.ejecutar(objetivoDiarioDAO.insertar());
        conexion.cerrarConexion();
        return resultado;
    }
    
    public String eliminar(){
        Conexion conexion = new Conexion();
        ObjetivoDiarioDAO objetivoDiarioDAO = new ObjetivoDiarioDAO(this.idObjetivoDiario);
        String resultado = conexion.ejecutar(objetivoDiarioDAO.eliminar());
        conexion.cerrarConexion();
        return resultado;
    }
    
    public boolean consultar(){
        Conexion conexion = new Conexion();
        ObjetivoDiarioDAO objetivoDiarioDAO = new ObjetivoDiarioDAO(this.idObjetivoDiario);
        ResultSet resultado = conexion.consultar(objetivoDiarioDAO.consultar());
        try{
            if(resultado.next()){
                this.descripcion = resultado.getString("descripcion");
                this.progreso = resultado.getInt("progreso");
                this.descripcionPaso = resultado.getString("descripcionPaso");
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
        ObjetivoDiarioDAO objetivoDiarioDAO = new ObjetivoDiarioDAO(this.idObjetivoDiario, this.descripcion, this.progreso, this.descripcionPaso);
        String resultado = conexion.ejecutar(objetivoDiarioDAO.actualizar());
        conexion.cerrarConexion();
        return resultado;
    }
}