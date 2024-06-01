/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package conexionBD.clasesDAO.clasesDashboardDAO;

/**
 * 
 * @author Sammy Guergachi <sguergachi at gmail.com>
 */
public class InspiracionDAO {
    private int idInspiracion;
    private String descripcion;

    public InspiracionDAO() {
    }

    public InspiracionDAO(int idInspiracion) {
        this.idInspiracion = idInspiracion;
    }

    public InspiracionDAO(int idInspiracion, String descripcion) {
        this.idInspiracion = idInspiracion;
        this.descripcion = descripcion;
    }

    public String insertar() {
        return "INSERT INTO inspiracion(idInspiracion, descripcion) VALUES(" + this.idInspiracion + ", '" + this.descripcion + "')";
    }

    public String consultar() {
        return "SELECT * FROM inspiracion WHERE idInspiracion = " + this.idInspiracion;
    }

    public String actualizar() {
        return "UPDATE inspiracion SET descripcion = '" + this.descripcion + "' WHERE idInspiracion = " + this.idInspiracion;
    }

    public String buscar(String filtro) {
        return "SELECT * FROM inspiracion WHERE descripcion LIKE '" + filtro + "%'";
    }
    public String eliminar() {
        return "DELETE FROM inspiracion WHERE idInspiracion = " + this.idInspiracion;
    }
}
