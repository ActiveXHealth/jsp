/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package logicaActivex.clasesLogica.clasesDashboardLogic;

import java.sql.ResultSet;
import java.sql.SQLException;

import conexionBD.Conexion;
import conexionBD.clasesDAO.clasesDashboardDAO.DesafioDAO;

public class Desafio {
    private int idDesafio;
    private String descripcion;
    private boolean estado;

    public Desafio() {
    }

    public Desafio(int idDesafio) {
        this.idDesafio = idDesafio;
    }

    public Desafio(int idDesafio, String descripcion, boolean estado) {
        this.idDesafio = idDesafio;
        this.descripcion = descripcion;
        this.estado = estado;
    }

    public String insertar(){
        Conexion conexion = new Conexion();
        DesafioDAO desafioDAO = new DesafioDAO(this.idDesafio, this.descripcion, this.estado);
        String resultado = conexion.ejecutar(desafioDAO.insertar());
        conexion.cerrarConexion();
        return resultado;
    }
    
    public String eliminar(){
        Conexion conexion = new Conexion();
        DesafioDAO desafioDAO = new DesafioDAO(this.idDesafio);
        String resultado = conexion.ejecutar(desafioDAO.eliminar());
        conexion.cerrarConexion();
        return resultado;
    }
    
    public boolean consultar(){
        Conexion conexion = new Conexion();
        DesafioDAO desafioDAO = new DesafioDAO(this.idDesafio);
        ResultSet resultado = conexion.consultar(desafioDAO.consultar());
        try{
            if(resultado.next()){
                this.descripcion = resultado.getString("descripcion");
                this.estado = resultado.getBoolean("estado");
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
        DesafioDAO desafioDAO = new DesafioDAO(this.idDesafio, this.descripcion, this.estado);
        String resultado = conexion.ejecutar(desafioDAO.actualizar());
        conexion.cerrarConexion();
        return resultado;
    }
    
    public String[][] buscar(String filtro){
        Conexion con = new Conexion();
        DesafioDAO desafioDAO = new DesafioDAO();
        ResultSet resultado = con.consultar(desafioDAO.buscar(filtro));
        String[][] datos = null;
        try{
            resultado.last();
            datos = new String[resultado.getRow()][3];
            resultado.beforeFirst();
            int i = 0;
            while(resultado.next()){
                datos[i][0] = resultado.getString("idDesafio");
                datos[i][1] = resultado.getString("descripcion");
                datos[i][2] = resultado.getString("estado");
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
