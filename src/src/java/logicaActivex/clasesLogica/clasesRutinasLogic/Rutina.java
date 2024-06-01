/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package logicaActivex.clasesLogica.clasesRutinasLogic;

import java.sql.ResultSet;
import java.sql.SQLException;

import conexionBD.Conexion;
import conexionBD.clasesDAO.clasesRutinasDAO.*;

public class Rutina {
    private int idRutina;
    private int idUsuario;
    private String nombreRutina;
    private String fechaCreacion;
    private String Descripcion;
    private String diaAsignado;
    private int cargaTotal;
    private int caloriasTotales;
    private float tiempoTotal;

    public Rutina() {
    }

    public Rutina(int idRutina) {
        this.idRutina = idRutina;
    }

    public Rutina(int idRutina, int idUsuario, String nombreRutina, String fechaCreacion, String Descripcion, String diaAsignado, int cargaTotal, int caloriasTotales, float tiempoTotal) {
        this.idRutina = idRutina;
        this.idUsuario = idUsuario;
        this.nombreRutina = nombreRutina;
        this.fechaCreacion = fechaCreacion;
        this.Descripcion = Descripcion;
        this.diaAsignado = diaAsignado;
        this.cargaTotal = cargaTotal;
        this.caloriasTotales = caloriasTotales;
        this.tiempoTotal = tiempoTotal;
    }

    public String insertar(){
        Conexion conexion = new Conexion();
        RutinaDAO rutinaDAO = new RutinaDAO(this.idRutina, this.idUsuario, this.nombreRutina, this.fechaCreacion, this.Descripcion, this.diaAsignado, this.cargaTotal, this.caloriasTotales, this.tiempoTotal);
        String resultado = conexion.ejecutar(rutinaDAO.insertar());
        conexion.cerrarConexion();
        return resultado;
    }
    
    public String eliminar(){
        Conexion conexion = new Conexion();
        RutinaDAO rutinaDAO = new RutinaDAO(this.idRutina);
        String resultado = conexion.ejecutar(rutinaDAO.eliminar());
        conexion.cerrarConexion();
        return resultado;
    }
    
    public boolean consultar(){
        Conexion conexion = new Conexion();
        RutinaDAO rutinaDAO = new RutinaDAO(this.idRutina);
        ResultSet resultado = conexion.consultar(rutinaDAO.consultar());
        try{
            if(resultado.next()){
                this.idUsuario = resultado.getInt("idUsuario");
                this.nombreRutina = resultado.getString("nombreRutina");
                this.fechaCreacion = resultado.getString("fechaCreacion");
                this.Descripcion = resultado.getString("Descripcion");
                this.diaAsignado = resultado.getString("diaAsignado");
                this.cargaTotal = resultado.getInt("cargaTotal");
                this.caloriasTotales = resultado.getInt("caloriasTotales");
                this.tiempoTotal = resultado.getFloat("tiempoTotal");
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
        RutinaDAO rutinaDAO = new RutinaDAO(this.idRutina, this.idUsuario, this.nombreRutina, this.fechaCreacion, this.Descripcion, this.diaAsignado, this.cargaTotal, this.caloriasTotales, this.tiempoTotal);
        String resultado = conexion.ejecutar(rutinaDAO.actualizar());
        conexion.cerrarConexion();
        return resultado;
    }
    
    public String[][] buscar(String filtro){
        Conexion con = new Conexion();
        RutinaDAO rutinaDAO = new RutinaDAO();
        ResultSet resultado = con.consultar(rutinaDAO.buscar(filtro));
        String[][] datos = null;
        try{
            resultado.last();
            datos = new String[resultado.getRow()][9];
            resultado.beforeFirst();
            int i = 0;
            while(resultado.next()){
                datos[i][0] = resultado.getString("idRutina");
                datos[i][1] = resultado.getString("idUsuario");
                datos[i][2] = resultado.getString("nombreRutina");
                datos[i][3] = resultado.getString("fechaCreacion");
                datos[i][4] = resultado.getString("Descripcion");
                datos[i][5] = resultado.getString("diaAsignado");
                datos[i][6] = resultado.getString("cargaTotal");
                datos[i][7] = resultado.getString("caloriasTotales");
                datos[i][8] = resultado.getString("tiempoTotal");
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

