/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package conexionBD.clasesDAO.clasesLoginDAO;

/**
 * 
 * @author Sammy Guergachi <sguergachi at gmail.com>
 */
public class DatosFisicosDAO {
    private int idDatosFisicos;
    private int edad;
    private float estatura;
    private float peso;
    private String sexo;

    public DatosFisicosDAO() {
    }

    public DatosFisicosDAO(int idDatosFisicos) {
        this.idDatosFisicos = idDatosFisicos;
    }

    public DatosFisicosDAO(int idDatosFisicos, int edad, float estatura, float peso, String sexo) {
        this.idDatosFisicos = idDatosFisicos;
        this.edad = edad;
        this.estatura = estatura;
        this.peso = peso;
        this.sexo = sexo;
    }

    public String insertar() {
        return "INSERT INTO datos_fisicos(idDatosFisicos, edad, estatura, peso, sexo) VALUES(" + this.idDatosFisicos + ", " + this.edad + ", " + this.estatura + ", " + this.peso + ", '" + this.sexo + "')";
    }

    public String consultar() {
        return "SELECT * FROM datos_fisicos WHERE idDatosFisicos = " + this.idDatosFisicos;
    }

    public String actualizar() {
        return "UPDATE datos_fisicos SET edad = " + this.edad + ", estatura = " + this.estatura + ", peso = " + this.peso + ", sexo = '" + this.sexo + "' WHERE idDatosFisicos = " + this.idDatosFisicos;
    }

    public String eliminar() {
        return "DELETE FROM datos_fisicos WHERE idDatosFisicos = " + this.idDatosFisicos;
    }
}

