/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package conexionBD.clasesDAO.clasesLoginDAO;

/**
 * 
 * @author Sammy Guergachi <sguergachi at gmail.com>
 */
public class DatosPersonalesDAO {
    private int idDatosPersonales;
    private String nombreCompleto;
    private String apodo;
    private String correo;
    private String fechaDeNacimiento;
    private String contraseña;

    public DatosPersonalesDAO() {
    }

    public DatosPersonalesDAO(int idDatosPersonales) {
        this.idDatosPersonales = idDatosPersonales;
    }

    public DatosPersonalesDAO(int idDatosPersonales, String nombreCompleto, String apodo, String correo, String fechaDeNacimiento, String contraseña) {
        this.idDatosPersonales = idDatosPersonales;
        this.nombreCompleto = nombreCompleto;
        this.apodo = apodo;
        this.correo = correo;
        this.fechaDeNacimiento = fechaDeNacimiento;
        this.contraseña = contraseña;
    }

    public String insertar() {
        return "INSERT INTO datos_personales(idDatosPersonales, nombreCompleto, apodo, correo, fechaDeNacimiento, contraseña) VALUES(" + this.idDatosPersonales + ", '" + this.nombreCompleto + "', '" + this.apodo + "', '" + this.correo + "', '" + this.fechaDeNacimiento + "', '" + this.contraseña + "')";
    }

    public String consultar() {
        return "SELECT * FROM datos_personales WHERE idDatosPersonales = " + this.idDatosPersonales;
    }

    public String actualizar() {
        return "UPDATE datos_personales SET nombreCompleto = '" + this.nombreCompleto + "', apodo = '" + this.apodo + "', correo = '" + this.correo + "', fechaDeNacimiento = '" + this.fechaDeNacimiento + "', contraseña = '" + this.contraseña + "' WHERE idDatosPersonales = " + this.idDatosPersonales;
    }

    public String eliminar() {
        return "DELETE FROM datos_personales WHERE idDatosPersonales = " + this.idDatosPersonales;
    }
}
