/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package logicaActivex.clasesLogica.clasesRutinasLogic;

import java.sql.ResultSet;
import java.sql.SQLException;

import conexionBD.Conexion;
import conexionBD.clasesDAO.clasesRutinasDAO.EjercicioDAO;

public class Ejercicio {
    private int idEjercicio;
    private String nombreEjercicio;
    private String Descripcion;
    private String musculosTrabajados;
    private String direccionImagen;

    public Ejercicio() {
    }

    public Ejercicio(int idEjercicio) {
        this.idEjercicio = idEjercicio;
    }

    public Ejercicio(int idEjercicio, String nombreEjercicio, String Descripcion, String musculosTrabajados, String direccionImagen) {
        this.idEjercicio = idEjercicio;
        this.nombreEjercicio = nombreEjercicio;
        this.Descripcion = Descripcion;
        this.musculosTrabajados = musculosTrabajados;
        this.direccionImagen = direccionImagen;
    }

    public String insertar(){
        Conexion conexion = new Conexion();
        EjercicioDAO ejercicioDAO = new EjercicioDAO(this.idEjercicio, this.nombreEjercicio, this.Descripcion, this.musculosTrabajados, this.direccionImagen);
        String resultado = conexion.ejecutar(ejercicioDAO.insertar());
        conexion.cerrarConexion();
        return resultado;
    }
    
    public String eliminar(){
        Conexion conexion = new Conexion();
        EjercicioDAO ejercicioDAO = new EjercicioDAO(this.idEjercicio);
        String resultado = conexion.ejecutar(ejercicioDAO.eliminar());
        conexion.cerrarConexion();
        return resultado;
    }
    
    public boolean consultar(){
        Conexion conexion = new Conexion();
        EjercicioDAO ejercicioDAO = new EjercicioDAO(this.idEjercicio);
        ResultSet resultado = conexion.consultar(ejercicioDAO.consultar());
        try{
            if(resultado.next()){
                this.nombreEjercicio = resultado.getString("nombreEjercicio");
                this.Descripcion = resultado.getString("Descripcion");
                this.musculosTrabajados = resultado.getString("musculosTrabajados");
                this.direccionImagen = resultado.getString("direccionImagen");
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
        EjercicioDAO ejercicioDAO = new EjercicioDAO(this.idEjercicio, this.nombreEjercicio, this.Descripcion, this.musculosTrabajados, this.direccionImagen);
        String resultado = conexion.ejecutar(ejercicioDAO.actualizar());
        conexion.cerrarConexion();
        return resultado;
    }
}

