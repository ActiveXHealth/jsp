/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package logicaActivex.clasesLogica.clasesLoginLogic;

import java.sql.ResultSet;
import java.sql.SQLException;

import conexionBD.Conexion;
import conexionBD.clasesDAO.clasesLoginDAO.DatosPersonalesDAO;

public class DatosPersonales {
    private int idDatosPersonales;
    private String nombreCompleto;
    private String apodo;
    private String correo;
    private String fechaDeNacimiento;
    private String contraseña;

    public DatosPersonales() {
    }

    public DatosPersonales(int idDatosPersonales) {
        this.idDatosPersonales = idDatosPersonales;
    }

    public DatosPersonales(int idDatosPersonales, String nombreCompleto, String apodo, String correo, String fechaDeNacimiento, String contraseña) {
        this.idDatosPersonales = idDatosPersonales;
        this.nombreCompleto = nombreCompleto;
        this.apodo = apodo;
        this.correo = correo;
        this.fechaDeNacimiento = fechaDeNacimiento;
        this.contraseña = contraseña;
    }

    public String insertar(){
        Conexion conexion = new Conexion();
        DatosPersonalesDAO datosPersonalesDAO = new DatosPersonalesDAO(this.idDatosPersonales, this.nombreCompleto, this.apodo, this.correo, this.fechaDeNacimiento, this.contraseña);
        String resultado = conexion.ejecutar(datosPersonalesDAO.insertar());
        conexion.cerrarConexion();
        return resultado;
    }
    
    public String eliminar(){
        Conexion conexion = new Conexion();
        DatosPersonalesDAO datosPersonalesDAO = new DatosPersonalesDAO(this.idDatosPersonales);
        String resultado = conexion.ejecutar(datosPersonalesDAO.eliminar());
        conexion.cerrarConexion();
        return resultado;
    }
    
    public boolean consultar(){
        Conexion conexion = new Conexion();
        DatosPersonalesDAO datosPersonalesDAO = new DatosPersonalesDAO(this.idDatosPersonales);
        ResultSet resultado = conexion.consultar(datosPersonalesDAO.consultar());
        try{
            if(resultado.next()){
                this.nombreCompleto = resultado.getString("nombreCompleto");
                this.apodo = resultado.getString("apodo");
                this.correo = resultado.getString("correo");
                this.fechaDeNacimiento = resultado.getString("fechaDeNacimiento");
                this.contraseña = resultado.getString("contraseña");
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
        DatosPersonalesDAO datosPersonalesDAO = new DatosPersonalesDAO(this.idDatosPersonales, this.nombreCompleto, this.apodo, this.correo, this.fechaDeNacimiento, this.contraseña);
        String resultado = conexion.ejecutar(datosPersonalesDAO.actualizar());
        conexion.cerrarConexion();
        return resultado;
    }
}

