/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package logicaActivex.clasesLogica.clasesRutinasLogic;

import java.sql.ResultSet;
import java.sql.SQLException;

import conexionBD.Conexion;
import conexionBD.clasesDAO.clasesRutinasDAO.TipoEjercicioDAO;

public class TipoEjercicio {
    private int idTipo;
    private int idEjercicio;
    private String descripcion;

    public TipoEjercicio() {
    }

    public TipoEjercicio(int idTipo) {
        this.idTipo = idTipo;
    }

    public TipoEjercicio(int idTipo, int idEjercicio, String descripcion) {
        this.idTipo = idTipo;
        this.idEjercicio = idEjercicio;
        this.descripcion = descripcion;
    }

    public String insertar(){
        Conexion conexion = new Conexion();
        TipoEjercicioDAO tipoEjercicioDAO = new TipoEjercicioDAO(this.idTipo, this.idEjercicio, this.descripcion);
        String resultado = conexion.ejecutar(tipoEjercicioDAO.insertar());
        conexion.cerrarConexion();
        return resultado;
    }
    
    public String eliminar(){
        Conexion conexion = new Conexion();
        TipoEjercicioDAO tipoEjercicioDAO = new TipoEjercicioDAO(this.idTipo);
        String resultado = conexion.ejecutar(tipoEjercicioDAO.eliminar());
        conexion.cerrarConexion();
        return resultado;
    }
    
    public boolean consultar(){
        Conexion conexion = new Conexion();
        TipoEjercicioDAO tipoEjercicioDAO = new TipoEjercicioDAO(this.idTipo);
        ResultSet resultado = conexion.consultar(tipoEjercicioDAO.consultar());
        try{
            if(resultado.next()){
                this.idEjercicio = resultado.getInt("idEjercicio");
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
        TipoEjercicioDAO tipoEjercicioDAO = new TipoEjercicioDAO(this.idTipo, this.idEjercicio, this.descripcion);
        String resultado = conexion.ejecutar(tipoEjercicioDAO.actualizar());
        conexion.cerrarConexion();
        return resultado;
    }
}

