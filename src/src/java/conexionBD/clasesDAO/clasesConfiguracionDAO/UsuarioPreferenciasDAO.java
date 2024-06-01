/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package conexionBD.clasesDAO.clasesConfiguracionDAO;

/**
 * 
 * @author Sammy Guergachi <sguergachi at gmail.com>
 */
public class UsuarioPreferenciasDAO {
    private int idUsuarioPreferencias;
    private int idUsuario;
    private int idPreferencias;

    public UsuarioPreferenciasDAO() {
    }

    public UsuarioPreferenciasDAO(int idUsuarioPreferencias) {
        this.idUsuarioPreferencias = idUsuarioPreferencias;
    }

    public UsuarioPreferenciasDAO(int idUsuarioPreferencias, int idUsuario, int idPreferencias) {
        this.idUsuarioPreferencias = idUsuarioPreferencias;
        this.idUsuario = idUsuario;
        this.idPreferencias = idPreferencias;
    }

    public String insertar() {
        return "INSERT INTO usuario_preferencias(idUsuarioPreferencias, idUsuario, idPreferencias) VALUES(" + this.idUsuarioPreferencias + ", " + this.idUsuario + ", " + this.idPreferencias + ")";
    }

    public String consultar() {
        return "SELECT * FROM usuario_preferencias WHERE idUsuarioPreferencias = " + this.idUsuarioPreferencias;
    }

    public String actualizar() {
        return "UPDATE usuario_preferencias SET idUsuario = " + this.idUsuario + ", idPreferencias = " + this.idPreferencias + " WHERE idUsuarioPreferencias = " + this.idUsuarioPreferencias;
    }

    public String buscar(String filtro) {
        return "SELECT * FROM usuario_preferencias WHERE idUsuario = " + filtro;
    }

    public String eliminar() {
        return "DELETE FROM usuario_preferencias WHERE idUsuarioPreferencias = " + this.idUsuarioPreferencias;
    }
}