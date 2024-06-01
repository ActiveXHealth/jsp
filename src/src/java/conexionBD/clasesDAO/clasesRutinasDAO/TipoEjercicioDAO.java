/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package conexionBD.clasesDAO.clasesRutinasDAO;

/**
 * 
 * @author Sammy Guergachi <sguergachi at gmail.com>
 */
public class TipoEjercicioDAO {
    private int idTipo;
    private int idEjercicio;
    private String descripcion;

    public TipoEjercicioDAO() {
    }

    public TipoEjercicioDAO(int idTipo) {
        this.idTipo = idTipo;
    }

    public TipoEjercicioDAO(int idTipo, int idEjercicio, String descripcion) {
        this.idTipo = idTipo;
        this.idEjercicio = idEjercicio;
        this.descripcion = descripcion;
    }

    public String insertar() {
        return "INSERT INTO tipo_ejercicio(idTipo, idEjercicio, descripcion) VALUES(" + this.idTipo + ", " + this.idEjercicio + ", '" + this.descripcion + "')";
    }

    public String consultar() {
        return "SELECT * FROM tipo_ejercicio WHERE idTipo = " + this.idTipo;
    }

    public String actualizar() {
        return "UPDATE tipo_ejercicio SET idEjercicio = " + this.idEjercicio + ", descripcion = '" + this.descripcion + "' WHERE idTipo = " + this.idTipo;
    }

    public String buscar(String filtro) {
        return "SELECT * FROM tipo_ejercicio WHERE descripcion LIKE '" + filtro + "%'";
    }

    public String eliminar() {
        return "DELETE FROM tipo_ejercicio WHERE idTipo = " + this.idTipo;
    }
}

