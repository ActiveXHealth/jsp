/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package conexionBD.clasesDAO.clasesDashboardDAO;

/**
 * 
 * @author Sammy Guergachi <sguergachi at gmail.com>
 */
public class ConsejoFitnessDAO {
    private int idConsejo;
    private String descripcion;

    public ConsejoFitnessDAO() {
    }

    public ConsejoFitnessDAO(int idConsejo) {
        this.idConsejo = idConsejo;
    }

    public ConsejoFitnessDAO(int idConsejo, String descripcion) {
        this.idConsejo = idConsejo;
        this.descripcion = descripcion;
    }

    public String insertar() {
        return "INSERT INTO consejo_fitness(idConsejo, descripcion) VALUES(" + this.idConsejo + ", '" + this.descripcion + "')";
    }

    public String consultar() {
        return "SELECT * FROM consejo_fitness WHERE idConsejo = " + this.idConsejo;
    }

    public String actualizar() {
        return "UPDATE consejo_fitness SET descripcion = '" + this.descripcion + "' WHERE idConsejo = " + this.idConsejo;
    }

    public String buscar(String filtro) {
        return "SELECT * FROM consejo_fitness WHERE descripcion LIKE '" + filtro + "%'";
    }

    public String eliminar() {
        return "DELETE FROM consejo_fitness WHERE idConsejo = " + this.idConsejo;
    }
}
