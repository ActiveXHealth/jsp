/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package logicaActivex.clasesLogica.clasesObjetivosLogic;

import java.sql.ResultSet;
import java.sql.SQLException;

import conexionBD.Conexion;
import conexionBD.clasesDAO.clasesObjetivosDAO.*;

public class RegistroHidratacion {
    private int idRegistroHidratacion;
    private float progreso;
    private String fechaRegistroHidratacion;

    public RegistroHidratacion() {
    }

    public RegistroHidratacion(int idRegistroHidratacion) {
        this.idRegistroHidratacion = idRegistroHidratacion;
    }

    public RegistroHidratacion(int idRegistroHidratacion, float progreso, String fechaRegistroHidratacion) {
        this.idRegistroHidratacion = idRegistroHidratacion;
        this.progreso = progreso;
        this.fechaRegistroHidratacion = fechaRegistroHidratacion;
    }

    public String insertar(){
        Conexion conexion = new Conexion();
        RegistroHidratacionDAO registroHidratacionDAO = new RegistroHidratacionDAO(this.idRegistroHidratacion, this.progreso, this.fechaRegistroHidratacion);
        String resultado = conexion.ejecutar(registroHidratacionDAO.insertar());
        conexion.cerrarConexion();
        return resultado;
    }
    
    public String eliminar(){
        Conexion conexion = new Conexion();
        RegistroHidratacionDAO registroHidratacionDAO = new RegistroHidratacionDAO(this.idRegistroHidratacion);
        String resultado = conexion.ejecutar(registroHidratacionDAO.eliminar());
        conexion.cerrarConexion();
        return resultado;
    }
    
    public boolean consultar(){
        Conexion conexion = new Conexion();
        RegistroHidratacionDAO registroHidratacionDAO = new RegistroHidratacionDAO(this.idRegistroHidratacion);
        ResultSet resultado = conexion.consultar(registroHidratacionDAO.consultar());
        try{
            if(resultado.next()){
                this.progreso = resultado.getFloat("progreso");
                this.fechaRegistroHidratacion = resultado.getString("fechaRegistroHidratacion");
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
        RegistroHidratacionDAO registroHidratacionDAO = new RegistroHidratacionDAO(this.idRegistroHidratacion, this.progreso, this.fechaRegistroHidratacion);
        String resultado = conexion.ejecutar(registroHidratacionDAO.actualizar());
        conexion.cerrarConexion();
        return resultado;
    }
    
    public String[][] buscar(String filtro){
        Conexion con = new Conexion();
        RegistroHidratacionDAO registroHidratacionDAO = new RegistroHidratacionDAO();
        ResultSet resultado = con.consultar(registroHidratacionDAO.buscar(filtro));
        String[][] datos = null;
        try{
            resultado.last();
            datos = new String[resultado.getRow()][3];
            resultado.beforeFirst();
            int i = 0;
            while(resultado.next()){
                datos[i][0] = resultado.getString("idRegistroHidratacion");
                datos[i][1] = resultado.getString("progreso");
                datos[i][2] = resultado.getString("fechaRegistroHidratacion");
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
