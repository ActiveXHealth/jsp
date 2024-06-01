/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package conexionBD.clasesDAO.clasesLoginDAO;

/**
 * 
 * @author Sammy Guergachi <sguergachi at gmail.com>
 */
public class UsuarioDatosPersonalesDAO {
    private int idUsuarioDatosPersonales;
    private int idUsuario;
    private int idDatosPersonales;

    public UsuarioDatosPersonalesDAO() {
    }

    public UsuarioDatosPersonalesDAO(int idUsuarioDatosPersonales) {
        this.idUsuarioDatosPersonales = idUsuarioDatosPersonales;
    }

    public UsuarioDatosPersonalesDAO(int idUsuarioDatosPersonales, int idUsuario, int idDatosPersonales) {
        this.idUsuarioDatosPersonales = idUsuarioDatosPersonales;
        this.idUsuario = idUsuario;
        this.idDatosPersonales = idDatosPersonales;
    }

    public String insertar() {
        return "INSERT INTO usuario_datos_personales(idUsuarioDatosPersonales, idUsuario, idDatosPersonales) VALUES(" + this.idUsuarioDatosPersonales + ", " + this.idUsuario + ", " + this.idDatosPersonales + ")";
    }

    public String consultar() {
        return "SELECT * FROM usuario_datos_personales WHERE idUsuarioDatosPersonales = " + this.idUsuarioDatosPersonales;
    }

    public String actualizar() {
        return "UPDATE usuario_datos_personales SET idUsuario = " + this.idUsuario + ", idDatosPersonales = " + this.idDatosPersonales + " WHERE idUsuarioDatosPersonales = " + this.idUsuarioDatosPersonales;
    }

    public String eliminar() {
        return "DELETE FROM usuario_datos_personales WHERE idUsuarioDatosPersonales = " + this.idUsuarioDatosPersonales;
    }
}
