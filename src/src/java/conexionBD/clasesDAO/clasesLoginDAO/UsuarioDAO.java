/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package conexionBD.clasesDAO.clasesLoginDAO;

/**
 * 
 * @author Sammy Guergachi <sguergachi at gmail.com>
 */
public class UsuarioDAO {
    private int idUsuario;
    private String membresia;
    private String objetivoGeneral;
    private float pesoObjetivo;
    private float hidratacionObjetivo;
    private int racha;

    public UsuarioDAO() {
    }

    public UsuarioDAO(int idUsuario) {
        this.idUsuario = idUsuario;
    }

    public UsuarioDAO(int idUsuario, String membresia, String objetivoGeneral, float pesoObjetivo, float hidratacionObjetivo, int racha) {
        this.idUsuario = idUsuario;
        this.membresia = membresia;
        this.objetivoGeneral = objetivoGeneral;
        this.pesoObjetivo = pesoObjetivo;
        this.hidratacionObjetivo = hidratacionObjetivo;
        this.racha = racha;
    }

    public String insertar() {
        return "INSERT INTO usuario(idUsuario, membresia, objetivoGeneral, pesoObjetivo, hidratacionObjetivo, racha) VALUES(" + this.idUsuario + ", '" + this.membresia + "', '" + this.objetivoGeneral + "', " + this.pesoObjetivo + ", " + this.hidratacionObjetivo + ", " + this.racha + ")";
    }

    public String consultar() {
        return "SELECT * FROM usuario WHERE idUsuario = " + this.idUsuario;
    }

    public String actualizar() {
        return "UPDATE usuario SET membresia = '" + this.membresia + "', objetivoGeneral = '" + this.objetivoGeneral + "', pesoObjetivo = " + this.pesoObjetivo + ", hidratacionObjetivo = " + this.hidratacionObjetivo + ", racha = " + this.racha + " WHERE idUsuario = " + this.idUsuario;
    }

    public String eliminar() {
        return "DELETE FROM usuario WHERE idUsuario = " + this.idUsuario;
    }
}
