/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package conexionBD.clasesDAO.clasesRutinasDAO;

/**
 * 
 * @author Sammy Guergachi <sguergachi at gmail.com>
 */
public class EntrenamientoDAO {
    private int idEntrenamiento;
    private String fechaEntrenamiento;
    private int cargaTotal;
    private int tiempoTotal;
    private int caloriasQuemadas;

    public EntrenamientoDAO() {
    }

    public EntrenamientoDAO(int idEntrenamiento) {
        this.idEntrenamiento = idEntrenamiento;
    }

    public EntrenamientoDAO(int idEntrenamiento, String fechaEntrenamiento, int cargaTotal, int tiempoTotal, int caloriasQuemadas) {
        this.idEntrenamiento = idEntrenamiento;
        this.fechaEntrenamiento = fechaEntrenamiento;
        this.cargaTotal = cargaTotal;
        this.tiempoTotal = tiempoTotal;
        this.caloriasQuemadas = caloriasQuemadas;
    }

    public String insertar() {
        return "INSERT INTO entrenamiento(idEntrenamiento, fechaEntrenamiento, cargaTotal, tiempoTotal, caloriasQuemadas) VALUES(" + this.idEntrenamiento + ", '" + this.fechaEntrenamiento + "', " + this.cargaTotal + ", " + this.tiempoTotal + ", " + this.caloriasQuemadas + ")";
    }

    public String consultar() {
        return "SELECT * FROM entrenamiento WHERE idEntrenamiento = " + this.idEntrenamiento;
    }

    public String actualizar() {
        return "UPDATE entrenamiento SET fechaEntrenamiento = '" + this.fechaEntrenamiento + "', cargaTotal = " + this.cargaTotal + ", tiempoTotal = " + this.tiempoTotal + ", caloriasQuemadas = " + this.caloriasQuemadas + " WHERE idEntrenamiento = " + this.idEntrenamiento;
    }

    public String buscar(String filtro) {
        return "SELECT * FROM entrenamiento WHERE fechaEntrenamiento LIKE '" + filtro + "%'";
    }

    public String eliminar() {
        return "DELETE FROM entrenamiento WHERE idEntrenamiento = " + this.idEntrenamiento;
    }
}
