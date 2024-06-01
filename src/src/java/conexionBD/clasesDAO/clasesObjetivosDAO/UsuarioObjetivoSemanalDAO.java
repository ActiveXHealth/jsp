/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package conexionBD.clasesDAO.clasesObjetivosDAO;

/**
 * 
 * @author Sammy Guergachi <sguergachi at gmail.com>
 */
public class UsuarioObjetivoSemanalDAO {
    private int idUsuarioObjetivoSemanal;
    private int idUsuario;
    private int idObjetivo;

    public UsuarioObjetivoSemanalDAO() {
    }

    public UsuarioObjetivoSemanalDAO(int idUsuarioObjetivoSemanal) {
        this.idUsuarioObjetivoSemanal = idUsuarioObjetivoSemanal;
    }

    public UsuarioObjetivoSemanalDAO(int idUsuarioObjetivoSemanal, int idUsuario, int idObjetivo) {
        this.idUsuarioObjetivoSemanal = idUsuarioObjetivoSemanal;
        this.idUsuario = idUsuario;
        this.idObjetivo = idObjetivo;
    }

    public String insertar() {
        return "INSERT INTO usuario_objetivo_semanal(idUsuarioObjetivoSemanal, idUsuario, idObjetivo) VALUES(" + this.idUsuarioObjetivoSemanal + ", " + this.idUsuario + ", " + this.idObjetivo + ")";
    }

    public String consultar() {
        return "SELECT * FROM usuario_objetivo_semanal WHERE idUsuarioObjetivoSemanal = " + this.idUsuarioObjetivoSemanal;
    }

    public String actualizar() {
        return "UPDATE usuario_objetivo_semanal SET idUsuario = " + this.idUsuario + ", idObjetivo = " + this.idObjetivo + " WHERE idUsuarioObjetivoSemanal = " + this.idUsuarioObjetivoSemanal;
    }

    public String eliminar() {
        return "DELETE FROM usuario_objetivo_semanal WHERE idUsuarioObjetivoSemanal = " + this.idUsuarioObjetivoSemanal;
    }
}
