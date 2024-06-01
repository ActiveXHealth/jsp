/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package conexionBD.clasesDAO.clasesRutinasDAO;

/**
 * 
 * @author Sammy Guergachi <sguergachi at gmail.com>
 */
public class UsuarioEntrenamientoDAO {
    private int idUsuarioEntrenamiento;
    private int idUsuario;
    private int idEntrenamiento;

    public UsuarioEntrenamientoDAO() {
    }

    public UsuarioEntrenamientoDAO(int idUsuarioEntrenamiento) {
        this.idUsuarioEntrenamiento = idUsuarioEntrenamiento;
    }

    public UsuarioEntrenamientoDAO(int idUsuarioEntrenamiento, int idUsuario, int idEntrenamiento) {
        this.idUsuarioEntrenamiento = idUsuarioEntrenamiento;
        this.idUsuario = idUsuario;
        this.idEntrenamiento = idEntrenamiento;
    }

    public String insertar() {
        return "INSERT INTO usuario_entrenamiento(idUsuarioEntrenamiento, idUsuario, idEntrenamiento) VALUES(" + this.idUsuarioEntrenamiento + ", " + this.idUsuario + ", " + this.idEntrenamiento + ")";
    }

    public String consultar() {
        return "SELECT * FROM usuario_entrenamiento WHERE idUsuarioEntrenamiento = " + this.idUsuarioEntrenamiento;
    }

    public String actualizar() {
        return "UPDATE usuario_entrenamiento SET idUsuario = " + this.idUsuario + ", idEntrenamiento = " + this.idEntrenamiento + " WHERE idUsuarioEntrenamiento = " + this.idUsuarioEntrenamiento;
    }

    public String buscar(String filtro) {
        return "SELECT * FROM usuario_entrenamiento WHERE idUsuario = " + filtro;
    }

    public String eliminar() {
        return "DELETE FROM usuario_entrenamiento WHERE idUsuarioEntrenamiento = " + this.idUsuarioEntrenamiento;
    }
}
