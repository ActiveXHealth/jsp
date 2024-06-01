/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package conexionBD.clasesDAO.clasesLoginDAO;

public class UsuarioDatosFisicosDAO {
    private int idUsuarioDatosFisicos;
    private int idUsuario;
    private int idDatosFisicos;

    public UsuarioDatosFisicosDAO() {
    }

    public UsuarioDatosFisicosDAO(int idUsuarioDatosFisicos) {
        this.idUsuarioDatosFisicos = idUsuarioDatosFisicos;
    }

    public UsuarioDatosFisicosDAO(int idUsuarioDatosFisicos, int idUsuario, int idDatosFisicos) {
        this.idUsuarioDatosFisicos = idUsuarioDatosFisicos;
        this.idUsuario = idUsuario;
        this.idDatosFisicos = idDatosFisicos;
    }

    public String insertar() {
        return "INSERT INTO usuario_datos_fisicos(idUsuarioDatosFisicos, idUsuario, idDatosFisicos) VALUES(" + this.idUsuarioDatosFisicos + ", " + this.idUsuario + ", " + this.idDatosFisicos + ")";
    }

    public String consultar() {
        return "SELECT * FROM usuario_datos_fisicos WHERE idUsuarioDatosFisicos = " + this.idUsuarioDatosFisicos;
    }

    public String actualizar() {
        return "UPDATE usuario_datos_fisicos SET idUsuario = " + this.idUsuario + ", idDatosFisicos = " + this.idDatosFisicos + " WHERE idUsuarioDatosFisicos = " + this.idUsuarioDatosFisicos;
    }

    public String eliminar() {
        return "DELETE FROM usuario_datos_fisicos WHERE idUsuarioDatosFisicos = " + this.idUsuarioDatosFisicos;
    }
}
