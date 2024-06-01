/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package logicaActivex.clasesLogica.clasesLoginLogic;

import java.sql.ResultSet;
import java.sql.SQLException;

import conexionBD.Conexion;
import conexionBD.clasesDAO.clasesLoginDAO.DatosFisicosDAO;

public class DatosFisicos {
    private int idDatosFisicos;
    private int edad;
    private float estatura;
    private float peso;
    private String sexo;

    public DatosFisicos() {
    }

    public DatosFisicos(int idDatosFisicos) {
        this.idDatosFisicos = idDatosFisicos;
    }

    public DatosFisicos(int idDatosFisicos, int edad, float estatura, float peso, String sexo) {
        this.idDatosFisicos = idDatosFisicos;
        this.edad = edad;
        this.estatura = estatura;
        this.peso = peso;
        this.sexo = sexo;
    }

    public String insertar(){
        Conexion conexion = new Conexion();
        DatosFisicosDAO datosFisicosDAO = new DatosFisicosDAO(this.idDatosFisicos, this.edad, this.estatura, this.peso, this.sexo);
        String resultado = conexion.ejecutar(datosFisicosDAO.insertar());
        conexion.cerrarConexion();
        return resultado;
    }
    
    public String eliminar(){
        Conexion conexion = new Conexion();
        DatosFisicosDAO datosFisicosDAO = new DatosFisicosDAO(this.idDatosFisicos);
        String resultado = conexion.ejecutar(datosFisicosDAO.eliminar());
        conexion.cerrarConexion();
        return resultado;
    }
    
    public boolean consultar(){
        Conexion conexion = new Conexion();
        DatosFisicosDAO datosFisicosDAO = new DatosFisicosDAO(this.idDatosFisicos);
        ResultSet resultado = conexion.consultar(datosFisicosDAO.consultar());
        try{
            if(resultado.next()){
                this.edad = resultado.getInt("edad");
                this.estatura = resultado.getFloat("estatura");
                this.peso = resultado.getFloat("peso");
                this.sexo = resultado.getString("sexo");
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
        DatosFisicosDAO datosFisicosDAO = new DatosFisicosDAO(this.idDatosFisicos, this.edad, this.estatura, this.peso, this.sexo);
        String resultado = conexion.ejecutar(datosFisicosDAO.actualizar());
        conexion.cerrarConexion();
        return resultado;
    }
}
