/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package conexionBD.clasesDAO.clasesObjetivosDAO;

/**
 * 
 * @author Sammy Guergachi <sguergachi at gmail.com>
 */
public class RegistroPesoDAO {
    private int idRegistroPeso;
    private String fecha;
    private float peso;

    public RegistroPesoDAO() {
    }

    public RegistroPesoDAO(int idRegistroPeso) {
        this.idRegistroPeso = idRegistroPeso;
    }

    public RegistroPesoDAO(int idRegistroPeso, String fecha, float peso) {
        this.idRegistroPeso = idRegistroPeso;
        this.fecha = fecha;
        this.peso = peso;
    }

    public String insertar() {
        return "INSERT INTO registro_peso(idRegistroPeso, fecha, peso) VALUES(" + this.idRegistroPeso + ", '" + this.fecha + "', " + this.peso + ")";
    }

    public String consultar() {
        return "SELECT * FROM registro_peso WHERE idRegistroPeso = " + this.idRegistroPeso;
    }

    public String actualizar() {
        return "UPDATE registro_peso SET fecha = '" + this.fecha + "', peso = " + this.peso + " WHERE idRegistroPeso = " + this.idRegistroPeso;
    }

    public String buscar(String filtro) {
        return "SELECT * FROM registro_peso WHERE fecha LIKE '" + filtro + "%'";
    }

    public String eliminar() {
        return "DELETE FROM registro_peso WHERE idRegistroPeso = " + this.idRegistroPeso;
    }
}

