/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package logicaActivex.clasesLogica.clasesObjetivosLogic;

import java.sql.ResultSet;
import java.sql.SQLException;

import conexionBD.Conexion;
import conexionBD.clasesDAO.clasesObjetivosDAO.*;

public class RegistroPeso {
    private int idRegistroPeso;
    private String fecha;
    private float peso;

    public RegistroPeso() {
    }

    public RegistroPeso(int idRegistroPeso) {
        this.idRegistroPeso = idRegistroPeso;
    }

    public RegistroPeso(int idRegistroPeso, String fecha, float peso) {
        this.idRegistroPeso = idRegistroPeso;
        this.fecha = fecha;
        this.peso = peso;
    }

    public String insertar(){
        Conexion conexion = new Conexion();
        RegistroPesoDAO registroPesoDAO = new RegistroPesoDAO(this.idRegistroPeso, this.fecha, this.peso);
        String resultado = conexion.ejecutar(registroPesoDAO.insertar());
        conexion.cerrarConexion();
        return resultado;
    }
    
    public String eliminar(){
        Conexion conexion = new Conexion();
        RegistroPesoDAO registroPesoDAO = new RegistroPesoDAO(this.idRegistroPeso);
        String resultado = conexion.ejecutar(registroPesoDAO.eliminar());
        conexion.cerrarConexion();
        return resultado;
    }
    
    public boolean consultar(){
        Conexion conexion = new Conexion();
        RegistroPesoDAO registroPesoDAO = new RegistroPesoDAO(this.idRegistroPeso);
        ResultSet resultado = conexion.consultar(registroPesoDAO.consultar());
        try{
            if(resultado.next()){
                this.fecha = resultado.getString("fecha");
                this.peso = resultado.getFloat("peso");
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
        RegistroPesoDAO registroPesoDAO = new RegistroPesoDAO(this.idRegistroPeso, this.fecha, this.peso);
        String resultado = conexion.ejecutar(registroPesoDAO.actualizar());
        conexion.cerrarConexion();
        return resultado;
    }
    
    public String[][] buscar(String filtro){
        Conexion con = new Conexion();
        RegistroPesoDAO registroPesoDAO = new RegistroPesoDAO();
        ResultSet resultado = con.consultar(registroPesoDAO.buscar(filtro));
        String[][] datos = null;
        try{
            resultado.last();
            datos = new String[resultado.getRow()][3];
            resultado.beforeFirst();
            int i = 0;
            while(resultado.next()){
                datos[i][0] = resultado.getString("idRegistroPeso");
                datos[i][1] = resultado.getString("fecha");
                datos[i][2] = resultado.getString("peso");
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

