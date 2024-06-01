/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package conexionBD.clasesDAO.clasesObjetivosDAO;

/**
 * 
 * @author Sammy Guergachi <sguergachi at gmail.com>
 */
public class RegistroHidratacionDAO {
    private int idRegistroHidratacion;
    private float progreso;
    private String fechaRegistroHidratacion;

    public RegistroHidratacionDAO() {
    }

    public RegistroHidratacionDAO(int idRegistroHidratacion) {
        this.idRegistroHidratacion = idRegistroHidratacion;
    }

    public RegistroHidratacionDAO(int idRegistroHidratacion, float progreso, String fechaRegistroHidratacion) {
        this.idRegistroHidratacion = idRegistroHidratacion;
        this.progreso = progreso;
        this.fechaRegistroHidratacion = fechaRegistroHidratacion;
    }

    public String insertar() {
        return "INSERT INTO registro_hidratacion(idRegistroHidratacion, progreso, fechaRegistroHidratacion) VALUES(" + this.idRegistroHidratacion + ", " + this.progreso + ", '" + this.fechaRegistroHidratacion + "')";
    }

    public String consultar() {
        return "SELECT * FROM registro_hidratacion WHERE idRegistroHidratacion = " + this.idRegistroHidratacion;
    }

    public String actualizar() {
        return "UPDATE registro_hidratacion SET progreso = " + this.progreso + ", fechaRegistroHidratacion = '" + this.fechaRegistroHidratacion + "' WHERE idRegistroHidratacion = " + this.idRegistroHidratacion;
    }

    public String buscar(String filtro) {
        return "SELECT * FROM registro_hidratacion WHERE fechaRegistroHidratacion LIKE '" + filtro + "%'";
    }

    public String eliminar() {
        return "DELETE FROM registro_hidratacion WHERE idRegistroHidratacion = " + this.idRegistroHidratacion;
    }
}

