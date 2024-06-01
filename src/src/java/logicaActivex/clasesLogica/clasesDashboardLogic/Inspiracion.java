/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package logicaActivex.clasesLogica.clasesDashboardLogic;

/**
 * 
 * @author Sammy Guergachi <sguergachi at gmail.com>
 */
import java.sql.ResultSet;
import java.sql.SQLException;

import conexionBD.Conexion;
import conexionBD.clasesDAO.clasesDashboardDAO.InspiracionDAO;

public class Inspiracion {
    private int idInspiracion;
    private String descripcion;

    public Inspiracion() {
    }

    public Inspiracion(int idInspiracion) {
        this.idInspiracion = idInspiracion;
    }

    public Inspiracion(int idInspiracion, String descripcion) {
        this.idInspiracion = idInspiracion;
        this.descripcion = descripcion;
    }

    public String insertar(){
        Conexion conexion = new Conexion();
        InspiracionDAO inspiracionDAO = new InspiracionDAO(this.idInspiracion, this.descripcion);
        String resultado = conexion.ejecutar(inspiracionDAO.insertar());
        conexion.cerrarConexion();
        return resultado;
    }
    
    public String eliminar(){
        Conexion conexion = new Conexion();
        InspiracionDAO inspiracionDAO = new InspiracionDAO(this.idInspiracion);
        String resultado = conexion.ejecutar(inspiracionDAO.eliminar());
        conexion.cerrarConexion();
        return resultado;
    }
    
    public boolean consultar(){
        Conexion conexion = new Conexion();
        InspiracionDAO inspiracionDAO = new InspiracionDAO(this.idInspiracion);
        ResultSet resultado = conexion.consultar(inspiracionDAO.consultar());
        try{
            if(resultado.next()){
                this.descripcion = resultado.getString("descripcion");
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
        InspiracionDAO inspiracionDAO = new InspiracionDAO(this.idInspiracion, this.descripcion);
        String resultado = conexion.ejecutar(inspiracionDAO.actualizar());
        conexion.cerrarConexion();
        return resultado;
    }
    
    public String[][] buscar(String filtro){
        Conexion con = new Conexion();
        InspiracionDAO inspiracionDAO = new InspiracionDAO();
        ResultSet resultado = con.consultar(inspiracionDAO.buscar(filtro));
        String[][] datos = null;
        try{
            resultado.last();
            datos = new String[resultado.getRow()][2];
            resultado.beforeFirst();
            int i = 0;
            while(resultado.next()){
                datos[i][0] = resultado.getString("idInspiracion");
                datos[i][1] = resultado.getString("descripcion");
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
