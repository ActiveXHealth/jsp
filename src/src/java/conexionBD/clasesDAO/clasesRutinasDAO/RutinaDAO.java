/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package conexionBD.clasesDAO.clasesRutinasDAO;


public class RutinaDAO {
    private int idRutina;
    private int idUsuario;
    private String nombreRutina;
    private String fechaCreacion;
    private String Descripcion;
    private String diaAsignado;
    private int cargaTotal;
    private int caloriasTotales;
    private float tiempoTotal;

    public RutinaDAO() {
    }

    public RutinaDAO(int idRutina) {
        this.idRutina = idRutina;
    }

    public RutinaDAO(int idRutina, int idUsuario, String nombreRutina, String fechaCreacion, String Descripcion, String diaAsignado, int cargaTotal, int caloriasTotales, float tiempoTotal) {
        this.idRutina = idRutina;
        this.idUsuario = idUsuario;
        this.nombreRutina = nombreRutina;
        this.fechaCreacion = fechaCreacion;
        this.Descripcion = Descripcion;
        this.diaAsignado = diaAsignado;
        this.cargaTotal = cargaTotal;
        this.caloriasTotales = caloriasTotales;
        this.tiempoTotal = tiempoTotal;
    }

   public String insertar() {
        return "INSERT INTO rutina(idRutina, idUsuario, nombreRutina, fechaCreacion, Descripcion, diaAsignado, cargaTotal, caloriasTotales, tiempoTotal) VALUES(" + this.idRutina + ", " + this.idUsuario + ", '" + this.nombreRutina + "', '" + this.fechaCreacion + "', '" + this.Descripcion + "', '" + this.diaAsignado + "', " + this.cargaTotal + ", " + this.caloriasTotales + ", " + this.tiempoTotal + ")";
    }

    public String consultar() {
        return "SELECT * FROM rutina WHERE idRutina = " + this.idRutina;
    }

    public String actualizar() {
        return "UPDATE rutina SET idUsuario = " + this.idUsuario + ", nombreRutina = '" + this.nombreRutina + "', fechaCreacion = '" + this.fechaCreacion + "', Descripcion = '" + this.Descripcion + "', diaAsignado = '" + this.diaAsignado + "', cargaTotal = " + this.cargaTotal + ", caloriasTotales = " + this.caloriasTotales + ", tiempoTotal = " + this.tiempoTotal + " WHERE idRutina = " + this.idRutina;
    }

    public String buscar(String filtro) {
        return "SELECT * FROM rutina WHERE nombreRutina LIKE '" + filtro + "%'";
    }

    public String eliminar() {
        return "DELETE FROM rutina WHERE idRutina = " + this.idRutina;
    }

}
