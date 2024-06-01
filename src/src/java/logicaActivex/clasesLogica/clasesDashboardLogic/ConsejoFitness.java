/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package logicaActivex.clasesLogica.clasesDashboardLogic;

import java.sql.ResultSet;
import java.sql.SQLException;

import conexionBD.Conexion;
import conexionBD.clasesDAO.clasesDashboardDAO.ConsejoFitnessDAO;

public class ConsejoFitness {
    private int idConsejo;
    private String descripcion;

    public ConsejoFitness() {
    }

    public ConsejoFitness(int idConsejo) {
        this.idConsejo = idConsejo;
    }

    public ConsejoFitness(int idConsejo, String descripcion) {
        this.idConsejo = idConsejo;
        this.descripcion = descripcion;
    }

    public String insertar(){
        Conexion conexion = new Conexion();
        ConsejoFitnessDAO consejoFitnessDAO = new ConsejoFitnessDAO(this.idConsejo, this.descripcion);
        String resultado = conexion.ejecutar(consejoFitnessDAO.insertar());
        conexion.cerrarConexion();
        return resultado;
    }
    
    public String eliminar(){
        Conexion conexion = new Conexion();
        ConsejoFitnessDAO consejoFitnessDAO = new ConsejoFitnessDAO(this.idConsejo);
        String resultado = conexion.ejecutar(consejoFitnessDAO.eliminar());
        conexion.cerrarConexion();
        return resultado;
    }
    
    public boolean consultar(){
        Conexion conexion = new Conexion();
        ConsejoFitnessDAO consejoFitnessDAO = new ConsejoFitnessDAO(this.idConsejo);
        ResultSet resultado = conexion.consultar(consejoFitnessDAO.consultar());
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
        ConsejoFitnessDAO consejoFitnessDAO = new ConsejoFitnessDAO(this.idConsejo, this.descripcion);
        String resultado = conexion.ejecutar(consejoFitnessDAO.actualizar());
        conexion.cerrarConexion();
        return resultado;
    }
    
    public String[][] buscar(String filtro){
        Conexion con = new Conexion();
        ConsejoFitnessDAO consejoFitnessDAO = new ConsejoFitnessDAO();
        ResultSet resultado = con.consultar(consejoFitnessDAO.buscar(filtro));
        String[][] datos = null;
        try{
            resultado.last();
            datos = new String[resultado.getRow()][2];
            resultado.beforeFirst();
            int i = 0;
            while(resultado.next()){
                datos[i][0] = resultado.getString("idConsejo");
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
