/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package conexionBD.clasesDAO.clasesObjetivosDAO;

/**
 * 
 * @author Sammy Guergachi <sguergachi at gmail.com>
 */
public class RecordDAO {
    private int idRecord;
    private int idUsuario;
    private String tipoRecord;
    private float valor;
    private String fechaRecord;

    public RecordDAO() {
    }

    public RecordDAO(int idRecord) {
        this.idRecord = idRecord;
    }

    public RecordDAO(int idRecord, int idUsuario, String tipoRecord, float valor, String fechaRecord) {
        this.idRecord = idRecord;
        this.idUsuario = idUsuario;
        this.tipoRecord = tipoRecord;
        this.valor = valor;
        this.fechaRecord = fechaRecord;
    }

    public String insertar() {
        return "INSERT INTO record(idRecord, idUsuario, tipoRecord, valor, fechaRecord) VALUES(" + this.idRecord + ", " + this.idUsuario + ", '" + this.tipoRecord + "', " + this.valor + ", '" + this.fechaRecord + "')";
    }

    public String consultar() {
        return "SELECT * FROM record WHERE idRecord = " + this.idRecord;
    }

    public String actualizar() {
        return "UPDATE record SET idUsuario = " + this.idUsuario + ", tipoRecord = '" + this.tipoRecord + "', valor = " + this.valor + ", fechaRecord = '" + this.fechaRecord + "' WHERE idRecord = " + this.idRecord;
    }

    public String buscar(String filtro) {
        return "SELECT * FROM record WHERE tipoRecord LIKE '" + filtro + "%'";
    }

    public String eliminar() {
        return "DELETE FROM record WHERE idRecord = " + this.idRecord;
    }
}
