/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package conexionBD.clasesDAO.clasesLoginDAO;

/**
 * 
 * @author Sammy Guergachi <sguergachi at gmail.com>
 */
public class ObjetivoDiarioDAO {
    private int idObjetivoDiario;
    private String descripcion;
    private int progreso;
    private String descripcionPaso;

    public ObjetivoDiarioDAO() {
    }

    public ObjetivoDiarioDAO(int idObjetivoDiario) {
        this.idObjetivoDiario = idObjetivoDiario;
    }

    public ObjetivoDiarioDAO(int idObjetivoDiario, String descripcion, int progreso, String descripcionPaso) {
        this.idObjetivoDiario = idObjetivoDiario;
        this.descripcion = descripcion;
        this.progreso = progreso;
        this.descripcionPaso = descripcionPaso;
    }

    public String insertar() {
        return "INSERT INTO objetivo_diario(idObjetivoDiario, descripcion, progreso, descripcionPaso) VALUES(" + this.idObjetivoDiario + ", '" + this.descripcion + "', " + this.progreso + ", '" + this.descripcionPaso + "')";
    }

    public String consultar() {
        return "SELECT * FROM objetivo_diario WHERE idObjetivoDiario = " + this.idObjetivoDiario;
    }

    public String actualizar() {
        return "UPDATE objetivo_diario SET descripcion = '" + this.descripcion + "', progreso = " + this.progreso + ", descripcionPaso = '" + this.descripcionPaso + "' WHERE idObjetivoDiario = " + this.idObjetivoDiario;
    }

    public String eliminar() {
        return "DELETE FROM objetivo_diario WHERE idObjetivoDiario = " + this.idObjetivoDiario;
    }
}
