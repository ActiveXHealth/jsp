/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package logicaActivex.clasesLogica.clasesRutinasLogic;

import java.sql.ResultSet;
import java.sql.SQLException;

import conexionBD.Conexion;
import conexionBD.clasesDAO.clasesRutinasDAO.EntrenamientoDAO;

public class Entrenamiento {
    private int idEntrenamiento;
    private String fechaEntrenamiento;
    private int cargaTotal;
    private int tiempoTotal;
    private int caloriasQuemadas;

    public Entrenamiento() {
    }

    public Entrenamiento(int idEntrenamiento) {
        this.idEntrenamiento = idEntrenamiento;
    }

    public Entrenamiento(int idEntrenamiento, String fechaEntrenamiento, int cargaTotal, int tiempoTotal, int caloriasQuemadas) {
        this.idEntrenamiento = idEntrenamiento;
        this.fechaEntrenamiento = fechaEntrenamiento;
        this.cargaTotal = cargaTotal;
        this.tiempoTotal = tiempoTotal;
        this.caloriasQuemadas = caloriasQuemadas;
    }

    public String insertar(){
        Conexion conexion = new Conexion();
        EntrenamientoDAO entrenamientoDAO = new EntrenamientoDAO(this.idEntrenamiento, this.fechaEntrenamiento, this.cargaTotal, this.tiempoTotal, this.caloriasQuemadas);
        String resultado = conexion.ejecutar(entrenamientoDAO.insertar());
        conexion.cerrarConexion();
        return resultado;
    }
    
    public String eliminar(){
        Conexion conexion = new Conexion();
        EntrenamientoDAO entrenamientoDAO = new EntrenamientoDAO(this.idEntrenamiento);
        String resultado = conexion.ejecutar(entrenamientoDAO.eliminar());
        conexion.cerrarConexion();
        return resultado;
    }
    
    public boolean consultar(){
        Conexion conexion = new Conexion();
        EntrenamientoDAO entrenamientoDAO = new EntrenamientoDAO(this.idEntrenamiento);
        ResultSet resultado = conexion.consultar(entrenamientoDAO.consultar());
        try{
            if(resultado.next()){
                this.fechaEntrenamiento = resultado.getString("fechaEntrenamiento");
                this.cargaTotal = resultado.getInt("cargaTotal");
                this.tiempoTotal = resultado.getInt("tiempoTotal");
                this.caloriasQuemadas = resultado.getInt("caloriasQuemadas");
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
        EntrenamientoDAO entrenamientoDAO = new EntrenamientoDAO(this.idEntrenamiento, this.fechaEntrenamiento, this.cargaTotal, this.tiempoTotal, this.caloriasQuemadas);
        String resultado = conexion.ejecutar(entrenamientoDAO.actualizar());
        conexion.cerrarConexion();
        return resultado;
    }
}
