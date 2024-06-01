/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package conexionBD.clasesDAO.clasesObjetivosDAO;

/**
 * 
 * @author Sammy Guergachi <sguergachi at gmail.com>
 */
public class ObjetivoSemanalDAO {
    private int idObjetivoSemanal;
    private String tipo;
    private String descripcion;
    private float progreso;
    private float volumen;

    public ObjetivoSemanalDAO() {
    }

    public ObjetivoSemanalDAO(int idObjetivoSemanal) {
        this.idObjetivoSemanal = idObjetivoSemanal;
    }

    public ObjetivoSemanalDAO(int idObjetivoSemanal, String tipo, String descripcion, float progreso, float volumen) {
        this.idObjetivoSemanal = idObjetivoSemanal;
        this.tipo = tipo;
        this.descripcion = descripcion;
        this.progreso = progreso;
        this.volumen = volumen;
    }

    public String insertar() {
        return "INSERT INTO objetivo_semanal(idObjetivoSemanal, tipo, descripcion, progreso, volumen) VALUES(" + this.idObjetivoSemanal + ", '" + this.tipo + "', '" + this.descripcion + "', " + this.progreso + ", " + this.volumen + ")";
    }

    public String consultar() {
        return "SELECT * FROM objetivo_semanal WHERE idObjetivoSemanal = " + this.idObjetivoSemanal;
    }

    public String actualizar() {
        return "UPDATE objetivo_semanal SET tipo = '" + this.tipo + "', descripcion = '" + this.descripcion + "', progreso = " + this.progreso + ", volumen = " + this.volumen + " WHERE idObjetivoSemanal = " + this.idObjetivoSemanal;
    }

    public String buscar(String filtro) {
        return "SELECT * FROM objetivo_semanal WHERE tipo LIKE '" + filtro + "%'";
    }

    public String eliminar() {
        return "DELETE FROM objetivo_semanal WHERE idObjetivoSemanal = " + this.idObjetivoSemanal;
    }
}
