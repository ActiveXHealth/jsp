/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package conexionBD.clasesDAO.clasesLoginDAO;

/**
 * 
 * @author Sammy Guergachi <sguergachi at gmail.com>
 */
public class UsuarioObjetivoDiarioDAO {
    private int idUsuarioObjetivoDiario;
    private int idUsuario;
    private int idObjetivoDiario;

    public UsuarioObjetivoDiarioDAO() {
    }

    public UsuarioObjetivoDiarioDAO(int idUsuarioObjetivoDiario) {
        this.idUsuarioObjetivoDiario = idUsuarioObjetivoDiario;
    }

    public UsuarioObjetivoDiarioDAO(int idUsuarioObjetivoDiario, int idUsuario, int idObjetivoDiario) {
        this.idUsuarioObjetivoDiario = idUsuarioObjetivoDiario;
        this.idUsuario = idUsuario;
        this.idObjetivoDiario = idObjetivoDiario;
    }

    public String insertar() {
        return "INSERT INTO usuario_objetivo_diario(idUsuarioObjetivoDiario, idUsuario, idObjetivoDiario) VALUES(" + this.idUsuarioObjetivoDiario + ", " + this.idUsuario + ", " + this.idObjetivoDiario + ")";
    }

    public String consultar() {
        return "SELECT * FROM usuario_objetivo_diario WHERE idUsuarioObjetivoDiario = " + this.idUsuarioObjetivoDiario;
    }

    public String actualizar() {
        return "UPDATE usuario_objetivo_diario SET idUsuario = " + this.idUsuario + ", idObjetivoDiario = " + this.idObjetivoDiario + " WHERE idUsuarioObjetivoDiario = " + this.idUsuarioObjetivoDiario;
    }

    public String eliminar() {
        return "DELETE FROM usuario_objetivo_diario WHERE idUsuarioObjetivoDiario = " + this.idUsuarioObjetivoDiario;
    }
}
