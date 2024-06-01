/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package conexionBD.clasesDAO.clasesConfiguracionDAO;

/**
 * 
 * @author Sammy Guergachi <sguergachi at gmail.com>
 */
public class PreferenciasDAO {
    private int idPreferencias;
    private boolean iniciarSesionAutomaticamente;
    private boolean notificaciones;
    private String tema;

    public PreferenciasDAO() {
    }

    public PreferenciasDAO(int idPreferencias) {
        this.idPreferencias = idPreferencias;
    }

    public PreferenciasDAO(int idPreferencias, boolean iniciarSesionAutomaticamente, boolean notificaciones, String tema) {
        this.idPreferencias = idPreferencias;
        this.iniciarSesionAutomaticamente = iniciarSesionAutomaticamente;
        this.notificaciones = notificaciones;
        this.tema = tema;
    }

    public String insertar() {
        return "INSERT INTO preferencias(idPreferencias, iniciarSesionAutomaticamente, notificaciones, tema) VALUES(" + this.idPreferencias + ", " + this.iniciarSesionAutomaticamente + ", " + this.notificaciones + ", '" + this.tema + "')";
    }

    public String consultar() {
        return "SELECT * FROM preferencias WHERE idPreferencias = " + this.idPreferencias;
    }

    public String actualizar() {
        return "UPDATE preferencias SET iniciarSesionAutomaticamente = " + this.iniciarSesionAutomaticamente + ", notificaciones = " + this.notificaciones + ", tema = '" + this.tema + "' WHERE idPreferencias = " + this.idPreferencias;
    }

    public String buscar(String filtro) {
        return "SELECT * FROM preferencias WHERE tema LIKE '" + filtro + "%'";
    }

    public String eliminar() {
        return "DELETE FROM preferencias WHERE idPreferencias = " + this.idPreferencias;
    }
}
