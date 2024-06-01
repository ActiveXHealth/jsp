/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package conexionBD.clasesDAO.clasesDashboardDAO;

/**
 * 
 * @author Sammy Guergachi <sguergachi at gmail.com>
 */
public class DesafioDAO {
    private int idDesafio;
    private String descripcion;
    private boolean estado;

    public DesafioDAO() {
    }

    public DesafioDAO(int idDesafio) {
        this.idDesafio = idDesafio;
    }

    public DesafioDAO(int idDesafio, String descripcion, boolean estado) {
        this.idDesafio = idDesafio;
        this.descripcion = descripcion;
        this.estado = estado;
    }

    public String insertar() {
        return "INSERT INTO desafio(idDesafio, descripcion, estado) VALUES(" + this.idDesafio + ", '" + this.descripcion + "', " + this.estado + ")";
    }

    public String consultar() {
        return "SELECT * FROM desafio WHERE idDesafio = " + this.idDesafio;
    }

    public String actualizar() {
        return "UPDATE desafio SET descripcion = '" + this.descripcion + "', estado = " + this.estado + " WHERE idDesafio = " + this.idDesafio;
    }

    public String buscar(String filtro) {
        return "SELECT * FROM desafio WHERE descripcion LIKE '" + filtro + "%'";
    }

    public String eliminar() {
        return "DELETE FROM desafio WHERE idDesafio = " + this.idDesafio;
    }
}