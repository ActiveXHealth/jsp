/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package conexionBD.clasesDAO.clasesObjetivosDAO;

/**
 * 
 * @author Sammy Guergachi <sguergachi at gmail.com>
 */
public class UsuarioRegistroHidratacionDAO {
    private int idUsuarioRegistroHidratacion;
    private int idUsuario;
    private int idRegistroHidratacion;

    public UsuarioRegistroHidratacionDAO() {
    }

    public UsuarioRegistroHidratacionDAO(int idUsuarioRegistroHidratacion) {
        this.idUsuarioRegistroHidratacion = idUsuarioRegistroHidratacion;
    }

    public UsuarioRegistroHidratacionDAO(int idUsuarioRegistroHidratacion, int idUsuario, int idRegistroHidratacion) {
        this.idUsuarioRegistroHidratacion = idUsuarioRegistroHidratacion;
        this.idUsuario = idUsuario;
        this.idRegistroHidratacion = idRegistroHidratacion;
    }

    public String insertar() {
        return "INSERT INTO usuario_registro_hidratacion(idUsuarioRegistroHidratacion, idUsuario, idRegistroHidratacion) VALUES(" + this.idUsuarioRegistroHidratacion + ", " + this.idUsuario + ", " + this.idRegistroHidratacion + ")";
    }

    public String consultar() {
        return "SELECT * FROM usuario_registro_hidratacion WHERE idUsuarioRegistroHidratacion = " + this.idUsuarioRegistroHidratacion;
    }

    public String actualizar() {
        return "UPDATE usuario_registro_hidratacion SET idUsuario = " + this.idUsuario + ", idRegistroHidratacion = " + this.idRegistroHidratacion + " WHERE idUsuarioRegistroHidratacion = " + this.idUsuarioRegistroHidratacion;
    }

    public String eliminar() {
        return "DELETE FROM usuario_registro_hidratacion WHERE idUsuarioRegistroHidratacion = " + this.idUsuarioRegistroHidratacion;
    }
}
