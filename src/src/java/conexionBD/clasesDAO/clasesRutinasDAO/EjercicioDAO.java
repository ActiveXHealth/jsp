/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package conexionBD.clasesDAO.clasesRutinasDAO;

public class EjercicioDAO {
    private int idEjercicio;
    private String nombreEjercicio;
    private String Descripcion;
    private String musculosTrabajados;
    private String direccionImagen;

    public EjercicioDAO() {
    }

    public EjercicioDAO(int idEjercicio) {
        this.idEjercicio = idEjercicio;
    }

    public EjercicioDAO(int idEjercicio, String nombreEjercicio, String Descripcion, String musculosTrabajados, String direccionImagen) {
        this.idEjercicio = idEjercicio;
        this.nombreEjercicio = nombreEjercicio;
        this.Descripcion = Descripcion;
        this.musculosTrabajados = musculosTrabajados;
        this.direccionImagen = direccionImagen;
    }

    public String insertar() {
        return "INSERT INTO ejercicio(idEjercicio, nombreEjercicio, Descripcion, musculosTrabajados, direccionImagen) VALUES(" + this.idEjercicio + ", '" + this.nombreEjercicio + "', '" + this.Descripcion + "', '" + this.musculosTrabajados + "', '" + this.direccionImagen + "')";
    }

    public String consultar() {
        return "SELECT * FROM ejercicio WHERE idEjercicio = " + this.idEjercicio;
    }

    public String actualizar() {
        return "UPDATE ejercicio SET nombreEjercicio = '" + this.nombreEjercicio + "', Descripcion = '" + this.Descripcion + "', musculosTrabajados = '" + this.musculosTrabajados + "', direccionImagen = '" + this.direccionImagen + "' WHERE idEjercicio = " + this.idEjercicio;
    }

    public String buscar(String filtro) {
        return "SELECT * FROM ejercicio WHERE nombreEjercicio LIKE '" + filtro + "%'";
    }

    public String eliminar() {
        return "DELETE FROM ejercicio WHERE idEjercicio = " + this.idEjercicio;
    }
}

