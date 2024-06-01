/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package logicaActivex.clasesLogica.clasesObjetivosLogic;

import java.sql.ResultSet;
import java.sql.SQLException;

import conexionBD.Conexion;
import conexionBD.clasesDAO.clasesObjetivosDAO.*;

public class ObjetivoSemanal {
    private int idObjetivoSemanal;
    private String tipo;
    private String descripcion;
    private float progreso;
    private float volumen;

    public ObjetivoSemanal() {
    }

    public ObjetivoSemanal(int idObjetivoSemanal) {
        this.idObjetivoSemanal = idObjetivoSemanal;
    }

    public ObjetivoSemanal(int idObjetivoSemanal, String tipo, String descripcion, float progreso, float volumen) {
        this.idObjetivoSemanal = idObjetivoSemanal;
        this.tipo = tipo;
        this.descripcion = descripcion;
        this.progreso = progreso;
        this.volumen = volumen;
    }

    public String insertar(){
        Conexion conexion = new Conexion();
        ObjetivoSemanalDAO objetivoSemanalDAO = new ObjetivoSemanalDAO(this.idObjetivoSemanal, this.tipo, this.descripcion, this.progreso, this.volumen);
        String resultado = conexion.ejecutar(objetivoSemanalDAO.insertar());
        conexion.cerrarConexion();
        return resultado;
    }
    
    public String eliminar(){
        Conexion conexion = new Conexion();
        ObjetivoSemanalDAO objetivoSemanalDAO = new ObjetivoSemanalDAO(this.idObjetivoSemanal);
        String resultado = conexion.ejecutar(objetivoSemanalDAO.eliminar());
        conexion.cerrarConexion();
        return resultado;
    }
    
    public boolean consultar(){
        Conexion conexion = new Conexion();
        ObjetivoSemanalDAO objetivoSemanalDAO = new ObjetivoSemanalDAO(this.idObjetivoSemanal);
        ResultSet resultado = conexion.consultar(objetivoSemanalDAO.consultar());
        try{
            if(resultado.next()){
                this.tipo = resultado.getString("tipo");
                this.descripcion = resultado.getString("descripcion");
                this.progreso = resultado.getFloat("progreso");
                this.volumen = resultado.getFloat("volumen");
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
        ObjetivoSemanalDAO objetivoSemanalDAO = new ObjetivoSemanalDAO(this.idObjetivoSemanal, this.tipo, this.descripcion, this.progreso, this.volumen);
        String resultado = conexion.ejecutar(objetivoSemanalDAO.actualizar());
        conexion.cerrarConexion();
        return resultado;
    }
    
    public String[][] buscar(String filtro){
        Conexion con = new Conexion();
        ObjetivoSemanalDAO objetivoSemanalDAO = new ObjetivoSemanalDAO();
        ResultSet resultado = con.consultar(objetivoSemanalDAO.buscar(filtro));
        String[][] datos = null;
        try{
            resultado.last();
            datos = new String[resultado.getRow()][5];
            resultado.beforeFirst();
            int i = 0;
            while(resultado.next()){
                datos[i][0] = resultado.getString("idObjetivoSemanal");
                datos[i][1] = resultado.getString("tipo");
                datos[i][2] = resultado.getString("descripcion");
                datos[i][3] = resultado.getString("progreso");
                datos[i][4] = resultado.getString("volumen");
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
